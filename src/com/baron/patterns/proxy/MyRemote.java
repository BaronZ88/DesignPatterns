package com.baron.patterns.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Baron Zhang (baron[dot]zhanglei[at]gmail[dot]com)
 * @version 1.0
 * @since 1.0
 */
public interface MyRemote extends Remote {

    public String sayHello() throws RemoteException;
}
