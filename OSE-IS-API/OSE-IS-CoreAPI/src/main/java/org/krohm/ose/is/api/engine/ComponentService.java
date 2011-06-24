/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.krohm.ose.is.api.engine;

import org.krohm.ose.is.api.action.Action;
import org.krohm.ose.is.api.engine.internal.ObjectRegisterer;
import org.krohm.ose.is.api.factory.ActionFactory;

/**
 *
 * @author arnaud
 */
//public interface ComponentService extends ObjectRegisterer<ActionFactory> {
public interface ComponentService  extends ObjectRegisterer<Class<? extends Action>>  {

    void register(Action actionInstance, String identifier);

    String register(Action actionInstance);
}
