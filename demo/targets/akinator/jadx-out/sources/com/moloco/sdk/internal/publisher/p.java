package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class p {
    public static final AdLoad a(CoroutineScope scope, kv.l timeout, String adUnitId, kv.l recreateXenossAdLoader, AdFormatType adFormatType, com.moloco.sdk.internal.services.k webViewChecker, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.e0.checkNotNullParameter(timeout, "timeout");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(recreateXenossAdLoader, "recreateXenossAdLoader");
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormatType, "adFormatType");
        kotlin.jvm.internal.e0.checkNotNullParameter(webViewChecker, "webViewChecker");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new o(scope, timeout, adUnitId, recreateXenossAdLoader, com.moloco.sdk.internal.ortb.c.a(), d0.a(), adFormatType, webViewChecker, metricsRecorder);
    }
}
