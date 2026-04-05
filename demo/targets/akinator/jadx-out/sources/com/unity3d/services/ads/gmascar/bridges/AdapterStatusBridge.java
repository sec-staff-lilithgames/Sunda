package com.unity3d.services.ads.gmascar.bridges;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.reflection.GenericBridge;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class AdapterStatusBridge extends GenericBridge {
    private static final String initializeStateMethodName = "getInitializationState";
    private Class _adapterStateClass;

    public AdapterStatusBridge() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super(new HashMap<String, Class<?>[]>() { // from class: com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge.1
            {
                put(AdapterStatusBridge.initializeStateMethodName, new Class[0]);
            }
        });
        AdapterStatusStateBridge adapterStatusStateBridge = new AdapterStatusStateBridge();
        try {
            this._adapterStateClass = Class.forName(adapterStatusStateBridge.getClassName());
        } catch (ClassNotFoundException e10) {
            DeviceLog.debug("ERROR: Could not find class %s %s", adapterStatusStateBridge.getClassName(), e10.getLocalizedMessage());
        }
    }

    public Object[] getAdapterStatesEnum() {
        return this._adapterStateClass.getEnumConstants();
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.google.android.gms.ads.initialization.AdapterStatus";
    }

    public boolean isGMAInitialized(Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object[] adapterStatesEnum = getAdapterStatesEnum();
        if (adapterStatesEnum != null) {
            return callNonVoidMethod(initializeStateMethodName, obj, new Object[0]) == adapterStatesEnum[1];
        }
        DeviceLog.debug("ERROR: Could not get adapter states enum from AdapterStatus.State");
        return false;
    }
}
