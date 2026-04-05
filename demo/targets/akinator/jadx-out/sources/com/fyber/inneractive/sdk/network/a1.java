package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.ignite.IgniteResponseOuterClass$IgniteResponse;
import com.fyber.inneractive.sdk.util.IAlog;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a1 extends t0 {

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f24193p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicInteger f24194q;

    public a1(com.fyber.inneractive.sdk.ignite.b bVar, byte[] bArr, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(bVar, g0.f24226c.a(), rVar);
        this.f24194q = new AtomicInteger();
        this.f24193p = bArr;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i10) throws n0 {
        try {
            o0 o0Var = new o0();
            InputStream inputStream = lVar.f24239c;
            if (inputStream == null) {
                return o0Var;
            }
            String str = new String(com.fyber.inneractive.sdk.util.v.a(inputStream), C.UTF8_NAME);
            IgniteResponseOuterClass$IgniteResponse from = IgniteResponseOuterClass$IgniteResponse.parseFrom(str.getBytes());
            o0Var.f24262b = str;
            o0Var.f24261a = from;
            return o0Var;
        } catch (Exception e10) {
            IAlog.a("failed parse ignite network request", e10, new Object[0]);
            throw new n0(e10);
        } catch (Throwable th2) {
            IAlog.a("failed parse ignite network request", th2, new Object[0]);
            throw new n0("failed to parse ignite network request");
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final byte[] f() {
        return this.f24193p;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return ((int) Math.pow(2.0d, this.f24194q.get())) * 1000;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String n() {
        return "application/x-protobuf; messageType=IgniteRequest";
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return "https://init-mp.fyber.com/init";
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return this.f24194q.getAndIncrement() < 4;
    }
}
