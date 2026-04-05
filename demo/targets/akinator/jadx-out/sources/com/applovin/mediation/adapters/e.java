package com.applovin.mediation.adapters;

import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16415b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MolocoMediationAdapter f16416c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MaxAdapterResponseParameters f16417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MaxAdapterListener f16418f;

    public /* synthetic */ e(MolocoMediationAdapter molocoMediationAdapter, MaxAdapterListener maxAdapterListener, MaxAdapterResponseParameters maxAdapterResponseParameters, int i10) {
        this.f16415b = i10;
        this.f16416c = molocoMediationAdapter;
        this.f16418f = maxAdapterListener;
        this.f16417e = maxAdapterResponseParameters;
    }

    @Override // kv.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16415b) {
            case 0:
                return this.f16416c.lambda$loadInterstitialAd$2((MaxInterstitialAdapterListener) this.f16418f, this.f16417e, (InterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
            default:
                return this.f16416c.lambda$loadRewardedAd$3((MaxRewardedAdapterListener) this.f16418f, this.f16417e, (RewardedInterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
        }
    }
}
