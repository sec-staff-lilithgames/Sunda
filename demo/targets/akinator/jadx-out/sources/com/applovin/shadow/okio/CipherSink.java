package com.applovin.shadow.okio;

import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class CipherSink implements Sink {
    private final int blockSize;
    private final Cipher cipher;
    private boolean closed;
    private final BufferedSink sink;

    public CipherSink(BufferedSink sink, Cipher cipher) {
        e0.checkNotNullParameter(sink, "sink");
        e0.checkNotNullParameter(cipher, "cipher");
        this.sink = sink;
        this.cipher = cipher;
        int blockSize = cipher.getBlockSize();
        this.blockSize = blockSize;
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    private final Throwable doFinal() {
        int outputSize = this.cipher.getOutputSize(0);
        Throwable th2 = null;
        if (outputSize == 0) {
            return null;
        }
        if (outputSize > 8192) {
            try {
                BufferedSink bufferedSink = this.sink;
                byte[] bArrDoFinal = this.cipher.doFinal();
                e0.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
                bufferedSink.write(bArrDoFinal);
                return null;
            } catch (Throwable th3) {
                return th3;
            }
        }
        Buffer buffer = this.sink.getBuffer();
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(outputSize);
        try {
            int iDoFinal = this.cipher.doFinal(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit);
            segmentWritableSegment$okio.limit += iDoFinal;
            buffer.setSize$okio(buffer.size() + iDoFinal);
        } catch (Throwable th4) {
            th2 = th4;
        }
        if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
            buffer.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
        }
        return th2;
    }

    private final int update(Buffer buffer, long j10) throws IOException, ShortBufferException {
        Segment segment = buffer.head;
        e0.checkNotNull(segment);
        int iMin = (int) Math.min(j10, segment.limit - segment.pos);
        Buffer buffer2 = this.sink.getBuffer();
        int outputSize = this.cipher.getOutputSize(iMin);
        int i10 = iMin;
        while (outputSize > 8192) {
            int i11 = this.blockSize;
            if (i10 <= i11) {
                BufferedSink bufferedSink = this.sink;
                byte[] bArrUpdate = this.cipher.update(buffer.readByteArray(j10));
                e0.checkNotNullExpressionValue(bArrUpdate, "update(...)");
                bufferedSink.write(bArrUpdate);
                return (int) j10;
            }
            i10 -= i11;
            outputSize = this.cipher.getOutputSize(i10);
        }
        Segment segmentWritableSegment$okio = buffer2.writableSegment$okio(outputSize);
        int iUpdate = this.cipher.update(segment.data, segment.pos, i10, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit);
        segmentWritableSegment$okio.limit += iUpdate;
        buffer2.setSize$okio(buffer2.size() + iUpdate);
        if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
            buffer2.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
        }
        this.sink.emitCompleteSegments();
        buffer.setSize$okio(buffer.size() - i10);
        int i12 = segment.pos + i10;
        segment.pos = i12;
        if (i12 == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return i10;
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        this.closed = true;
        Throwable thDoFinal = doFinal();
        try {
            this.sink.close();
        } catch (Throwable th2) {
            if (thDoFinal == null) {
                thDoFinal = th2;
            }
        }
        if (thDoFinal != null) {
            throw thDoFinal;
        }
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.sink.flush();
    }

    public final Cipher getCipher() {
        return this.cipher;
    }

    @Override // com.applovin.shadow.okio.Sink
    public Timeout timeout() {
        return this.sink.timeout();
    }

    @Override // com.applovin.shadow.okio.Sink
    public void write(Buffer source, long j10) throws IOException {
        e0.checkNotNullParameter(source, "source");
        SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j10);
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        long jUpdate = j10;
        while (jUpdate > 0) {
            jUpdate -= update(source, jUpdate);
        }
    }
}
