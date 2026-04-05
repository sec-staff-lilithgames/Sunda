package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class b {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r a(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, String adm, e0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(adm, "adm");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        return new a(context, customUserEventBuilderService, adm, externalLinkHandler, watermark);
    }
}
