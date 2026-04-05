package com.mbridge.msdk.thrid.okio;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class h implements s {

    /* renamed from: a, reason: collision with root package name */
    private final s f43826a;

    public h(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f43826a = sVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f43826a.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f43826a.close();
    }

    public final s d() {
        return this.f43826a;
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f43826a.toString() + ")";
    }
}
