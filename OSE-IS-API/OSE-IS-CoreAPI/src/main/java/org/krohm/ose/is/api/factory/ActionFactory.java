package org.krohm.ose.is.api.factory;

import org.krohm.ose.is.api.action.Action;

public interface ActionFactory {

    Action getUnsafeAction(final Object configObject);

    Action getAction(final Object configObject) throws Exception;

    void destroyAction(final Object configObject) throws Exception;

    void clear();
}
