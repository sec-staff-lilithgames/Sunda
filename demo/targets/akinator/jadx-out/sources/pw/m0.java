package pw;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m0 implements z0 {

    /* renamed from: b, reason: collision with root package name */
    public final OutputStream f81923b;

    /* renamed from: c, reason: collision with root package name */
    public final d1 f81924c;

    public m0(OutputStream out, d1 timeout) {
        kotlin.jvm.internal.e0.checkNotNullParameter(out, "out");
        kotlin.jvm.internal.e0.checkNotNullParameter(timeout, "timeout");
        this.f81923b = out;
        this.f81924c = timeout;
    }

    @Override // pw.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f81923b.close();
    }

    @Override // pw.z0, java.io.Flushable
    public void flush() throws IOException {
        this.f81923b.flush();
    }

    @Override // pw.z0
    public d1 timeout() {
        return this.f81924c;
    }

    public String toString() {
        return "sink(" + this.f81923b + ')';
    }

    @Override // pw.z0
    public void write(g source, long j10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        b.checkOffsetAndCount(source.size(), 0L, j10);
        while (j10 > 0) {
            this.f81924c.throwIfReached();
            w0 w0Var = source.f81896b;
            kotlin.jvm.internal.e0.checkNotNull(w0Var);
            int iMin = (int) Math.min(j10, w0Var.f81996c - w0Var.f81995b);
            this.f81923b.write(w0Var.f81994a, w0Var.f81995b, iMin);
            w0Var.f81995b += iMin;
            long j11 = iMin;
            j10 -= j11;
            source.setSize$okio(source.size() - j11);
            if (w0Var.f81995b == w0Var.f81996c) {
                source.f81896b = w0Var.pop();
                x0.recycle(w0Var);
            }
        }
    }
}
