package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.k0;
import com.applovin.impl.b5;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.q4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.ironsource.E3;
import com.ironsource.mediationsdk.ISBannerSize;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14781c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14783f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f14784g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f14785h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f14786i;

    public /* synthetic */ j(MaxFullscreenAdImpl maxFullscreenAdImpl, String str, String str2, Activity activity, ViewGroup viewGroup, k0 k0Var) {
        this.f14780b = 1;
        this.f14782e = maxFullscreenAdImpl;
        this.f14783f = str;
        this.f14784g = str2;
        this.f14781c = activity;
        this.f14785h = viewGroup;
        this.f14786i = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14780b) {
            case 0:
                ((MediationServiceImpl) this.f14782e).a((q4) this.f14783f, (h) this.f14784g, (MaxAdapterParametersImpl) this.f14785h, (b5) this.f14786i, (Activity) this.f14781c);
                break;
            case 1:
                ((MaxFullscreenAdImpl) this.f14782e).a((String) this.f14783f, (String) this.f14784g, (Activity) this.f14781c, (ViewGroup) this.f14785h, (k0) this.f14786i);
                break;
            case 2:
                com.applovin.impl.mediation.ads.a.a((String) this.f14782e, (String) this.f14783f, (MaxAdFormat) this.f14784g, (String) this.f14785h, (com.applovin.impl.sdk.k) this.f14786i, (String) this.f14781c);
                break;
            case 3:
                ((h) this.f14784g).a((MaxSignalProvider) this.f14782e, (MaxAdapterSignalCollectionParameters) this.f14785h, (Activity) this.f14781c, (b5) this.f14786i, (q4) this.f14783f);
                break;
            default:
                com.ironsource.mediationsdk.l.a((com.ironsource.mediationsdk.q) this.f14782e, (View) this.f14783f, (ISBannerSize) this.f14784g, (Context) this.f14785h, (FrameLayout.LayoutParams) this.f14786i, (E3) this.f14781c);
                break;
        }
    }

    public /* synthetic */ j(h hVar, MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, b5 b5Var, q4 q4Var) {
        this.f14780b = 3;
        this.f14784g = hVar;
        this.f14782e = maxSignalProvider;
        this.f14785h = maxAdapterSignalCollectionParameters;
        this.f14781c = activity;
        this.f14786i = b5Var;
        this.f14783f = q4Var;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f14780b = i10;
        this.f14782e = obj;
        this.f14783f = obj2;
        this.f14784g = obj3;
        this.f14785h = obj4;
        this.f14786i = obj5;
        this.f14781c = obj6;
    }
}
