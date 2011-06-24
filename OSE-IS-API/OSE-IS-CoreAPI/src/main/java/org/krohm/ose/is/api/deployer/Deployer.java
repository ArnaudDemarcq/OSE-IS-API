/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.krohm.ose.is.api.deployer;

import org.krohm.ose.is.api.engine.EngineAware;

/**
 *
 * @author arnaud
 */
public interface Deployer extends EngineAware, Runnable {

    void init();
}
