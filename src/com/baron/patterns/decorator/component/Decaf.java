package com.baron.patterns.decorator.component;

/**
 * 脱因咖啡，被装饰者
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class Decaf extends Beverage {

    public Decaf(){
        description = "脱因咖啡";
    }

    @Override
    public double cost() {
        return 4.89;
    }
}
