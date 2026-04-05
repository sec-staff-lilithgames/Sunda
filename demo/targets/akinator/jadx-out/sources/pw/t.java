package pw;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class t implements z0 {

    /* renamed from: b, reason: collision with root package name */
    public final z0 f81980b;

    public t(z0 delegate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(delegate, "delegate");
        this.f81980b = delegate;
    }

    @tu.f
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final z0 m5895deprecated_delegate() {
        return this.f81980b;
    }

    @Override // pw.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f81980b.close();
    }

    public final z0 delegate() {
        return this.f81980b;
    }

    @Override // pw.z0, java.io.Flushable
    public void flush() throws IOException {
        this.f81980b.flush();
    }

    @Override // pw.z0
    public d1 timeout() {
        return this.f81980b.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f81980b + ')';
    }

    @Override // pw.z0
    public void write(g source, long j10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        this.f81980b.write(source, j10);
    }
}
