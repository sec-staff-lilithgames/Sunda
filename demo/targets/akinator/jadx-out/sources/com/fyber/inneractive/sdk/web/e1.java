package com.fyber.inneractive.sdk.web;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f26869a;

    public e1(i1 i1Var) {
        this.f26869a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = this.f26869a.f26879b;
        if (mVar != null) {
            mVar.getViewTreeObserver().addOnPreDrawListener(this.f26869a.K);
        }
    }
}
