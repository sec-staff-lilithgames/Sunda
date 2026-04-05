package com.mbridge.msdk.thrid.okhttp.internal.http2;

import androidx.activity.result.HM.OIPXcgrVyyxoLF;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.thrid.okhttp.internal.http2.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class j implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f43588g = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okio.d f43589a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f43590b;

    /* renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okio.c f43591c;

    /* renamed from: d, reason: collision with root package name */
    private int f43592d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f43593e;

    /* renamed from: f, reason: collision with root package name */
    final d.b f43594f;

    public j(com.mbridge.msdk.thrid.okio.d dVar, boolean z10) {
        this.f43589a = dVar;
        this.f43590b = z10;
        com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
        this.f43591c = cVar;
        this.f43594f = new d.b(cVar);
        this.f43592d = 16384;
    }

    public synchronized void a(m mVar) throws IOException {
        try {
            if (this.f43593e) {
                throw new IOException("closed");
            }
            this.f43592d = mVar.c(this.f43592d);
            if (mVar.b() != -1) {
                this.f43594f.b(mVar.b());
            }
            a(0, 0, (byte) 4, (byte) 1);
            this.f43589a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b(m mVar) throws IOException {
        try {
            if (this.f43593e) {
                throw new IOException("closed");
            }
            int i10 = 0;
            a(0, mVar.d() * 6, (byte) 4, (byte) 0);
            while (i10 < 10) {
                if (mVar.d(i10)) {
                    this.f43589a.writeShort(i10 == 4 ? 3 : i10 == 7 ? 4 : i10);
                    this.f43589a.writeInt(mVar.a(i10));
                }
                i10++;
            }
            this.f43589a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f43593e = true;
        this.f43589a.close();
    }

    public synchronized void d() throws IOException {
        try {
            if (this.f43593e) {
                throw new IOException("closed");
            }
            if (this.f43590b) {
                Logger logger = f43588g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(com.mbridge.msdk.thrid.okhttp.internal.c.a(">> CONNECTION %s", e.f43468a.b()));
                }
                this.f43589a.write(e.f43468a.g());
                this.f43589a.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void flush() throws IOException {
        if (this.f43593e) {
            throw new IOException("closed");
        }
        this.f43589a.flush();
    }

    public int h() {
        return this.f43592d;
    }

    public synchronized void a(int i10, int i11, List<c> list) throws IOException {
        if (!this.f43593e) {
            this.f43594f.a(list);
            long size = this.f43591c.size();
            int iMin = (int) Math.min(this.f43592d - 4, size);
            long j10 = iMin;
            a(i10, iMin + 4, (byte) 5, size == j10 ? (byte) 4 : (byte) 0);
            this.f43589a.writeInt(i11 & Integer.MAX_VALUE);
            this.f43589a.a(this.f43591c, j10);
            if (size > j10) {
                b(i10, size - j10);
            }
        } else {
            throw new IOException(OIPXcgrVyyxoLF.YjW);
        }
    }

    private void b(int i10, long j10) throws IOException {
        while (j10 > 0) {
            int iMin = (int) Math.min(this.f43592d, j10);
            long j11 = iMin;
            j10 -= j11;
            a(i10, iMin, (byte) 9, j10 == 0 ? (byte) 4 : (byte) 0);
            this.f43589a.a(this.f43591c, j11);
        }
    }

    public synchronized void a(boolean z10, int i10, int i11, List<c> list) throws IOException {
        if (!this.f43593e) {
            a(z10, i10, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(int i10, b bVar) throws IOException {
        if (!this.f43593e) {
            if (bVar.f43438a != -1) {
                a(i10, 4, (byte) 3, (byte) 0);
                this.f43589a.writeInt(bVar.f43438a);
                this.f43589a.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(boolean z10, int i10, com.mbridge.msdk.thrid.okio.c cVar, int i11) throws IOException {
        if (!this.f43593e) {
            a(i10, z10 ? (byte) 1 : (byte) 0, cVar, i11);
        } else {
            throw new IOException("closed");
        }
    }

    public void a(int i10, byte b10, com.mbridge.msdk.thrid.okio.c cVar, int i11) throws IOException {
        a(i10, i11, (byte) 0, b10);
        if (i11 > 0) {
            this.f43589a.a(cVar, i11);
        }
    }

    public synchronized void a(boolean z10, int i10, int i11) throws IOException {
        if (!this.f43593e) {
            a(0, 8, (byte) 6, z10 ? (byte) 1 : (byte) 0);
            this.f43589a.writeInt(i10);
            this.f43589a.writeInt(i11);
            this.f43589a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(int i10, b bVar, byte[] bArr) throws IOException {
        try {
            if (!this.f43593e) {
                if (bVar.f43438a != -1) {
                    a(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.f43589a.writeInt(i10);
                    this.f43589a.writeInt(bVar.f43438a);
                    if (bArr.length > 0) {
                        this.f43589a.write(bArr);
                    }
                    this.f43589a.flush();
                } else {
                    throw e.a("errorCode.httpCode == -1", new Object[0]);
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(int i10, long j10) throws IOException {
        if (this.f43593e) {
            throw new IOException("closed");
        }
        if (j10 != 0 && j10 <= 2147483647L) {
            a(i10, 4, (byte) 8, (byte) 0);
            this.f43589a.writeInt((int) j10);
            this.f43589a.flush();
        } else {
            throw e.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
        }
    }

    public void a(int i10, int i11, byte b10, byte b11) throws IOException {
        Logger logger = f43588g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.a(false, i10, i11, b10, b11));
        }
        int i12 = this.f43592d;
        if (i11 > i12) {
            throw e.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
        }
        if ((Integer.MIN_VALUE & i10) == 0) {
            a(this.f43589a, i11);
            this.f43589a.writeByte(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            this.f43589a.writeByte(b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            this.f43589a.writeInt(i10 & Integer.MAX_VALUE);
            return;
        }
        throw e.a("reserved bit set: %s", Integer.valueOf(i10));
    }

    private static void a(com.mbridge.msdk.thrid.okio.d dVar, int i10) throws IOException {
        dVar.writeByte((i10 >>> 16) & 255);
        dVar.writeByte((i10 >>> 8) & 255);
        dVar.writeByte(i10 & 255);
    }

    public void a(boolean z10, int i10, List<c> list) throws IOException {
        if (!this.f43593e) {
            this.f43594f.a(list);
            long size = this.f43591c.size();
            int iMin = (int) Math.min(this.f43592d, size);
            long j10 = iMin;
            byte b10 = size == j10 ? (byte) 4 : (byte) 0;
            if (z10) {
                b10 = (byte) (b10 | 1);
            }
            a(i10, iMin, (byte) 1, b10);
            this.f43589a.a(this.f43591c, j10);
            if (size > j10) {
                b(i10, size - j10);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }
}
