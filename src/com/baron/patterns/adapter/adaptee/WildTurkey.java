package com.baron.patterns.adapter.adaptee;

/**
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("咯咯咯......");
    }

    @Override
    public void fly() {
        System.out.println("我火鸡哥玩儿命的挥动翅膀，好不容易才飞了一小段距离");
    }
}
