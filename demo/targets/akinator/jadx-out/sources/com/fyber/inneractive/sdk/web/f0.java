package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f0 implements f {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.mraid.e f26870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f26871b;

    public f0(i0 i0Var, com.fyber.inneractive.sdk.mraid.e eVar) {
        this.f26871b = i0Var;
        this.f26870a = eVar;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final String a() {
        return this.f26870a.c();
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void b() {
        com.fyber.inneractive.sdk.mraid.e eVar = this.f26870a;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final String c() {
        return this.f26870a.f24171a;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void d() {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar = ((IAmraidWebViewController) this.f26871b).I;
        if (eVar != null) {
            eVar.a();
        }
        this.f26870a.a();
    }

    public final String toString() {
        return "action = " + this.f26870a.f24171a + " url = " + this.f26870a.c();
    }
}
