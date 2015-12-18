package com.baron.patterns.adapter.adapter;

import com.baron.patterns.adapter.adaptee.Turkey;
import com.baron.patterns.adapter.target.Duck;

/**
 * 适配器，将火鸡的接口转换成鸭子的接口
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        //虽然火鸡也能飞，但是飞行距离太短，需要多次挥动它那萌萌哒的翅膀才能和火鸡飞的一样远
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
