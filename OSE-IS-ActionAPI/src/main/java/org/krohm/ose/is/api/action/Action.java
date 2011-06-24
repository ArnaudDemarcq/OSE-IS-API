package org.krohm.ose.is.api.action;

import java.util.Map;

public interface Action {

    void init() throws Exception;

    void run(final Map context) throws Exception;

    void shutdown() throws Exception;
}
