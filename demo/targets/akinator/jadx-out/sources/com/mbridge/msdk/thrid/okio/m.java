package com.mbridge.msdk.thrid.okio;

import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class m implements d {

    /* renamed from: a, reason: collision with root package name */
    public final c f43843a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final r f43844b;

    /* renamed from: c, reason: collision with root package name */
    boolean f43845c;

    public m(r rVar) {
        if (rVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f43844b = rVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this.f43843a;
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public t b() {
        return this.f43844b.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f43845c) {
            return;
        }
        try {
            c cVar = this.f43843a;
            long j10 = cVar.f43818b;
            if (j10 > 0) {
                this.f43844b.a(cVar, j10);
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f43844b.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f43845c = true;
        if (th != null) {
            u.a(th);
        }
    }

    public d d() throws IOException {
        if (this.f43845c) {
            throw new IllegalStateException("closed");
        }
        long jM = this.f43843a.m();
        if (jM > 0) {
            this.f43844b.a(this.f43843a, jM);
        }
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.d, com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() throws IOException {
        if (this.f43845c) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.f43843a;
        long j10 = cVar.f43818b;
        if (j10 > 0) {
            this.f43844b.a(cVar, j10);
        }
        this.f43844b.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f43845c;
    }

    public String toString() {
        return "buffer(" + this.f43844b + ")";
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d write(byte[] bArr) throws IOException {
        if (this.f43845c) {
            throw new IllegalStateException("closed");
        }
        this.f43843a.write(bArr);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeByte(int i10) throws IOException {
        if (this.f43845c) {
            throw new IllegalStateException("closed");
        }
        this.f43843a.writeByte(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeInt(int i10) throws IOException {
        if (this.f43845c) {
            throw new IllegalStateException("closed");
        }
        this.f43843a.writeInt(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeShort(int i10) throws IOException {
        if (this.f43845c) {
            throw new IllegalStateException("closed");
        }
        this.f43843a.writeShort(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j10) throws IOException {
        if (this.f43845c) {
            throw new IllegalStateException(SFPXhf.mxdJ);
        }
        this.f43843a.a(cVar, j10);
        d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d write(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f43845c) {
            this.f43843a.write(bArr, i10, i11);
            return d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d a(String str) throws IOException {
        if (!this.f43845c) {
            this.f43843a.a(str);
            return d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f43845c) {
            int iWrite = this.f43843a.write(byteBuffer);
            d();
            return iWrite;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d a(long j10) throws IOException {
        if (!this.f43845c) {
            this.f43843a.a(j10);
            return d();
        }
        throw new IllegalStateException("closed");
    }
}
