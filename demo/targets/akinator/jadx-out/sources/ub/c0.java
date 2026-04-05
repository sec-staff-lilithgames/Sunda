package ub;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface c0 {
    int appendQuoted(char[] cArr, int i10);

    int appendQuotedUTF8(byte[] bArr, int i10);

    int appendUnquoted(char[] cArr, int i10);

    int appendUnquotedUTF8(byte[] bArr, int i10);

    char[] asQuotedChars();

    byte[] asQuotedUTF8();

    byte[] asUnquotedUTF8();

    int charLength();

    String getValue();

    int putQuotedUTF8(ByteBuffer byteBuffer) throws IOException;

    int putUnquotedUTF8(ByteBuffer byteBuffer) throws IOException;

    int writeQuotedUTF8(OutputStream outputStream) throws IOException;

    int writeUnquotedUTF8(OutputStream outputStream) throws IOException;
}
