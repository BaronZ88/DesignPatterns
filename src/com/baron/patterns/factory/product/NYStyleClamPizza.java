package com.baron.patterns.factory.product;

/**
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        name = "纽约韭菜炒蛋披萨";
        dough = "中国大东北进口的高级白面";
        sauce = "韭菜、鸡蛋";
    }

    @Override
    public void box() {
        System.out.println("将披萨装进印有纽约店logo的包装盒里");
    }
}
