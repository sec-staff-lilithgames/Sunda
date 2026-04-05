package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.u1;
import com.fyber.inneractive.sdk.util.v1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o0 implements u1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f23762a;

    public o0(p0 p0Var) {
        this.f23762a = p0Var;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        Runnable runnable = this.f23762a.f23767n;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.f26804b.post(runnable);
        }
        p0 p0Var = this.f23762a;
        v1 v1Var = p0Var.f23768o;
        if (v1Var != null) {
            v1Var.f26828e = null;
            p0Var.f23768o = null;
        }
    }
}
