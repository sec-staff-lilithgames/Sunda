package pw;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w implements z0 {

    /* renamed from: b, reason: collision with root package name */
    public final t0 f81989b;

    /* renamed from: c, reason: collision with root package name */
    public final Deflater f81990c;

    /* renamed from: e, reason: collision with root package name */
    public final o f81991e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f81992f;

    /* renamed from: g, reason: collision with root package name */
    public final CRC32 f81993g;

    public w(z0 sink) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        t0 t0Var = new t0(sink);
        this.f81989b = t0Var;
        Deflater deflater = new Deflater(qw.y.getDEFAULT_COMPRESSION(), true);
        this.f81990c = deflater;
        this.f81991e = new o((j) t0Var, deflater);
        this.f81993g = new CRC32();
        g gVar = t0Var.f81982c;
        gVar.writeShort(8075);
        gVar.writeByte(8);
        gVar.writeByte(0);
        gVar.writeInt(0);
        gVar.writeByte(0);
        gVar.writeByte(0);
    }

    @tu.f
    /* renamed from: -deprecated_deflater, reason: not valid java name */
    public final Deflater m5898deprecated_deflater() {
        return this.f81990c;
    }

    @Override // pw.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        Deflater deflater = this.f81990c;
        t0 t0Var = this.f81989b;
        if (this.f81992f) {
            return;
        }
        try {
            this.f81991e.finishDeflate$okio();
            t0Var.writeIntLe((int) this.f81993g.getValue());
            t0Var.writeIntLe((int) deflater.getBytesRead());
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            deflater.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            t0Var.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f81992f = true;
        if (th != null) {
            throw th;
        }
    }

    public final Deflater deflater() {
        return this.f81990c;
    }

    @Override // pw.z0, java.io.Flushable
    public void flush() throws IOException {
        this.f81991e.flush();
    }

    @Override // pw.z0
    public d1 timeout() {
        return this.f81989b.timeout();
    }

    @Override // pw.z0
    public void write(g source, long j10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: ").toString());
        }
        if (j10 == 0) {
            return;
        }
        w0 w0Var = source.f81896b;
        kotlin.jvm.internal.e0.checkNotNull(w0Var);
        long j11 = j10;
        while (j11 > 0) {
            int iMin = (int) Math.min(j11, w0Var.f81996c - w0Var.f81995b);
            this.f81993g.update(w0Var.f81994a, w0Var.f81995b, iMin);
            j11 -= iMin;
            w0Var = w0Var.f81999f;
            kotlin.jvm.internal.e0.checkNotNull(w0Var);
        }
        this.f81991e.write(source, j10);
    }
}
