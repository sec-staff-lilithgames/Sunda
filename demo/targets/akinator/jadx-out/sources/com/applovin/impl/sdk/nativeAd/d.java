package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15580b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15581c;

    public /* synthetic */ d(Object obj, int i10) {
        this.f15580b = i10;
        this.f15581c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15580b) {
            case 0:
                ((AppLovinVastMediaView.e) this.f15581c).a();
                break;
            case 1:
                ((AppLovinVastMediaView.f) this.f15581c).a();
                break;
            default:
                ((AppLovinNativeAdImpl) this.f15581c).lambda$unregisterViewsForInteraction$0();
                break;
        }
    }
}
