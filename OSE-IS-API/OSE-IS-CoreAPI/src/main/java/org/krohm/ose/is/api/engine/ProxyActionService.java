/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.krohm.ose.is.api.engine;

import org.krohm.ose.is.api.engine.internal.ObjectRegisterer;
import org.krohm.ose.is.api.proxyaction.ProxyAction;

/**
 *
 * @author arnaud
 */
public interface ProxyActionService extends ObjectRegisterer<Class<? extends ProxyAction>> {

    void register(ProxyAction proxyActionPrototype, String identifier);

    String register(ProxyAction proxyActionPrototype);
}
