package org.example.Observable;

import org.example.Observer.NotificationAlertObserver;

public interface Observable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setStockCout(int count);
    public int getStockCount();
}
