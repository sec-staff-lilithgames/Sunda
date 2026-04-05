package com.applovin.shadow.okio;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class InputStreamSource implements Source {
    private final InputStream input;
    private final Timeout timeout;

    public InputStreamSource(InputStream input, Timeout timeout) {
        e0.checkNotNullParameter(input, "input");
        e0.checkNotNullParameter(timeout, "timeout");
        this.input = input;
        this.timeout = timeout;
    }

    @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.input.close();
    }

    @Override // com.applovin.shadow.okio.Source
    public long read(Buffer sink, long j10) throws IOException {
        e0.checkNotNullParameter(sink, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: ").toString());
        }
        try {
            this.timeout.throwIfReached();
            Segment segmentWritableSegment$okio = sink.writableSegment$okio(1);
            int i10 = this.input.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(j10, 8192 - segmentWritableSegment$okio.limit));
            if (i10 != -1) {
                segmentWritableSegment$okio.limit += i10;
                long j11 = i10;
                sink.setSize$okio(sink.size() + j11);
                return j11;
            }
            if (segmentWritableSegment$okio.pos != segmentWritableSegment$okio.limit) {
                return -1L;
            }
            sink.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
            return -1L;
        } catch (AssertionError e10) {
            if (Okio.isAndroidGetsocknameError(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // com.applovin.shadow.okio.Source
    public Timeout timeout() {
        return this.timeout;
    }

    public String toString() {
        return "source(" + this.input + ')';
    }
}
