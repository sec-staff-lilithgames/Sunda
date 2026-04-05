package com.moloco.sdk.internal.error;

import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.config.a f45909a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.error.api.a f45910b;

    public d(com.moloco.sdk.internal.services.config.a configService, com.moloco.sdk.internal.error.api.a errorReportingApi) {
        e0.checkNotNullParameter(configService, "configService");
        e0.checkNotNullParameter(errorReportingApi, "errorReportingApi");
        this.f45909a = configService;
        this.f45910b = errorReportingApi;
    }

    @Override // com.moloco.sdk.internal.error.c
    public void a(String error, a errorMetadata) {
        e0.checkNotNullParameter(error, "error");
        e0.checkNotNullParameter(errorMetadata, "errorMetadata");
        com.moloco.sdk.internal.services.config.a aVar = this.f45909a;
        if (!aVar.a("ReportSDKError")) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ErrorReportingServiceImpl", a.b.k("Error reporting is disabled. Tried to report error: ", error), null, false, 12, null);
            return;
        }
        String strB = aVar.b("ReportSDKError");
        if (strB == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "ErrorReportingServiceImpl", "Error reporting is enabled but with invalid url", null, false, 12, null);
        } else {
            this.f45910b.a(error, strB, errorMetadata);
        }
    }
}
