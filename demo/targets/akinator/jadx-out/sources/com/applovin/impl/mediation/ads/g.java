package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.z2;
import com.applovin.mediation.MaxAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14612b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14613c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14614e;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.f14612b = i10;
        this.f14613c = obj;
        this.f14614e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14612b) {
            case 0:
                ((MaxNativeAdLoaderImpl.c) this.f14613c).a((MaxAd) this.f14614e);
                break;
            case 1:
                ((MaxFullscreenAdImpl) this.f14613c).a((Long) this.f14614e);
                break;
            case 2:
                ((MaxFullscreenAdImpl.b) this.f14613c).a((MaxAd) this.f14614e);
                break;
            default:
                ((MaxFullscreenAdImpl.b) this.f14613c).a((z2) this.f14614e);
                break;
        }
    }
}
