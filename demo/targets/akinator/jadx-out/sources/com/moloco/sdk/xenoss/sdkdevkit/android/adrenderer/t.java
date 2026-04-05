package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import com.moloco.sdk.service_locator.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class t {
    public static /* synthetic */ r a(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar, o oVar, com.moloco.sdk.internal.ortb.model.c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 e0Var, e0 e0Var2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            oVar = null;
        }
        return a(context, bVar, oVar, cVar, e0Var, e0Var2);
    }

    public static final r a(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, o oVar, com.moloco.sdk.internal.ortb.model.c bid, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 externalLinkHandler, e0 watermark) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(bid, "bid");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.u(context, customUserEventBuilderService, oVar, bid, externalLinkHandler, watermark);
    }

    public static final r a(Context context, String adm, com.moloco.sdk.internal.services.c0 clickthroughService, e0 watermark, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(adm, "adm");
        kotlin.jvm.internal.e0.checkNotNullParameter(clickthroughService, "clickthroughService");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d(context, adm, clickthroughService, watermark, a.h.f47463a.f(), a.i.f47469a.c(), metricsRecorder);
    }
}
