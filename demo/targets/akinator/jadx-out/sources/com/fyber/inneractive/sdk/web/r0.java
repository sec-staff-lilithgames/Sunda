package com.fyber.inneractive.sdk.web;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f26945a;

    public r0(v0 v0Var) {
        this.f26945a = v0Var;
    }

    public final void a(boolean z10) {
        if (this.f26945a.f26978u.compareAndSet(false, true)) {
            this.f26945a.d("onCancelResult(" + z10 + ");");
            this.f26945a.f26979v.set(false);
        }
    }
}
