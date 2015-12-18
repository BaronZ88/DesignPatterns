package com.baron.patterns.factory.factory;

import com.baron.patterns.factory.product.*;

/**
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {

        if ("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        } else if ("clam".equals(type)) {
            return new ChicagoStyleClamPizza();
        }
        return null;
    }
}
