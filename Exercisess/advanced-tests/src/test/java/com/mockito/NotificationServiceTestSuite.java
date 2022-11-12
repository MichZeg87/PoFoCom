package com.kodilla.mockito;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotificationServiceTestSuite {

    // refaktoryzacja

    NotificationService notificationService = new NotificationService();
    Client client = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
//        NotificationService notificationService = new NotificationService();
//        Client client = Mockito.mock(Client.class);
//        Notification notification = Mockito.mock(Notification.class);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void subscribedClientShouldReceiveNotification() {
//        NotificationService notificationService = new NotificationService();
//        Client client = Mockito.mock(Client.class);
//        Notification notification = Mockito.mock(Notification.class);
        notificationService.addSubscriber(client);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClients() {
//        NotificationService notificationService = new NotificationService();
//        Client firstClient = Mockito.mock(Client.class);
        Client secondClient = Mockito.mock(Client.class);
        Client thirdClient = Mockito.mock(Client.class);
//        notificationService.addSubscriber(firstClient);
        notificationService.addSubscriber(client); // zamiast firstClient (linia42)
        notificationService.addSubscriber(secondClient);
        notificationService.addSubscriber(thirdClient);
//        Notification notification = Mockito.mock(Notification.class);

        notificationService.sendNotification(notification);
//        Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {
//        NotificationService notificationService = new NotificationService();
//        Client client = Mockito.mock(Client.class);
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client);
//        Notification notification = Mockito.mock(Notification.class);

        notificationService.sendNotification(notification);

        Mockito.verify(client, Mockito.times(1)).receive(notification);

    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {
//            NotificationService notificationService = new NotificationService();
//            Client client = Mockito.mock(Client.class);
        notificationService.addSubscriber(client);
//            Notification notification = Mockito.mock(Notification.class);
        notificationService.removeSubscriber(client);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);

    }
}
