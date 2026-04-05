package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.hardware.SensorEventListener;
import android.webkit.WebView;
import com.applovin.impl.b6;
import com.applovin.impl.h2;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.q4;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.y3;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinPostbackListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class s8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15228b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15229c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15230e;

    public /* synthetic */ s8(int i10, Object obj, Object obj2) {
        this.f15228b = i10;
        this.f15229c = obj;
        this.f15230e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15228b) {
            case 0:
                ((ScheduledThreadPoolExecutor) this.f15229c).execute((b6.e) this.f15230e);
                break;
            case 1:
                ((h2.b) this.f15229c).a((AppLovinAd) this.f15230e);
                break;
            case 2:
                y3.b.a((y3.c) this.f15229c, (y3.d) this.f15230e);
                break;
            case 3:
                ((c4) this.f15229c).b((WebView) this.f15230e);
                break;
            case 4:
                ((c4) this.f15229c).a((String) this.f15230e);
                break;
            case 5:
                ((d6) this.f15229c).b((MaxErrorImpl) this.f15230e);
                break;
            case 6:
                ((d8) this.f15229c).a((WeakReference) this.f15230e);
                break;
            case 7:
                ((f0) this.f15229c).a((SensorEventListener) this.f15230e);
                break;
            case 8:
                ((i5) this.f15229c).a((h3) this.f15230e);
                break;
            case 9:
                ((i8) this.f15229c).c((String) this.f15230e);
                break;
            case 10:
                ((i8) this.f15229c).b((WebView) this.f15230e);
                break;
            case 11:
                ((j3) this.f15229c).a((Context) this.f15230e);
                break;
            case 12:
                k7.a((Context) this.f15229c, (String) this.f15230e);
                break;
            case 13:
                ((m2) this.f15229c).b((com.applovin.impl.sdk.ad.b) this.f15230e);
                break;
            case 14:
                ((m2) this.f15229c).a((Context) this.f15230e);
                break;
            case 15:
                ((m2) this.f15229c).a((AppLovinAd) this.f15230e);
                break;
            case 16:
                q2.b((AppLovinAdClickListener) this.f15229c, (AppLovinAd) this.f15230e);
                break;
            case 17:
                q2.b((AppLovinPostbackListener) this.f15229c, (String) this.f15230e);
                break;
            case 18:
                q2.b((AppLovinAdVideoPlaybackListener) this.f15229c, (AppLovinAd) this.f15230e);
                break;
            case 19:
                q2.b((k2) this.f15229c, (String) this.f15230e);
                break;
            case 20:
                q2.a((AppLovinNativeAdEventListener) this.f15229c, (AppLovinNativeAd) this.f15230e);
                break;
            case 21:
                q2.a((AppLovinNativeAdLoadListener) this.f15229c, (AppLovinError) this.f15230e);
                break;
            case 22:
                ((q4) this.f15229c).a((q4.b) this.f15230e);
                break;
            case 23:
                ((t0) this.f15229c).a((Activity) this.f15230e);
                break;
            default:
                ((z1) this.f15229c).h((String) this.f15230e);
                break;
        }
    }
}
