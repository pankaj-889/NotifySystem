package org.example;

import org.example.Observable.IPhoneObservableImpl;
import org.example.Observable.Observable;
import org.example.Observer.EmailAlertObservImpl;
import org.example.Observer.MobileAlertObservImpl;
import org.example.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {

        Observable IphoneObservable = new IPhoneObservableImpl();

        NotificationAlertObserver observer1 = new MobileAlertObservImpl("pankaj",IphoneObservable);
        NotificationAlertObserver observer2 = new EmailAlertObservImpl("hello.com",IphoneObservable);
        NotificationAlertObserver observer3 = new EmailAlertObservImpl("world.com",IphoneObservable);

        IphoneObservable.add(observer1);
        IphoneObservable.add(observer2);
        IphoneObservable.add(observer3);

        IphoneObservable.setStockCout(10); // push the notification
        IphoneObservable.setStockCout(0); // push nothing
        IphoneObservable.setStockCout(5); // push the notification 

    }
}
