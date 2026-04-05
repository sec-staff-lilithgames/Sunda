package com.applovin.impl;

import com.applovin.impl.a1;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinPostbackListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class o8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14993b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14994c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14996f;

    public /* synthetic */ o8(Object obj, Object obj2, int i10, int i11) {
        this.f14993b = i11;
        this.f14995e = obj;
        this.f14996f = obj2;
        this.f14994c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14993b) {
            case 0:
                ((a1) this.f14995e).b((a1.c) this.f14996f, this.f14994c);
                break;
            case 1:
                q2.b((AppLovinPostbackListener) this.f14995e, (String) this.f14996f, this.f14994c);
                break;
            default:
                q2.b((AppLovinAdRewardListener) this.f14995e, (AppLovinAd) this.f14996f, this.f14994c);
                break;
        }
    }
}
