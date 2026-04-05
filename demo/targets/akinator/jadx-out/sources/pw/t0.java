package pw;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t0 implements j {

    /* renamed from: b, reason: collision with root package name */
    public final z0 f81981b;

    /* renamed from: c, reason: collision with root package name */
    public final g f81982c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f81983e;

    public t0(z0 sink) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        this.f81981b = sink;
        this.f81982c = new g();
    }

    @Override // pw.j
    public g buffer() {
        return this.f81982c;
    }

    @Override // pw.j, pw.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        z0 z0Var = this.f81981b;
        g gVar = this.f81982c;
        if (this.f81983e) {
            return;
        }
        try {
            if (gVar.size() > 0) {
                z0Var.write(gVar, gVar.size());
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            z0Var.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f81983e = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // pw.j
    public j emit() throws IOException {
        if (this.f81983e) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f81982c;
        long size = gVar.size();
        if (size > 0) {
            this.f81981b.write(gVar, size);
        }
        return this;
    }

    @Override // pw.j
    public j emitCompleteSegments() throws IOException {
        if (this.f81983e) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f81982c;
        long jCompleteSegmentByteCount = gVar.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            this.f81981b.write(gVar, jCompleteSegmentByteCount);
        }
        return this;
    }

    @Override // pw.j, pw.z0, java.io.Flushable
    public void flush() throws IOException {
        if (this.f81983e) {
            throw new IllegalStateException("closed");
        }
        g gVar = this.f81982c;
        long size = gVar.size();
        z0 z0Var = this.f81981b;
        if (size > 0) {
            z0Var.write(gVar, gVar.size());
        }
        z0Var.flush();
    }

    @Override // pw.j
    public g getBuffer() {
        return this.f81982c;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f81983e;
    }

    @Override // pw.j
    public OutputStream outputStream() {
        return new s0(this);
    }

    @Override // pw.j, pw.z0
    public d1 timeout() {
        return this.f81981b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f81981b + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        if (this.f81983e) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f81982c.write(source);
        emitCompleteSegments();
        return iWrite;
    }

    @Override // pw.j
    public long writeAll(b1 source) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this.f81982c, 8192L);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            emitCompleteSegments();
        }
    }

    @Override // pw.j
    public j writeByte(int i10) {
        if (this.f81983e) {
            throw new IllegalStateException("closed");
        }
        this.f81982c.writeByte(i10);
        return emitCompleteSegments();
    }

    @Override // pw.j
    public j writeDecimalLong(long j10) {
        if (this.f81983e) {
            throw new IllegalStateException("closed");
        }
        this.f81982c.writeDecimalLong(j10);
        return emitCompleteSegments();
    }

    @Override // pw.j
    public j writeHexadecimalUnsignedLong(long j10) {
        if (this.f81983e) {
            throw new IllegalStateException("closed");
        }
        this.f81982c.writeHexadecimalUnsignedLong(j10);
        return emitCompleteSegments();
    }

    @Override // pw.j
    public j writeInt(int i10) {
        if (this.f81983e) {
            throw new IllegalStateException("closed");
        }
        this.f81982c.writeInt(i10);
        return emitCompleteSegments();
    }

    @Override // pw.j
    public j writeIntLe(int i10) {
        if (this.f81983e) {
            throw new IllegalStateException("closed");
        }
        this.f81982c.writeIntLe(i10);
        return emitCompleteSegments();
    }

    @Override // pw.j
    public j writeLong(long j10) {
        if (this.f81983e) {
            throw new IllegalStateException("closed");
        }
        this.f81982c.writeLong(j10);
        return emitCompleteSegments();
    }

    @Override // pw.j
    public j writeLongLe(long j10) {
        if (this.f81983e) {
            throw new IllegalStateException("closed");
        }
        this.f81982c.writeLongLe(j10);
        return emitCompleteSegments();
    }

    @Override // pw.j
    public j writeShort(int i10) {
        if (this.f81983e) {
            throw new IllegalStateException("closed");
        }
        this.f81982c.writeShort(i10);
        return emitCompleteSegments();
    }

    @Override // pw.j
    public j writeShortLe(int i10) {
        if (this.f81983e) {
            throw new IllegalStateException("closed");
        }
        this.f81982c.writeShortLe(i10);
        return emitCompleteSegments();
    }

    @Override // pw.j
    public j writeString(String string, Charset charset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(string, "string");
        kotlin.jvm.internal.e0.checkNotNullParameter(charset, "charset");
        if (this.f81983e) {
            throw new IllegalStateException("closed");
        }
        this.f81982c.writeString(string, charset);
        return emitCompleteSegments();
    }

    @Override // pw.j
    public j writeUtf8(String string) {
        kotlin.jvm.internal.e0.checkNotNullParameter(string, "string");
        if (this.f81983e) {
            throw new IllegalStateException("closed");
        }
        this.f81982c.writeUtf8(string);
        return emitCompleteSegments();
    }

    @Override // pw.j
    public j writeUtf8CodePoint(int i10) {
        if (this.f81983e) {
            throw new IllegalStateException("closed");
        }
        this.f81982c.writeUtf8CodePoint(i10);
        return emitCompleteSegments();
    }

    @Override // pw.j, pw.z0
    public void write(g source, long j10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        if (!this.f81983e) {
            this.f81982c.write(source, j10);
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // pw.j
    public j writeString(String string, int i10, int i11, Charset charset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(string, "string");
        kotlin.jvm.internal.e0.checkNotNullParameter(charset, "charset");
        if (!this.f81983e) {
            this.f81982c.writeString(string, i10, i11, charset);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // pw.j
    public j writeUtf8(String string, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(string, "string");
        if (!this.f81983e) {
            this.f81982c.writeUtf8(string, i10, i11);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // pw.j
    public j write(l byteString) {
        kotlin.jvm.internal.e0.checkNotNullParameter(byteString, "byteString");
        if (!this.f81983e) {
            this.f81982c.write(byteString);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // pw.j
    public j write(l byteString, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(byteString, "byteString");
        if (!this.f81983e) {
            this.f81982c.write(byteString, i10, i11);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public static /* synthetic */ void getBuffer$annotations() {
    }

    @Override // pw.j
    public j write(byte[] source) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        if (!this.f81983e) {
            this.f81982c.write(source);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // pw.j
    public j write(byte[] source, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        if (!this.f81983e) {
            this.f81982c.write(source, i10, i11);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // pw.j
    public j write(b1 source, long j10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        while (j10 > 0) {
            long j11 = source.read(this.f81982c, j10);
            if (j11 != -1) {
                j10 -= j11;
                emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }
}
