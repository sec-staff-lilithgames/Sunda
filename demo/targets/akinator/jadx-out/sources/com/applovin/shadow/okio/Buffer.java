package com.applovin.shadow.okio;

import a.b;
import b0.e2;
import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;
import sv.g;
import tu.f;
import uu.f0;
import w0.i;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    public Segment head;
    private long size;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class UnsafeCursor implements Closeable {
        public Buffer buffer;
        public byte[] data;
        public boolean readWrite;
        private Segment segment;
        public long offset = -1;
        public int start = -1;
        public int end = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.buffer = null;
            setSegment$okio(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final long expandBuffer(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException(b.e(i10, "minByteCount <= 0: ").toString());
            }
            if (i10 > 8192) {
                throw new IllegalArgumentException(b.e(i10, "minByteCount > Segment.SIZE: ").toString());
            }
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
            }
            long size = buffer.size();
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i10);
            int i11 = 8192 - segmentWritableSegment$okio.limit;
            segmentWritableSegment$okio.limit = Segment.SIZE;
            long j10 = i11;
            buffer.setSize$okio(size + j10);
            setSegment$okio(segmentWritableSegment$okio);
            this.offset = size;
            this.data = segmentWritableSegment$okio.data;
            this.start = 8192 - i11;
            this.end = Segment.SIZE;
            return j10;
        }

        public final Segment getSegment$okio() {
            return this.segment;
        }

        public final int next() {
            long j10 = this.offset;
            Buffer buffer = this.buffer;
            e0.checkNotNull(buffer);
            if (j10 == buffer.size()) {
                throw new IllegalStateException("no more bytes");
            }
            long j11 = this.offset;
            return seek(j11 == -1 ? 0L : j11 + (this.end - this.start));
        }

        public final long resizeBuffer(long j10) {
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long size = buffer.size();
            if (j10 <= size) {
                if (j10 < 0) {
                    throw new IllegalArgumentException(o2.m(j10, "newSize < 0: ").toString());
                }
                long j11 = size - j10;
                while (true) {
                    if (j11 <= 0) {
                        break;
                    }
                    Segment segment = buffer.head;
                    e0.checkNotNull(segment);
                    Segment segment2 = segment.prev;
                    e0.checkNotNull(segment2);
                    int i10 = segment2.limit;
                    long j12 = i10 - segment2.pos;
                    if (j12 > j11) {
                        segment2.limit = i10 - ((int) j11);
                        break;
                    }
                    buffer.head = segment2.pop();
                    SegmentPool.recycle(segment2);
                    j11 -= j12;
                }
                setSegment$okio(null);
                this.offset = j10;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (j10 > size) {
                long j13 = j10 - size;
                boolean z10 = true;
                while (j13 > 0) {
                    Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                    int iMin = (int) Math.min(j13, 8192 - segmentWritableSegment$okio.limit);
                    segmentWritableSegment$okio.limit += iMin;
                    j13 -= iMin;
                    if (z10) {
                        setSegment$okio(segmentWritableSegment$okio);
                        this.offset = size;
                        this.data = segmentWritableSegment$okio.data;
                        int i11 = segmentWritableSegment$okio.limit;
                        this.start = i11 - iMin;
                        this.end = i11;
                        z10 = false;
                    }
                }
            }
            buffer.setSize$okio(j10);
            return size;
        }

        public final int seek(long j10) {
            Segment segmentPush;
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j10 < -1 || j10 > buffer.size()) {
                StringBuilder sbR = e2.r(j10, "offset=", " > size=");
                sbR.append(buffer.size());
                throw new ArrayIndexOutOfBoundsException(sbR.toString());
            }
            if (j10 == -1 || j10 == buffer.size()) {
                setSegment$okio(null);
                this.offset = j10;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = buffer.size();
            Segment segment$okio = buffer.head;
            long j11 = 0;
            if (getSegment$okio() != null) {
                long j12 = this.offset;
                int i10 = this.start;
                e0.checkNotNull(getSegment$okio());
                long j13 = j12 - (i10 - r9.pos);
                if (j13 > j10) {
                    segmentPush = segment$okio;
                    segment$okio = getSegment$okio();
                    size = j13;
                } else {
                    segmentPush = getSegment$okio();
                    j11 = j13;
                }
            } else {
                segmentPush = segment$okio;
            }
            if (size - j10 > j10 - j11) {
                while (true) {
                    e0.checkNotNull(segmentPush);
                    int i11 = segmentPush.limit;
                    int i12 = segmentPush.pos;
                    if (j10 < (i11 - i12) + j11) {
                        break;
                    }
                    j11 += i11 - i12;
                    segmentPush = segmentPush.next;
                }
            } else {
                while (size > j10) {
                    e0.checkNotNull(segment$okio);
                    segment$okio = segment$okio.prev;
                    e0.checkNotNull(segment$okio);
                    size -= segment$okio.limit - segment$okio.pos;
                }
                j11 = size;
                segmentPush = segment$okio;
            }
            if (this.readWrite) {
                e0.checkNotNull(segmentPush);
                if (segmentPush.shared) {
                    Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                    if (buffer.head == segmentPush) {
                        buffer.head = segmentUnsharedCopy;
                    }
                    segmentPush = segmentPush.push(segmentUnsharedCopy);
                    Segment segment = segmentPush.prev;
                    e0.checkNotNull(segment);
                    segment.pop();
                }
            }
            setSegment$okio(segmentPush);
            this.offset = j10;
            e0.checkNotNull(segmentPush);
            this.data = segmentPush.data;
            int i13 = segmentPush.pos + ((int) (j10 - j11));
            this.start = i13;
            int i14 = segmentPush.limit;
            this.end = i14;
            return i14 - i13;
        }

        public final void setSegment$okio(Segment segment) {
            this.segment = segment;
        }
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, OutputStream outputStream, long j10, long j11, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = buffer.size - j12;
        }
        return buffer.copyTo(outputStream, j12, j11);
    }

    private final ByteString digest(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        Segment segment = this.head;
        if (segment != null) {
            byte[] bArr = segment.data;
            int i10 = segment.pos;
            messageDigest.update(bArr, i10, segment.limit - i10);
            Segment segment2 = segment.next;
            e0.checkNotNull(segment2);
            while (segment2 != segment) {
                byte[] bArr2 = segment2.data;
                int i11 = segment2.pos;
                messageDigest.update(bArr2, i11, segment2.limit - i11);
                segment2 = segment2.next;
                e0.checkNotNull(segment2);
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        e0.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return new ByteString(bArrDigest);
    }

    private final ByteString hmac(String str, ByteString byteString) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.internalArray$okio(), str));
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i10 = segment.pos;
                mac.update(bArr, i10, segment.limit - i10);
                Segment segment2 = segment.next;
                e0.checkNotNull(segment2);
                while (segment2 != segment) {
                    byte[] bArr2 = segment2.data;
                    int i11 = segment2.pos;
                    mac.update(bArr2, i11, segment2.limit - i11);
                    segment2 = segment2.next;
                    e0.checkNotNull(segment2);
                }
            }
            byte[] bArrDoFinal = mac.doFinal();
            e0.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static /* synthetic */ UnsafeCursor readAndWriteUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readAndWriteUnsafe(unsafeCursor);
    }

    public static /* synthetic */ UnsafeCursor readUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readUnsafe(unsafeCursor);
    }

    public static /* synthetic */ Buffer writeTo$default(Buffer buffer, OutputStream outputStream, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = buffer.size;
        }
        return buffer.writeTo(outputStream, j10);
    }

    @f
    /* renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m347deprecated_getByte(long j10) {
        return getByte(j10);
    }

    @f
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final long m348deprecated_size() {
        return this.size;
    }

    @Override // com.applovin.shadow.okio.BufferedSource, com.applovin.shadow.okio.BufferedSink
    public Buffer buffer() {
        return this;
    }

    public final void clear() throws EOFException {
        skip(size());
    }

    @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final long completeSegmentByteCount() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = this.head;
        e0.checkNotNull(segment);
        Segment segment2 = segment.prev;
        e0.checkNotNull(segment2);
        return (segment2.limit >= 8192 || !segment2.owner) ? size : size - (r3 - segment2.pos);
    }

    public final Buffer copy() {
        Buffer buffer = new Buffer();
        if (size() == 0) {
            return buffer;
        }
        Segment segment = this.head;
        e0.checkNotNull(segment);
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer.head = segmentSharedCopy;
        segmentSharedCopy.prev = segmentSharedCopy;
        segmentSharedCopy.next = segmentSharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            e0.checkNotNull(segment3);
            e0.checkNotNull(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer.setSize$okio(size());
        return buffer;
    }

    public final Buffer copyTo(OutputStream out) throws IOException {
        e0.checkNotNullParameter(out, "out");
        return copyTo$default(this, out, 0L, 0L, 6, (Object) null);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer emit() {
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer emitCompleteSegments() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Buffer)) {
            return false;
        }
        Buffer buffer = (Buffer) obj;
        if (size() != buffer.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        Segment segment = this.head;
        e0.checkNotNull(segment);
        Segment segment2 = buffer.head;
        e0.checkNotNull(segment2);
        int i10 = segment.pos;
        int i11 = segment2.pos;
        long j10 = 0;
        while (j10 < size()) {
            long jMin = Math.min(segment.limit - i10, segment2.limit - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (segment.data[i10] != segment2.data[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == segment.limit) {
                segment = segment.next;
                e0.checkNotNull(segment);
                i10 = segment.pos;
            }
            if (i11 == segment2.limit) {
                segment2 = segment2.next;
                e0.checkNotNull(segment2);
                i11 = segment2.pos;
            }
            j10 += jMin;
        }
        return true;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    @Override // com.applovin.shadow.okio.BufferedSink, com.applovin.shadow.okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // com.applovin.shadow.okio.BufferedSource, com.applovin.shadow.okio.BufferedSink
    public Buffer getBuffer() {
        return this;
    }

    public final byte getByte(long j10) {
        SegmentedByteString.checkOffsetAndCount(size(), j10, 1L);
        Segment segment = this.head;
        if (segment == null) {
            e0.checkNotNull(null);
            throw null;
        }
        if (size() - j10 < j10) {
            long size = size();
            while (size > j10) {
                segment = segment.prev;
                e0.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            e0.checkNotNull(segment);
            return segment.data[(int) ((segment.pos + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            long j12 = (segment.limit - segment.pos) + j11;
            if (j12 > j10) {
                e0.checkNotNull(segment);
                return segment.data[(int) ((segment.pos + j10) - j11)];
            }
            segment = segment.next;
            e0.checkNotNull(segment);
            j11 = j12;
        }
    }

    public int hashCode() {
        Segment segment = this.head;
        if (segment == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = segment.limit;
            for (int i12 = segment.pos; i12 < i11; i12++) {
                i10 = (i10 * 31) + segment.data[i12];
            }
            segment = segment.next;
            e0.checkNotNull(segment);
        } while (segment != this.head);
        return i10;
    }

    public final ByteString hmacSha1(ByteString key) {
        e0.checkNotNullParameter(key, "key");
        return hmac("HmacSHA1", key);
    }

    public final ByteString hmacSha256(ByteString key) {
        e0.checkNotNullParameter(key, "key");
        return hmac("HmacSHA256", key);
    }

    public final ByteString hmacSha512(ByteString key) {
        e0.checkNotNullParameter(key, "key");
        return hmac("HmacSHA512", key);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(byte b10) {
        return indexOf(b10, 0L, Long.MAX_VALUE);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOfElement(ByteString targetBytes) {
        e0.checkNotNullParameter(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public InputStream inputStream() {
        return new InputStream() { // from class: com.applovin.shadow.okio.Buffer.inputStream.1
            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(Buffer.this.size(), Integer.MAX_VALUE);
            }

            @Override // java.io.InputStream
            public int read() {
                if (Buffer.this.size() > 0) {
                    return Buffer.this.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                }
                return -1;
            }

            public String toString() {
                return Buffer.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(byte[] sink, int i10, int i11) {
                e0.checkNotNullParameter(sink, "sink");
                return Buffer.this.read(sink, i10, i11);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final ByteString md5() {
        return digest(SameMD5.TAG);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public OutputStream outputStream() {
        return new OutputStream() { // from class: com.applovin.shadow.okio.Buffer.outputStream.1
            public String toString() {
                return Buffer.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i10) {
                Buffer.this.writeByte(i10);
            }

            @Override // java.io.OutputStream
            public void write(byte[] data, int i10, int i11) {
                e0.checkNotNullParameter(data, "data");
                Buffer.this.write(data, i10, i11);
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }
        };
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public boolean rangeEquals(long j10, ByteString bytes) {
        e0.checkNotNullParameter(bytes, "bytes");
        return rangeEquals(j10, bytes, 0, bytes.size());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) throws IOException {
        e0.checkNotNullParameter(sink, "sink");
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), segment.limit - segment.pos);
        sink.put(segment.data, segment.pos, iMin);
        int i10 = segment.pos + iMin;
        segment.pos = i10;
        this.size -= iMin;
        if (i10 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long readAll(Sink sink) throws IOException {
        e0.checkNotNullParameter(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        Segment segment = this.head;
        e0.checkNotNull(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        int i12 = i10 + 1;
        byte b10 = segment.data[i10];
        setSize$okio(size() - 1);
        if (i12 != i11) {
            segment.pos = i12;
            return b10;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return b10;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public ByteString readByteString() {
        return readByteString(size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r1 = new com.applovin.shadow.okio.Buffer().writeDecimalLong(r8).writeByte((int) r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: " + r1.readUtf8());
     */
    @Override // com.applovin.shadow.okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readDecimalLong() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.Buffer.readDecimalLong():long");
    }

    public final Buffer readFrom(InputStream input) throws IOException {
        e0.checkNotNullParameter(input, "input");
        readFrom(input, Long.MAX_VALUE, true);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public void readFully(Buffer sink, long j10) throws EOFException {
        e0.checkNotNullParameter(sink, "sink");
        if (size() >= j10) {
            sink.write(this, j10);
        } else {
            sink.write(this, size());
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1 A[EDGE_INSN: B:43:0x00a1->B:37:0x00a1 BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // com.applovin.shadow.okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readHexadecimalUnsignedLong() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lab
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            com.applovin.shadow.okio.Segment r6 = r14.head
            kotlin.jvm.internal.e0.checkNotNull(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L18:
            if (r8 >= r9) goto L8d
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L71
            r11 = 70
            if (r10 > r11) goto L71
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            com.applovin.shadow.okio.Buffer r0 = new com.applovin.shadow.okio.Buffer
            r0.<init>()
            com.applovin.shadow.okio.Buffer r0 = r0.writeHexadecimalUnsignedLong(r4)
            com.applovin.shadow.okio.Buffer r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L71:
            if (r0 == 0) goto L75
            r1 = 1
            goto L8d
        L75:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = com.applovin.shadow.okio.SegmentedByteString.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8d:
            if (r8 != r9) goto L99
            com.applovin.shadow.okio.Segment r7 = r6.pop()
            r14.head = r7
            com.applovin.shadow.okio.SegmentPool.recycle(r6)
            goto L9b
        L99:
            r6.pos = r8
        L9b:
            if (r1 != 0) goto La1
            com.applovin.shadow.okio.Segment r6 = r14.head
            if (r6 != 0) goto Ld
        La1:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lab:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.Buffer.readHexadecimalUnsignedLong():long");
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        Segment segment = this.head;
        e0.checkNotNull(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        if (i11 - i10 < 4) {
            return ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        byte[] bArr = segment.data;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i13;
        setSize$okio(size() - 4);
        if (i14 != i11) {
            segment.pos = i14;
            return i15;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return i15;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int readIntLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readInt());
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        Segment segment = this.head;
        e0.checkNotNull(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        if (i11 - i10 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = segment.data;
        int i12 = i10 + 7;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (bArr[i12] & 255);
        setSize$okio(size() - 8);
        if (i13 != i11) {
            segment.pos = i13;
            return j11;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return j11;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long readLongLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readLong());
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        Segment segment = this.head;
        e0.checkNotNull(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        byte[] bArr = segment.data;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i13;
        setSize$okio(size() - 2);
        if (i14 == i11) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i14;
        }
        return (short) i15;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public short readShortLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readShort());
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readString(Charset charset) {
        e0.checkNotNullParameter(charset, "charset");
        return readString(this.size, charset);
    }

    public final UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readUtf8() {
        return readString(this.size, g.f86134b);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (size() == 0) {
            throw new EOFException();
        }
        byte b10 = getByte(0L);
        if ((b10 & 128) == 0) {
            i10 = b10 & AbstractJsonLexerKt.TC_INVALID;
            i12 = 0;
            i11 = 1;
        } else if ((b10 & 224) == 192) {
            i10 = b10 & 31;
            i11 = 2;
            i12 = 128;
        } else if ((b10 & 240) == 224) {
            i10 = b10 & 15;
            i11 = 3;
            i12 = 2048;
        } else {
            if ((b10 & 248) != 240) {
                skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i10 = b10 & 7;
            i11 = 4;
            i12 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        long j10 = i11;
        if (size() < j10) {
            StringBuilder sbT = o2.t(i11, "size < ", ": ");
            sbT.append(size());
            sbT.append(" (to read code point prefixed 0x");
            sbT.append(SegmentedByteString.toHexString(b10));
            sbT.append(')');
            throw new EOFException(sbT.toString());
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte b11 = getByte(j11);
            if ((b11 & 192) != 128) {
                skip(j11);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i10 = (i10 << 6) | (b11 & Utf8.REPLACEMENT_BYTE);
        }
        skip(j10);
        return i10 > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 > i10 || i10 >= 57344) && i10 >= i12) ? i10 : Utf8.REPLACEMENT_CODE_POINT;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readUtf8Line() throws EOFException {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return com.applovin.shadow.okio.internal.Buffer.readUtf8Line(this, jIndexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public boolean request(long j10) {
        return this.size >= j10;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public void require(long j10) throws EOFException {
        if (this.size < j10) {
            throw new EOFException();
        }
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int select(Options options) throws EOFException {
        e0.checkNotNullParameter(options, "options");
        int iSelectPrefix$default = com.applovin.shadow.okio.internal.Buffer.selectPrefix$default(this, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        skip(options.getByteStrings$okio()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public final void setSize$okio(long j10) {
        this.size = j10;
    }

    public final ByteString sha1() {
        return digest(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    public final ByteString sha256() {
        return digest("SHA-256");
    }

    public final ByteString sha512() {
        return digest("SHA-512");
    }

    public final long size() {
        return this.size;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            Segment segment = this.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, segment.limit - segment.pos);
            long j11 = iMin;
            setSize$okio(size() - j11);
            j10 -= j11;
            int i10 = segment.pos + iMin;
            segment.pos = i10;
            if (i10 == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    public final ByteString snapshot() {
        if (size() <= 2147483647L) {
            return snapshot((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @Override // com.applovin.shadow.okio.Source
    public Timeout timeout() {
        return Timeout.NONE;
    }

    public String toString() {
        return snapshot().toString();
    }

    public final Segment writableSegment$okio(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Segment segment = this.head;
        if (segment != null) {
            e0.checkNotNull(segment);
            Segment segment2 = segment.prev;
            e0.checkNotNull(segment2);
            return (segment2.limit + i10 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        this.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public long writeAll(Source source) throws IOException {
        e0.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this, 8192L);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    public final Buffer writeTo(OutputStream out) throws IOException {
        e0.checkNotNullParameter(out, "out");
        return writeTo$default(this, out, 0L, 2, null);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Buffer m349clone() {
        return copy();
    }

    public final Buffer copyTo(OutputStream out, long j10) throws IOException {
        e0.checkNotNullParameter(out, "out");
        return copyTo$default(this, out, j10, 0L, 4, (Object) null);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(byte b10, long j10) {
        return indexOf(b10, j10, Long.MAX_VALUE);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOfElement(ByteString targetBytes, long j10) {
        int i10;
        int i11;
        e0.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "fromIndex < 0: ").toString());
        }
        Segment segment = this.head;
        if (segment == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                segment = segment.prev;
                e0.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            if (targetBytes.size() == 2) {
                byte b10 = targetBytes.getByte(0);
                byte b11 = targetBytes.getByte(1);
                while (size < size()) {
                    byte[] bArr = segment.data;
                    i10 = (int) ((segment.pos + j10) - size);
                    int i12 = segment.limit;
                    while (i10 < i12) {
                        byte b12 = bArr[i10];
                        if (b12 == b10 || b12 == b11) {
                            i11 = segment.pos;
                        } else {
                            i10++;
                        }
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    e0.checkNotNull(segment);
                    j10 = size;
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < size()) {
                    byte[] bArr2 = segment.data;
                    i10 = (int) ((segment.pos + j10) - size);
                    int i13 = segment.limit;
                    while (i10 < i13) {
                        byte b13 = bArr2[i10];
                        for (byte b14 : bArrInternalArray$okio) {
                            if (b13 == b14) {
                                i11 = segment.pos;
                            }
                        }
                        i10++;
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    e0.checkNotNull(segment);
                    j10 = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j11 = (segment.limit - segment.pos) + size;
            if (j11 > j10) {
                break;
            }
            segment = segment.next;
            e0.checkNotNull(segment);
            size = j11;
        }
        if (targetBytes.size() == 2) {
            byte b15 = targetBytes.getByte(0);
            byte b16 = targetBytes.getByte(1);
            while (size < size()) {
                byte[] bArr3 = segment.data;
                i10 = (int) ((segment.pos + j10) - size);
                int i14 = segment.limit;
                while (i10 < i14) {
                    byte b17 = bArr3[i10];
                    if (b17 == b15 || b17 == b16) {
                        i11 = segment.pos;
                    } else {
                        i10++;
                    }
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                e0.checkNotNull(segment);
                j10 = size;
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < size()) {
                byte[] bArr4 = segment.data;
                i10 = (int) ((segment.pos + j10) - size);
                int i15 = segment.limit;
                while (i10 < i15) {
                    byte b18 = bArr4[i10];
                    for (byte b19 : bArrInternalArray$okio2) {
                        if (b18 == b19) {
                            i11 = segment.pos;
                        }
                    }
                    i10++;
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                e0.checkNotNull(segment);
                j10 = size;
            }
        }
        return -1L;
        return (i10 - i11) + size;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public boolean rangeEquals(long j10, ByteString bytes, int i10, int i11) {
        e0.checkNotNullParameter(bytes, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || size() - j10 < i11 || bytes.size() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (getByte(i12 + j10) != bytes.getByte(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public final UnsafeCursor readAndWriteUnsafe(UnsafeCursor unsafeCursor) {
        e0.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return com.applovin.shadow.okio.internal.Buffer.commonReadAndWriteUnsafe(this, unsafeCursor);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public byte[] readByteArray(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount: ").toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public ByteString readByteString(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount: ").toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new ByteString(readByteArray(j10));
        }
        ByteString byteStringSnapshot = snapshot((int) j10);
        skip(j10);
        return byteStringSnapshot;
    }

    public final Buffer readFrom(InputStream input, long j10) throws IOException {
        e0.checkNotNullParameter(input, "input");
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: ").toString());
        }
        readFrom(input, j10, false);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readString(long j10, Charset charset) throws EOFException {
        e0.checkNotNullParameter(charset, "charset");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount: ").toString());
        }
        if (this.size < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        Segment segment = this.head;
        e0.checkNotNull(segment);
        int i10 = segment.pos;
        if (i10 + j10 > segment.limit) {
            return new String(readByteArray(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(segment.data, i10, i11, charset);
        int i12 = segment.pos + i11;
        segment.pos = i12;
        this.size -= j10;
        if (i12 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return str;
    }

    public final UnsafeCursor readUnsafe(UnsafeCursor unsafeCursor) {
        e0.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return com.applovin.shadow.okio.internal.Buffer.commonReadUnsafe(this, unsafeCursor);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readUtf8(long j10) throws EOFException {
        return readString(j10, g.f86134b);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public String readUtf8LineStrict(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "limit < 0: ").toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jIndexOf = indexOf((byte) 10, 0L, j11);
        if (jIndexOf != -1) {
            return com.applovin.shadow.okio.internal.Buffer.readUtf8Line(this, jIndexOf);
        }
        if (j11 < size() && getByte(j11 - 1) == 13 && getByte(j11) == 10) {
            return com.applovin.shadow.okio.internal.Buffer.readUtf8Line(this, j11);
        }
        Buffer buffer = new Buffer();
        copyTo(buffer, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeByte(int i10) {
        Segment segmentWritableSegment$okio = writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i11 + 1;
        bArr[i11] = (byte) i10;
        setSize$okio(size() + 1);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeDecimalLong(long j10) {
        boolean z10;
        if (j10 == 0) {
            return writeByte(48);
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 >= 100000000) {
            i10 = j10 < 1000000000000L ? j10 < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j10 < C.NANOS_PER_SECOND ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
        } else if (j10 >= 10000) {
            i10 = j10 < 1000000 ? j10 < 100000 ? 5 : 6 : j10 < 10000000 ? 7 : 8;
        } else if (j10 >= 100) {
            i10 = j10 < 1000 ? 3 : 4;
        } else if (j10 >= 10) {
            i10 = 2;
        }
        if (z10) {
            i10++;
        }
        Segment segmentWritableSegment$okio = writableSegment$okio(i10);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = com.applovin.shadow.okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        segmentWritableSegment$okio.limit += i10;
        setSize$okio(size() + i10);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeHexadecimalUnsignedLong(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + 3) / 4);
        Segment segmentWritableSegment$okio = writableSegment$okio(i10);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = com.applovin.shadow.okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i10;
        setSize$okio(size() + i10);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeInt(int i10) {
        Segment segmentWritableSegment$okio = writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        segmentWritableSegment$okio.limit = i11 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeIntLe(int i10) {
        return writeInt(SegmentedByteString.reverseBytes(i10));
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeLong(long j10) {
        Segment segmentWritableSegment$okio = writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((j10 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((j10 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((j10 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((j10 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((j10 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((j10 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (j10 & 255);
        segmentWritableSegment$okio.limit = i10 + 8;
        setSize$okio(size() + 8);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeLongLe(long j10) {
        return writeLong(SegmentedByteString.reverseBytes(j10));
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeShort(int i10) {
        Segment segmentWritableSegment$okio = writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        segmentWritableSegment$okio.limit = i11 + 2;
        setSize$okio(size() + 2);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeShortLe(int i10) {
        return writeShort((int) SegmentedByteString.reverseBytes((short) i10));
    }

    public final Buffer writeTo(OutputStream out, long j10) throws IOException {
        e0.checkNotNullParameter(out, "out");
        SegmentedByteString.checkOffsetAndCount(this.size, 0L, j10);
        Segment segment = this.head;
        long j11 = j10;
        while (j11 > 0) {
            e0.checkNotNull(segment);
            int iMin = (int) Math.min(j11, segment.limit - segment.pos);
            out.write(segment.data, segment.pos, iMin);
            int i10 = segment.pos + iMin;
            segment.pos = i10;
            long j12 = iMin;
            this.size -= j12;
            j11 -= j12;
            if (i10 == segment.limit) {
                Segment segmentPop = segment.pop();
                this.head = segmentPop;
                SegmentPool.recycle(segment);
                segment = segmentPop;
            }
        }
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeUtf8CodePoint(int i10) {
        if (i10 < 128) {
            writeByte(i10);
            return this;
        }
        if (i10 < 2048) {
            Segment segmentWritableSegment$okio = writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i11 = segmentWritableSegment$okio.limit;
            bArr[i11] = (byte) ((i10 >> 6) | PsExtractor.AUDIO_STREAM);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            segmentWritableSegment$okio.limit = i11 + 2;
            setSize$okio(size() + 2);
            return this;
        }
        if (55296 <= i10 && i10 < 57344) {
            writeByte(63);
            return this;
        }
        if (i10 < 65536) {
            Segment segmentWritableSegment$okio2 = writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i12 = segmentWritableSegment$okio2.limit;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            segmentWritableSegment$okio2.limit = i12 + 3;
            setSize$okio(size() + 3);
            return this;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(i10));
        }
        Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
        byte[] bArr3 = segmentWritableSegment$okio3.data;
        int i13 = segmentWritableSegment$okio3.limit;
        bArr3[i13] = (byte) ((i10 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        segmentWritableSegment$okio3.limit = i13 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return buffer.copyTo(buffer2, j10, j11);
    }

    public final Buffer copyTo(OutputStream out, long j10, long j11) throws IOException {
        e0.checkNotNullParameter(out, "out");
        long j12 = j10;
        SegmentedByteString.checkOffsetAndCount(this.size, j12, j11);
        if (j11 != 0) {
            Segment segment = this.head;
            while (true) {
                e0.checkNotNull(segment);
                int i10 = segment.limit;
                int i11 = segment.pos;
                if (j12 < i10 - i11) {
                    break;
                }
                j12 -= i10 - i11;
                segment = segment.next;
            }
            Segment segment2 = segment;
            long j13 = j11;
            while (j13 > 0) {
                e0.checkNotNull(segment2);
                int iMin = (int) Math.min(segment2.limit - r1, j13);
                out.write(segment2.data, (int) (segment2.pos + j12), iMin);
                j13 -= iMin;
                segment2 = segment2.next;
                j12 = 0;
            }
        }
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(ByteString bytes) throws IOException {
        e0.checkNotNullParameter(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeString(String string, Charset charset) {
        e0.checkNotNullParameter(string, "string");
        e0.checkNotNullParameter(charset, VPCjETNfjxu.EMVLOGxScRhIan);
        return writeString(string, 0, string.length(), charset);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeUtf8(String string) {
        e0.checkNotNullParameter(string, "string");
        return writeUtf8(string, 0, string.length());
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return buffer.copyTo(buffer2, j10);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(byte b10, long j10, long j11) {
        Segment segment;
        int i10;
        long size = 0;
        if (0 > j10 || j10 > j11) {
            StringBuilder sb2 = new StringBuilder("size=");
            sb2.append(size());
            sb2.append(" fromIndex=");
            sb2.append(j10);
            throw new IllegalArgumentException(e2.i(j11, " toIndex=", sb2).toString());
        }
        if (j11 > size()) {
            j11 = size();
        }
        if (j10 == j11 || (segment = this.head) == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                segment = segment.prev;
                e0.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            while (size < j11) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (segment.pos + j11) - size);
                i10 = (int) ((segment.pos + j10) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                e0.checkNotNull(segment);
                j10 = size;
            }
            return -1L;
        }
        while (true) {
            long j12 = (segment.limit - segment.pos) + size;
            if (j12 > j10) {
                break;
            }
            segment = segment.next;
            e0.checkNotNull(segment);
            size = j12;
        }
        while (size < j11) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (segment.pos + j11) - size);
            i10 = (int) ((segment.pos + j10) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += segment.limit - segment.pos;
            segment = segment.next;
            e0.checkNotNull(segment);
            j10 = size;
        }
        return -1L;
        return (i10 - segment.pos) + size;
    }

    public final ByteString snapshot(int i10) {
        if (i10 == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(size(), 0L, i10);
        Segment segment = this.head;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            e0.checkNotNull(segment);
            int i14 = segment.limit;
            int i15 = segment.pos;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        Segment segment2 = this.head;
        int i16 = 0;
        while (i11 < i10) {
            e0.checkNotNull(segment2);
            bArr[i16] = segment2.data;
            i11 += segment2.limit - segment2.pos;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = segment2.pos;
            segment2.shared = true;
            i16++;
            segment2 = segment2.next;
        }
        return new C0819SegmentedByteString(bArr, iArr);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeUtf8(String string, int i10, int i11) {
        char cCharAt;
        e0.checkNotNullParameter(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(b.e(i10, "beginIndex < 0: ").toString());
        }
        if (i11 >= i10) {
            if (i11 > string.length()) {
                StringBuilder sbT = o2.t(i11, "endIndex > string.length: ", " > ");
                sbT.append(string.length());
                throw new IllegalArgumentException(sbT.toString().toString());
            }
            while (i10 < i11) {
                char cCharAt2 = string.charAt(i10);
                if (cCharAt2 < 128) {
                    Segment segmentWritableSegment$okio = writableSegment$okio(1);
                    byte[] bArr = segmentWritableSegment$okio.data;
                    int i12 = segmentWritableSegment$okio.limit - i10;
                    int iMin = Math.min(i11, 8192 - i12);
                    int i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt2;
                    while (true) {
                        i10 = i13;
                        if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                            break;
                        }
                        i13 = i10 + 1;
                        bArr[i10 + i12] = (byte) cCharAt;
                    }
                    int i14 = segmentWritableSegment$okio.limit;
                    int i15 = (i12 + i10) - i14;
                    segmentWritableSegment$okio.limit = i14 + i15;
                    setSize$okio(size() + i15);
                } else {
                    if (cCharAt2 < 2048) {
                        Segment segmentWritableSegment$okio2 = writableSegment$okio(2);
                        byte[] bArr2 = segmentWritableSegment$okio2.data;
                        int i16 = segmentWritableSegment$okio2.limit;
                        bArr2[i16] = (byte) ((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                        bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                        segmentWritableSegment$okio2.limit = i16 + 2;
                        setSize$okio(size() + 2);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i17 = i10 + 1;
                        char cCharAt3 = i17 < i11 ? string.charAt(i17) : (char) 0;
                        if (cCharAt2 <= 56319 && 56320 <= cCharAt3 && cCharAt3 < 57344) {
                            int i18 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                            Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
                            byte[] bArr3 = segmentWritableSegment$okio3.data;
                            int i19 = segmentWritableSegment$okio3.limit;
                            bArr3[i19] = (byte) ((i18 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            bArr3[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                            bArr3[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                            bArr3[i19 + 3] = (byte) ((i18 & 63) | 128);
                            segmentWritableSegment$okio3.limit = i19 + 4;
                            setSize$okio(size() + 4);
                            i10 += 2;
                        } else {
                            writeByte(63);
                            i10 = i17;
                        }
                    } else {
                        Segment segmentWritableSegment$okio4 = writableSegment$okio(3);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i20 = segmentWritableSegment$okio4.limit;
                        bArr4[i20] = (byte) ((cCharAt2 >> '\f') | 224);
                        bArr4[i20 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                        bArr4[i20 + 2] = (byte) ((cCharAt2 & '?') | 128);
                        segmentWritableSegment$okio4.limit = i20 + 3;
                        setSize$okio(size() + 3);
                    }
                    i10++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(i.a(i11, i10, "endIndex < beginIndex: ", " < ").toString());
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public void readFully(byte[] sink) throws EOFException {
        e0.checkNotNullParameter(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer writeString(String string, int i10, int i11, Charset charset) {
        e0.checkNotNullParameter(string, "string");
        e0.checkNotNullParameter(charset, "charset");
        if (i10 < 0) {
            throw new IllegalArgumentException(b.e(i10, "beginIndex < 0: ").toString());
        }
        if (i11 >= i10) {
            if (i11 <= string.length()) {
                if (e0.areEqual(charset, g.f86134b)) {
                    return writeUtf8(string, i10, i11);
                }
                String strSubstring = string.substring(i10, i11);
                e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                byte[] bytes = strSubstring.getBytes(charset);
                e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                return write(bytes, 0, bytes.length);
            }
            StringBuilder sbT = o2.t(i11, "endIndex > string.length: ", " > ");
            sbT.append(string.length());
            throw new IllegalArgumentException(sbT.toString().toString());
        }
        throw new IllegalArgumentException(i.a(i11, i10, "endIndex < beginIndex: ", " < ").toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) throws IOException {
        e0.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i10, 8192 - segmentWritableSegment$okio.limit);
            source.get(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, iMin);
            i10 -= iMin;
            segmentWritableSegment$okio.limit += iMin;
        }
        this.size += iRemaining;
        return iRemaining;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int read(byte[] sink) {
        e0.checkNotNullParameter(sink, "sink");
        return read(sink, 0, sink.length);
    }

    private final void readFrom(InputStream inputStream, long j10, boolean z10) throws IOException {
        while (true) {
            if (j10 <= 0 && !z10) {
                return;
            }
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int i10 = inputStream.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(j10, 8192 - segmentWritableSegment$okio.limit));
            if (i10 == -1) {
                if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
                    this.head = segmentWritableSegment$okio.pop();
                    SegmentPool.recycle(segmentWritableSegment$okio);
                }
                if (!z10) {
                    throw new EOFException();
                }
                return;
            }
            segmentWritableSegment$okio.limit += i10;
            long j11 = i10;
            this.size += j11;
            j10 -= j11;
        }
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int read(byte[] sink, int i10, int i11) {
        e0.checkNotNullParameter(sink, "sink");
        SegmentedByteString.checkOffsetAndCount(sink.length, i10, i11);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i11, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i12 = segment.pos;
        f0.copyInto(bArr, sink, i10, i12, i12 + iMin);
        segment.pos += iMin;
        setSize$okio(size() - iMin);
        if (segment.pos == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    public final Buffer copyTo(Buffer out, long j10) {
        e0.checkNotNullParameter(out, "out");
        return copyTo(out, j10, this.size - j10);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer write(ByteString byteString) {
        e0.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    public final Buffer copyTo(Buffer out, long j10, long j11) {
        e0.checkNotNullParameter(out, "out");
        long j12 = j10;
        SegmentedByteString.checkOffsetAndCount(size(), j12, j11);
        if (j11 != 0) {
            out.setSize$okio(out.size() + j11);
            Segment segment = this.head;
            while (true) {
                e0.checkNotNull(segment);
                int i10 = segment.limit;
                int i11 = segment.pos;
                if (j12 < i10 - i11) {
                    break;
                }
                j12 -= i10 - i11;
                segment = segment.next;
            }
            Segment segment2 = segment;
            long j13 = j11;
            while (j13 > 0) {
                e0.checkNotNull(segment2);
                Segment segmentSharedCopy = segment2.sharedCopy();
                int i12 = segmentSharedCopy.pos + ((int) j12);
                segmentSharedCopy.pos = i12;
                segmentSharedCopy.limit = Math.min(i12 + ((int) j13), segmentSharedCopy.limit);
                Segment segment3 = out.head;
                if (segment3 == null) {
                    segmentSharedCopy.prev = segmentSharedCopy;
                    segmentSharedCopy.next = segmentSharedCopy;
                    out.head = segmentSharedCopy;
                } else {
                    e0.checkNotNull(segment3);
                    Segment segment4 = segment3.prev;
                    e0.checkNotNull(segment4);
                    segment4.push(segmentSharedCopy);
                }
                j13 -= segmentSharedCopy.limit - segmentSharedCopy.pos;
                segment2 = segment2.next;
                j12 = 0;
            }
        }
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer write(ByteString byteString, int i10, int i11) {
        e0.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(this, i10, i11);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer write(byte[] source) {
        e0.checkNotNullParameter(source, "source");
        return write(source, 0, source.length);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer write(byte[] source, int i10, int i11) {
        e0.checkNotNullParameter(source, "source");
        long j10 = i11;
        SegmentedByteString.checkOffsetAndCount(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i12 - i10, 8192 - segmentWritableSegment$okio.limit);
            int i13 = i10 + iMin;
            f0.copyInto(source, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, i10, i13);
            segmentWritableSegment$okio.limit += iMin;
            i10 = i13;
        }
        setSize$okio(size() + j10);
        return this;
    }

    @Override // com.applovin.shadow.okio.Source
    public long read(Buffer sink, long j10) {
        e0.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: ").toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j10 > size()) {
            j10 = size();
        }
        sink.write(this, j10);
        return j10;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer write(Source source, long j10) throws IOException {
        e0.checkNotNullParameter(source, "source");
        while (j10 > 0) {
            long j11 = source.read(this, j10);
            if (j11 == -1) {
                throw new EOFException();
            }
            j10 -= j11;
        }
        return this;
    }

    @Override // com.applovin.shadow.okio.Sink
    public void write(Buffer source, long j10) {
        Segment segment;
        e0.checkNotNullParameter(source, "source");
        if (source != this) {
            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j10);
            while (j10 > 0) {
                Segment segment2 = source.head;
                e0.checkNotNull(segment2);
                int i10 = segment2.limit;
                e0.checkNotNull(source.head);
                if (j10 < i10 - r1.pos) {
                    Segment segment3 = this.head;
                    if (segment3 != null) {
                        e0.checkNotNull(segment3);
                        segment = segment3.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((segment.limit + j10) - (segment.shared ? 0 : segment.pos) <= 8192) {
                            Segment segment4 = source.head;
                            e0.checkNotNull(segment4);
                            segment4.writeTo(segment, (int) j10);
                            source.setSize$okio(source.size() - j10);
                            setSize$okio(size() + j10);
                            return;
                        }
                    }
                    Segment segment5 = source.head;
                    e0.checkNotNull(segment5);
                    source.head = segment5.split((int) j10);
                }
                Segment segment6 = source.head;
                e0.checkNotNull(segment6);
                long j11 = segment6.limit - segment6.pos;
                source.head = segment6.pop();
                Segment segment7 = this.head;
                if (segment7 == null) {
                    this.head = segment6;
                    segment6.prev = segment6;
                    segment6.next = segment6;
                } else {
                    e0.checkNotNull(segment7);
                    Segment segment8 = segment7.prev;
                    e0.checkNotNull(segment8);
                    segment8.push(segment6).compact();
                }
                source.setSize$okio(source.size() - j11);
                setSize$okio(size() + j11);
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(ByteString bytes, long j10) throws IOException {
        int i10;
        long j11 = j10;
        e0.checkNotNullParameter(bytes, "bytes");
        if (bytes.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j11 >= 0) {
            Segment segment = this.head;
            if (segment == null) {
                return -1L;
            }
            if (size() - j11 < j11) {
                size = size();
                while (size > j11) {
                    segment = segment.prev;
                    e0.checkNotNull(segment);
                    size -= segment.limit - segment.pos;
                }
                byte[] bArrInternalArray$okio = bytes.internalArray$okio();
                byte b10 = bArrInternalArray$okio[0];
                int size2 = bytes.size();
                long size3 = (size() - size2) + 1;
                while (size < size3) {
                    byte[] bArr = segment.data;
                    long j12 = size3;
                    int iMin = (int) Math.min(segment.limit, (segment.pos + size3) - size);
                    i10 = (int) ((segment.pos + j11) - size);
                    while (i10 < iMin) {
                        if (bArr[i10] != b10 || !com.applovin.shadow.okio.internal.Buffer.rangeEquals(segment, i10 + 1, bArrInternalArray$okio, 1, size2)) {
                            i10++;
                        }
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    e0.checkNotNull(segment);
                    j11 = size;
                    size3 = j12;
                }
                return -1L;
            }
            while (true) {
                long j13 = (segment.limit - segment.pos) + size;
                if (j13 > j11) {
                    break;
                }
                segment = segment.next;
                e0.checkNotNull(segment);
                size = j13;
            }
            byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
            byte b11 = bArrInternalArray$okio2[0];
            int size4 = bytes.size();
            long size5 = (size() - size4) + 1;
            while (size < size5) {
                byte[] bArr2 = segment.data;
                int iMin2 = (int) Math.min(segment.limit, (segment.pos + size5) - size);
                i10 = (int) ((segment.pos + j11) - size);
                while (i10 < iMin2) {
                    if (bArr2[i10] == b11 && com.applovin.shadow.okio.internal.Buffer.rangeEquals(segment, i10 + 1, bArrInternalArray$okio2, 1, size4)) {
                    }
                    i10++;
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                e0.checkNotNull(segment);
                j11 = size;
            }
            return -1L;
            return (i10 - segment.pos) + size;
        }
        throw new IllegalArgumentException(o2.m(j11, "fromIndex < 0: ").toString());
    }
}
