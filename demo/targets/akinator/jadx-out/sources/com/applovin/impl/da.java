package com.applovin.impl;

import com.applovin.sdk.AppLovinBidTokenCollectionListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class da implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinBidTokenCollectionListener f13914c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f13915e;

    public /* synthetic */ da(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str, int i10) {
        this.f13913b = i10;
        this.f13914c = appLovinBidTokenCollectionListener;
        this.f13915e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13913b) {
            case 0:
                q2.c(this.f13914c, this.f13915e);
                break;
            default:
                q2.d(this.f13914c, this.f13915e);
                break;
        }
    }
}
