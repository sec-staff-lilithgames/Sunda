package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Timeout;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.applovin.shadow.okio.internal.-RealBufferedSink, reason: invalid class name */
/* loaded from: classes4.dex */
public final class RealBufferedSink {
    public static final void commonClose(com.applovin.shadow.okio.RealBufferedSink realBufferedSink) throws Throwable {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            return;
        }
        try {
            if (realBufferedSink.bufferField.size() > 0) {
                Sink sink = realBufferedSink.sink;
                Buffer buffer = realBufferedSink.bufferField;
                sink.write(buffer, buffer.size());
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            realBufferedSink.sink.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        realBufferedSink.closed = true;
        if (th != null) {
            throw th;
        }
    }

    public static final BufferedSink commonEmit(com.applovin.shadow.okio.RealBufferedSink realBufferedSink) throws IOException {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        long size = realBufferedSink.bufferField.size();
        if (size > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, size);
        }
        return realBufferedSink;
    }

    public static final BufferedSink commonEmitCompleteSegments(com.applovin.shadow.okio.RealBufferedSink realBufferedSink) throws IOException {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        long jCompleteSegmentByteCount = realBufferedSink.bufferField.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, jCompleteSegmentByteCount);
        }
        return realBufferedSink;
    }

    public static final void commonFlush(com.applovin.shadow.okio.RealBufferedSink realBufferedSink) throws IOException {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        if (realBufferedSink.bufferField.size() > 0) {
            Sink sink = realBufferedSink.sink;
            Buffer buffer = realBufferedSink.bufferField;
            sink.write(buffer, buffer.size());
        }
        realBufferedSink.sink.flush();
    }

    public static final Timeout commonTimeout(com.applovin.shadow.okio.RealBufferedSink realBufferedSink) {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        return realBufferedSink.sink.timeout();
    }

    public static final String commonToString(com.applovin.shadow.okio.RealBufferedSink realBufferedSink) {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        return "buffer(" + realBufferedSink.sink + ')';
    }

    public static final void commonWrite(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, Buffer source, long j10) throws IOException {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        e0.checkNotNullParameter(source, "source");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.write(source, j10);
        realBufferedSink.emitCompleteSegments();
    }

    public static final long commonWriteAll(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, Source source) throws IOException {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        e0.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(realBufferedSink.bufferField, 8192L);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            realBufferedSink.emitCompleteSegments();
        }
    }

    public static final BufferedSink commonWriteByte(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i10) {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeByte(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteDecimalLong(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, long j10) {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeDecimalLong(j10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteHexadecimalUnsignedLong(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, long j10) {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeHexadecimalUnsignedLong(j10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteInt(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i10) {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeInt(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteIntLe(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i10) {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeIntLe(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteLong(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, long j10) {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeLong(j10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteLongLe(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, long j10) {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeLongLe(j10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteShort(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i10) {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeShort(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteShortLe(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i10) {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeShortLe(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteUtf8(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, String string) {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        e0.checkNotNullParameter(string, "string");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeUtf8(string);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteUtf8CodePoint(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i10) {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeUtf8CodePoint(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWrite(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, ByteString byteString) {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        e0.checkNotNullParameter(byteString, "byteString");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(byteString);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public static final BufferedSink commonWriteUtf8(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, String string, int i10, int i11) {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        e0.checkNotNullParameter(string, "string");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeUtf8(string, i10, i11);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public static final BufferedSink commonWrite(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, ByteString byteString, int i10, int i11) {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        e0.checkNotNullParameter(byteString, "byteString");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(byteString, i10, i11);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public static final BufferedSink commonWrite(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, byte[] source) {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        e0.checkNotNullParameter(source, "source");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(source);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public static final BufferedSink commonWrite(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, byte[] source, int i10, int i11) {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        e0.checkNotNullParameter(source, "source");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(source, i10, i11);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public static final BufferedSink commonWrite(com.applovin.shadow.okio.RealBufferedSink realBufferedSink, Source source, long j10) throws IOException {
        e0.checkNotNullParameter(realBufferedSink, "<this>");
        e0.checkNotNullParameter(source, "source");
        while (j10 > 0) {
            long j11 = source.read(realBufferedSink.bufferField, j10);
            if (j11 != -1) {
                j10 -= j11;
                realBufferedSink.emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return realBufferedSink;
    }
}
