package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class U7 {
    public final String a() {
        String OMID_LIB_VERSION = Hc.f34589f;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(OMID_LIB_VERSION, "OMID_LIB_VERSION");
        return OMID_LIB_VERSION;
    }

    public final String b() {
        return Hc.f34588e;
    }

    public final String c() {
        String sDKVersion = SDKUtils.getSDKVersion();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        return sDKVersion;
    }
}
