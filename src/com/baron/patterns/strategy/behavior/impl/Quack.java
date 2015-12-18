package com.baron.patterns.strategy.behavior.impl;

import com.baron.patterns.strategy.behavior.QuackBehavior;


/**
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        //实现鸭子嘎嘎叫
        System.out.println("嘎嘎嘎嘎嘎嘎嘎......");
    }
}
