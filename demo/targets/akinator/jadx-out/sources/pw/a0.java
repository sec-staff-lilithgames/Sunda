package pw;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a0 implements b1 {

    /* renamed from: b, reason: collision with root package name */
    public final k f81863b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f81864c;

    /* renamed from: e, reason: collision with root package name */
    public int f81865e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f81866f;

    public a0(k source, Inflater inflater) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(inflater, "inflater");
        this.f81863b = source;
        this.f81864c = inflater;
    }

    @Override // pw.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f81866f) {
            return;
        }
        this.f81864c.end();
        this.f81866f = true;
        this.f81863b.close();
    }

    @Override // pw.b1
    public long read(g sink, long j10) throws DataFormatException, IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        do {
            long orInflate = readOrInflate(sink, j10);
            if (orInflate > 0) {
                return orInflate;
            }
            Inflater inflater = this.f81864c;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f81863b.exhausted());
        throw new EOFException("source exhausted prematurely");
    }

    public final long readOrInflate(g sink, long j10) throws DataFormatException, IOException {
        Inflater inflater = this.f81864c;
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: ").toString());
        }
        if (this.f81866f) {
            throw new IllegalStateException("closed");
        }
        if (j10 != 0) {
            try {
                w0 w0VarWritableSegment$okio = sink.writableSegment$okio(1);
                int iMin = (int) Math.min(j10, 8192 - w0VarWritableSegment$okio.f81996c);
                refill();
                int iInflate = inflater.inflate(w0VarWritableSegment$okio.f81994a, w0VarWritableSegment$okio.f81996c, iMin);
                int i10 = this.f81865e;
                if (i10 != 0) {
                    int remaining = i10 - inflater.getRemaining();
                    this.f81865e -= remaining;
                    this.f81863b.skip(remaining);
                }
                if (iInflate > 0) {
                    w0VarWritableSegment$okio.f81996c += iInflate;
                    long j11 = iInflate;
                    sink.setSize$okio(sink.size() + j11);
                    return j11;
                }
                if (w0VarWritableSegment$okio.f81995b == w0VarWritableSegment$okio.f81996c) {
                    sink.f81896b = w0VarWritableSegment$okio.pop();
                    x0.recycle(w0VarWritableSegment$okio);
                }
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        }
        return 0L;
    }

    public final boolean refill() throws IOException {
        Inflater inflater = this.f81864c;
        if (!inflater.needsInput()) {
            return false;
        }
        k kVar = this.f81863b;
        if (kVar.exhausted()) {
            return true;
        }
        w0 w0Var = kVar.getBuffer().f81896b;
        kotlin.jvm.internal.e0.checkNotNull(w0Var);
        int i10 = w0Var.f81996c;
        int i11 = w0Var.f81995b;
        int i12 = i10 - i11;
        this.f81865e = i12;
        inflater.setInput(w0Var.f81994a, i11, i12);
        return false;
    }

    @Override // pw.b1
    public d1 timeout() {
        return this.f81863b.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(b1 source, Inflater inflater) {
        this(h0.buffer(source), inflater);
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(inflater, "inflater");
    }
}
