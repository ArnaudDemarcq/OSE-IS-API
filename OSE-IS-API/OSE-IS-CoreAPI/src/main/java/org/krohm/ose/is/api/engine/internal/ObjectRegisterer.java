/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.krohm.ose.is.api.engine.internal;

/**
 *
 * @author arnaud
 */
public interface ObjectRegisterer<T> {

    String register(T registrableObject);

    void register(T registrableObject, String identifier);

    void unregister(String identifier);

    T getRegistered(String identifier) throws InterruptedException;

    T getRegistered(String identifier, long timeout) throws InterruptedException;

    T getRegisteredUnsafe(String identifier);
}
