package com.baron.patterns.state.state;

import com.baron.patterns.state.state.*;

/**
 * 糖果售卖机
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class GumballMachine {

    private HasQuarterState hasQuarterState;
    private NoQuarterState noQuarterState;
    private SoldOutState soldOutState;
    private SoldState soldState;

    private State state = soldOutState;
    private int count = 0;//售卖机剩余糖果数量

    public GumballMachine(int numberGumballs) {
        this.hasQuarterState = new HasQuarterState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.soldOutState = new SoldOutState(this);
        this.soldState = new SoldState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            this.state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }


    void releaseBall() {
        System.out.println("售出糖果");
        if (count > 0) {
            count--;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public HasQuarterState getHasQuarterState() {
        return hasQuarterState;
    }

    public NoQuarterState getNoQuarterState() {
        return noQuarterState;
    }

    public SoldOutState getSoldOutState() {
        return soldOutState;
    }

    public SoldState getSoldState() {
        return soldState;
    }
}
