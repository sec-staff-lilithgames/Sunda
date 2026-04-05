package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.MolocoLogger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class d0 {
    public static final void b(String str) {
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "DECLoaderImpl", str, false, 4, null);
    }

    public static final b0 a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h mediaCacheRepository, com.moloco.sdk.internal.error.c errorReportingService) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        kotlin.jvm.internal.e0.checkNotNullParameter(errorReportingService, "errorReportingService");
        return new c0(mediaCacheRepository, errorReportingService);
    }
}
