package com.baron.patterns.strategy.behavior.impl;

import com.baron.patterns.strategy.behavior.QuackBehavior;


/**
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        //实现鸭子吱吱叫
        System.out.println("吱吱吱吱吱吱吱......");
    }
}
