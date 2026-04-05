package com.fyber.inneractive.sdk.renderers;

import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f26617a;

    public z(a0 a0Var) {
        this.f26617a = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0 a0Var = this.f26617a;
        if (a0Var.f23531b != null && !a0Var.f26549m) {
            a0Var.f26549m = true;
            IAlog.a("%sTracking impression", IAlog.a(a0Var));
            com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = new com.fyber.inneractive.sdk.flow.nativead.trackers.a((w0) a0Var.f23531b);
            a0Var.f26550n = aVar;
            aVar.a(a0Var);
        }
        a0Var.G();
    }
}
