package pw;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface k extends b1, ReadableByteChannel {
    @tu.f
    g buffer();

    @Override // pw.b1, java.io.Closeable, java.lang.AutoCloseable
    /* synthetic */ void close() throws IOException;

    boolean exhausted() throws IOException;

    g getBuffer();

    long indexOf(byte b10) throws IOException;

    long indexOf(byte b10, long j10) throws IOException;

    long indexOf(byte b10, long j10, long j11) throws IOException;

    long indexOf(l lVar) throws IOException;

    long indexOf(l lVar, long j10) throws IOException;

    long indexOf(l lVar, long j10, long j11) throws IOException;

    long indexOfElement(l lVar) throws IOException;

    long indexOfElement(l lVar, long j10) throws IOException;

    InputStream inputStream();

    k peek();

    boolean rangeEquals(long j10, l lVar) throws IOException;

    boolean rangeEquals(long j10, l lVar, int i10, int i11) throws IOException;

    int read(byte[] bArr) throws IOException;

    int read(byte[] bArr, int i10, int i11) throws IOException;

    @Override // pw.b1
    /* synthetic */ long read(g gVar, long j10) throws IOException;

    long readAll(z0 z0Var) throws IOException;

    byte readByte() throws IOException;

    byte[] readByteArray() throws IOException;

    byte[] readByteArray(long j10) throws IOException;

    l readByteString() throws IOException;

    l readByteString(long j10) throws IOException;

    long readDecimalLong() throws IOException;

    void readFully(g gVar, long j10) throws IOException;

    void readFully(byte[] bArr) throws IOException;

    long readHexadecimalUnsignedLong() throws IOException;

    int readInt() throws IOException;

    int readIntLe() throws IOException;

    long readLong() throws IOException;

    long readLongLe() throws IOException;

    short readShort() throws IOException;

    short readShortLe() throws IOException;

    String readString(long j10, Charset charset) throws IOException;

    String readString(Charset charset) throws IOException;

    String readUtf8() throws IOException;

    String readUtf8(long j10) throws IOException;

    int readUtf8CodePoint() throws IOException;

    String readUtf8Line() throws IOException;

    String readUtf8LineStrict() throws IOException;

    String readUtf8LineStrict(long j10) throws IOException;

    boolean request(long j10) throws IOException;

    void require(long j10) throws IOException;

    int select(l0 l0Var) throws IOException;

    <T> T select(e1 e1Var) throws IOException;

    void skip(long j10) throws IOException;

    @Override // pw.b1
    /* synthetic */ d1 timeout();
}
