package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.buffer.a f17110a;

    /* renamed from: b, reason: collision with root package name */
    private long f17111b;

    public a(com.bykv.vk.openvk.preload.geckox.buffer.a aVar) {
        this.f17110a = aVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jB = this.f17110a.b() - this.f17110a.c();
        if (jB > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jB;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f17111b = i10;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return this.f17110a.b(bArr);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.f17110a.b(this.f17111b);
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        return this.f17110a.a(j10);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f17110a.b(bArr, i10, i11);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return this.f17110a.d();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
