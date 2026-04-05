package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class a {
    public static /* synthetic */ m0 a(AdShowListener adShowListener, com.moloco.sdk.internal.services.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar, kv.a aVar, kv.a aVar2, com.moloco.sdk.internal.y yVar, com.moloco.sdk.internal.h hVar, AdFormatType adFormatType, com.moloco.sdk.acm.recorder.c cVar, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            yVar = com.moloco.sdk.internal.a0.b();
        }
        return a(adShowListener, rVar, bVar, aVar, aVar2, yVar, (i10 & 64) != 0 ? com.moloco.sdk.internal.j.a() : hVar, adFormatType, cVar);
    }

    public static final m0 a(AdShowListener adShowListener, com.moloco.sdk.internal.services.r appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, kv.a provideSdkEvents, kv.a provideBUrlData, com.moloco.sdk.internal.y sdkEventUrlTracker, com.moloco.sdk.internal.h bUrlTracker, AdFormatType adType, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        kotlin.jvm.internal.e0.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        kotlin.jvm.internal.e0.checkNotNullParameter(sdkEventUrlTracker, "sdkEventUrlTracker");
        kotlin.jvm.internal.e0.checkNotNullParameter(bUrlTracker, "bUrlTracker");
        kotlin.jvm.internal.e0.checkNotNullParameter(adType, "adType");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new n0(adShowListener, appLifecycleTrackerService, customUserEventBuilderService, provideSdkEvents, provideBUrlData, sdkEventUrlTracker, bUrlTracker, adType, metricsRecorder);
    }
}
