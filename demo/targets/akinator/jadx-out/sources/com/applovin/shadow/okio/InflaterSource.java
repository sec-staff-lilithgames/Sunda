package com.applovin.shadow.okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class InflaterSource implements Source {
    private int bufferBytesHeldByInflater;
    private boolean closed;
    private final Inflater inflater;
    private final BufferedSource source;

    public InflaterSource(BufferedSource source, Inflater inflater) {
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(inflater, "inflater");
        this.source = source;
        this.inflater = inflater;
    }

    private final void releaseBytesAfterInflate() throws IOException {
        int i10 = this.bufferBytesHeldByInflater;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.inflater.getRemaining();
        this.bufferBytesHeldByInflater -= remaining;
        this.source.skip(remaining);
    }

    @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.inflater.end();
        this.closed = true;
        this.source.close();
    }

    @Override // com.applovin.shadow.okio.Source
    public long read(Buffer sink, long j10) throws DataFormatException, IOException {
        e0.checkNotNullParameter(sink, "sink");
        do {
            long orInflate = readOrInflate(sink, j10);
            if (orInflate > 0) {
                return orInflate;
            }
            if (this.inflater.finished() || this.inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.source.exhausted());
        throw new EOFException("source exhausted prematurely");
    }

    public final long readOrInflate(Buffer sink, long j10) throws DataFormatException, IOException {
        e0.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: ").toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            Segment segmentWritableSegment$okio = sink.writableSegment$okio(1);
            int iMin = (int) Math.min(j10, 8192 - segmentWritableSegment$okio.limit);
            refill();
            int iInflate = this.inflater.inflate(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, iMin);
            releaseBytesAfterInflate();
            if (iInflate > 0) {
                segmentWritableSegment$okio.limit += iInflate;
                long j11 = iInflate;
                sink.setSize$okio(sink.size() + j11);
                return j11;
            }
            if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
                sink.head = segmentWritableSegment$okio.pop();
                SegmentPool.recycle(segmentWritableSegment$okio);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    public final boolean refill() throws IOException {
        if (!this.inflater.needsInput()) {
            return false;
        }
        if (this.source.exhausted()) {
            return true;
        }
        Segment segment = this.source.getBuffer().head;
        e0.checkNotNull(segment);
        int i10 = segment.limit;
        int i11 = segment.pos;
        int i12 = i10 - i11;
        this.bufferBytesHeldByInflater = i12;
        this.inflater.setInput(segment.data, i11, i12);
        return false;
    }

    @Override // com.applovin.shadow.okio.Source
    public Timeout timeout() {
        return this.source.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InflaterSource(Source source, Inflater inflater) {
        this(Okio.buffer(source), inflater);
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(inflater, "inflater");
    }
}
