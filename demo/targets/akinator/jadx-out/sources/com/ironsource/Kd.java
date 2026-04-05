package com.ironsource;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Kd implements InterfaceC3151c0<RewardedAd> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3386p1 f34767a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f34768b;

    public Kd(InterfaceC3386p1 analytics, Executor callbackExecutor) {
        kotlin.jvm.internal.e0.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.e0.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.f34767a = analytics;
        this.f34768b = callbackExecutor;
    }

    @Override // com.ironsource.InterfaceC3151c0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RewardedAd a(M9 adInstance, W1 auctionDataReporter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        return new RewardedAd(new Nd(adInstance, new C3133b0(new Cc()), auctionDataReporter, this.f34767a, null, null, null, null, Ld.f34805a, PsExtractor.VIDEO_STREAM_MASK, null));
    }
}
