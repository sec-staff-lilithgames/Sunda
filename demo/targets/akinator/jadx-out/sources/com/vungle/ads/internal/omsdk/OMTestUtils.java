package com.vungle.ads.internal.omsdk;

import com.iab.omid.library.vungle.Omid;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class OMTestUtils {
    public static final OMTestUtils INSTANCE = new OMTestUtils();

    private OMTestUtils() {
    }

    public final boolean isOmidActive() {
        return Omid.isActive();
    }
}
