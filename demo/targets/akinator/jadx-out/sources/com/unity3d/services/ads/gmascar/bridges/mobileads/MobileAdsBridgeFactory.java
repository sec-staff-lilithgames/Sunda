package com.unity3d.services.ads.gmascar.bridges.mobileads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MobileAdsBridgeFactory {
    public MobileAdsBridgeBase createMobileAdsBridge() {
        MobileAdsBridge mobileAdsBridge = new MobileAdsBridge();
        if (mobileAdsBridge.exists()) {
            return mobileAdsBridge;
        }
        return null;
    }
}
