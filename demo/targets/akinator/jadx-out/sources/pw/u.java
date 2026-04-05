package pw;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class u implements b1 {
    private final b1 delegate;

    public u(b1 delegate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @tu.f
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final b1 m5896deprecated_delegate() {
        return this.delegate;
    }

    @Override // pw.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final b1 delegate() {
        return this.delegate;
    }

    @Override // pw.b1
    public long read(g sink, long j10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        return this.delegate.read(sink, j10);
    }

    @Override // pw.b1
    public d1 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
