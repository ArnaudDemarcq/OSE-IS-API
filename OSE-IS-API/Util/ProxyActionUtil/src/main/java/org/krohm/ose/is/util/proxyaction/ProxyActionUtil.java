package org.krohm.ose.is.util.proxyaction;


import org.krohm.ose.is.api.action.Action;
import org.krohm.ose.is.api.proxyaction.ProxyAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ProxyActionUtil {

    private static final Logger logger = LoggerFactory.getLogger(ProxyActionUtil.class);

    private static final Action getFinalTargetActionInternal(final ProxyAction pa) {
        Action tmpAction = pa.getAction();
        // not really clean, but it works
        if (tmpAction instanceof ProxyAction) {
            tmpAction = getFinalTargetActionInternal((ProxyAction) tmpAction);
        }
        if (tmpAction == null) {
            return tmpAction;
        }
        logger.info("" + tmpAction.hashCode());
        return tmpAction;
    }

    public static final Action getFinalTargetAction(final ProxyAction pa) {
        return getFinalTargetActionInternal(pa);
    }
}
