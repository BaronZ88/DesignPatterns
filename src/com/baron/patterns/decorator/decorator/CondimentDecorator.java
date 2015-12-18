package com.baron.patterns.decorator.decorator;

import com.baron.patterns.decorator.component.Beverage;

/**
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
