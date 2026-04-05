package com.applovin.shadow.okio;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class DeflaterSink implements Sink {
    private boolean closed;
    private final Deflater deflater;
    private final BufferedSink sink;

    public DeflaterSink(BufferedSink sink, Deflater deflater) {
        e0.checkNotNullParameter(sink, "sink");
        e0.checkNotNullParameter(deflater, "deflater");
        this.sink = sink;
        this.deflater = deflater;
    }

    private final void deflate(boolean z10) throws IOException {
        Segment segmentWritableSegment$okio;
        int iDeflate;
        Buffer buffer = this.sink.getBuffer();
        while (true) {
            segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            if (z10) {
                try {
                    Deflater deflater = this.deflater;
                    byte[] bArr = segmentWritableSegment$okio.data;
                    int i10 = segmentWritableSegment$okio.limit;
                    iDeflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                Deflater deflater2 = this.deflater;
                byte[] bArr2 = segmentWritableSegment$okio.data;
                int i11 = segmentWritableSegment$okio.limit;
                iDeflate = deflater2.deflate(bArr2, i11, 8192 - i11);
            }
            if (iDeflate > 0) {
                segmentWritableSegment$okio.limit += iDeflate;
                buffer.setSize$okio(buffer.size() + iDeflate);
                this.sink.emitCompleteSegments();
            } else if (this.deflater.needsInput()) {
                break;
            }
        }
        if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
            buffer.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
        }
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        try {
            finishDeflate$okio();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.deflater.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.sink.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    public final void finishDeflate$okio() throws IOException {
        this.deflater.finish();
        deflate(false);
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        deflate(true);
        this.sink.flush();
    }

    @Override // com.applovin.shadow.okio.Sink
    public Timeout timeout() {
        return this.sink.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.sink + ')';
    }

    @Override // com.applovin.shadow.okio.Sink
    public void write(Buffer source, long j10) throws IOException {
        e0.checkNotNullParameter(source, "source");
        SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j10);
        while (j10 > 0) {
            Segment segment = source.head;
            e0.checkNotNull(segment);
            int iMin = (int) Math.min(j10, segment.limit - segment.pos);
            this.deflater.setInput(segment.data, segment.pos, iMin);
            deflate(false);
            long j11 = iMin;
            source.setSize$okio(source.size() - j11);
            int i10 = segment.pos + iMin;
            segment.pos = i10;
            if (i10 == segment.limit) {
                source.head = segment.pop();
                SegmentPool.recycle(segment);
            }
            j10 -= j11;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeflaterSink(Sink sink, Deflater deflater) {
        this(Okio.buffer(sink), deflater);
        e0.checkNotNullParameter(sink, "sink");
        e0.checkNotNullParameter(deflater, "deflater");
    }
}
