package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class i extends t {

    /* renamed from: e, reason: collision with root package name */
    private t f43827e;

    public i(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f43827e = tVar;
    }

    public final i a(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f43827e = tVar;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public t b() {
        return this.f43827e.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public long c() {
        return this.f43827e.c();
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public boolean d() {
        return this.f43827e.d();
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public void e() throws IOException {
        this.f43827e.e();
    }

    public final t g() {
        return this.f43827e;
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public t a(long j10, TimeUnit timeUnit) {
        return this.f43827e.a(j10, timeUnit);
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public t a(long j10) {
        return this.f43827e.a(j10);
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public t a() {
        return this.f43827e.a();
    }
}
