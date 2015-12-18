package com.baron.patterns.decorator.component;

/**
 * 饮料，被装饰者抽象基类
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public abstract class Beverage {

    String description = "还不知道是什么饮料";

    /**
     * @return 返回饮料详细描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 计算价格
     *
     * @return double类型的价格
     */
    public abstract double cost();
}
