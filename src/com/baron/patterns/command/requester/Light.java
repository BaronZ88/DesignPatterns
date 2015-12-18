package com.baron.patterns.command.requester;

/**
 * 点灯，发出请求的对象
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class Light {

    public void on() {
        System.out.println("等开了");
    }

    public void off() {
        System.out.println("妈蛋啊，灯关了！！！");
    }
}
