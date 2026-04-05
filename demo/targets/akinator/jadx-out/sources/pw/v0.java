package pw;

import b0.e2;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v0 implements k {

    /* renamed from: b, reason: collision with root package name */
    public final b1 f81986b;

    /* renamed from: c, reason: collision with root package name */
    public final g f81987c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f81988e;

    public v0(b1 source) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        this.f81986b = source;
        this.f81987c = new g();
    }

    @Override // pw.k, pw.j
    public g buffer() {
        return this.f81987c;
    }

    @Override // pw.k, pw.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f81988e) {
            return;
        }
        this.f81988e = true;
        this.f81986b.close();
        this.f81987c.clear();
    }

    @Override // pw.k
    public boolean exhausted() {
        if (this.f81988e) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f81987c;
        return gVar.exhausted() && this.f81986b.read(gVar, 8192L) == -1;
    }

    @Override // pw.k, pw.j
    public g getBuffer() {
        return this.f81987c;
    }

    @Override // pw.k
    public long indexOf(byte b10) throws IOException {
        return indexOf(b10, 0L, Long.MAX_VALUE);
    }

    @Override // pw.k
    public long indexOfElement(l targetBytes) {
        kotlin.jvm.internal.e0.checkNotNullParameter(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // pw.k
    public InputStream inputStream() {
        return new u0(this);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f81988e;
    }

    @Override // pw.k
    public k peek() {
        return h0.buffer(new o0(this));
    }

    @Override // pw.k
    public boolean rangeEquals(long j10, l bytes) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bytes, "bytes");
        return rangeEquals(j10, bytes, 0, bytes.size());
    }

    @Override // pw.k
    public int read(byte[] sink) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // pw.k
    public long readAll(z0 sink) throws IOException {
        g gVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        long j10 = 0;
        while (true) {
            b1 b1Var = this.f81986b;
            gVar = this.f81987c;
            if (b1Var.read(gVar, 8192L) == -1) {
                break;
            }
            long jCompleteSegmentByteCount = gVar.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j10 += jCompleteSegmentByteCount;
                sink.write(gVar, jCompleteSegmentByteCount);
            }
        }
        if (gVar.size() <= 0) {
            return j10;
        }
        long size = gVar.size() + j10;
        sink.write(gVar, gVar.size());
        return size;
    }

    @Override // pw.k
    public byte readByte() throws IOException {
        require(1L);
        return this.f81987c.readByte();
    }

    @Override // pw.k
    public byte[] readByteArray() throws IOException {
        b1 b1Var = this.f81986b;
        g gVar = this.f81987c;
        gVar.writeAll(b1Var);
        return gVar.readByteArray();
    }

    @Override // pw.k
    public l readByteString() throws IOException {
        b1 b1Var = this.f81986b;
        g gVar = this.f81987c;
        gVar.writeAll(b1Var);
        return gVar.readByteString();
    }

    @Override // pw.k
    public long readDecimalLong() throws IOException {
        g gVar;
        byte b10;
        require(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            boolean zRequest = request(j11);
            gVar = this.f81987c;
            if (!zRequest) {
                break;
            }
            b10 = gVar.getByte(j10);
            if ((b10 < 48 || b10 > 57) && !(j10 == 0 && b10 == 45)) {
                break;
            }
            j10 = j11;
        }
        if (j10 == 0) {
            StringBuilder sb2 = new StringBuilder("Expected a digit or '-' but was 0x");
            String string = Integer.toString(b10, sv.e.checkRadix(16));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return gVar.readDecimalLong();
    }

    @Override // pw.k
    public void readFully(byte[] sink) throws IOException {
        g gVar = this.f81987c;
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        try {
            require(sink.length);
            gVar.readFully(sink);
        } catch (EOFException e10) {
            int i10 = 0;
            while (gVar.size() > 0) {
                int i11 = gVar.read(sink, i10, (int) gVar.size());
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
            throw e10;
        }
    }

    @Override // pw.k
    public long readHexadecimalUnsignedLong() throws IOException {
        g gVar;
        byte b10;
        require(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            boolean zRequest = request(i11);
            gVar = this.f81987c;
            if (!zRequest) {
                break;
            }
            b10 = gVar.getByte(i10);
            if ((b10 < 48 || b10 > 57) && ((b10 < 97 || b10 > 102) && (b10 < 65 || b10 > 70))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(b10, sv.e.checkRadix(16));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return gVar.readHexadecimalUnsignedLong();
    }

    @Override // pw.k
    public int readInt() throws IOException {
        require(4L);
        return this.f81987c.readInt();
    }

    @Override // pw.k
    public int readIntLe() throws IOException {
        require(4L);
        return this.f81987c.readIntLe();
    }

    @Override // pw.k
    public long readLong() throws IOException {
        require(8L);
        return this.f81987c.readLong();
    }

    @Override // pw.k
    public long readLongLe() throws IOException {
        require(8L);
        return this.f81987c.readLongLe();
    }

    @Override // pw.k
    public short readShort() throws IOException {
        require(2L);
        return this.f81987c.readShort();
    }

    @Override // pw.k
    public short readShortLe() throws IOException {
        require(2L);
        return this.f81987c.readShortLe();
    }

    @Override // pw.k
    public String readString(Charset charset) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(charset, "charset");
        b1 b1Var = this.f81986b;
        g gVar = this.f81987c;
        gVar.writeAll(b1Var);
        return gVar.readString(charset);
    }

    @Override // pw.k
    public String readUtf8() throws IOException {
        b1 b1Var = this.f81986b;
        g gVar = this.f81987c;
        gVar.writeAll(b1Var);
        return gVar.readUtf8();
    }

    @Override // pw.k
    public int readUtf8CodePoint() throws IOException {
        require(1L);
        g gVar = this.f81987c;
        byte b10 = gVar.getByte(0L);
        if ((b10 & 224) == 192) {
            require(2L);
        } else if ((b10 & 240) == 224) {
            require(3L);
        } else if ((b10 & 248) == 240) {
            require(4L);
        }
        return gVar.readUtf8CodePoint();
    }

    @Override // pw.k
    public String readUtf8Line() throws IOException {
        long jIndexOf = indexOf((byte) 10);
        g gVar = this.f81987c;
        if (jIndexOf != -1) {
            return qw.a.readUtf8Line(gVar, jIndexOf);
        }
        if (gVar.size() != 0) {
            return readUtf8(gVar.size());
        }
        return null;
    }

    @Override // pw.k
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // pw.k
    public boolean request(long j10) throws IOException {
        g gVar;
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: ").toString());
        }
        if (this.f81988e) {
            throw new IllegalStateException("closed");
        }
        do {
            gVar = this.f81987c;
            if (gVar.size() >= j10) {
                return true;
            }
        } while (this.f81986b.read(gVar, 8192L) != -1);
        return false;
    }

    @Override // pw.k
    public void require(long j10) throws IOException {
        if (!request(j10)) {
            throw new EOFException();
        }
    }

    @Override // pw.k
    public int select(l0 options) throws EOFException {
        kotlin.jvm.internal.e0.checkNotNullParameter(options, "options");
        if (this.f81988e) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            g gVar = this.f81987c;
            int iSelectPrefix = qw.a.selectPrefix(gVar, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix != -1) {
                    gVar.skip(options.getByteStrings$okio()[iSelectPrefix].size());
                    return iSelectPrefix;
                }
            } else if (this.f81986b.read(gVar, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // pw.k
    public void skip(long j10) throws IOException {
        if (this.f81988e) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            g gVar = this.f81987c;
            if (gVar.size() == 0 && this.f81986b.read(gVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, gVar.size());
            gVar.skip(jMin);
            j10 -= jMin;
        }
    }

    @Override // pw.k, pw.b1
    public d1 timeout() {
        return this.f81986b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f81986b + ')';
    }

    @Override // pw.k
    public long indexOf(byte b10, long j10) {
        return indexOf(b10, j10, Long.MAX_VALUE);
    }

    @Override // pw.k
    public long indexOfElement(l targetBytes, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(targetBytes, "targetBytes");
        if (this.f81988e) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            g gVar = this.f81987c;
            long jIndexOfElement = gVar.indexOfElement(targetBytes, j10);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = gVar.size();
            if (this.f81986b.read(gVar, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, size);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        g gVar = this.f81987c;
        if (gVar.size() == 0 && this.f81986b.read(gVar, 8192L) == -1) {
            return -1;
        }
        return gVar.read(sink);
    }

    @Override // pw.k
    public String readUtf8LineStrict(long j10) throws IOException {
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "limit < 0: ").toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jIndexOf = indexOf((byte) 10, 0L, j11);
        g gVar = this.f81987c;
        if (jIndexOf != -1) {
            return qw.a.readUtf8Line(gVar, jIndexOf);
        }
        if (j11 < Long.MAX_VALUE && request(j11) && gVar.getByte(j11 - 1) == 13 && request(j11 + 1) && gVar.getByte(j11) == 10) {
            return qw.a.readUtf8Line(gVar, j11);
        }
        g gVar2 = new g();
        g gVar3 = this.f81987c;
        gVar3.copyTo(gVar2, 0L, Math.min(32, gVar3.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(gVar.size(), j10) + " content=" + gVar2.readByteString().hex() + (char) 8230);
    }

    @Override // pw.k
    public long indexOf(l bytes) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // pw.k
    public boolean rangeEquals(long j10, l bytes, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bytes, "bytes");
        if (!this.f81988e) {
            if (i11 >= 0 && j10 >= 0 && i10 >= 0 && i10 + i11 <= bytes.size()) {
                return i11 == 0 || qw.i.commonIndexOf(this, bytes, i10, i11, j10, j10 + 1) != -1;
            }
            return false;
        }
        throw new IllegalStateException("closed");
    }

    @Override // pw.k
    public byte[] readByteArray(long j10) throws IOException {
        require(j10);
        return this.f81987c.readByteArray(j10);
    }

    @Override // pw.k
    public l readByteString(long j10) throws IOException {
        require(j10);
        return this.f81987c.readByteString(j10);
    }

    @Override // pw.k
    public String readString(long j10, Charset charset) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(charset, "charset");
        require(j10);
        return this.f81987c.readString(j10, charset);
    }

    @Override // pw.k
    public String readUtf8(long j10) throws IOException {
        require(j10);
        return this.f81987c.readUtf8(j10);
    }

    @Override // pw.k
    public long indexOf(l bytes, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bytes, "bytes");
        return indexOf(bytes, j10, Long.MAX_VALUE);
    }

    @Override // pw.k
    public long indexOf(l bytes, long j10, long j11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bytes, "bytes");
        return qw.i.commonIndexOf$default(this, bytes, 0, 0, j10, j11, 6, null);
    }

    @Override // pw.k, pw.b1
    public long read(g sink, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        if (j10 >= 0) {
            if (!this.f81988e) {
                g gVar = this.f81987c;
                if (gVar.size() == 0) {
                    if (j10 == 0) {
                        return 0L;
                    }
                    if (this.f81986b.read(gVar, 8192L) == -1) {
                        return -1L;
                    }
                }
                return gVar.read(sink, Math.min(j10, gVar.size()));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: ").toString());
    }

    @Override // pw.k
    public long indexOf(byte b10, long j10, long j11) throws IOException {
        if (this.f81988e) {
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
            long jIndexOf = this.f81987c.indexOf(b11, jMax, j12);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            g gVar = this.f81987c;
            long size = gVar.size();
            if (size >= j12 || this.f81986b.read(gVar, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b10 = b11;
            j11 = j12;
        }
        return -1L;
    }

    @Override // pw.k
    public void readFully(g sink, long j10) throws IOException {
        g gVar = this.f81987c;
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        try {
            require(j10);
            gVar.readFully(sink, j10);
        } catch (EOFException e10) {
            sink.writeAll(gVar);
            throw e10;
        }
    }

    @Override // pw.k
    public <T> T select(e1 options) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(options, "options");
        int iSelect = select(options.getOptions$okio());
        if (iSelect == -1) {
            return null;
        }
        return (T) options.get(iSelect);
    }

    @Override // pw.k
    public int read(byte[] sink, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        long j10 = i11;
        b.checkOffsetAndCount(sink.length, i10, j10);
        g gVar = this.f81987c;
        if (gVar.size() == 0) {
            if (i11 == 0) {
                return 0;
            }
            if (this.f81986b.read(gVar, 8192L) == -1) {
                return -1;
            }
        }
        return gVar.read(sink, i10, (int) Math.min(j10, gVar.size()));
    }

    public static /* synthetic */ void getBuffer$annotations() {
    }
}
