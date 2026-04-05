package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f24233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f24234b;

    public j0(l0 l0Var, t0 t0Var) {
        this.f24234b = l0Var;
        this.f24233a = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.e("retryNetworkRequest pre-execute - %s", this.f24233a.getClass().getName());
        this.f24234b.a(this.f24233a);
    }
}
