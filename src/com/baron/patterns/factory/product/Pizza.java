package com.baron.patterns.factory.product;

import java.util.ArrayList;

/**
 * 抽象披萨类
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public abstract class Pizza {

    String name;//披萨名
    String dough;//面团
    String sauce;//调料

    public void prepare(){
        System.out.println("我们准备制作"+name);
        System.out.println("开始和面....,采用的是"+dough);
        System.out.println("添加"+sauce);
    }

    /**
     * 烘培
     */
    public void bake(){
        System.out.println("烘培25分中");
    }

    /**
     * 切块
     */
    public void cut(){
        System.out.println("把披萨切成斜片");
    }

    /**
     * 包装
     */
    public void box(){
        System.out.println("将披萨装载连锁店的盒子里");
    }

    public String getName() {
        return name;
    }
}
