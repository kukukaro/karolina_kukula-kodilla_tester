package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class WeatherAlertApp {

    private Map<Location, Set<User>> database = new HashMap<>();

    public void addSubscriber(User user, Location location) {
        database.computeIfAbsent(location, u -> new HashSet<>()).add(user);
    }


    public void sendNotificationForAllUsers(Notification notification) {
        database.values().stream()
                .flatMap(Set::stream)
                .collect(Collectors.toSet())
                .forEach(u -> u.receiveNotification(notification));
    }

    public void sendNotificationForOneLocationUsers(Location location, Notification notification) {
        if (database.containsKey(location)) {
            database.get(location)
                    .forEach(u -> u.receiveNotification(notification));
        }
    }

    public void removeSubscriberFromAllLocations(User user) {

        database.values().stream()
                .forEach(u -> u.remove(user));
        }

    public void removeSubscriberFromLocation(User user, Location location) {
        if (database.containsKey(location)) {
            Set<User> users = database.get(location);
            users.remove(user);
        }
    }

    public void deleteLocation(Location location) {
        if (database.containsKey(location))
            database.remove(location);
    }


}
