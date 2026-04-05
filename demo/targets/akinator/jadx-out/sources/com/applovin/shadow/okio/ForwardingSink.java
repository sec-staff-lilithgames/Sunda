package com.applovin.shadow.okio;

import java.io.IOException;
import kotlin.jvm.internal.e0;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class ForwardingSink implements Sink {
    private final Sink delegate;

    public ForwardingSink(Sink delegate) {
        e0.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @f
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final Sink m362deprecated_delegate() {
        return this.delegate;
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final Sink delegate() {
        return this.delegate;
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // com.applovin.shadow.okio.Sink
    public Timeout timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // com.applovin.shadow.okio.Sink
    public void write(Buffer source, long j10) throws IOException {
        e0.checkNotNullParameter(source, "source");
        this.delegate.write(source, j10);
    }
}
