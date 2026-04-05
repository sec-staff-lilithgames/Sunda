package com.unity3d.services.ads.gmascar.bridges.mobileads;

import android.content.Context;
import com.unity3d.services.core.reflection.GenericBridge;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class MobileAdsBridgeBase extends GenericBridge implements IMobileAdsBridge {
    public static final String initializationStatusMethodName = "getInitializationStatus";
    public static final String initializeMethodName = "initialize";

    public MobileAdsBridgeBase(Map<String, Class<?>[]> map) {
        super(map);
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.google.android.gms.ads.MobileAds";
    }

    @Override // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public Object getInitializationStatus() {
        return callNonVoidMethod(initializationStatusMethodName, null, new Object[0]);
    }

    @Override // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public String getVersionString() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object objCallNonVoidMethod = callNonVoidMethod(getVersionMethodName(), null, new Object[0]);
        return objCallNonVoidMethod == null ? "0.0.0" : objCallNonVoidMethod.toString();
    }

    public abstract boolean hasSCARBiddingSupport();

    @Override // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public void initialize(Context context, Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        callVoidMethod(initializeMethodName, null, context, obj);
    }
}
