package com.moloco.sdk.internal.error.api;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.i;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final i f45900a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.a f45901b;

    public b(i timeProviderService, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.a httpClient) {
        e0.checkNotNullParameter(timeProviderService, "timeProviderService");
        e0.checkNotNullParameter(httpClient, "httpClient");
        this.f45900a = timeProviderService;
        this.f45901b = httpClient;
    }

    @Override // com.moloco.sdk.internal.error.api.a
    public void a(Throwable error) {
        e0.checkNotNullParameter(error, "error");
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "ErrorReportingApi", "SDK Crashed", error, false, 8, null);
    }

    @Override // com.moloco.sdk.internal.error.api.a
    public void a(String error, String url, com.moloco.sdk.internal.error.a errorMetadata) {
        e0.checkNotNullParameter(error, "error");
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(errorMetadata, "errorMetadata");
        String strB = com.moloco.sdk.internal.utils.b.b(com.moloco.sdk.internal.utils.b.a(url, error, this.f45900a.invoke()), errorMetadata.b());
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "ErrorReportingApi", a.b.m("Reporting error: ", error, " to url: ", strB), null, false, 12, null);
        this.f45901b.a(strB);
    }
}
