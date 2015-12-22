package com.baron.patterns.state.state;

/**
 * 状态接口，所有糖果机的状态都必须实现这一接口。接口的方法直接隐射到糖果机上可能发生的动作.
 * <p/>
 * 准确的说接口中的方法是糖果机在该状态下的操作
 *
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public interface State {

    /**
     * 投入25分硬币
     */
    void insertQuarter();

    /**
     * 吐出25分硬币
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     */
    void turnCrank();

    /**
     * 发放糖果
     */
    void dispense();
}
