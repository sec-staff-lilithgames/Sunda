package ow;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;
import pw.g;
import pw.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f79922b;

    /* renamed from: c, reason: collision with root package name */
    public final k f79923c;

    /* renamed from: e, reason: collision with root package name */
    public final h f79924e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f79925f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f79926g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f79927h;

    /* renamed from: i, reason: collision with root package name */
    public int f79928i;

    /* renamed from: j, reason: collision with root package name */
    public long f79929j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f79930k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f79931l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f79932m;

    /* renamed from: n, reason: collision with root package name */
    public final pw.g f79933n;

    /* renamed from: o, reason: collision with root package name */
    public final pw.g f79934o;

    /* renamed from: p, reason: collision with root package name */
    public c f79935p;

    /* renamed from: q, reason: collision with root package name */
    public final byte[] f79936q;

    /* renamed from: r, reason: collision with root package name */
    public final g.a f79937r;

    public i(boolean z10, k source, h frameCallback, boolean z11, boolean z12) {
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(frameCallback, "frameCallback");
        this.f79922b = z10;
        this.f79923c = source;
        this.f79924e = frameCallback;
        this.f79925f = z11;
        this.f79926g = z12;
        this.f79933n = new pw.g();
        this.f79934o = new pw.g();
        this.f79936q = z10 ? null : new byte[4];
        this.f79937r = z10 ? null : new g.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        c cVar = this.f79935p;
        if (cVar != null) {
            cVar.close();
        }
    }

    public final void d() throws IOException {
        short s10;
        String utf8;
        long j10 = this.f79929j;
        g gVar = g.f79921a;
        pw.g gVar2 = this.f79933n;
        if (j10 > 0) {
            this.f79923c.readFully(gVar2, j10);
            if (!this.f79922b) {
                g.a aVar = this.f79937r;
                e0.checkNotNull(aVar);
                gVar2.readAndWriteUnsafe(aVar);
                aVar.seek(0L);
                byte[] bArr = this.f79936q;
                e0.checkNotNull(bArr);
                gVar.toggleMask(aVar, bArr);
                aVar.close();
            }
        }
        int i10 = this.f79928i;
        h hVar = this.f79924e;
        switch (i10) {
            case 8:
                long size = gVar2.size();
                if (size == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (size != 0) {
                    s10 = gVar2.readShort();
                    utf8 = gVar2.readUtf8();
                    String strCloseCodeExceptionMessage = gVar.closeCodeExceptionMessage(s10);
                    if (strCloseCodeExceptionMessage != null) {
                        throw new ProtocolException(strCloseCodeExceptionMessage);
                    }
                } else {
                    s10 = 1005;
                    utf8 = "";
                }
                hVar.onReadClose(s10, utf8);
                this.f79927h = true;
                return;
            case 9:
                hVar.onReadPing(gVar2.readByteString());
                return;
            case 10:
                hVar.onReadPong(gVar2.readByteString());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + yv.i.toHexString(this.f79928i));
        }
    }

    public final k getSource() {
        return this.f79923c;
    }

    public final void h() throws IOException {
        boolean z10;
        if (this.f79927h) {
            throw new IOException("closed");
        }
        k kVar = this.f79923c;
        long jTimeoutNanos = kVar.timeout().timeoutNanos();
        kVar.timeout().clearTimeout();
        try {
            int iAnd = yv.h.and(kVar.readByte(), 255);
            kVar.timeout().timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            int i10 = iAnd & 15;
            this.f79928i = i10;
            boolean z11 = (iAnd & 128) != 0;
            this.f79930k = z11;
            boolean z12 = (iAnd & 8) != 0;
            this.f79931l = z12;
            if (z12 && !z11) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z13 = (iAnd & 64) != 0;
            if (i10 == 1 || i10 == 2) {
                if (!z13) {
                    z10 = false;
                } else {
                    if (!this.f79925f) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z10 = true;
                }
                this.f79932m = z10;
            } else if (z13) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iAnd & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iAnd & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iAnd2 = yv.h.and(kVar.readByte(), 255);
            boolean z14 = (iAnd2 & 128) != 0;
            boolean z15 = this.f79922b;
            if (z14 == z15) {
                throw new ProtocolException(z15 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j10 = iAnd2 & 127;
            this.f79929j = j10;
            if (j10 == 126) {
                this.f79929j = yv.h.and(kVar.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            } else if (j10 == 127) {
                long j11 = kVar.readLong();
                this.f79929j = j11;
                if (j11 < 0) {
                    throw new ProtocolException("Frame length 0x" + yv.i.toHexString(this.f79929j) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f79931l && this.f79929j > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z14) {
                byte[] bArr = this.f79936q;
                e0.checkNotNull(bArr);
                kVar.readFully(bArr);
            }
        } catch (Throwable th2) {
            kVar.timeout().timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            throw th2;
        }
    }

    public final void processNextFrame() throws IOException {
        h();
        if (this.f79931l) {
            d();
            return;
        }
        int i10 = this.f79928i;
        if (i10 != 1 && i10 != 2) {
            throw new ProtocolException("Unknown opcode: " + yv.i.toHexString(i10));
        }
        while (!this.f79927h) {
            long j10 = this.f79929j;
            pw.g gVar = this.f79934o;
            if (j10 > 0) {
                this.f79923c.readFully(gVar, j10);
                if (!this.f79922b) {
                    g.a aVar = this.f79937r;
                    e0.checkNotNull(aVar);
                    gVar.readAndWriteUnsafe(aVar);
                    aVar.seek(gVar.size() - this.f79929j);
                    byte[] bArr = this.f79936q;
                    e0.checkNotNull(bArr);
                    g.f79921a.toggleMask(aVar, bArr);
                    aVar.close();
                }
            }
            if (this.f79930k) {
                if (this.f79932m) {
                    c cVar = this.f79935p;
                    if (cVar == null) {
                        cVar = new c(this.f79926g);
                        this.f79935p = cVar;
                    }
                    cVar.inflate(gVar);
                }
                h hVar = this.f79924e;
                if (i10 == 1) {
                    hVar.onReadMessage(gVar.readUtf8());
                    return;
                } else {
                    hVar.onReadMessage(gVar.readByteString());
                    return;
                }
            }
            while (!this.f79927h) {
                h();
                if (!this.f79931l) {
                    break;
                } else {
                    d();
                }
            }
            if (this.f79928i != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + yv.i.toHexString(this.f79928i));
            }
        }
        throw new IOException("closed");
    }
}
