package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class r {
    public static final l0 a(AdLoad.Listener listener, com.moloco.sdk.acm.g acmLoadTimerEvent, AdFormatType adFormatType, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(acmLoadTimerEvent, "acmLoadTimerEvent");
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormatType, "adFormatType");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new q(listener, com.moloco.sdk.internal.a0.b(), acmLoadTimerEvent, adFormatType, metricsRecorder);
    }
}
