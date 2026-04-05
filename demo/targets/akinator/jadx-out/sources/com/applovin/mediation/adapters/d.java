package com.applovin.mediation.adapters;

import android.app.Activity;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.NativeAd;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16410b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MolocoMediationAdapter f16411c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MaxAdapterResponseParameters f16412e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16413f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f16414g;

    public /* synthetic */ d(MolocoMediationAdapter molocoMediationAdapter, MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener, MaxAdapterResponseParameters maxAdapterResponseParameters) {
        this.f16411c = molocoMediationAdapter;
        this.f16413f = maxAdFormat;
        this.f16414g = maxAdViewAdapterListener;
        this.f16412e = maxAdapterResponseParameters;
    }

    @Override // kv.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16410b) {
            case 0:
                return this.f16411c.lambda$loadAdViewAd$5((MaxAdFormat) this.f16413f, (MaxAdViewAdapterListener) this.f16414g, this.f16412e, (Banner) obj, (MolocoAdError.AdCreateError) obj2);
            default:
                return this.f16411c.lambda$loadNativeAd$6((MaxNativeAdAdapterListener) this.f16413f, this.f16412e, (Activity) this.f16414g, (NativeAd) obj, (MolocoAdError.AdCreateError) obj2);
        }
    }

    public /* synthetic */ d(MolocoMediationAdapter molocoMediationAdapter, MaxNativeAdAdapterListener maxNativeAdAdapterListener, MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        this.f16411c = molocoMediationAdapter;
        this.f16413f = maxNativeAdAdapterListener;
        this.f16412e = maxAdapterResponseParameters;
        this.f16414g = activity;
    }
}
