package com.mbridge.msdk.thrid.okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class k implements s {

    /* renamed from: a, reason: collision with root package name */
    private final e f43833a;

    /* renamed from: b, reason: collision with root package name */
    private final Inflater f43834b;

    /* renamed from: c, reason: collision with root package name */
    private int f43835c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f43836d;

    public k(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f43833a = eVar;
        this.f43834b = inflater;
    }

    private void h() throws IOException {
        int i10 = this.f43835c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f43834b.getRemaining();
        this.f43835c -= remaining;
        this.f43833a.skip(remaining);
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) throws DataFormatException, IOException {
        boolean zD;
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: "));
        }
        if (this.f43836d) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        do {
            zD = d();
            try {
                o oVarB = cVar.b(1);
                int iInflate = this.f43834b.inflate(oVarB.f43850a, oVarB.f43852c, (int) Math.min(j10, 8192 - oVarB.f43852c));
                if (iInflate > 0) {
                    oVarB.f43852c += iInflate;
                    long j11 = iInflate;
                    cVar.f43818b += j11;
                    return j11;
                }
                if (!this.f43834b.finished() && !this.f43834b.needsDictionary()) {
                }
                h();
                if (oVarB.f43851b != oVarB.f43852c) {
                    return -1L;
                }
                cVar.f43817a = oVarB.b();
                p.a(oVarB);
                return -1L;
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        } while (!zD);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f43836d) {
            return;
        }
        this.f43834b.end();
        this.f43836d = true;
        this.f43833a.close();
    }

    public final boolean d() throws IOException {
        if (!this.f43834b.needsInput()) {
            return false;
        }
        h();
        if (this.f43834b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f43833a.f()) {
            return true;
        }
        o oVar = this.f43833a.a().f43817a;
        int i10 = oVar.f43852c;
        int i11 = oVar.f43851b;
        int i12 = i10 - i11;
        this.f43835c = i12;
        this.f43834b.setInput(oVar.f43850a, i11, i12);
        return false;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f43833a.b();
    }
}
