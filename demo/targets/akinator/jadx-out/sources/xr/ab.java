package xr;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface ab extends Closeable {
    byte[] array();

    int arrayOffset();

    boolean byteBufferSupported();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    ByteBuffer getByteBuffer();

    boolean hasArray();

    void mark();

    boolean markSupported();

    ab readBytes(int i10);

    void readBytes(OutputStream outputStream, int i10) throws IOException;

    void readBytes(ByteBuffer byteBuffer);

    void readBytes(byte[] bArr, int i10, int i11);

    int readInt();

    int readUnsignedByte();

    int readableBytes();

    void reset();

    void skipBytes(int i10);

    default void touch() {
    }
}
