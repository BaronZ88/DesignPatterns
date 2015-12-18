package com.baron.patterns.strategy.behavior.impl;

import com.baron.patterns.strategy.behavior.FlyBehavior;


/**
 * 飞行行为的实现类，执行具体的飞行行为
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        //挥动翅膀飞行
        System.out.println("我飞起来了!!!");
    }
}
