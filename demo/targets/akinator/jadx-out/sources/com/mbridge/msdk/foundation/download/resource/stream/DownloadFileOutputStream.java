package com.mbridge.msdk.foundation.download.resource.stream;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface DownloadFileOutputStream {
    void close() throws IOException;

    void flushAndSync() throws IOException;

    void seek(long j10) throws IllegalAccessException, IOException;

    void setLength(long j10) throws IllegalAccessException, IOException;

    void write(byte[] bArr, int i10, int i11) throws IOException;
}
