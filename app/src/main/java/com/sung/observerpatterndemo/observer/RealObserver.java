package com.sung.observerpatterndemo.observer;

import android.util.Log;

import com.sung.observerpatterndemo.subject.RealSubject;

/**
 * Created by sung on 2018/3/1.
 */
public class RealObserver implements Observer {
    private static final String TAG = RealSubject.class.getSimpleName();

    private RealSubject realSubject;//方便用于沟通
    private String tag = "";//观察者标识

    public RealObserver(RealSubject realSubject, String tag) {
        this.realSubject = realSubject;
        this.tag = tag;

        //每次创建添加进list
        this.realSubject.addObserver(this);
    }

    @Override
    public void update(String string) {
        Log.e(TAG, tag+"\tget meseage: "+string );
    }
}
