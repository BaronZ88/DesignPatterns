package com.baron.patterns.decorator.component;

/**
 * 深培咖啡，被装饰者
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "深培咖啡";
    }

    @Override
    public double cost() {
        return 3.99;
    }
}
