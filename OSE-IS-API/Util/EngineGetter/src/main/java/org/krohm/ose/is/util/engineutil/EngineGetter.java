package org.krohm.ose.is.util.engineutil;

import org.krohm.ose.is.api.engine.Engine;
import org.krohm.ose.is.api.engine.EngineAware;

@Deprecated
public class EngineGetter implements EngineAware {

    private static Engine engine;

    public final void setEngine(Engine engine) {
        EngineGetter.engine = engine;
    }

    public final Engine getEngine() {
        return EngineGetter.engine;
    }

    public static final Engine getEngineStatic() {
        return EngineGetter.engine;
    }
}
