package xr;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.DataFormatException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class p9 implements Closeable, d2 {

    /* renamed from: b, reason: collision with root package name */
    public m9 f92881b;

    /* renamed from: c, reason: collision with root package name */
    public int f92882c;

    /* renamed from: e, reason: collision with root package name */
    public final te f92883e;

    /* renamed from: f, reason: collision with root package name */
    public final ff f92884f;

    /* renamed from: g, reason: collision with root package name */
    public wr.a1 f92885g;

    /* renamed from: h, reason: collision with root package name */
    public d5 f92886h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f92887i;

    /* renamed from: j, reason: collision with root package name */
    public int f92888j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f92891m;

    /* renamed from: n, reason: collision with root package name */
    public z1 f92892n;

    /* renamed from: p, reason: collision with root package name */
    public long f92894p;

    /* renamed from: s, reason: collision with root package name */
    public int f92897s;

    /* renamed from: k, reason: collision with root package name */
    public int f92889k = 1;

    /* renamed from: l, reason: collision with root package name */
    public int f92890l = 5;

    /* renamed from: o, reason: collision with root package name */
    public z1 f92893o = new z1();

    /* renamed from: q, reason: collision with root package name */
    public boolean f92895q = false;

    /* renamed from: r, reason: collision with root package name */
    public int f92896r = -1;

    /* renamed from: t, reason: collision with root package name */
    public boolean f92898t = false;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f92899u = false;

    public p9(m9 m9Var, wr.a1 a1Var, int i10, te teVar, ff ffVar) {
        this.f92881b = (m9) mh.p1.checkNotNull(m9Var, "sink");
        this.f92885g = (wr.a1) mh.p1.checkNotNull(a1Var, "decompressor");
        this.f92882c = i10;
        this.f92883e = (te) mh.p1.checkNotNull(teVar, "statsTraceCtx");
        this.f92884f = (ff) mh.p1.checkNotNull(ffVar, "transportTracer");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    @Override // java.io.Closeable, java.lang.AutoCloseable, xr.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            r6 = this;
            boolean r0 = r6.isClosed()
            if (r0 == 0) goto L7
            return
        L7:
            xr.z1 r0 = r6.f92892n
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L15
            int r0 = r0.readableBytes()
            if (r0 <= 0) goto L15
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            r3 = 0
            xr.d5 r4 = r6.f92886h     // Catch: java.lang.Throwable -> L39
            if (r4 == 0) goto L3b
            if (r0 != 0) goto L31
            boolean r0 = r4.f92414k     // Catch: java.lang.Throwable -> L39
            r0 = r0 ^ r2
            java.lang.String r5 = "GzipInflatingBuffer is closed"
            mh.p1.checkState(r0, r5)     // Catch: java.lang.Throwable -> L39
            androidx.recyclerview.widget.l1 r0 = r4.f92408e     // Catch: java.lang.Throwable -> L39
            int r0 = r0.e()     // Catch: java.lang.Throwable -> L39
            if (r0 != 0) goto L31
            int r0 = r4.f92413j     // Catch: java.lang.Throwable -> L39
            if (r0 == r2) goto L32
        L31:
            r1 = r2
        L32:
            xr.d5 r0 = r6.f92886h     // Catch: java.lang.Throwable -> L39
            r0.close()     // Catch: java.lang.Throwable -> L39
            r0 = r1
            goto L3b
        L39:
            r0 = move-exception
            goto L55
        L3b:
            xr.z1 r1 = r6.f92893o     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L42
            r1.close()     // Catch: java.lang.Throwable -> L39
        L42:
            xr.z1 r1 = r6.f92892n     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L49
            r1.close()     // Catch: java.lang.Throwable -> L39
        L49:
            r6.f92886h = r3
            r6.f92893o = r3
            r6.f92892n = r3
            xr.m9 r1 = r6.f92881b
            r1.deframerClosed(r0)
            return
        L55:
            r6.f92886h = r3
            r6.f92893o = r3
            r6.f92892n = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.p9.close():void");
    }

    @Override // xr.d2
    public void closeWhenComplete() {
        boolean z10;
        if (isClosed()) {
            return;
        }
        d5 d5Var = this.f92886h;
        if (d5Var != null) {
            mh.p1.checkState(!d5Var.f92414k, "GzipInflatingBuffer is closed");
            z10 = d5Var.f92420q;
        } else {
            z10 = this.f92893o.readableBytes() == 0;
        }
        if (z10) {
            close();
        } else {
            this.f92898t = true;
        }
    }

    public final void d() {
        if (this.f92895q) {
            return;
        }
        boolean z10 = true;
        this.f92895q = true;
        while (!this.f92899u && this.f92894p > 0 && l()) {
            try {
                int iC = b3.h.c(this.f92889k);
                if (iC == 0) {
                    k();
                } else {
                    if (iC != 1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid state: ");
                        int i10 = this.f92889k;
                        sb2.append(i10 != 1 ? i10 != 2 ? AbstractJsonLexerKt.NULL : "BODY" : "HEADER");
                        throw new AssertionError(sb2.toString());
                    }
                    h();
                    this.f92894p--;
                }
            } catch (Throwable th2) {
                this.f92895q = false;
                throw th2;
            }
        }
        if (this.f92899u) {
            close();
            this.f92895q = false;
            return;
        }
        if (this.f92898t) {
            d5 d5Var = this.f92886h;
            if (d5Var != null) {
                mh.p1.checkState(true ^ d5Var.f92414k, "GzipInflatingBuffer is closed");
                z10 = d5Var.f92420q;
            } else if (this.f92893o.readableBytes() != 0) {
                z10 = false;
            }
            if (z10) {
                close();
            }
        }
        this.f92895q = false;
    }

    @Override // xr.d2
    public void deframe(ab abVar) throws Throwable {
        mh.p1.checkNotNull(abVar, "data");
        boolean z10 = true;
        try {
            if (!isClosed() && !this.f92898t) {
                d5 d5Var = this.f92886h;
                if (d5Var != null) {
                    mh.p1.checkState(!d5Var.f92414k, "GzipInflatingBuffer is closed");
                    d5Var.f92406b.addBuffer(abVar);
                    d5Var.f92420q = false;
                } else {
                    this.f92893o.addBuffer(abVar);
                }
                try {
                    d();
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    z10 = false;
                    if (z10) {
                        abVar.close();
                    }
                    throw th;
                }
            }
            abVar.close();
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void h() {
        InputStream inputStreamOpenStream;
        int i10 = this.f92896r;
        long j10 = this.f92897s;
        te teVar = this.f92883e;
        teVar.inboundMessageRead(i10, j10, -1L);
        this.f92897s = 0;
        if (this.f92891m) {
            wr.a1 a1Var = this.f92885g;
            if (a1Var == wr.z.f91209a) {
                throw wr.m6.f91046n.withDescription("Can't decode compressed gRPC message as compression not configured").asRuntimeException();
            }
            try {
                inputStreamOpenStream = new o9(a1Var.decompress(fb.openStream(this.f92892n, true)), this.f92882c, teVar);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } else {
            teVar.inboundUncompressedSize(this.f92892n.readableBytes());
            inputStreamOpenStream = fb.openStream(this.f92892n, true);
        }
        this.f92892n.touch();
        this.f92892n = null;
        m9 m9Var = this.f92881b;
        n9 n9Var = new n9();
        n9Var.f92814b = inputStreamOpenStream;
        m9Var.messagesAvailable(n9Var);
        this.f92889k = 1;
        this.f92890l = 5;
    }

    public boolean isClosed() {
        return this.f92893o == null && this.f92886h == null;
    }

    public final void k() {
        int unsignedByte = this.f92892n.readUnsignedByte();
        if ((unsignedByte & 254) != 0) {
            throw wr.m6.f91046n.withDescription("gRPC frame header malformed: reserved bits not zero").asRuntimeException();
        }
        this.f92891m = (unsignedByte & 1) != 0;
        int i10 = this.f92892n.readInt();
        this.f92890l = i10;
        if (i10 >= 0 && i10 <= this.f92882c) {
            int i11 = this.f92896r + 1;
            this.f92896r = i11;
            this.f92883e.inboundMessage(i11);
            this.f92884f.reportMessageReceived();
            this.f92889k = 2;
            return;
        }
        wr.m6 m6Var = wr.m6.f91043k;
        Locale locale = Locale.US;
        throw m6Var.withDescription("gRPC message exceeds maximum size " + this.f92882c + ": " + i10).asRuntimeException();
    }

    public final boolean l() throws Throwable {
        int i10;
        te teVar = this.f92883e;
        int i11 = 0;
        try {
            if (this.f92892n == null) {
                this.f92892n = new z1();
            }
            int i12 = 0;
            i10 = 0;
            while (true) {
                try {
                    int i13 = this.f92890l - this.f92892n.readableBytes();
                    if (i13 <= 0) {
                        if (i12 > 0) {
                            this.f92881b.bytesRead(i12);
                            if (this.f92889k == 2) {
                                if (this.f92886h != null) {
                                    teVar.inboundWireSize(i10);
                                    this.f92897s += i10;
                                    return true;
                                }
                                teVar.inboundWireSize(i12);
                                this.f92897s += i12;
                            }
                        }
                        return true;
                    }
                    if (this.f92886h != null) {
                        try {
                            byte[] bArr = this.f92887i;
                            if (bArr == null || this.f92888j == bArr.length) {
                                this.f92887i = new byte[Math.min(i13, 2097152)];
                                this.f92888j = 0;
                            }
                            int iA = this.f92886h.a(this.f92888j, Math.min(i13, this.f92887i.length - this.f92888j), this.f92887i);
                            d5 d5Var = this.f92886h;
                            int i14 = d5Var.f92418o;
                            d5Var.f92418o = 0;
                            i12 += i14;
                            int i15 = d5Var.f92419p;
                            d5Var.f92419p = 0;
                            i10 += i15;
                            if (iA != 0) {
                                this.f92892n.addBuffer(fb.wrap(this.f92887i, this.f92888j, iA));
                                this.f92888j += iA;
                            } else if (i12 > 0) {
                                this.f92881b.bytesRead(i12);
                                if (this.f92889k == 2) {
                                    if (this.f92886h != null) {
                                        teVar.inboundWireSize(i10);
                                        this.f92897s += i10;
                                        return false;
                                    }
                                    teVar.inboundWireSize(i12);
                                    this.f92897s += i12;
                                    return false;
                                }
                            }
                        } catch (IOException e10) {
                            throw new RuntimeException(e10);
                        } catch (DataFormatException e11) {
                            throw new RuntimeException(e11);
                        }
                    } else if (this.f92893o.readableBytes() != 0) {
                        int iMin = Math.min(i13, this.f92893o.readableBytes());
                        i12 += iMin;
                        this.f92892n.addBuffer(this.f92893o.readBytes(iMin));
                    } else if (i12 > 0) {
                        this.f92881b.bytesRead(i12);
                        if (this.f92889k == 2) {
                            if (this.f92886h != null) {
                                teVar.inboundWireSize(i10);
                                this.f92897s += i10;
                                return false;
                            }
                            teVar.inboundWireSize(i12);
                            this.f92897s += i12;
                        }
                    }
                } catch (Throwable th2) {
                    int i16 = i12;
                    th = th2;
                    i11 = i16;
                    if (i11 > 0) {
                        this.f92881b.bytesRead(i11);
                        if (this.f92889k == 2) {
                            if (this.f92886h != null) {
                                teVar.inboundWireSize(i10);
                                this.f92897s += i10;
                            } else {
                                teVar.inboundWireSize(i11);
                                this.f92897s += i11;
                            }
                        }
                    }
                    throw th;
                }
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            i10 = 0;
        }
    }

    @Override // xr.d2
    public void request(int i10) {
        mh.p1.checkArgument(i10 > 0, "numMessages must be > 0");
        if (isClosed()) {
            return;
        }
        this.f92894p += i10;
        d();
    }

    @Override // xr.d2
    public void setDecompressor(wr.a1 a1Var) {
        mh.p1.checkState(this.f92886h == null, "Already set full stream decompressor");
        this.f92885g = (wr.a1) mh.p1.checkNotNull(a1Var, "Can't pass an empty decompressor");
    }

    @Override // xr.d2
    public void setFullStreamDecompressor(d5 d5Var) {
        mh.p1.checkState(this.f92885g == wr.z.f91209a, "per-message decompressor already set");
        mh.p1.checkState(this.f92886h == null, "full stream decompressor already set");
        this.f92886h = (d5) mh.p1.checkNotNull(d5Var, "Can't pass a null full stream decompressor");
        this.f92893o = null;
    }

    @Override // xr.d2
    public void setMaxInboundMessageSize(int i10) {
        this.f92882c = i10;
    }
}
