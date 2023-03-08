package com.mockito;

import com.notification.Client;
import com.notification.Notification;

import java.util.HashSet;
import java.util.Set;

public class NotificationService {

    private Set<Client> clients = new HashSet<>();

//    private List<Client> clients = new ArrayList<>();

//    private Client client;

    public void addSubscriber(Client client) {
//        this.client = client;
        this.clients.add(client);

    }

    public void sendNotification(Notification notification) {
//        this.client.receive(notification);
        this.clients.forEach(client -> client.receive(notification));
    }

    public void removeSubscriber(Client client) {
        this.clients.remove(client);
    }
}
