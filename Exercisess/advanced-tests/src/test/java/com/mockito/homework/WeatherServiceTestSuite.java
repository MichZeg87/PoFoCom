package com.mockito.homework;

import com.notification.Client;
import com.notification.Location;
import com.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


class WeatherServiceTestSuite {

    WeatherService weatherService = new WeatherService();
    Client client = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);
    Location location = Mockito.mock(Location.class);

    @Test
    public void SholdSendNaotyficationToClientWithoutLocation() {
        weatherService.addSubscriberToLocalisation(client, location);
        Client client2 = Mockito.mock(Client.class);
        weatherService.sendNotificationToLocation(notification, location);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.never()).receive(notification);
    }


    @Test
    public void shouldSendToSubscriberInLocalisation() {
        weatherService.addSubscriberToLocalisation(client, location);

        weatherService.sendNotificationToLocation(notification, location);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }


    @Test
    public void shouldRemoveSubscriberFromLocalisation() {
        weatherService.addSubscriberToLocalisation(client, location);
        weatherService.removeSubscriberFromLocalisation(client, location);
        weatherService.sendNotificationToLocation(notification, location);
        Mockito.verify(client, Mockito.never()).receive(notification);

    }

    @Test
    public void shouldRemoveSubscribeFromAllLocalisation() {
        Location location1 = Mockito.mock(Location.class);
        weatherService.addSubscriberToLocalisation(client, location);
        weatherService.addSubscriberToLocalisation(client, location1);
        weatherService.removeLocation(location);
        weatherService.removeLocation(location1);
        weatherService.removeSubscriberWithoutLocalisation(client);
        weatherService.sendNotificationToLocation(notification, location);
        Mockito.verify(client, Mockito.never()).receive(notification);

    }

    @Test
    public void notificationShouldReachToGroupOfPeopleInLocation() {
        Client client1 = Mockito.mock(Client.class);
        Client client2 = Mockito.mock(Client.class);
        Client client3 = Mockito.mock(Client.class);
        weatherService.addSubscriberToLocalisation(client1, location);
        weatherService.addSubscriberToLocalisation(client2, location);
        weatherService.addSubscriberToLocalisation(client3, location);
        weatherService.sendNotificationToLocation(notification, location);
        Mockito.verify(client1, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
        Mockito.verify(client3, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldBeSendToAllSubscribed() {
        Client client1 = Mockito.mock(Client.class);
        Client client2 = Mockito.mock(Client.class);
        Client client3 = Mockito.mock(Client.class);
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        Location location3 = Mockito.mock(Location.class);
        weatherService.addSubscriberToLocalisation(client1, location1);
        weatherService.addSubscriberToLocalisation(client2, location2);
        weatherService.addSubscriberToLocalisation(client3, location3);
        weatherService.sendNotificationToAll(notification);
        Mockito.verify(client1, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);

    }

    @Test
    public void clientShouldNotReciveNotificationFromEraseLocation() {
        Location location3 = Mockito.mock(Location.class);
        weatherService.addSubscriberToLocalisation(client, location3);
        weatherService.removeLocation(location3);
        weatherService.sendNotificationToLocation(notification, location3);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }
}