package com.mbridge.msdk.thrid.okhttp;

import java.io.Closeable;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class z implements Closeable {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends z {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f43802a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.thrid.okio.e f43803b;

        public a(s sVar, long j10, com.mbridge.msdk.thrid.okio.e eVar) {
            this.f43802a = j10;
            this.f43803b = eVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public long h() {
            return this.f43802a;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public com.mbridge.msdk.thrid.okio.e k() {
            return this.f43803b;
        }
    }

    public static z a(s sVar, byte[] bArr) {
        return a(sVar, bArr.length, new com.mbridge.msdk.thrid.okio.c().write(bArr));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.mbridge.msdk.thrid.okhttp.internal.c.a(k());
    }

    public final InputStream d() {
        return k().j();
    }

    public abstract long h();

    public abstract com.mbridge.msdk.thrid.okio.e k();

    public static z a(s sVar, long j10, com.mbridge.msdk.thrid.okio.e eVar) {
        if (eVar != null) {
            return new a(sVar, j10, eVar);
        }
        throw new NullPointerException("source == null");
    }
}
