package pw;

import java.io.IOException;
import java.io.InputStream;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class b0 implements b1 {

    /* renamed from: b, reason: collision with root package name */
    public final InputStream f81869b;

    /* renamed from: c, reason: collision with root package name */
    public final d1 f81870c;

    public b0(InputStream input, d1 timeout) {
        kotlin.jvm.internal.e0.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.e0.checkNotNullParameter(timeout, "timeout");
        this.f81869b = input;
        this.f81870c = timeout;
    }

    @Override // pw.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f81869b.close();
    }

    @Override // pw.b1
    public long read(g sink, long j10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: ").toString());
        }
        try {
            this.f81870c.throwIfReached();
            w0 w0VarWritableSegment$okio = sink.writableSegment$okio(1);
            int i10 = this.f81869b.read(w0VarWritableSegment$okio.f81994a, w0VarWritableSegment$okio.f81996c, (int) Math.min(j10, 8192 - w0VarWritableSegment$okio.f81996c));
            if (i10 != -1) {
                w0VarWritableSegment$okio.f81996c += i10;
                long j11 = i10;
                sink.setSize$okio(sink.size() + j11);
                return j11;
            }
            if (w0VarWritableSegment$okio.f81995b != w0VarWritableSegment$okio.f81996c) {
                return -1L;
            }
            sink.f81896b = w0VarWritableSegment$okio.pop();
            x0.recycle(w0VarWritableSegment$okio);
            return -1L;
        } catch (AssertionError e10) {
            if (qw.w.isAndroidGetsocknameError(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // pw.b1
    public d1 timeout() {
        return this.f81870c;
    }

    public String toString() {
        return "source(" + this.f81869b + ')';
    }
}
