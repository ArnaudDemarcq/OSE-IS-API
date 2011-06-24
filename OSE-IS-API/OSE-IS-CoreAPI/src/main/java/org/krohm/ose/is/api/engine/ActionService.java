/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.krohm.ose.is.api.engine;

import org.krohm.ose.is.api.action.Action;

/**
 *
 * @author arnaud
 */
public interface ActionService {

    Object getKeyObject(Action actionInstance);

    Action getAction(final Object keyObject) throws Exception;

    Action getAction(final Object keyObject, long timeout) throws Exception;

    void unregisterConfig(Object keyObject);
}
