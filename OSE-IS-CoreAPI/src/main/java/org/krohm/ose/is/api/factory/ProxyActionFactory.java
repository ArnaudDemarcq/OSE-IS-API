package org.krohm.ose.is.api.factory;

import org.krohm.ose.is.api.action.Action;

public interface ProxyActionFactory<Object> {

    Action getProxifiedAction(final Object configObject, final Action targetAction)
            throws Exception;

    void clear();
}
