package com.kodilla.mockito.homework;

import com.kodilla.notification.Client;
import com.kodilla.notification.Location;
import com.kodilla.notification.Notification;

import java.util.*;


public class WeatherService {

    Map<Location, Set<Client>> clients = new HashMap<>();


    public void addSubscriberToLocalisation(Client client, Location location) {
        if (this.clients.containsKey(location)) {
            this.clients.get(location).add(client);
        } else {
            Set<Client> clients = new HashSet<>();
            clients.add(client);
            this.clients.put(location, clients);
        }
    }

    public void removeSubscriberFromLocalisation(Client client, Location location) {
        if (this.clients.containsKey(location)) {
            this.clients.get(location).remove(client);
        }
    }

    public void removeSubscriberWithoutLocalisation(Client client) {
        Collection<Set<Client>> values = this.clients.values();
        for (Set<Client> value : values) {
            value.remove(client);
        }


    }

    public void removeLocation(Location location) {
        this.clients.remove(location);

    }

    public void sendNotificationToAll(Notification notification) {
        for (Set<Client> clients : clients.values())
            clients.forEach(client -> client.receive(notification));

    }

    public void sendNotificationToLocation(Notification notification, Location location) {
        if (this.clients.containsKey(location)) {
            this.clients.get(location).forEach(client -> client.receive(notification));
        }
    }
}
