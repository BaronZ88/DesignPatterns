package com.baron.patterns.state;

import com.baron.patterns.state.state.GumballMachine;

/**
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class StatePatternTest {

    public static void main(String[] args) {

        GumballMachine machine = new GumballMachine(10);
        machine.insertQuarter();
        machine.turnCrank();
        System.out.println("剩余糖果："+machine.getCount()+"\n");

        machine.ejectQuarter();
        machine.turnCrank();
        System.out.println("剩余糖果：" + machine.getCount() + "\n");

        machine.insertQuarter();
        machine.ejectQuarter();
        System.out.println("剩余糖果：" + machine.getCount() + "\n");

        machine.insertQuarter();
        machine.turnCrank();
        System.out.println("剩余糖果："+machine.getCount()+"\n");
    }
}
