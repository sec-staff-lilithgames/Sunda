package com.mbridge.msdk.thrid.okio;

import b0.e2;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class n implements e {

    /* renamed from: a, reason: collision with root package name */
    public final c f43846a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final s f43847b;

    /* renamed from: c, reason: collision with root package name */
    boolean f43848c;

    public n(s sVar) {
        if (sVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f43847b = sVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.e, com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this.f43846a;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) throws IOException {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: "));
        }
        if (this.f43848c) {
            throw new IllegalStateException("closed");
        }
        c cVar2 = this.f43846a;
        if (cVar2.f43818b == 0 && this.f43847b.b(cVar2, 8192L) == -1) {
            return -1L;
        }
        return this.f43846a.b(cVar, Math.min(j10, this.f43846a.f43818b));
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte[] c(long j10) throws IOException {
        e(j10);
        return this.f43846a.c(j10);
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f43848c) {
            return;
        }
        this.f43848c = true;
        this.f43847b.close();
        this.f43846a.k();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String d(long j10) throws IOException {
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "limit < 0: "));
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jA = a((byte) 10, 0L, j11);
        if (jA != -1) {
            return this.f43846a.h(jA);
        }
        if (j11 < Long.MAX_VALUE && f(j11) && this.f43846a.f(j11 - 1) == 13 && f(j11 + 1) && this.f43846a.f(j11) == 10) {
            return this.f43846a.h(j11);
        }
        c cVar = new c();
        c cVar2 = this.f43846a;
        cVar2.a(cVar, 0L, Math.min(32L, cVar2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f43846a.size(), j10) + " content=" + cVar.o().b() + (char) 8230);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void e(long j10) throws IOException {
        if (!f(j10)) {
            throw new EOFException();
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public boolean f() throws IOException {
        if (this.f43848c) {
            throw new IllegalStateException("closed");
        }
        return this.f43846a.f() && this.f43847b.b(this.f43846a, 8192L) == -1;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short g() throws IOException {
        e(2L);
        return this.f43846a.g();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public long i() throws IOException {
        byte bF;
        e(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!f(i11)) {
                break;
            }
            bF = this.f43846a.f(i10);
            if ((bF < 48 || bF > 57) && ((bF < 97 || bF > 102) && (bF < 65 || bF > 70))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(bF)));
        }
        return this.f43846a.i();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f43848c;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public InputStream j() {
        return new a();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        c cVar = this.f43846a;
        if (cVar.f43818b == 0 && this.f43847b.b(cVar, 8192L) == -1) {
            return -1;
        }
        return this.f43846a.read(byteBuffer);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte readByte() throws IOException {
        e(1L);
        return this.f43846a.readByte();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void readFully(byte[] bArr) throws IOException {
        try {
            e(bArr.length);
            this.f43846a.readFully(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (true) {
                c cVar = this.f43846a;
                long j10 = cVar.f43818b;
                if (j10 <= 0) {
                    throw e10;
                }
                int i11 = cVar.read(bArr, i10, (int) j10);
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int readInt() throws IOException {
        e(4L);
        return this.f43846a.readInt();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short readShort() throws IOException {
        e(2L);
        return this.f43846a.readShort();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void skip(long j10) throws IOException {
        if (this.f43848c) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            c cVar = this.f43846a;
            if (cVar.f43818b == 0 && this.f43847b.b(cVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, this.f43846a.size());
            this.f43846a.skip(jMin);
            j10 -= jMin;
        }
    }

    public String toString() {
        return "buffer(" + this.f43847b + ")";
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public long a(byte b10) throws IOException {
        return a(b10, 0L, Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int e() throws IOException {
        e(4L);
        return this.f43846a.e();
    }

    public long a(byte b10, long j10, long j11) throws IOException {
        if (this.f43848c) {
            throw new IllegalStateException("closed");
        }
        if (j10 < 0 || j11 < j10) {
            StringBuilder sbR = e2.r(j10, "fromIndex=", " toIndex=");
            sbR.append(j11);
            throw new IllegalArgumentException(sbR.toString());
        }
        long jMax = j10;
        while (jMax < j11) {
            byte b11 = b10;
            long j12 = j11;
            long jA = this.f43846a.a(b11, jMax, j12);
            if (jA != -1) {
                return jA;
            }
            c cVar = this.f43846a;
            long j13 = cVar.f43818b;
            if (j13 >= j12 || this.f43847b.b(cVar, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j13);
            b10 = b11;
            j11 = j12;
        }
        return -1L;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String c() throws IOException {
        return d(Long.MAX_VALUE);
    }

    public boolean f(long j10) throws IOException {
        c cVar;
        if (j10 >= 0) {
            if (this.f43848c) {
                throw new IllegalStateException("closed");
            }
            do {
                cVar = this.f43846a;
                if (cVar.f43818b >= j10) {
                    return true;
                }
            } while (this.f43847b.b(cVar, 8192L) != -1);
            return false;
        }
        throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: "));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            n nVar = n.this;
            if (nVar.f43848c) {
                throw new IOException("closed");
            }
            return (int) Math.min(nVar.f43846a.f43818b, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            n.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            n nVar = n.this;
            if (nVar.f43848c) {
                throw new IOException("closed");
            }
            c cVar = nVar.f43846a;
            if (cVar.f43818b == 0 && nVar.f43847b.b(cVar, 8192L) == -1) {
                return -1;
            }
            return n.this.f43846a.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }

        public String toString() {
            return n.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            if (!n.this.f43848c) {
                u.a(bArr.length, i10, i11);
                n nVar = n.this;
                c cVar = nVar.f43846a;
                if (cVar.f43818b == 0 && nVar.f43847b.b(cVar, 8192L) == -1) {
                    return -1;
                }
                return n.this.f43846a.read(bArr, i10, i11);
            }
            throw new IOException("closed");
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public f b(long j10) throws IOException {
        e(j10);
        return this.f43846a.b(j10);
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f43847b.b();
    }
}
