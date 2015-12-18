package com.baron.patterns.adapter.adaptee;

/**
 * 火鸡接口，被适配者
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public interface Turkey {

    void gobble();//火鸡不会呱呱叫，只会咯咯(gobble)叫

    void fly();//火鸡也会飞，但是并飞不远
}
