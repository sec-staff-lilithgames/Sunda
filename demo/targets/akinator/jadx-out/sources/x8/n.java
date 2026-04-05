package x8;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface n {
    int getUInt16() throws IOException;

    short getUInt8() throws IOException;

    int read(byte[] bArr, int i10) throws IOException;

    long skip(long j10) throws IOException;
}
