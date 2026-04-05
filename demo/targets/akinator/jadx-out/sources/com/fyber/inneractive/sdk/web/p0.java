package com.fyber.inneractive.sdk.web;

import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p0 implements bb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f26941c;

    public p0(v0 v0Var, String str, String str2) {
        this.f26941c = v0Var;
        this.f26939a = str;
        this.f26940b = str2;
    }

    @Override // bb.a
    public final void a() throws JSONException {
        v0 v0Var = this.f26941c;
        v0Var.f26959b.a(v0Var.f26960c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f26963f, v0Var.f26961d, v0Var.f26965h.f23897a));
        this.f26941c.d("onShowInstallStarted();");
    }

    @Override // bb.a
    public final void a(String str) {
        v0 v0Var = this.f26941c;
        v0Var.f26959b.m();
        v0Var.d("onInstallationFailed();");
        v0 v0Var2 = this.f26941c;
        v0Var2.f26965h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_INSTALL_APP, this.f26939a, this.f26940b, v0Var2.f26961d);
    }
}
