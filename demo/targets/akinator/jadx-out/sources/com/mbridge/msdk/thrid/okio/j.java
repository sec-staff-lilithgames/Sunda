package com.mbridge.msdk.thrid.okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class j implements s {

    /* renamed from: b, reason: collision with root package name */
    private final e f43829b;

    /* renamed from: c, reason: collision with root package name */
    private final Inflater f43830c;

    /* renamed from: d, reason: collision with root package name */
    private final k f43831d;

    /* renamed from: a, reason: collision with root package name */
    private int f43828a = 0;

    /* renamed from: e, reason: collision with root package name */
    private final CRC32 f43832e = new CRC32();

    public j(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f43830c = inflater;
        e eVarA = l.a(sVar);
        this.f43829b = eVarA;
        this.f43831d = new k(eVarA, inflater);
    }

    private void a(c cVar, long j10, long j11) {
        o oVar = cVar.f43817a;
        while (true) {
            long j12 = oVar.f43852c - oVar.f43851b;
            if (j10 < j12) {
                break;
            }
            j10 -= j12;
            oVar = oVar.f43855f;
        }
        while (j11 > 0) {
            int iMin = (int) Math.min(oVar.f43852c - r6, j11);
            this.f43832e.update(oVar.f43850a, (int) (oVar.f43851b + j10), iMin);
            j11 -= iMin;
            oVar = oVar.f43855f;
            j10 = 0;
        }
    }

    private void d() throws IOException {
        this.f43829b.e(10L);
        byte bF = this.f43829b.a().f(3L);
        boolean z10 = ((bF >> 1) & 1) == 1;
        if (z10) {
            a(this.f43829b.a(), 0L, 10L);
        }
        a("ID1ID2", 8075, this.f43829b.readShort());
        this.f43829b.skip(8L);
        if (((bF >> 2) & 1) == 1) {
            this.f43829b.e(2L);
            if (z10) {
                a(this.f43829b.a(), 0L, 2L);
            }
            long jG = this.f43829b.a().g();
            this.f43829b.e(jG);
            if (z10) {
                a(this.f43829b.a(), 0L, jG);
            }
            this.f43829b.skip(jG);
        }
        if (((bF >> 3) & 1) == 1) {
            long jA = this.f43829b.a((byte) 0);
            if (jA == -1) {
                throw new EOFException();
            }
            if (z10) {
                a(this.f43829b.a(), 0L, jA + 1);
            }
            this.f43829b.skip(jA + 1);
        }
        if (((bF >> 4) & 1) == 1) {
            long jA2 = this.f43829b.a((byte) 0);
            if (jA2 == -1) {
                throw new EOFException();
            }
            if (z10) {
                a(this.f43829b.a(), 0L, jA2 + 1);
            }
            this.f43829b.skip(jA2 + 1);
        }
        if (z10) {
            a("FHCRC", this.f43829b.g(), (short) this.f43832e.getValue());
            this.f43832e.reset();
        }
    }

    private void h() throws IOException {
        a("CRC", this.f43829b.e(), (int) this.f43832e.getValue());
        a("ISIZE", this.f43829b.e(), (int) this.f43830c.getBytesWritten());
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) throws DataFormatException, IOException {
        j jVar;
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: "));
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f43828a == 0) {
            d();
            this.f43828a = 1;
        }
        if (this.f43828a == 1) {
            long j11 = cVar.f43818b;
            long jB = this.f43831d.b(cVar, j10);
            if (jB != -1) {
                a(cVar, j11, jB);
                return jB;
            }
            jVar = this;
            jVar.f43828a = 2;
        } else {
            jVar = this;
        }
        if (jVar.f43828a == 2) {
            h();
            jVar.f43828a = 3;
            if (!jVar.f43829b.f()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f43831d.close();
    }

    private void a(String str, int i10, int i11) throws IOException {
        if (i11 != i10) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f43829b.b();
    }
}
