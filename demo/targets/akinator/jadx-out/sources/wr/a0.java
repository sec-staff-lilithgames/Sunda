package wr;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface a0 extends d0, a1 {
    @Override // wr.d0
    /* synthetic */ OutputStream compress(OutputStream outputStream) throws IOException;

    @Override // wr.a1
    /* synthetic */ InputStream decompress(InputStream inputStream) throws IOException;

    @Override // wr.d0, wr.a1
    /* synthetic */ String getMessageEncoding();
}
