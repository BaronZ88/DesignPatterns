package com.baron.patterns.state.state;

/**
 * 状态之木有钱
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        //这里加入投币代码
        System.out.println("客官您投入了25分硬币");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        //这里加入退币代码
        System.out.println("小子！你特么都没投钱，还要求退币？！！！");
    }

    @Override
    public void turnCrank() {
        //这里加入转动曲柄代码
        System.out.println("没给钱拨你妹的曲柄开关啊");
    }

    @Override
    public void dispense() {
        //这里加入发糖果代码
        System.out.println("哥哥，咱先给钱好不好");
    }
}
