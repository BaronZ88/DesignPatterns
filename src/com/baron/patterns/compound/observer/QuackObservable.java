package com.baron.patterns.compound.observer;

import java.util.Observer;

/**
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public interface QuackObservable {

    void registerObservable(Observer observer);

    void notifyObservers();
}
