package com.baron.patterns.decorator.decorator;

import com.baron.patterns.decorator.component.Beverage;

/**
 * 摩卡，装饰者
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "，加摩卡";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 1.99;
    }
}
