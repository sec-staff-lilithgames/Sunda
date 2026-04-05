package pw;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x implements b1 {

    /* renamed from: b, reason: collision with root package name */
    public byte f82001b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f82002c;

    /* renamed from: e, reason: collision with root package name */
    public final Inflater f82003e;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f82004f;

    /* renamed from: g, reason: collision with root package name */
    public final CRC32 f82005g;

    public x(b1 source) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        v0 v0Var = new v0(source);
        this.f82002c = v0Var;
        Inflater inflater = new Inflater(true);
        this.f82003e = inflater;
        this.f82004f = new a0((k) v0Var, inflater);
        this.f82005g = new CRC32();
    }

    public static void a(String str, int i10, int i11) throws IOException {
        if (i11 == i10) {
            return;
        }
        StringBuilder sbT = a.b.t(str, ": actual 0x");
        sbT.append(sv.n0.padStart(b.toHexString(i11), 8, '0'));
        sbT.append(" != expected 0x");
        sbT.append(sv.n0.padStart(b.toHexString(i10), 8, '0'));
        throw new IOException(sbT.toString());
    }

    public final void b(long j10, g gVar, long j11) {
        w0 w0Var = gVar.f81896b;
        kotlin.jvm.internal.e0.checkNotNull(w0Var);
        while (true) {
            int i10 = w0Var.f81996c;
            int i11 = w0Var.f81995b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= i10 - i11;
            w0Var = w0Var.f81999f;
            kotlin.jvm.internal.e0.checkNotNull(w0Var);
        }
        while (j11 > 0) {
            int iMin = (int) Math.min(w0Var.f81996c - r5, j11);
            this.f82005g.update(w0Var.f81994a, (int) (w0Var.f81995b + j10), iMin);
            j11 -= iMin;
            w0Var = w0Var.f81999f;
            kotlin.jvm.internal.e0.checkNotNull(w0Var);
            j10 = 0;
        }
    }

    @Override // pw.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f82004f.close();
    }

    @Override // pw.b1
    public long read(g sink, long j10) throws DataFormatException, IOException {
        long j11;
        byte b10;
        x xVar = this;
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: ").toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        byte b11 = xVar.f82001b;
        CRC32 crc32 = xVar.f82005g;
        v0 v0Var = xVar.f82002c;
        if (b11 == 0) {
            v0Var.require(10L);
            g gVar = v0Var.f81987c;
            byte b12 = gVar.getByte(3L);
            boolean z10 = ((b12 >> 1) & 1) == 1;
            if (z10) {
                b10 = 0;
                j11 = -1;
                xVar.b(0L, v0Var.f81987c, 10L);
            } else {
                b10 = 0;
                j11 = -1;
            }
            a("ID1ID2", 8075, v0Var.readShort());
            v0Var.skip(8L);
            if (((b12 >> 2) & 1) == 1) {
                v0Var.require(2L);
                if (z10) {
                    b(0L, v0Var.f81987c, 2L);
                }
                long shortLe = gVar.readShortLe() & 65535;
                v0Var.require(shortLe);
                if (z10) {
                    b(0L, v0Var.f81987c, shortLe);
                }
                v0Var.skip(shortLe);
            }
            if (((b12 >> 3) & 1) == 1) {
                long jIndexOf = v0Var.indexOf(b10);
                if (jIndexOf == j11) {
                    throw new EOFException();
                }
                if (z10) {
                    b(0L, v0Var.f81987c, jIndexOf + 1);
                }
                v0Var.skip(jIndexOf + 1);
            }
            if (((b12 >> 4) & 1) == 1) {
                long jIndexOf2 = v0Var.indexOf(b10);
                if (jIndexOf2 == j11) {
                    throw new EOFException();
                }
                if (z10) {
                    xVar = this;
                    xVar.b(0L, v0Var.f81987c, jIndexOf2 + 1);
                } else {
                    xVar = this;
                }
                v0Var.skip(jIndexOf2 + 1);
            } else {
                xVar = this;
            }
            if (z10) {
                a("FHCRC", v0Var.readShortLe(), (short) crc32.getValue());
                crc32.reset();
            }
            xVar.f82001b = (byte) 1;
        } else {
            j11 = -1;
        }
        if (xVar.f82001b == 1) {
            long size = sink.size();
            long j12 = xVar.f82004f.read(sink, j10);
            if (j12 != j11) {
                xVar.b(size, sink, j12);
                return j12;
            }
            xVar.f82001b = (byte) 2;
        }
        if (xVar.f82001b == 2) {
            a("CRC", v0Var.readIntLe(), (int) crc32.getValue());
            a("ISIZE", v0Var.readIntLe(), (int) xVar.f82003e.getBytesWritten());
            xVar.f82001b = (byte) 3;
            if (!v0Var.exhausted()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return j11;
    }

    @Override // pw.b1
    public d1 timeout() {
        return this.f82002c.timeout();
    }
}
