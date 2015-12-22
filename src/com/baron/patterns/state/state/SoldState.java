package com.baron.patterns.state.state;

/**
 * 状态之售出糖果
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("等等骚年，我们已经给你一个糖果了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("抱歉，你已经拨动曲柄，现在无法退币了");
    }

    @Override
    public void turnCrank() {
        System.out.println("好的，我们将会给你颗糖果");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            System.out.println("发糖果啦");
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("妈蛋，糖果卖完了！！！");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
