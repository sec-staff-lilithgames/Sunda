package com.fyber.inneractive.sdk.web;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f26953a;

    public s0(v0 v0Var) {
        this.f26953a = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f26953a.f26978u.compareAndSet(false, true)) {
            this.f26953a.d("onCancelResult(true);");
            this.f26953a.f26979v.set(false);
        }
    }
}
