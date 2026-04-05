package xr;

import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface ue {
    void flush();

    boolean isReady();

    void optimizeForDirectExecutor();

    void request(int i10);

    void setCompressor(wr.d0 d0Var);

    void setMessageCompression(boolean z10);

    void writeMessage(InputStream inputStream);
}
