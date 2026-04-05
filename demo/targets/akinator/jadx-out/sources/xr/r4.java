package xr;

import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface r4 {
    void close();

    void dispose();

    void flush();

    boolean isClosed();

    r4 setCompressor(wr.d0 d0Var);

    void setMaxOutboundMessageSize(int i10);

    r4 setMessageCompression(boolean z10);

    void writePayload(InputStream inputStream);
}
