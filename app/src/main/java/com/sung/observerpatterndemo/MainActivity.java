package com.sung.observerpatterndemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sung.observerpatterndemo.observer.RealObserver;
import com.sung.observerpatterndemo.subject.RealSubject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test();
    }

    private void test(){
        //被观察者
        RealSubject realSubject = new RealSubject();

        //观察者
        RealObserver observer1 = new RealObserver(realSubject,"observer1");
        RealObserver observer2 = new RealObserver(realSubject,"observer2");
        RealObserver observer3 = new RealObserver(realSubject,"observer3");
        RealObserver observer4 = new RealObserver(realSubject,"observer4");

        //被观察者下发任务
        realSubject.publishJob("job publish !!");
    }
}
