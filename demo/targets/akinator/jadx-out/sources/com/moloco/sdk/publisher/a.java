package com.moloco.sdk.publisher;

import android.app.Activity;
import com.moloco.sdk.publisher.MolocoAdError;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f47370c;

    public /* synthetic */ a(Activity activity, int i10) {
        this.f47369b = i10;
        this.f47370c = activity;
    }

    @Override // kv.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f47369b) {
            case 0:
                return BannerActivitySample.onCreate$lambda$0((BannerActivitySample) this.f47370c, (Banner) obj, (MolocoAdError.AdCreateError) obj2);
            case 1:
                return InterstitialAdActivitySample.onCreate$lambda$0((InterstitialAdActivitySample) this.f47370c, (InterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
            default:
                return RewardedInterstitialAdSample.onCreate$lambda$0((RewardedInterstitialAdSample) this.f47370c, (RewardedInterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
        }
    }
}
