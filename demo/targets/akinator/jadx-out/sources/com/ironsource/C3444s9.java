package com.ironsource;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.s9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3444s9 implements InterfaceC3151c0<InterstitialAd> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3386p1 f38372a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f38373b;

    public C3444s9(InterfaceC3386p1 analytics, Executor callbackExecutor) {
        kotlin.jvm.internal.e0.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.e0.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.f38372a = analytics;
        this.f38373b = callbackExecutor;
    }

    @Override // com.ironsource.InterfaceC3151c0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterstitialAd a(M9 adInstance, W1 auctionDataReporter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        return new InterstitialAd(new C3478u9(adInstance, new C3133b0(new Cc()), auctionDataReporter, this.f38372a, null, null, null, null, C3461t9.f38949a, PsExtractor.VIDEO_STREAM_MASK, null));
    }
}
