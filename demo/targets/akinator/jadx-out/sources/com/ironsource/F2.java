package com.ironsource;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class F2 implements E2 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3386p1 f34348a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f34349b;

    public F2(InterfaceC3386p1 analytics, Executor callbackExecutor) {
        kotlin.jvm.internal.e0.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.e0.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.f34348a = analytics;
        this.f34349b = callbackExecutor;
    }

    @Override // com.ironsource.E2
    public BannerAdView a(M9 adInstance, C3302k8 adContainer, W1 auctionDataReporter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.e0.checkNotNullParameter(adContainer, "adContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        return new BannerAdView(new Q2(adInstance, adContainer, auctionDataReporter, this.f34348a, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null));
    }
}
