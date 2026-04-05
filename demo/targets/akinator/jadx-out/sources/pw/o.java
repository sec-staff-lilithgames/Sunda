package pw;

import java.io.IOException;
import java.util.zip.Deflater;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o implements z0 {

    /* renamed from: b, reason: collision with root package name */
    public final j f81934b;

    /* renamed from: c, reason: collision with root package name */
    public final Deflater f81935c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f81936e;

    public o(j sink, Deflater deflater) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        kotlin.jvm.internal.e0.checkNotNullParameter(deflater, "deflater");
        this.f81934b = sink;
        this.f81935c = deflater;
    }

    public final void a(boolean z10) throws IOException {
        w0 w0VarWritableSegment$okio;
        int iDeflate;
        j jVar = this.f81934b;
        g buffer = jVar.getBuffer();
        while (true) {
            w0VarWritableSegment$okio = buffer.writableSegment$okio(1);
            Deflater deflater = this.f81935c;
            if (z10) {
                try {
                    byte[] bArr = w0VarWritableSegment$okio.f81994a;
                    int i10 = w0VarWritableSegment$okio.f81996c;
                    iDeflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                byte[] bArr2 = w0VarWritableSegment$okio.f81994a;
                int i11 = w0VarWritableSegment$okio.f81996c;
                iDeflate = deflater.deflate(bArr2, i11, 8192 - i11);
            }
            if (iDeflate > 0) {
                w0VarWritableSegment$okio.f81996c += iDeflate;
                buffer.setSize$okio(buffer.size() + iDeflate);
                jVar.emitCompleteSegments();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (w0VarWritableSegment$okio.f81995b == w0VarWritableSegment$okio.f81996c) {
            buffer.f81896b = w0VarWritableSegment$okio.pop();
            x0.recycle(w0VarWritableSegment$okio);
        }
    }

    @Override // pw.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f81936e) {
            return;
        }
        try {
            finishDeflate$okio();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f81935c.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f81934b.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f81936e = true;
        if (th != null) {
            throw th;
        }
    }

    public final void finishDeflate$okio() throws IOException {
        this.f81935c.finish();
        a(false);
    }

    @Override // pw.z0, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.f81934b.flush();
    }

    @Override // pw.z0
    public d1 timeout() {
        return this.f81934b.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f81934b + ')';
    }

    @Override // pw.z0
    public void write(g source, long j10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        b.checkOffsetAndCount(source.size(), 0L, j10);
        while (true) {
            Deflater deflater = this.f81935c;
            if (j10 <= 0) {
                deflater.setInput(qw.y.getEMPTY_BYTE_ARRAY(), 0, 0);
                return;
            }
            w0 w0Var = source.f81896b;
            kotlin.jvm.internal.e0.checkNotNull(w0Var);
            int iMin = (int) Math.min(j10, w0Var.f81996c - w0Var.f81995b);
            deflater.setInput(w0Var.f81994a, w0Var.f81995b, iMin);
            a(false);
            long j11 = iMin;
            source.setSize$okio(source.size() - j11);
            int i10 = w0Var.f81995b + iMin;
            w0Var.f81995b = i10;
            if (i10 == w0Var.f81996c) {
                source.f81896b = w0Var.pop();
                x0.recycle(w0Var);
            }
            j10 -= j11;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(z0 sink, Deflater deflater) {
        this(h0.buffer(sink), deflater);
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        kotlin.jvm.internal.e0.checkNotNullParameter(deflater, "deflater");
    }
}
