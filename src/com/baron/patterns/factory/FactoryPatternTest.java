package com.baron.patterns.factory;

import com.baron.patterns.factory.factory.ChicagoPizzaStore;
import com.baron.patterns.factory.factory.NYPizzaStore;
import com.baron.patterns.factory.product.Pizza;

/**
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class FactoryPatternTest {

    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("二狗子定了一个" + pizza.getName() + "\n");

        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        pizza = chicagoPizzaStore.orderPizza("clam");
        System.out.println("隔壁老王定了一个" + pizza.getName() + "\n");
    }
}
