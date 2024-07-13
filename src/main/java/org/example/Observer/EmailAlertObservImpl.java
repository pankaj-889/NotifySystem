package org.example.Observer;

import org.example.Observable.Observable;

public class EmailAlertObservImpl implements NotificationAlertObserver{

    public String email;
    public Observable observable;

    public EmailAlertObservImpl(String email, Observable observable){
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
       sendMail(email);
    }

    private void sendMail(String email){
        System.out.println("Email sent to: " + email);
    }
}
