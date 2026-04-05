package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class z9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdRewardListener f16387c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f16388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Map f16389f;

    public /* synthetic */ z9(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map, int i10) {
        this.f16386b = i10;
        this.f16387c = appLovinAdRewardListener;
        this.f16388e = appLovinAd;
        this.f16389f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16386b) {
            case 0:
                q2.f(this.f16387c, this.f16388e, this.f16389f);
                break;
            case 1:
                q2.e(this.f16387c, this.f16388e, this.f16389f);
                break;
            default:
                q2.d(this.f16387c, this.f16388e, this.f16389f);
                break;
        }
    }
}
