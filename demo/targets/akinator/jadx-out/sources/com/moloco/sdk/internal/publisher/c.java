package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f46246a;

    /* renamed from: b, reason: collision with root package name */
    public final AdShowListener f46247b;

    public c(AdShowListener adShowListener, com.moloco.sdk.internal.services.r appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, kv.a provideSdkEvents, kv.a provideBUrlData, AdFormatType adFormatType, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adShowListener, "adShowListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        kotlin.jvm.internal.e0.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormatType, "adFormatType");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f46246a = a.a(adShowListener, appLifecycleTrackerService, customUserEventBuilderService, provideSdkEvents, provideBUrlData, null, null, adFormatType, metricsRecorder, 96, null);
        this.f46247b = adShowListener;
    }

    @Override // com.moloco.sdk.internal.publisher.m0
    public void a(com.moloco.sdk.internal.s internalError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(internalError, "internalError");
        this.f46246a.a(internalError);
    }

    @Override // com.moloco.sdk.internal.publisher.m0
    public void onAdClicked(MolocoAd molocoAd) {
        kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
        this.f46246a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.m0
    public void onAdHidden(MolocoAd molocoAd) {
        kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
        this.f46246a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.m0
    public void onAdShowSuccess(MolocoAd molocoAd) {
        kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
        this.f46246a.onAdShowSuccess(molocoAd);
    }

    public final AdShowListener a() {
        return this.f46247b;
    }
}
