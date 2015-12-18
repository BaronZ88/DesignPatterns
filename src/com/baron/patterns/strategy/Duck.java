package com.baron.patterns.strategy;

import com.baron.patterns.strategy.behavior.FlyBehavior;
import com.baron.patterns.strategy.behavior.QuackBehavior;

/**
 * 鸭子抽象类（基类）
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public abstract class Duck {


    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    /**
     * 鸭子的外观
     */
    public abstract void display();

    /**
     * 游泳
     */
    public void swim() {
        System.out.println("我游啊游啊游......");
    }

    /**
     * 飞行
     */
    public void performFly() {
        //将飞行这件小事委托给行为类
        if (flyBehavior != null)
            flyBehavior.fly();
    }

    /**
     * 叫
     */
    public void performQuack() {
        //将浪叫这件小事委托给行为类
        if (quackBehavior != null)
            quackBehavior.quack();
    }

    /**
     * 设置鸭子的飞行行为
     *
     * @param flyBehavior 飞
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * 设置鸭子叫的行为
     *
     * @param quackBehavior 叫
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


}
