package com.unity3d.services.ads.gmascar.bridges;

import com.unity3d.services.core.reflection.GenericBridge;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class InitializationStatusBridge extends GenericBridge {
    private static final String adapterStatusMapMethodName = "getAdapterStatusMap";

    public InitializationStatusBridge() {
        super(new HashMap<String, Class<?>[]>() { // from class: com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge.1
            {
                put(InitializationStatusBridge.adapterStatusMapMethodName, new Class[0]);
            }
        });
    }

    public Map<String, Object> getAdapterStatusMap(Object obj) {
        return (Map) callNonVoidMethod(adapterStatusMapMethodName, obj, new Object[0]);
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.google.android.gms.ads.initialization.InitializationStatus";
    }
}
