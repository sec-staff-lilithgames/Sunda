package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q0 implements bb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f26943a;

    public q0(v0 v0Var) {
        this.f26943a = v0Var;
    }

    @Override // bb.a
    public final void a() throws JSONException {
        IAlog.a("InternalStoreWebpageController: onCancelError: onReconnectSuccess", new Object[0]);
        v0 v0Var = this.f26943a;
        v0Var.f26959b.a(v0Var.f26960c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f26963f, v0Var.f26961d, v0Var.f26965h.f23897a));
        this.f26943a.d("onShowInstallStarted();");
    }

    @Override // bb.a
    public final void a(String str) {
        IAlog.a("InternalStoreWebpageController: onCancelError: onReconnectFailed: error: %s", str);
    }
}
