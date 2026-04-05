package com.applovin.shadow.okio.internal;

import b0.e2;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Options;
import com.applovin.shadow.okio.PeekSource;
import com.applovin.shadow.okio.SegmentedByteString;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Timeout;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.e0;
import p0.o2;
import sv.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.applovin.shadow.okio.internal.-RealBufferedSource, reason: invalid class name */
/* loaded from: classes4.dex */
public final class RealBufferedSource {
    public static final void commonClose(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws IOException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            return;
        }
        realBufferedSource.closed = true;
        realBufferedSource.source.close();
        realBufferedSource.bufferField.clear();
    }

    public static final boolean commonExhausted(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        return realBufferedSource.bufferField.exhausted() && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1;
    }

    public static final long commonIndexOf(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, byte b10, long j10, long j11) {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (0 > j10 || j10 > j11) {
            StringBuilder sbR = e2.r(j10, "fromIndex=", " toIndex=");
            sbR.append(j11);
            throw new IllegalArgumentException(sbR.toString().toString());
        }
        long jMax = j10;
        while (jMax < j11) {
            byte b11 = b10;
            long j12 = j11;
            long jIndexOf = realBufferedSource.bufferField.indexOf(b11, jMax, j12);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (size >= j12 || realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b10 = b11;
            j11 = j12;
        }
        return -1L;
    }

    public static final long commonIndexOfElement(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, ByteString targetBytes, long j10) {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        e0.checkNotNullParameter(targetBytes, "targetBytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jIndexOfElement = realBufferedSource.bufferField.indexOfElement(targetBytes, j10);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, size);
        }
    }

    public static final BufferedSource commonPeek(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        return Okio.buffer(new PeekSource(realBufferedSource));
    }

    public static final boolean commonRangeEquals(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10, ByteString bytes, int i10, int i11) {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        e0.checkNotNullParameter(bytes, "bytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (j10 < 0 || i10 < 0 || i11 < 0 || bytes.size() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            long j11 = i12 + j10;
            if (!realBufferedSource.request(1 + j11) || realBufferedSource.bufferField.getByte(j11) != bytes.getByte(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public static final long commonRead(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, Buffer sink, long j10) {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        e0.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: ").toString());
        }
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
            return -1L;
        }
        return realBufferedSource.bufferField.read(sink, Math.min(j10, realBufferedSource.bufferField.size()));
    }

    public static final long commonReadAll(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, Sink sink) throws IOException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        e0.checkNotNullParameter(sink, "sink");
        long j10 = 0;
        while (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) != -1) {
            long jCompleteSegmentByteCount = realBufferedSource.bufferField.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j10 += jCompleteSegmentByteCount;
                sink.write(realBufferedSource.bufferField, jCompleteSegmentByteCount);
            }
        }
        if (realBufferedSource.bufferField.size() <= 0) {
            return j10;
        }
        long size = realBufferedSource.bufferField.size() + j10;
        Buffer buffer = realBufferedSource.bufferField;
        sink.write(buffer, buffer.size());
        return size;
    }

    public static final byte commonReadByte(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        return realBufferedSource.bufferField.readByte();
    }

    public static final byte[] commonReadByteArray(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(j10);
        return realBufferedSource.bufferField.readByteArray(j10);
    }

    public static final ByteString commonReadByteString(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(j10);
        return realBufferedSource.bufferField.readByteString(j10);
    }

    public static final long commonReadDecimalLong(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        byte b10;
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!realBufferedSource.request(j11)) {
                break;
            }
            b10 = realBufferedSource.bufferField.getByte(j10);
            if ((b10 < 48 || b10 > 57) && !(j10 == 0 && b10 == 45)) {
                break;
            }
            j10 = j11;
        }
        if (j10 == 0) {
            StringBuilder sb2 = new StringBuilder("Expected a digit or '-' but was 0x");
            String string = Integer.toString(b10, e.checkRadix(e.checkRadix(16)));
            e0.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return realBufferedSource.bufferField.readDecimalLong();
    }

    public static final void commonReadFully(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, byte[] sink) throws EOFException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        e0.checkNotNullParameter(sink, "sink");
        try {
            realBufferedSource.require(sink.length);
            realBufferedSource.bufferField.readFully(sink);
        } catch (EOFException e10) {
            int i10 = 0;
            while (realBufferedSource.bufferField.size() > 0) {
                Buffer buffer = realBufferedSource.bufferField;
                int i11 = buffer.read(sink, i10, (int) buffer.size());
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
            throw e10;
        }
    }

    public static final long commonReadHexadecimalUnsignedLong(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        byte b10;
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!realBufferedSource.request(i11)) {
                break;
            }
            b10 = realBufferedSource.bufferField.getByte(i10);
            if ((b10 < 48 || b10 > 57) && ((b10 < 97 || b10 > 102) && (b10 < 65 || b10 > 70))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(b10, e.checkRadix(e.checkRadix(16)));
            e0.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return realBufferedSource.bufferField.readHexadecimalUnsignedLong();
    }

    public static final int commonReadInt(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readInt();
    }

    public static final int commonReadIntLe(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readIntLe();
    }

    public static final long commonReadLong(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLong();
    }

    public static final long commonReadLongLe(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLongLe();
    }

    public static final short commonReadShort(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShort();
    }

    public static final short commonReadShortLe(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShortLe();
    }

    public static final String commonReadUtf8(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(j10);
        return realBufferedSource.bufferField.readUtf8(j10);
    }

    public static final int commonReadUtf8CodePoint(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        byte b10 = realBufferedSource.bufferField.getByte(0L);
        if ((b10 & 224) == 192) {
            realBufferedSource.require(2L);
        } else if ((b10 & 240) == 224) {
            realBufferedSource.require(3L);
        } else if ((b10 & 248) == 240) {
            realBufferedSource.require(4L);
        }
        return realBufferedSource.bufferField.readUtf8CodePoint();
    }

    public static final String commonReadUtf8Line(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        long jIndexOf = realBufferedSource.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (realBufferedSource.bufferField.size() != 0) {
            return realBufferedSource.readUtf8(realBufferedSource.bufferField.size());
        }
        return null;
    }

    public static final String commonReadUtf8LineStrict(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "limit < 0: ").toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jIndexOf = realBufferedSource.indexOf((byte) 10, 0L, j11);
        if (jIndexOf != -1) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (j11 < Long.MAX_VALUE && realBufferedSource.request(j11) && realBufferedSource.bufferField.getByte(j11 - 1) == 13 && realBufferedSource.request(j11 + 1) && realBufferedSource.bufferField.getByte(j11) == 10) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, j11);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = realBufferedSource.bufferField;
        buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(realBufferedSource.bufferField.size(), j10) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    public static final boolean commonRequest(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10) {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: ").toString());
        }
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (realBufferedSource.bufferField.size() < j10) {
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final void commonRequire(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        if (!realBufferedSource.request(j10)) {
            throw new EOFException();
        }
    }

    public static final int commonSelect(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, Options options) throws EOFException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        e0.checkNotNullParameter(options, "options");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        do {
            int iSelectPrefix = Buffer.selectPrefix(realBufferedSource.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix == -1) {
                    return -1;
                }
                realBufferedSource.bufferField.skip(options.getByteStrings$okio()[iSelectPrefix].size());
                return iSelectPrefix;
            }
        } while (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) != -1);
        return -1;
    }

    public static final void commonSkip(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, realBufferedSource.bufferField.size());
            realBufferedSource.bufferField.skip(jMin);
            j10 -= jMin;
        }
    }

    public static final Timeout commonTimeout(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        return realBufferedSource.source.timeout();
    }

    public static final String commonToString(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        return "buffer(" + realBufferedSource.source + ')';
    }

    public static final byte[] commonReadByteArray(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws IOException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteArray();
    }

    public static final ByteString commonReadByteString(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws IOException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteString();
    }

    public static final String commonReadUtf8(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws IOException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readUtf8();
    }

    public static final void commonReadFully(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, Buffer sink, long j10) throws IOException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        e0.checkNotNullParameter(sink, "sink");
        try {
            realBufferedSource.require(j10);
            realBufferedSource.bufferField.readFully(sink, j10);
        } catch (EOFException e10) {
            sink.writeAll(realBufferedSource.bufferField);
            throw e10;
        }
    }

    public static final long commonIndexOf(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, ByteString bytes, long j10) throws IOException {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        e0.checkNotNullParameter(bytes, "bytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jIndexOf = realBufferedSource.bufferField.indexOf(bytes, j10);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, (size - bytes.size()) + 1);
        }
    }

    public static final int commonRead(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, byte[] sink, int i10, int i11) {
        e0.checkNotNullParameter(realBufferedSource, "<this>");
        e0.checkNotNullParameter(sink, "sink");
        long j10 = i11;
        SegmentedByteString.checkOffsetAndCount(sink.length, i10, j10);
        if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
            return -1;
        }
        return realBufferedSource.bufferField.read(sink, i10, (int) Math.min(j10, realBufferedSource.bufferField.size()));
    }
}
