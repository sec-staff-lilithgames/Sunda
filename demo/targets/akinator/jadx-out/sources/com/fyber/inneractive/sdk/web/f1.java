package com.fyber.inneractive.sdk.web;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f1 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f26872a;

    public f1(i1 i1Var) {
        this.f26872a = i1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        m mVar;
        m mVar2 = this.f26872a.f26879b;
        if (mVar2 == null) {
            return false;
        }
        mVar2.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f26872a.k();
        i1 i1Var = this.f26872a;
        i1Var.a(new com.fyber.inneractive.sdk.mraid.b0(i1Var.G));
        i1 i1Var2 = this.f26872a;
        if (i1Var2.G == c0.INTERSTITIAL && (mVar = i1Var2.f26879b) != null) {
            mVar.a("if (window.showInterstitial) { showInterstitial(); }");
        }
        this.f26872a.j();
        i1 i1Var3 = this.f26872a;
        i1Var3.a(com.fyber.inneractive.sdk.util.o.a(i1Var3.f26879b), true);
        this.f26872a.n();
        com.fyber.inneractive.sdk.util.r.f26804b.postDelayed(this.f26872a.L, 100L);
        return false;
    }
}
