package com.applovin.impl.sdk;

import android.view.InputEvent;
import com.applovin.impl.sdk.c;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15687b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15688c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15690f;

    public /* synthetic */ s(AppLovinAdServiceImpl appLovinAdServiceImpl, AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f15687b = 1;
        this.f15688c = appLovinAdServiceImpl;
        this.f15690f = appLovinError;
        this.f15689e = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15687b) {
            case 0:
                ((AppLovinAdServiceImpl) this.f15688c).a((AppLovinAdLoadListener) this.f15689e, (AppLovinAd) this.f15690f);
                break;
            case 1:
                ((AppLovinAdServiceImpl) this.f15688c).a((AppLovinError) this.f15690f, (AppLovinAdLoadListener) this.f15689e);
                break;
            case 2:
                ((c) this.f15688c).a((com.applovin.impl.sdk.ad.b) this.f15689e, (c.b) this.f15690f);
                break;
            case 3:
                ((n) this.f15688c).a((Long) this.f15689e, this.f15690f);
                break;
            default:
                ((r) this.f15688c).a((List) this.f15689e, (InputEvent) this.f15690f);
                break;
        }
    }

    public /* synthetic */ s(Object obj, int i10, Object obj2, Object obj3) {
        this.f15687b = i10;
        this.f15688c = obj;
        this.f15689e = obj2;
        this.f15690f = obj3;
    }
}
