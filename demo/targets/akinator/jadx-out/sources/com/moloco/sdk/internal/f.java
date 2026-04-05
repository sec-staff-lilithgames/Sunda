package com.moloco.sdk.internal;

import android.content.Context;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.publisher.b0;
import com.moloco.sdk.internal.publisher.g0;
import com.moloco.sdk.internal.services.c0;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0;
import kotlin.jvm.internal.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Init$SDKInitResponse f45911a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b f45912b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f45913c;

    /* renamed from: d, reason: collision with root package name */
    public final tu.o f45914d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a extends kotlin.jvm.internal.a0 implements kv.l {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e0 f45916c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f45917e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e0 e0Var, Context context) {
            super(1, d0.class, "createVastController", "createNativeAd$createVastController(Lcom/moloco/sdk/internal/AdFactoryImpl;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ExternalLinkHandler;Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/Ad;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/AdController;", 0);
            this.f45916c = e0Var;
            this.f45917e = context;
        }

        @Override // kv.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a p02) {
            kotlin.jvm.internal.e0.checkNotNullParameter(p02, "p0");
            return f.b(f.this, this.f45916c, this.f45917e, p02);
        }
    }

    public f(Init$SDKInitResponse initResponse, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, c0 clickthroughService) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initResponse, "initResponse");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(clickthroughService, "clickthroughService");
        this.f45911a = initResponse;
        this.f45912b = customUserEventBuilderService;
        this.f45913c = clickthroughService;
        this.f45914d = tu.q.lazy(new a1.e(this, 5));
    }

    @Override // com.moloco.sdk.internal.e
    public Banner b(Context context, com.moloco.sdk.internal.services.r appLifecycleTrackerService, String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j viewVisibilityTracker, e0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark, com.moloco.sdk.internal.publisher.j adCreateLoadTimeoutManager, com.moloco.sdk.internal.a viewLifecycleOwnerSingleton, k bannerSize, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.e0.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerSize, "bannerSize");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return com.moloco.sdk.internal.publisher.w.a(context, appLifecycleTrackerService, this.f45912b, adUnitId, a(), externalLinkHandler, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, this.f45913c, metricsRecorder);
    }

    @Override // com.moloco.sdk.internal.e
    public Banner c(Context context, com.moloco.sdk.internal.services.r appLifecycleTrackerService, String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j viewVisibilityTracker, e0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark, com.moloco.sdk.internal.publisher.j adCreateLoadTimeoutManager, com.moloco.sdk.internal.a viewLifecycleOwnerSingleton, k bannerSize, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.e0.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerSize, "bannerSize");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return com.moloco.sdk.internal.publisher.w.a(context, appLifecycleTrackerService, this.f45912b, adUnitId, a(), externalLinkHandler, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, this.f45913c, metricsRecorder);
    }

    public final boolean a() {
        return ((Boolean) this.f45914d.getValue()).booleanValue();
    }

    public static final boolean a(f fVar) {
        return fVar.f45911a.getVerifyBannerVisible();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a b(f fVar, e0 e0Var, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar) {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a(aVar, e0Var, context, fVar.f45912b, true, Boolean.FALSE, 0, 0, 0, false, false);
    }

    @Override // com.moloco.sdk.internal.e
    public Banner a(Context context, com.moloco.sdk.internal.services.r appLifecycleTrackerService, String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j viewVisibilityTracker, e0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, com.moloco.sdk.internal.publisher.j adCreateLoadTimeoutManager, com.moloco.sdk.internal.a viewLifecycleOwnerSingleton, k bannerSize, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(e0Var, TJzY.wSo);
        kotlin.jvm.internal.e0.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerSize, "bannerSize");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return com.moloco.sdk.internal.publisher.w.a(context, appLifecycleTrackerService, this.f45912b, adUnitId, a(), externalLinkHandler, e0Var, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, this.f45913c, metricsRecorder);
    }

    @Override // com.moloco.sdk.internal.e
    public NativeAd a(Context context, com.moloco.sdk.internal.services.r appLifecycleTrackerService, com.moloco.sdk.internal.services.y audioService, String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j viewVisibilityTracker, e0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k persistentHttpRequest, com.moloco.sdk.internal.a viewLifecycleOwnerSingleton, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark, com.moloco.sdk.internal.publisher.j adCreateLoadTimeoutManager, com.moloco.sdk.internal.services.i timeProvider, com.moloco.sdk.internal.services.k webViewAvailabilityChecker, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.e0.checkNotNullParameter(audioService, "audioService");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.e0.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(timeProvider, "timeProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(webViewAvailabilityChecker, "webViewAvailabilityChecker");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new com.moloco.sdk.internal.publisher.nativead.b(adUnitId, new com.moloco.sdk.internal.publisher.nativead.c(context, adUnitId, new b0(com.moloco.sdk.internal.ortb.c.a(), com.moloco.sdk.internal.publisher.d0.a()), new com.moloco.sdk.internal.publisher.nativead.parser.a(), adCreateLoadTimeoutManager, metricsRecorder, timeProvider, webViewAvailabilityChecker), new com.moloco.sdk.internal.publisher.nativead.a(context, viewVisibilityTracker, viewLifecycleOwnerSingleton, watermark, new a(externalLinkHandler, context)), appLifecycleTrackerService, this.f45912b, externalLinkHandler, persistentHttpRequest, adCreateLoadTimeoutManager, metricsRecorder);
    }

    @Override // com.moloco.sdk.internal.e
    public RewardedInterstitialAd b(Context context, com.moloco.sdk.internal.services.r appLifecycleTrackerService, String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j viewVisibilityTracker, e0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k persistentHttpRequest, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark, com.moloco.sdk.internal.publisher.j adCreateLoadTimeoutManager, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.e0.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return com.moloco.sdk.internal.publisher.h.a(context, appLifecycleTrackerService, this.f45912b, adUnitId, externalLinkHandler, persistentHttpRequest, (64 & 64) != 0 ? new g0(null, null, null, null, null, 31, null) : null, watermark, adCreateLoadTimeoutManager, metricsRecorder);
    }

    @Override // com.moloco.sdk.internal.e
    public InterstitialAd a(Context context, com.moloco.sdk.internal.services.r appLifecycleTrackerService, String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j viewVisibilityTracker, e0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k persistentHttpRequest, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 watermark, com.moloco.sdk.internal.publisher.j adCreateLoadTimeoutManager, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.e0.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return com.moloco.sdk.internal.publisher.e.a(context, appLifecycleTrackerService, this.f45912b, adUnitId, externalLinkHandler, persistentHttpRequest, (64 & 64) != 0 ? new g0(null, null, null, null, null, 31, null) : null, watermark, adCreateLoadTimeoutManager, metricsRecorder);
    }
}
