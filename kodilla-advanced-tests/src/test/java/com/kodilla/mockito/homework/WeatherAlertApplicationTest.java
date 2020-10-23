package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherAlertApplicationTest {

    WeatherAlertApp weatherAlertApp = new WeatherAlertApp();

    @Test
    public void shouldAddUserToLocation() {
        User user1 = Mockito.mock(User.class);
        Location krakow = Mockito.mock(Location.class);
        Notification notification = Mockito.mock(Notification.class);

        weatherAlertApp.addSubscriber(user1, krakow);
        weatherAlertApp.sendNotificationForAllUsers(notification);
        Mockito.verify(user1, Mockito.times(1)).receiveNotification(notification);
    }

    @Test
    public void shouldNotAddUserTwice() {
        User user1 = Mockito.mock(User.class);
        Location krakow = Mockito.mock(Location.class);
        Notification notification = Mockito.mock(Notification.class);

        weatherAlertApp.addSubscriber(user1, krakow);
        weatherAlertApp.addSubscriber(user1, krakow);
        weatherAlertApp.sendNotificationForOneLocationUsers(krakow, notification);
        Mockito.verify(user1, Mockito.times(1)).receiveNotification(notification);
    }

    @Test
    public void shouldSendNotificationForAllUser() {
        User user1 = Mockito.mock(User.class);
        User user2 = Mockito.mock(User.class);
        User user3 = Mockito.mock(User.class);
        Location krakow = Mockito.mock(Location.class);
        Location rabkazdroj = Mockito.mock(Location.class);
        Notification notification = Mockito.mock(Notification.class);

        weatherAlertApp.addSubscriber(user1, krakow);
        weatherAlertApp.addSubscriber(user2, krakow);
        weatherAlertApp.addSubscriber(user3, rabkazdroj);

        weatherAlertApp.sendNotificationForAllUsers(notification);
        Mockito.verify(user1, Mockito.times(1)).receiveNotification(notification);
        Mockito.verify(user2, Mockito.times(1)).receiveNotification(notification);
        Mockito.verify(user3, Mockito.times(1)).receiveNotification(notification);
    }


    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {
        User user1 = Mockito.mock(User.class);
        Location krakow = Mockito.mock(Location.class);
        Location rabkazdroj = Mockito.mock(Location.class);
        Notification notification = Mockito.mock(Notification.class);

        weatherAlertApp.addSubscriber(user1, krakow);
        weatherAlertApp.addSubscriber(user1, rabkazdroj);

        weatherAlertApp.sendNotificationForAllUsers(notification);
        Mockito.verify(user1, Mockito.times(1)).receiveNotification(notification);
    }

    @Test
    public void shouldSendNotificationOnlyForOneLocationUsers() {
        User user1 = Mockito.mock(User.class);
        User user2 = Mockito.mock(User.class);
        User user3 = Mockito.mock(User.class);
        Location krakow = Mockito.mock(Location.class);
        Location rabkazdroj = Mockito.mock(Location.class);
        Notification notification = Mockito.mock(Notification.class);

        weatherAlertApp.addSubscriber(user1, krakow);
        weatherAlertApp.addSubscriber(user2, krakow);
        weatherAlertApp.addSubscriber(user3, rabkazdroj);

        weatherAlertApp.sendNotificationForOneLocationUsers(krakow, notification);
        Mockito.verify(user1, Mockito.times(1)).receiveNotification(notification);
        Mockito.verify(user2, Mockito.times(1)).receiveNotification(notification);
        Mockito.verify(user3, Mockito.never()).receiveNotification(notification);
    }

    @Test
    public void shouldNotSendNotificationIfThisLocationDoesNotExistInDatabase() {
        User user1 = Mockito.mock(User.class);
        User user2 = Mockito.mock(User.class);
        Location krakow = Mockito.mock(Location.class);
        Location rabkazdroj = Mockito.mock(Location.class);
        Notification notification = Mockito.mock(Notification.class);

        weatherAlertApp.addSubscriber(user1, krakow);
        weatherAlertApp.addSubscriber(user2, krakow);

        weatherAlertApp.sendNotificationForOneLocationUsers(rabkazdroj, notification);
        Mockito.verify(user1, Mockito.never()).receiveNotification(notification);
        Mockito.verify(user2, Mockito.never()).receiveNotification(notification);
    }

    @Test
    public void shouldRemoveUserFromLocation() {
        User user = Mockito.mock(User.class);
        Location krakow = Mockito.mock(Location.class);
        Notification notification = Mockito.mock(Notification.class);
        weatherAlertApp.addSubscriber(user, krakow);
        weatherAlertApp.removeSubscriberFromLocation(user, krakow);
        weatherAlertApp.sendNotificationForOneLocationUsers(krakow, notification);

        Mockito.verify(user, Mockito.never()).receiveNotification(notification);
    }

    @Test
    public void shouldNotRemoveUserIfProvidedLocationDoesNotExistInDatabase() {
        User user1 = Mockito.mock(User.class);
        Location krakow = Mockito.mock(Location.class);
        Location rabkazdroj = Mockito.mock(Location.class);
        Notification notification = Mockito.mock(Notification.class);

        weatherAlertApp.addSubscriber(user1, krakow);

        weatherAlertApp.removeSubscriberFromLocation(user1, rabkazdroj);
        weatherAlertApp.sendNotificationForAllUsers(notification);
        Mockito.verify(user1, Mockito.times(1)).receiveNotification(notification);
    }

    @Test
    public void shouldRemoveUserFromAllLocation() {
        User user = Mockito.mock(User.class);
        Location krakow = Mockito.mock(Location.class);
        Location lodz = Mockito.mock(Location.class);
        Notification notification = Mockito.mock(Notification.class);
        weatherAlertApp.addSubscriber(user, krakow);
        weatherAlertApp.addSubscriber(user, lodz);
        weatherAlertApp.removeSubscriberFromAllLocations(user);
        weatherAlertApp.sendNotificationForAllUsers(notification);

        Mockito.verify(user, Mockito.never()).receiveNotification(notification);
    }

    @Test
    public void shouldRemoveLocationFromDatabase() {
        User user = Mockito.mock(User.class);
        Location krakow = Mockito.mock(Location.class);
        Notification notification = Mockito.mock(Notification.class);
        weatherAlertApp.addSubscriber(user, krakow);
        weatherAlertApp.deleteLocation(krakow);

        weatherAlertApp.sendNotificationForAllUsers(notification);

        Mockito.verify(user, Mockito.never()).receiveNotification(notification);
    }

    @Test
    public void shouldNotRemoveLocationFromDatabaseIfLocationDoesNotExistInDatabase() {
        User user = Mockito.mock(User.class);
        Location krakow = Mockito.mock(Location.class);
        Location lodz = Mockito.mock(Location.class);
        Notification notification = Mockito.mock(Notification.class);
        weatherAlertApp.addSubscriber(user, krakow);
        weatherAlertApp.deleteLocation(lodz);
        weatherAlertApp.sendNotificationForAllUsers(notification);

        Mockito.verify(user, Mockito.times(1)).receiveNotification(notification);
    }
}