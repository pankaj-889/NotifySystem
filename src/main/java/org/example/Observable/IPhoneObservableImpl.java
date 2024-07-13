package org.example.Observable;

import org.example.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements Observable{

    public int stockCount;
    public List<NotificationAlertObserver> observers = new ArrayList<>();

    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer : observers){
            observer.update();
        }
    }

    @Override
    public void setStockCout(int count) {
        if (stockCount == 0){
            notifySubscribers();
        }
        stockCount = count;

    }

    public int getStockCount(){
        return stockCount;
    }
}
