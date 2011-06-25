/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.krohm.ose.is.api.engine;

/**
 *
 * @author arnaud
 */
public interface Engine {

    ActionService getActionService();

    WorkflowService getWorkflowServive();

    ComponentService getComponentService();

    ConfiguratorService getConfiguratorService();

    ProxyActionService getProxyActionService();

    PackageService getPackageService();
}
