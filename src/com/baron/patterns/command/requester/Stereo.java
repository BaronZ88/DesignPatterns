package com.baron.patterns.command.requester;

/**
 * 音响，发出请求的对象
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class Stereo {

    public void on() {
        System.out.println("打开音响");
    }

    public void setCD() {
        System.out.println("放入CD");
    }

    public void setVolume(int i) {
        System.out.println("设置播放音量为：" + i);
    }

    public void off(){
        System.out.println("关闭音响");
    }
}
