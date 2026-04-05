package com.mbridge.msdk.thrid.okio;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface r extends Closeable, Flushable {
    void a(c cVar, long j10) throws IOException;

    t b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;
}
