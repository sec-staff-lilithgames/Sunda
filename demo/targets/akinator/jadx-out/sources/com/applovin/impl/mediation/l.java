package com.applovin.impl.mediation;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.lifecycle.k0;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.v2;
import com.applovin.impl.z2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14791b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MediationServiceImpl f14792c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f14793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f14794f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a.InterfaceC0034a f14795g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f14796h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f14797i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f14798j;

    public /* synthetic */ l(MediationServiceImpl mediationServiceImpl, h hVar, String str, MaxAdapterParametersImpl maxAdapterParametersImpl, v2 v2Var, Activity activity, a.InterfaceC0034a interfaceC0034a) {
        this.f14792c = mediationServiceImpl;
        this.f14793e = hVar;
        this.f14796h = str;
        this.f14797i = maxAdapterParametersImpl;
        this.f14798j = v2Var;
        this.f14794f = activity;
        this.f14795g = interfaceC0034a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14791b) {
            case 0:
                this.f14792c.a(this.f14793e, (String) this.f14796h, (MaxAdapterParametersImpl) this.f14797i, (v2) this.f14798j, this.f14794f, this.f14795g);
                break;
            default:
                this.f14792c.a((z2) this.f14796h, this.f14793e, (ViewGroup) this.f14797i, (k0) this.f14798j, this.f14794f, this.f14795g);
                break;
        }
    }

    public /* synthetic */ l(MediationServiceImpl mediationServiceImpl, z2 z2Var, h hVar, ViewGroup viewGroup, k0 k0Var, Activity activity, a.InterfaceC0034a interfaceC0034a) {
        this.f14792c = mediationServiceImpl;
        this.f14796h = z2Var;
        this.f14793e = hVar;
        this.f14797i = viewGroup;
        this.f14798j = k0Var;
        this.f14794f = activity;
        this.f14795g = interfaceC0034a;
    }
}
