package com.baron.patterns.strategy.behavior.impl;

import com.baron.patterns.strategy.behavior.QuackBehavior;


/**
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        //什么都不做，不会叫
        System.out.print("整个世界都清净了....  ps：我不会叫 :(");
    }
}
