package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.service_locator.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class i {
    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r a(Context context, com.moloco.sdk.internal.ortb.model.c cVar, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar, b0 b0Var, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            eVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g.a(context);
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e eVar2 = eVar;
        if ((i10 & 32) != 0) {
            b0Var = a.C0394a.f47435a.a();
        }
        return a(context, cVar, z10, e0Var, eVar2, b0Var);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r a(Context context, com.moloco.sdk.internal.ortb.model.c bid, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e loadVast, b0 decLoader) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(bid, "bid");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.e0.checkNotNullParameter(loadVast, "loadVast");
        kotlin.jvm.internal.e0.checkNotNullParameter(decLoader, "decLoader");
        return new h(context, bid, loadVast, decLoader, z10, watermark);
    }
}
