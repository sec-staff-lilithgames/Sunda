package wr;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y implements a0 {
    @Override // wr.a0, wr.d0
    public OutputStream compress(OutputStream outputStream) throws IOException {
        return new GZIPOutputStream(outputStream);
    }

    @Override // wr.a0, wr.a1
    public InputStream decompress(InputStream inputStream) throws IOException {
        return new GZIPInputStream(inputStream);
    }

    @Override // wr.a0, wr.d0, wr.a1
    public String getMessageEncoding() {
        return "gzip";
    }
}
