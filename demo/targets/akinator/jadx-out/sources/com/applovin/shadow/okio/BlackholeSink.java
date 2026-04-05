package com.applovin.shadow.okio;

import java.io.EOFException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
final class BlackholeSink implements Sink {
    @Override // com.applovin.shadow.okio.Sink
    public Timeout timeout() {
        return Timeout.NONE;
    }

    @Override // com.applovin.shadow.okio.Sink
    public void write(Buffer source, long j10) throws EOFException {
        e0.checkNotNullParameter(source, "source");
        source.skip(j10);
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Flushable
    public void flush() {
    }
}
