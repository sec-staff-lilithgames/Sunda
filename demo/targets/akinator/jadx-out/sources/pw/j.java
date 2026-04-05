package pw;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface j extends z0, WritableByteChannel {
    @tu.f
    g buffer();

    @Override // pw.z0, java.io.Closeable, java.lang.AutoCloseable
    /* synthetic */ void close() throws IOException;

    j emit() throws IOException;

    j emitCompleteSegments() throws IOException;

    @Override // pw.z0, java.io.Flushable
    void flush() throws IOException;

    g getBuffer();

    OutputStream outputStream();

    @Override // pw.z0
    /* synthetic */ d1 timeout();

    j write(b1 b1Var, long j10) throws IOException;

    j write(l lVar) throws IOException;

    j write(l lVar, int i10, int i11) throws IOException;

    j write(byte[] bArr) throws IOException;

    j write(byte[] bArr, int i10, int i11) throws IOException;

    @Override // pw.z0
    /* synthetic */ void write(g gVar, long j10) throws IOException;

    long writeAll(b1 b1Var) throws IOException;

    j writeByte(int i10) throws IOException;

    j writeDecimalLong(long j10) throws IOException;

    j writeHexadecimalUnsignedLong(long j10) throws IOException;

    j writeInt(int i10) throws IOException;

    j writeIntLe(int i10) throws IOException;

    j writeLong(long j10) throws IOException;

    j writeLongLe(long j10) throws IOException;

    j writeShort(int i10) throws IOException;

    j writeShortLe(int i10) throws IOException;

    j writeString(String str, int i10, int i11, Charset charset) throws IOException;

    j writeString(String str, Charset charset) throws IOException;

    j writeUtf8(String str) throws IOException;

    j writeUtf8(String str, int i10, int i11) throws IOException;

    j writeUtf8CodePoint(int i10) throws IOException;
}
