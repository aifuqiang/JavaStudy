package com.javastudy.DesignMode.Observer.SystemObserver;

import com.javastudy.DesignMode.Observer.ModeRel.ObserverBean;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by mq on 2017/9/25 上午1:01
 * mqcoder90@gmail.com
 * 观察者B
 */

public class SystemObserverB implements Observer {

    @Override
    public void update(Observable observable, Object o) {
        if (o instanceof ObserverBean
                && observable instanceof NetSubject) {
            ObserverBean bean = (ObserverBean) o;
            System.out.print("ConcreteObserverB 网络类型："
                    + bean.netType + ",网络状态：" + bean.netStatus + "\n");
        }
    }
}
