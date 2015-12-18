package com.baron.patterns.decorator.decorator;

import com.baron.patterns.decorator.component.Beverage;

/**
 * 奶泡，装饰者
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "，加奶泡";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + .88;
    }
}
