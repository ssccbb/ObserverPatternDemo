package com.sung.observerpatterndemo.subject;

import com.sung.observerpatterndemo.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sung on 2018/3/1.
 *
 * 被观察者实现类
 * */
public class RealSubject implements Subject {
    //观察者不止一个添加一个list用于存储创建的observer
    private List<Observer> observers = new ArrayList<>();

    //被传递的arg
    private String jobInfo = "";

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        if (!observers.contains(observer))
            return;
        observers.remove(observers.indexOf(observer));
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(jobInfo);
        }
    }

    /**********          被观察者业务逻辑（即所有需要监听的逻辑）           **********/
    public void publishJob(String jobInfo){
        this.jobInfo = jobInfo;
        this.notifyObserver();
    }
}
