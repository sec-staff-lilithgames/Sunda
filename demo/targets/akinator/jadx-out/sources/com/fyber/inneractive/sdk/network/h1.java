package com.fyber.inneractive.sdk.network;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h1 extends t0 {

    /* renamed from: p, reason: collision with root package name */
    public final String f24230p;

    public h1(f0 f0Var, String str) {
        super(f0Var, g0.f24226c.a(), null);
        this.f24230p = str;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i10) {
        o0 o0Var = new o0();
        com.fyber.inneractive.sdk.click.c cVar = new com.fyber.inneractive.sdk.click.c();
        if (lVar != null) {
            ArrayList arrayList = lVar.f24242f;
            cVar.f23166a.clear();
            cVar.f23166a.addAll(arrayList);
            InputStream inputStream = lVar.f24239c;
            if (inputStream != null) {
                String string = com.fyber.inneractive.sdk.util.v.b(inputStream).toString();
                cVar.f23167b = string;
                o0Var.f24262b = string;
            }
        }
        o0Var.f24261a = cVar;
        return o0Var;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return this.f24230p;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return false;
    }
}
