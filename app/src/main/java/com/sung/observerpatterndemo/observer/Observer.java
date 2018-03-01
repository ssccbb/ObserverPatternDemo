package com.sung.observerpatterndemo.observer;

/**
 * Created by sung on 2018/3/1.
 *
 * 观察者接口（根据subject更新执行业务逻辑）
 */

public interface Observer {
    //业务逻辑
    void update(String string);
}
