package org.krohm.ose.is.api.proxyaction;

import org.krohm.ose.is.api.action.Action;


public interface ProxyAction extends Action {

    void setAction(final Action action);

    Action getAction();
}
