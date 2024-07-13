package org.example.Observer;

import org.example.Observable.Observable;

public class MobileAlertObservImpl implements NotificationAlertObserver{

    public String username;
    public Observable observable;


    public MobileAlertObservImpl(String username, Observable observable){
        this.username = username;
        this.observable = observable;
    }


    @Override
    public void update() {
        sendNotification(username);
    }

    private void sendNotification(String username){
        System.out.println("Notification sent to: " + username);
    }
}
