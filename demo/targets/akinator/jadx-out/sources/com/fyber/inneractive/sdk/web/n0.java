package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f26934a;

    public n0(v0 v0Var) {
        this.f26934a = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v0 v0Var = this.f26934a;
        v0Var.f26958a.stopLoading();
        IAlog.a("%sonLoadTimeout after %d msec", IAlog.a(v0Var), Long.valueOf(v0Var.f26971n));
        com.fyber.inneractive.sdk.flow.v vVar = v0Var.f26965h;
        if (vVar == null || v0Var.f26961d == null) {
            return;
        }
        vVar.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_LOAD_WEBPAGE, v0Var.f26968k, com.fyber.inneractive.sdk.ignite.j.LOAD_WEBPAGE_TIMEOUT.a(), v0Var.f26961d);
    }
}
