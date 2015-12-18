package com.baron.patterns.factory.product;

/**
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "芝加哥田园风光芝士披萨";
        dough = "朝鲜进贡的金三胖专用白面";
        sauce = "菠萝、小番茄、胡萝卜";
    }

    @Override
    public void cut() {
        System.out.println("这次咱切成五角形");
    }
}
