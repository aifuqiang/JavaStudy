package com.javastudy.DesignMode.Decorator.ModeRel;

/**
 * ����װ������
 * Created by MQ on 2017/4/16.
 */

public class FruitDecorator extends Decorator {
    Sweet sweet;

    public FruitDecorator(Sweet sweet) {
        this.sweet = sweet;
    }

    @Override
    public String getDescription() {
        return sweet.getDescription() + "ˮ����";
    }

    @Override
    public double cost() {
        return sweet.cost() + 10;
    }
}
