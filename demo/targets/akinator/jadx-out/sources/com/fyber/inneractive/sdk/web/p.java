package com.fyber.inneractive.sdk.web;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f26938a;

    public p(i0 i0Var) {
        this.f26938a = i0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        m mVar = this.f26938a.f26879b;
        if (mVar == null) {
            return false;
        }
        mVar.getViewTreeObserver().removeOnPreDrawListener(this);
        i0 i0Var = this.f26938a;
        i0Var.a(i0Var.f26879b.getContext(), true);
        return false;
    }
}
