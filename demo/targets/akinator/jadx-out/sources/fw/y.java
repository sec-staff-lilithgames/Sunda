package fw;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y implements Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f56284i;

    /* renamed from: b, reason: collision with root package name */
    public final pw.j f56285b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f56286c;

    /* renamed from: e, reason: collision with root package name */
    public final pw.g f56287e;

    /* renamed from: f, reason: collision with root package name */
    public int f56288f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f56289g;

    /* renamed from: h, reason: collision with root package name */
    public final h f56290h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
        f56284i = Logger.getLogger(j.class.getName());
    }

    public y(pw.j sink, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        this.f56285b = sink;
        this.f56286c = z10;
        pw.g gVar = new pw.g();
        this.f56287e = gVar;
        this.f56288f = 16384;
        this.f56290h = new h(0, false, gVar, 3, null);
    }

    public final void a(int i10, long j10) throws IOException {
        while (j10 > 0) {
            long jMin = Math.min(this.f56288f, j10);
            j10 -= jMin;
            frameHeader(i10, (int) jMin, 9, j10 == 0 ? 4 : 0);
            this.f56285b.write(this.f56287e, jMin);
        }
    }

    public final void applyAndAckSettings(d0 peerSettings) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (this.f56289g) {
                    throw new IOException("closed");
                }
                this.f56288f = peerSettings.getMaxFrameSize(this.f56288f);
                if (peerSettings.getHeaderTableSize() != -1) {
                    this.f56290h.resizeHeaderTable(peerSettings.getHeaderTableSize());
                }
                frameHeader(0, 0, 4, 1);
                this.f56285b.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this) {
            this.f56289g = true;
            this.f56285b.close();
        }
    }

    public final void connectionPreface() throws IOException {
        synchronized (this) {
            try {
                if (this.f56289g) {
                    throw new IOException("closed");
                }
                if (this.f56286c) {
                    Logger logger = f56284i;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(yv.i.format(">> CONNECTION " + j.f56167b.hex(), new Object[0]));
                    }
                    this.f56285b.write(j.f56167b);
                    this.f56285b.flush();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void data(boolean z10, int i10, pw.g gVar, int i11) throws IOException {
        synchronized (this) {
            if (this.f56289g) {
                throw new IOException("closed");
            }
            dataFrame(i10, z10 ? 1 : 0, gVar, i11);
        }
    }

    public final void dataFrame(int i10, int i11, pw.g gVar, int i12) throws IOException {
        frameHeader(i10, i12, 0, i11);
        if (i12 > 0) {
            kotlin.jvm.internal.e0.checkNotNull(gVar);
            this.f56285b.write(gVar, i12);
        }
    }

    public final void flush() throws IOException {
        synchronized (this) {
            if (this.f56289g) {
                throw new IOException("closed");
            }
            this.f56285b.flush();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void frameHeader(int r9, int r10, int r11, int r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 8
            if (r11 == r0) goto L1d
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            java.util.logging.Logger r1 = fw.y.f56284i
            boolean r0 = r1.isLoggable(r0)
            if (r0 == 0) goto L1d
            fw.j r2 = fw.j.f56166a
            r3 = 0
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            java.lang.String r9 = r2.frameLog(r3, r4, r5, r6, r7)
            r1.fine(r9)
            goto L21
        L1d:
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
        L21:
            int r9 = r8.f56288f
            if (r5 > r9) goto L51
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r9 & r4
            if (r9 != 0) goto L41
            pw.j r9 = r8.f56285b
            yv.h.writeMedium(r9, r5)
            r10 = r6 & 255(0xff, float:3.57E-43)
            r9.writeByte(r10)
            r10 = r7 & 255(0xff, float:3.57E-43)
            r9.writeByte(r10)
            r10 = 2147483647(0x7fffffff, float:NaN)
            r10 = r10 & r4
            r9.writeInt(r10)
            return
        L41:
            java.lang.String r9 = "reserved bit set: "
            java.lang.String r9 = a.b.e(r4, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L51:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "FRAME_SIZE_ERROR length > "
            r9.<init>(r10)
            int r10 = r8.f56288f
            r9.append(r10)
            java.lang.String r10 = ": "
            r9.append(r10)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: fw.y.frameHeader(int, int, int, int):void");
    }

    public final h getHpackWriter() {
        return this.f56290h;
    }

    public final void goAway(int i10, c errorCode, byte[] debugData) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(errorCode, "errorCode");
        kotlin.jvm.internal.e0.checkNotNullParameter(debugData, "debugData");
        synchronized (this) {
            if (this.f56289g) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            frameHeader(0, debugData.length + 8, 7, 0);
            this.f56285b.writeInt(i10);
            this.f56285b.writeInt(errorCode.getHttpCode());
            if (debugData.length != 0) {
                this.f56285b.write(debugData);
            }
            this.f56285b.flush();
        }
    }

    public final void headers(boolean z10, int i10, List<f> headerBlock) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(headerBlock, "headerBlock");
        synchronized (this) {
            if (this.f56289g) {
                throw new IOException("closed");
            }
            this.f56290h.writeHeaders(headerBlock);
            long size = this.f56287e.size();
            long jMin = Math.min(this.f56288f, size);
            int i11 = size == jMin ? 4 : 0;
            if (z10) {
                i11 |= 1;
            }
            frameHeader(i10, (int) jMin, 1, i11);
            this.f56285b.write(this.f56287e, jMin);
            if (size > jMin) {
                a(i10, size - jMin);
            }
        }
    }

    public final int maxDataLength() {
        return this.f56288f;
    }

    public final void ping(boolean z10, int i10, int i11) throws IOException {
        synchronized (this) {
            if (this.f56289g) {
                throw new IOException("closed");
            }
            frameHeader(0, 8, 6, z10 ? 1 : 0);
            this.f56285b.writeInt(i10);
            this.f56285b.writeInt(i11);
            this.f56285b.flush();
        }
    }

    public final void pushPromise(int i10, int i11, List<f> requestHeaders) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.f56289g) {
                throw new IOException("closed");
            }
            this.f56290h.writeHeaders(requestHeaders);
            long size = this.f56287e.size();
            int iMin = (int) Math.min(this.f56288f - 4, size);
            long j10 = iMin;
            frameHeader(i10, iMin + 4, 5, size == j10 ? 4 : 0);
            this.f56285b.writeInt(i11 & Integer.MAX_VALUE);
            this.f56285b.write(this.f56287e, j10);
            if (size > j10) {
                a(i10, size - j10);
            }
        }
    }

    public final void rstStream(int i10, c errorCode) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(errorCode, "errorCode");
        synchronized (this) {
            if (this.f56289g) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            frameHeader(i10, 4, 3, 0);
            this.f56285b.writeInt(errorCode.getHttpCode());
            this.f56285b.flush();
        }
    }

    public final void settings(d0 settings) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(settings, "settings");
        synchronized (this) {
            try {
                if (this.f56289g) {
                    throw new IOException("closed");
                }
                frameHeader(0, settings.size() * 6, 4, 0);
                for (int i10 = 0; i10 < 10; i10++) {
                    if (settings.isSet(i10)) {
                        this.f56285b.writeShort(i10);
                        this.f56285b.writeInt(settings.get(i10));
                    }
                }
                this.f56285b.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void windowUpdate(int i10, long j10) throws IOException {
        int i11;
        long j11;
        synchronized (this) {
            try {
                if (this.f56289g) {
                    throw new IOException("closed");
                }
                if (j10 == 0 || j10 > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
                }
                Logger logger = f56284i;
                if (logger.isLoggable(Level.FINE)) {
                    i11 = i10;
                    j11 = j10;
                    logger.fine(j.f56166a.frameLogWindowUpdate(false, i11, 4, j11));
                } else {
                    i11 = i10;
                    j11 = j10;
                }
                frameHeader(i11, 4, 8, 0);
                this.f56285b.writeInt((int) j11);
                this.f56285b.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
