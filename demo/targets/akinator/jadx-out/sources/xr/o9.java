package xr;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o9 extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public final int f92850b;

    /* renamed from: c, reason: collision with root package name */
    public final te f92851c;

    /* renamed from: e, reason: collision with root package name */
    public long f92852e;

    /* renamed from: f, reason: collision with root package name */
    public long f92853f;

    /* renamed from: g, reason: collision with root package name */
    public long f92854g;

    public o9(InputStream inputStream, int i10, te teVar) {
        super(inputStream);
        this.f92854g = -1L;
        this.f92850b = i10;
        this.f92851c = teVar;
    }

    public final void d() {
        long j10 = this.f92853f;
        long j11 = this.f92852e;
        if (j10 > j11) {
            this.f92851c.inboundUncompressedSize(j10 - j11);
            this.f92852e = this.f92853f;
        }
    }

    public final void h() {
        long j10 = this.f92853f;
        int i10 = this.f92850b;
        if (j10 <= i10) {
            return;
        }
        throw wr.m6.f91043k.withDescription("Decompressed gRPC message exceeds maximum size " + i10).asRuntimeException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        this.f92854g = this.f92853f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 != -1) {
            this.f92853f++;
        }
        h();
        d();
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f92854g == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f92853f = this.f92854g;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j10);
        this.f92853f += jSkip;
        h();
        d();
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f92853f += i12;
        }
        h();
        d();
        return i12;
    }
}
