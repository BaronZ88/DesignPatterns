package com.baron.patterns.factory.factory;

import com.baron.patterns.factory.product.NYStyleCheesePizza;
import com.baron.patterns.factory.product.NYStyleClamPizza;
import com.baron.patterns.factory.product.Pizza;

/**
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {

        if ("cheese".equals(type)) {
            return new NYStyleCheesePizza();
        } else if ("clam".equals(type)) {
            return new NYStyleClamPizza();
        }
        return null;
    }
}

