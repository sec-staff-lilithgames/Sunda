package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.sdk.AppLovinAd;
import com.inmobi.media.C2897n2;
import com.inmobi.media.C2981s2;
import com.inmobi.media.C2998t2;
import com.ironsource.C3317l5;
import com.ironsource.C3326le;
import com.ironsource.C3497vb;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.ui.view.WebViewAPI;
import kotlinx.serialization.json.JsonObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class y8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16307c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16309f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f16310g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f16311h;

    public /* synthetic */ y8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f16306b = i10;
        this.f16307c = obj;
        this.f16308e = obj2;
        this.f16309f = obj3;
        this.f16310g = obj4;
        this.f16311h = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16306b) {
            case 0:
                ((d1) this.f16307c).a((View) this.f16308e, (FrameLayout) this.f16309f, (ViewTreeObserver) this.f16310g, (x8) this.f16311h);
                return;
            case 1:
                ((m2) this.f16307c).a((androidx.lifecycle.k0) this.f16308e, (AppLovinAd) this.f16309f, (ViewGroup) this.f16310g, (Activity) this.f16311h);
                return;
            case 2:
                ((MediationServiceImpl) this.f16307c).a((z2) this.f16308e, (com.applovin.impl.mediation.h) this.f16309f, (Activity) this.f16310g, (a.InterfaceC0034a) this.f16311h);
                return;
            case 3:
                C3497vb.a.a((LevelPlayInitRequest) this.f16307c, (C3326le) this.f16308e, (Context) this.f16309f, (C3317l5) this.f16310g, (LevelPlayInitListener) this.f16311h);
                return;
            case 4:
                VungleWebClient.m3659shouldOverrideUrlLoading$lambda16$lambda15$lambda14((WebViewAPI.MraidDelegate) this.f16307c, (String) this.f16308e, (JsonObject) this.f16309f, (VungleWebClient) this.f16310g, (WebView) this.f16311h);
                return;
            case 5:
                n6.t0 t0Var = (n6.t0) this.f16307c;
                String str = (String) this.f16308e;
                kv.a aVar = (kv.a) this.f16309f;
                androidx.lifecycle.t1 t1Var = (androidx.lifecycle.t1) this.f16310g;
                w2.j jVar = (w2.j) this.f16311h;
                n6.d dVar = (n6.d) t0Var;
                boolean zIsEnabled = dVar.isEnabled();
                if (zIsEnabled) {
                    try {
                        dVar.beginSection(str);
                    } finally {
                        if (zIsEnabled) {
                            dVar.endSection();
                        }
                    }
                }
                try {
                    aVar.invoke();
                    n6.i0 i0Var = n6.j0.f75748a;
                    t1Var.postValue(i0Var);
                    jVar.set(i0Var);
                } catch (Throwable th2) {
                    t1Var.postValue(new n6.g0(th2));
                    jVar.setException(th2);
                }
                if (zIsEnabled) {
                    return;
                } else {
                    return;
                }
            default:
                C2981s2.a((C2981s2) this.f16307c, (C2897n2) this.f16308e, (Handler) this.f16309f, (C2998t2) this.f16310g, (WebView) this.f16311h);
                return;
        }
    }
}
