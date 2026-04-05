package com.moloco.sdk.internal.publisher;

import androidx.lifecycle.c3;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g implements RewardedInterstitialAd, e0, FullscreenAd {

    /* renamed from: b, reason: collision with root package name */
    public final h0 f46261b;

    /* renamed from: c, reason: collision with root package name */
    public final String f46262c;

    public g(h0 fullscreenAd, String adUnitId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fullscreenAd, "fullscreenAd");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        this.f46261b = fullscreenAd;
        this.f46262c = adUnitId;
    }

    public static final com.moloco.sdk.internal.ortb.model.r a(g gVar) {
        return gVar.f46261b.c();
    }

    public static final Boolean b(g gVar) {
        return gVar.f46261b.e();
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        this.f46261b.destroy();
    }

    @Override // com.moloco.sdk.internal.publisher.e0
    public long getCreateAdObjectStartTime() {
        return this.f46261b.getCreateAdObjectStartTime();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.f46261b.isLoaded();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(String bidResponseJson, AdLoad.Listener listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        this.f46261b.load(bidResponseJson, listener);
    }

    @Override // com.moloco.sdk.internal.publisher.e0
    public void setCreateAdObjectStartTime(long j10) {
        this.f46261b.setCreateAdObjectStartTime(j10);
    }

    public static final x0 a(RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener, g gVar, boolean z10) {
        rewardedInterstitialAdShowListener.onRewardedVideoCompleted(MolocoAdKt.createAdInfo$default(gVar.f46262c, null, 2, null));
        return x0.f87415a;
    }

    @Override // com.moloco.sdk.publisher.FullscreenAd
    public void show(RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener) {
        final int i10 = 0;
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListenerA = h.a(rewardedInterstitialAdShowListener, new kv.a(this) { // from class: com.moloco.sdk.internal.publisher.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f46251c;

            {
                this.f46251c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return g.a(this.f46251c);
                    default:
                        return g.b(this.f46251c);
                }
            }
        });
        h0 h0Var = this.f46261b;
        final int i11 = 1;
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListenerA2 = h.a(rewardedInterstitialAdShowListenerA, h0Var.b() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o.f50233b, new kv.a(this) { // from class: com.moloco.sdk.internal.publisher.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f46251c;

            {
                this.f46251c = this;
            }

            @Override // kv.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return g.a(this.f46251c);
                    default:
                        return g.b(this.f46251c);
                }
            }
        });
        h0Var.a(new c3(7, rewardedInterstitialAdShowListenerA2, this));
        h0Var.show(rewardedInterstitialAdShowListenerA2);
    }
}
