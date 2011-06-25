package org.krohm.ose.is.util.proxyaction.impl;

import org.krohm.ose.is.api.action.Action;
import org.krohm.ose.is.api.proxyaction.ProxyAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;

public abstract class ProxyActionImpl implements ProxyAction {

    protected static final Logger logger = LoggerFactory.getLogger(ProxyActionImpl.class);
    protected Action targetAction = null;

    public void init() throws Exception {
        // cascading init
        targetAction.init();
    }

    public final void run(final Map context) throws Exception {
        beforeRun(context);
        try {
            targetAction.run(context);
        } catch (final Exception e) {
            onException(context, e);
        }
        afterRun(context);
        if (logger.isDebugEnabled()) {
            logger.debug("TestProxy run ended");
        }
    }

    protected abstract void beforeRun(final Map context);

    protected abstract void afterRun(final Map context);

    protected void onException(final Map context, final Exception e)
            throws Exception {
        throw e;
    }

    public void shutdown() throws Exception {
        logger.info("Calling shutdown for proxyAction");
        targetAction.shutdown();
    }

    public final void setAction(final Action action) {
        targetAction = action;
    }

    public final Action getAction() {
        return targetAction;
    }
}
