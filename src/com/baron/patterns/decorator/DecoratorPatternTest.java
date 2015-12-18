package com.baron.patterns.decorator;

import com.baron.patterns.decorator.component.Beverage;
import com.baron.patterns.decorator.component.DarkRoast;
import com.baron.patterns.decorator.component.Decaf;
import com.baron.patterns.decorator.decorator.Mocha;
import com.baron.patterns.decorator.decorator.Whip;

/**
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class DecoratorPatternTest {

    public static void main(String[] args) {

        Beverage beverage = new Decaf();//这是顾客要的脱因咖啡
        beverage = new Mocha(beverage);//顾客想要摩卡，用摩卡装饰
        beverage = new Whip(beverage);//顾客想要奶泡，用奶泡装饰
        System.out.println(beverage.getDescription() + " 共花费$" + beverage.cost());

        Beverage beverage2 = new DarkRoast();//这是顾客要的深培咖啡
        beverage2 = new Mocha(beverage2);//顾客想要摩卡，用摩卡装饰
        beverage2 = new Mocha(beverage2);//顾客想要摩卡，用摩卡装饰
        beverage2 = new Whip(beverage2);//顾客想要奶泡，用奶泡装饰
        System.out.println(beverage2.getDescription() + " 共花费$" + beverage2.cost());
    }
}
