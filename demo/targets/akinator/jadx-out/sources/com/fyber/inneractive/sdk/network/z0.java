package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z0 extends t0 {

    /* renamed from: p, reason: collision with root package name */
    public final String f24340p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicInteger f24341q;

    public z0(f0 f0Var, String str) {
        super(f0Var, g0.f24226c.a(), null);
        this.f24341q = new AtomicInteger();
        this.f24340p = str;
    }

    public static void b(String str) {
        IAConfigManager.O.f23224s.a(new z0(new y0(str, System.currentTimeMillis()), str));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i10) throws n0 {
        try {
            o0 o0Var = new o0();
            o0Var.f24261a = String.valueOf(i10);
            InputStream inputStream = lVar.f24239c;
            if (inputStream == null) {
                return o0Var;
            }
            o0Var.f24262b = com.fyber.inneractive.sdk.util.v.b(inputStream).toString();
            return o0Var;
        } catch (Exception e10) {
            IAlog.a("failed parse hit network request", e10, new Object[0]);
            throw new n0(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return ((int) Math.pow(2.0d, this.f24341q.get())) * 1000;
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
        return this.f24340p;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return this.f24341q.getAndIncrement() < 4;
    }
}
