package com.mbridge.msdk.thrid.okio;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class g implements r {

    /* renamed from: a, reason: collision with root package name */
    private final r f43825a;

    public g(r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f43825a = rVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j10) throws IOException {
        this.f43825a.a(cVar, j10);
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public t b() {
        return this.f43825a.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f43825a.close();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() throws IOException {
        this.f43825a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f43825a.toString() + ")";
    }
}
