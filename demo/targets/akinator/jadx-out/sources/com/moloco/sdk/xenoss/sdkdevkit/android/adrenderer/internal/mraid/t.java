package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class t {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a a(r rVar) {
        e0.checkNotNullParameter(rVar, "<this>");
        int i10 = s.f48117a[rVar.ordinal()];
        if (i10 == 1) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.f48335b;
        }
        if (i10 == 2) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.f48336c;
        }
        if (i10 == 3) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.f48337e;
        }
        throw new tu.t();
    }
}
