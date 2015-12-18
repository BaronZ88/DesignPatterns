package com.baron.patterns.strategy;

import com.baron.patterns.strategy.behavior.impl.FlyWithWings;
import com.baron.patterns.strategy.behavior.impl.MuteQuack;

/**
 * 鸭子模拟器，测试类
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class StrategyPatternTest {

    public static void main(String[] args) {

        Duck duck = new MallardDuck();
        duck.swim();
        duck.display();
        duck.performFly();
        duck.performQuack();

        //现在会飞了
        duck.setFlyBehavior(new FlyWithWings());
        duck.performFly();
        //可是不会叫了
        duck.setQuackBehavior(new MuteQuack());
        duck.performQuack();
    }

}
