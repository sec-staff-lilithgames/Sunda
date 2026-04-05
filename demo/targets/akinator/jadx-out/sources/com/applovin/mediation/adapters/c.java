package com.applovin.mediation.adapters;

import android.app.Activity;
import android.os.Handler;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.NativeAd;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16404b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16405c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f16408g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f16409h;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f16404b = i10;
        this.f16405c = obj;
        this.f16406e = obj2;
        this.f16407f = obj3;
        this.f16408g = obj4;
        this.f16409h = obj5;
    }

    @Override // kv.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16404b) {
            case 0:
                return ((MolocoMediationAdapter) this.f16405c).lambda$loadAdViewAd$4((MaxAdFormat) this.f16406e, (MaxAdViewAdapterListener) this.f16407f, (MaxAdapterResponseParameters) this.f16408g, (Activity) this.f16409h, (NativeAd) obj, (MolocoAdError.AdCreateError) obj2);
            default:
                return com.moloco.sdk.internal.unity_bridge.internal.b.a((Handler) this.f16405c, (com.moloco.sdk.internal.unity_bridge.internal.b) this.f16406e, (String) this.f16407f, (String) this.f16408g, (MolocoUnityLoadCallback) this.f16409h, (InterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
        }
    }
}
