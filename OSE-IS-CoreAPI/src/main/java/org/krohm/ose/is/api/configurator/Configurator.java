/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.krohm.ose.is.api.configurator;

import org.krohm.ose.is.api.action.Action;

/**
 *
 * @author arnaud
 */
public interface Configurator<T> {

    public static int NOT_ELIGIBLE = 0;
    public static int GENERIC = 1;
    public static int SPECIFIC = 2;
    public static int UNIC = 3;
    public static int FINAL = 4;

    Action configureAction(Action action, T configObject);

    int isEligibleAction(Action action);

    int isEligibleConfig(Object configObject);

    String getServiceName(T configObject);
}
