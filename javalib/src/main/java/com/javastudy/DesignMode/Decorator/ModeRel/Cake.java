package com.javastudy.DesignMode.Decorator.ModeRel;

/**
 * ���屻װ������
 * Created by MQ on 2017/4/16.
 */

public class Cake extends Sweet {
    @Override
    public String getDescription() {
        return "һ�����⣬";
    }

    @Override
    public double cost() {
        return 66;
    }
}
