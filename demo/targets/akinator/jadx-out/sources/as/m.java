package as;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m implements d {

    /* renamed from: b, reason: collision with root package name */
    public final pw.j f7985b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7986c;

    /* renamed from: e, reason: collision with root package name */
    public final pw.g f7987e;

    /* renamed from: f, reason: collision with root package name */
    public final h f7988f;

    /* renamed from: g, reason: collision with root package name */
    public int f7989g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7990h;

    public m(pw.j jVar, boolean z10) {
        this.f7985b = jVar;
        this.f7986c = z10;
        pw.g gVar = new pw.g();
        this.f7987e = gVar;
        this.f7988f = new h(gVar);
        this.f7989g = 16384;
    }

    public final void a(int i10, int i11, byte b10, byte b11) throws IOException {
        Logger logger = j.f7970a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(k.a(false, i10, i11, b10, b11));
        }
        int i12 = this.f7989g;
        if (i11 > i12) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(w0.i.a(i12, i11, "FRAME_SIZE_ERROR length > ", ": "));
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException(a.b.e(i10, "reserved bit set: "));
        }
        pw.j jVar = this.f7985b;
        jVar.writeByte((i11 >>> 16) & 255);
        jVar.writeByte((i11 >>> 8) & 255);
        jVar.writeByte(i11 & 255);
        jVar.writeByte(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        jVar.writeByte(b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        jVar.writeInt(i10 & Integer.MAX_VALUE);
    }

    @Override // as.d
    public synchronized void ackSettings(p pVar) throws IOException {
        if (this.f7990h) {
            throw new IOException("closed");
        }
        int i10 = this.f7989g;
        if ((pVar.f7998a & 32) != 0) {
            i10 = pVar.f7999b[5];
        }
        this.f7989g = i10;
        a(0, 0, (byte) 4, (byte) 1);
        this.f7985b.flush();
    }

    public final void b(boolean z10, int i10, List list) throws IOException {
        if (this.f7990h) {
            throw new IOException("closed");
        }
        this.f7988f.c(list);
        pw.g gVar = this.f7987e;
        long size = gVar.size();
        int iMin = (int) Math.min(this.f7989g, size);
        long j10 = iMin;
        byte b10 = size == j10 ? (byte) 4 : (byte) 0;
        if (z10) {
            b10 = (byte) (b10 | 1);
        }
        a(i10, iMin, (byte) 1, b10);
        this.f7985b.write(gVar, j10);
        if (size > j10) {
            c(i10, size - j10);
        }
    }

    public final void c(int i10, long j10) throws IOException {
        while (j10 > 0) {
            int iMin = (int) Math.min(this.f7989g, j10);
            long j11 = iMin;
            j10 -= j11;
            a(i10, iMin, (byte) 9, j10 == 0 ? (byte) 4 : (byte) 0);
            this.f7985b.write(this.f7987e, j11);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f7990h = true;
        this.f7985b.close();
    }

    @Override // as.d
    public synchronized void connectionPreface() throws IOException {
        try {
            if (this.f7990h) {
                throw new IOException("closed");
            }
            if (this.f7986c) {
                Logger logger = j.f7970a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(">> CONNECTION " + j.f7971b.hex());
                }
                this.f7985b.write(j.f7971b.toByteArray());
                this.f7985b.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // as.d
    public synchronized void data(boolean z10, int i10, pw.g gVar, int i11) throws IOException {
        if (this.f7990h) {
            throw new IOException("closed");
        }
        a(i10, i11, (byte) 0, z10 ? (byte) 1 : (byte) 0);
        if (i11 > 0) {
            this.f7985b.write(gVar, i11);
        }
    }

    @Override // as.d
    public synchronized void flush() throws IOException {
        if (this.f7990h) {
            throw new IOException("closed");
        }
        this.f7985b.flush();
    }

    @Override // as.d
    public synchronized void goAway(int i10, a aVar, byte[] bArr) throws IOException {
        try {
            if (this.f7990h) {
                throw new IOException("closed");
            }
            if (aVar.f7938b == -1) {
                Logger logger = j.f7970a;
                Locale locale = Locale.US;
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            a(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f7985b.writeInt(i10);
            this.f7985b.writeInt(aVar.f7938b);
            if (bArr.length > 0) {
                this.f7985b.write(bArr);
            }
            this.f7985b.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // as.d
    public synchronized void headers(int i10, List<e> list) throws IOException {
        if (this.f7990h) {
            throw new IOException("closed");
        }
        b(false, i10, list);
    }

    @Override // as.d
    public int maxDataLength() {
        return this.f7989g;
    }

    @Override // as.d
    public synchronized void ping(boolean z10, int i10, int i11) throws IOException {
        if (this.f7990h) {
            throw new IOException("closed");
        }
        a(0, 8, (byte) 6, z10 ? (byte) 1 : (byte) 0);
        this.f7985b.writeInt(i10);
        this.f7985b.writeInt(i11);
        this.f7985b.flush();
    }

    @Override // as.d
    public synchronized void pushPromise(int i10, int i11, List<e> list) throws IOException {
        if (this.f7990h) {
            throw new IOException("closed");
        }
        this.f7988f.c(list);
        long size = this.f7987e.size();
        int iMin = (int) Math.min(this.f7989g - 4, size);
        long j10 = iMin;
        a(i10, iMin + 4, (byte) 5, size == j10 ? (byte) 4 : (byte) 0);
        this.f7985b.writeInt(i11 & Integer.MAX_VALUE);
        this.f7985b.write(this.f7987e, j10);
        if (size > j10) {
            c(i10, size - j10);
        }
    }

    @Override // as.d
    public synchronized void rstStream(int i10, a aVar) throws IOException {
        if (this.f7990h) {
            throw new IOException("closed");
        }
        if (aVar.f7938b == -1) {
            throw new IllegalArgumentException();
        }
        a(i10, 4, (byte) 3, (byte) 0);
        this.f7985b.writeInt(aVar.f7938b);
        this.f7985b.flush();
    }

    @Override // as.d
    public synchronized void settings(p pVar) throws IOException {
        try {
            if (this.f7990h) {
                throw new IOException("closed");
            }
            int i10 = 0;
            a(0, Integer.bitCount(pVar.f7998a) * 6, (byte) 4, (byte) 0);
            while (i10 < 10) {
                if (pVar.isSet(i10)) {
                    this.f7985b.writeShort(i10 == 4 ? 3 : i10 == 7 ? 4 : i10);
                    this.f7985b.writeInt(pVar.get(i10));
                }
                i10++;
            }
            this.f7985b.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // as.d
    public synchronized void synReply(boolean z10, int i10, List<e> list) throws IOException {
        if (this.f7990h) {
            throw new IOException("closed");
        }
        b(z10, i10, list);
    }

    @Override // as.d
    public synchronized void synStream(boolean z10, boolean z11, int i10, int i11, List<e> list) throws IOException {
        if (z11) {
            throw new UnsupportedOperationException();
        }
        if (this.f7990h) {
            throw new IOException("closed");
        }
        b(z10, i10, list);
    }

    @Override // as.d
    public synchronized void windowUpdate(int i10, long j10) throws IOException {
        if (this.f7990h) {
            throw new IOException("closed");
        }
        if (j10 == 0 || j10 > 2147483647L) {
            Logger logger = j.f7970a;
            Locale locale = Locale.US;
            throw new IllegalArgumentException("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10);
        }
        a(i10, 4, (byte) 8, (byte) 0);
        this.f7985b.writeInt((int) j10);
        this.f7985b.flush();
    }
}
