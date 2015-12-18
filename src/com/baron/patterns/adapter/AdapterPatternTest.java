package com.baron.patterns.adapter;

import com.baron.patterns.adapter.adaptee.WildTurkey;
import com.baron.patterns.adapter.adapter.TurkeyAdapter;
import com.baron.patterns.adapter.target.Duck;
import com.baron.patterns.adapter.target.MallardDuck;

/**
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class AdapterPatternTest {

    public static void main(String[] args) {

        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        TurkeyAdapter adapter = new TurkeyAdapter(turkey);

        System.out.println("==========火鸡===========");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n==========鸭子===========");
        testDuck(duck);

        System.out.println("\n==========适配器===========");
        testDuck(adapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
