package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f23528a;

    public a0(b0 b0Var) {
        this.f23528a = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f23528a;
        b0Var.getClass();
        IAlog.a("%sRe-enabling clicks, grace period has passed", IAlog.a(b0Var));
        b0 b0Var2 = this.f23528a;
        b0Var2.f23535f = true;
        b0Var2.f23536g = null;
    }
}
