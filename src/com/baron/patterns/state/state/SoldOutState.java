package com.baron.patterns.state.state;

/**
 * 状态之售罄
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("不能投币，糖果卖完了！");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("无法退币，你没投币！");
    }

    @Override
    public void turnCrank() {
        System.out.println("没糖果了，拨你妹的曲柄啊！！！");
    }

    @Override
    public void dispense() {
        System.out.println("没有可以售出的糖果");
    }
}
