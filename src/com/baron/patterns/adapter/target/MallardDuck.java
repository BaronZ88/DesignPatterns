package com.baron.patterns.adapter.target;

/**
 * 绿头鸭，目标对象
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("呱呱呱......");
    }

    @Override
    public void fly() {
        System.out.println("鸭哥我虽然带了绿帽子，但是依然可以只有飞翔！");
    }
}
