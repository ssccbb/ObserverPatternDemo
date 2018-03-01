package com.sung.observerpatterndemo.subject;

import com.sung.observerpatterndemo.observer.Observer;

/**
 * Created by sung on 2018/3/1.
 *
 * 被观察者接口
 */

public interface Subject {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObserver();
}
