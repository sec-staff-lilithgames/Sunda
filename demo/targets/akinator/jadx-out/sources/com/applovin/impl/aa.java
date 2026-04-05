package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.inmobi.media.C2853k9;
import com.inmobi.media.C2887m9;
import com.inmobi.media.C3039v9;
import com.ironsource.sdk.controller.v;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import java.util.Map;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class aa implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13443b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13444c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13446f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f13447g;

    public /* synthetic */ aa(TpatSender tpatSender, TpatRequest tpatRequest, String str, boolean z10) {
        this.f13443b = 8;
        this.f13447g = tpatSender;
        this.f13446f = tpatRequest;
        this.f13445e = str;
        this.f13444c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13443b) {
            case 0:
                q2.a(this.f13444c, (MaxNativeAdListener) this.f13447g, (String) this.f13445e, (MaxError) this.f13446f);
                break;
            case 1:
                q2.a(this.f13444c, (MaxAdListener) this.f13447g, (String) this.f13445e, (MaxError) this.f13446f);
                break;
            case 2:
                q2.a(this.f13444c, (MaxAdExpirationListener) this.f13447g, (MaxAd) this.f13445e, (MaxAd) this.f13446f);
                break;
            case 3:
                q2.a(this.f13444c, (MaxNativeAdListener) this.f13447g, (MaxNativeAdView) this.f13445e, (MaxAd) this.f13446f);
                break;
            case 4:
                q2.a(this.f13444c, (MaxAdListener) this.f13447g, (MaxAd) this.f13445e, (MaxError) this.f13446f);
                break;
            case 5:
                q2.a(this.f13444c, (MaxRewardedAdListener) this.f13447g, (MaxAd) this.f13445e, (MaxReward) this.f13446f);
                break;
            case 6:
                ((EventServiceImpl) this.f13447g).a((String) this.f13445e, (Map) this.f13446f, this.f13444c);
                break;
            case 7:
                ((v.r) this.f13447g).a(this.f13444c, (String) this.f13445e, (String) this.f13446f);
                break;
            case 8:
                TpatSender.m3620sendTpat$lambda1((TpatSender) this.f13447g, (TpatRequest) this.f13446f, (String) this.f13445e, this.f13444c);
                break;
            case 9:
                hi.s0 s0Var = (hi.s0) this.f13447g;
                f2.e.d dVar = (f2.e.d) this.f13445e;
                ji.d dVar2 = (ji.d) this.f13446f;
                s0Var.getClass();
                ei.f.getLogger().d("disk worker: log non-fatal event to persistence");
                s0Var.f58871b.persistEvent(dVar, dVar2.getSessionId(), this.f13444c);
                break;
            case 10:
                Context context = (Context) this.f13447g;
                io.bidmachine.media3.exoplayer.l0 l0Var = (io.bidmachine.media3.exoplayer.l0) this.f13445e;
                on.f0 f0Var = (on.f0) this.f13446f;
                on.c0 c0VarCreate = on.c0.create(context);
                if (c0VarCreate != null) {
                    if (this.f13444c) {
                        l0Var.addAnalyticsListener(c0VarCreate);
                    }
                    f0Var.setLogSessionId(c0VarCreate.getLogSessionId());
                    break;
                } else {
                    io.bidmachine.media3.common.util.b0.w("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    break;
                }
            default:
                C2853k9.a((C2887m9) this.f13447g, this.f13444c, (C2853k9) this.f13445e, (C3039v9) this.f13446f);
                break;
        }
    }

    public /* synthetic */ aa(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f13443b = i10;
        this.f13447g = obj;
        this.f13445e = obj2;
        this.f13446f = obj3;
        this.f13444c = z10;
    }

    public /* synthetic */ aa(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f13443b = i10;
        this.f13447g = obj;
        this.f13444c = z10;
        this.f13445e = obj2;
        this.f13446f = obj3;
    }

    public /* synthetic */ aa(boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f13443b = i10;
        this.f13444c = z10;
        this.f13447g = obj;
        this.f13445e = obj2;
        this.f13446f = obj3;
    }
}
