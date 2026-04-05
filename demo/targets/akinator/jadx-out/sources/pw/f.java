package pw;

import java.io.EOFException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f implements z0 {
    @Override // pw.z0
    public d1 timeout() {
        return d1.f81884f;
    }

    @Override // pw.z0
    public void write(g source, long j10) throws EOFException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        source.skip(j10);
    }

    @Override // pw.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // pw.z0, java.io.Flushable
    public void flush() {
    }
}
