package com.applovin.shadow.okio;

import java.io.IOException;
import kotlin.jvm.internal.e0;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class ForwardingSource implements Source {
    private final Source delegate;

    public ForwardingSource(Source delegate) {
        e0.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @f
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final Source m363deprecated_delegate() {
        return this.delegate;
    }

    @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final Source delegate() {
        return this.delegate;
    }

    @Override // com.applovin.shadow.okio.Source
    public long read(Buffer sink, long j10) throws IOException {
        e0.checkNotNullParameter(sink, "sink");
        return this.delegate.read(sink, j10);
    }

    @Override // com.applovin.shadow.okio.Source
    public Timeout timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
