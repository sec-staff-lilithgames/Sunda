package com.facebook.ads.internal.dynamicloading;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdListener f23007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ad f23008c;

    public g(AdListener adListener, Ad ad2) {
        this.f23007b = adListener;
        this.f23008c = ad2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f23007b.onError(this.f23008c, new AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder."));
    }
}
