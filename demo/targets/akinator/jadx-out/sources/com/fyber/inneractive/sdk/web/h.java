package com.fyber.inneractive.sdk.web;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f26874a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.g1 f26875b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f26876c;

    public h(i iVar, String str, com.fyber.inneractive.sdk.util.g1 g1Var) {
        this.f26876c = iVar;
        this.f26875b = g1Var;
        this.f26874a = str;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final String a() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final String c() {
        return "open";
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void d() {
        i iVar = this.f26876c;
        String str = this.f26874a;
        com.fyber.inneractive.sdk.util.g1 g1Var = this.f26875b;
        j1 j1Var = iVar.f26884g;
        if (j1Var != null) {
            com.fyber.inneractive.sdk.util.g0 g0Var = j1Var.a(str, g1Var).f26769a;
        }
    }

    public final String toString() {
        return "action: open url: " + this.f26874a;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void b() {
    }
}
