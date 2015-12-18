package com.baron.patterns.strategy;

import com.baron.patterns.strategy.behavior.impl.FlyNoWay;
import com.baron.patterns.strategy.behavior.impl.Quack;

/**
 * Duck的子类，野鸭
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我可是一只货真价实的野鸭子！");
    }
}
