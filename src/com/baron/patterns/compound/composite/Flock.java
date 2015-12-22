package com.baron.patterns.compound.composite;

import com.baron.patterns.compound.model.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public class Flock implements Quackable {

    ArrayList<Quackable> quackers = new ArrayList<Quackable>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {

        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
        }
    }
}
