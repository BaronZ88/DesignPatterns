package com.baron.patterns.strategy.behavior.impl;

import com.baron.patterns.strategy.behavior.FlyBehavior;

/**
 * 飞行行为的实现类（飞不了）
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        //什么都不做
        System.out.println("我不能飞 :(");
    }
}
