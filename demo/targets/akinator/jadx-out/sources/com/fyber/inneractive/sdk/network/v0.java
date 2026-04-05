package com.fyber.inneractive.sdk.network;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class v0 extends t0 {

    /* renamed from: p, reason: collision with root package name */
    public final Context f24320p;

    /* renamed from: q, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.cache.a f24321q;

    /* renamed from: r, reason: collision with root package name */
    public d0 f24322r;

    public v0(f0 f0Var, Context context, com.fyber.inneractive.sdk.cache.a aVar) {
        super(f0Var, g0.f24226c.a(), null);
        this.f24320p = context;
        this.f24321q = aVar;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public o0 a(l lVar, Map map, int i10) throws Exception {
        o0 o0Var = new o0();
        try {
            String string = com.fyber.inneractive.sdk.util.v.b(lVar.f24239c).toString();
            o0Var.f24261a = this.f24321q.a(string);
            o0Var.f24262b = string;
            return o0Var;
        } catch (Exception e10) {
            IAlog.a("failed parse cacheable network request", e10, new Object[0]);
            if (e10 instanceof InvalidAppIdException) {
                throw e10;
            }
            throw new n0(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String h() {
        return this.f24321q.c();
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public a i() throws Throwable {
        d0 d0Var = new d0(this.f24320p, this.f24321q);
        this.f24322r = d0Var;
        com.fyber.inneractive.sdk.cache.m mVarA = d0Var.a();
        String str = mVarA.f23140b;
        Object obj = mVarA.f23139a;
        this.f24321q.c();
        return new a(obj, str);
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
        return this.f24321q.a();
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public void a(o0 o0Var, String str, String str2) {
        d0 d0Var = this.f24322r;
        if (d0Var != null) {
            d0Var.b(str2);
            if (o0Var == null || o0Var.f24262b.isEmpty() || str.isEmpty()) {
                return;
            }
            if (!this.f24322r.a(str, o0Var.f24262b)) {
                IAlog.b("Failed to cache file", new Object[0]);
            } else {
                this.f24321q.a(o0Var.f24261a);
            }
        }
    }
}
