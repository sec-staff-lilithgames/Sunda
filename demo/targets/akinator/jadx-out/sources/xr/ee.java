package xr;

import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface ee extends ue {
    void cancel(wr.m6 m6Var);

    void close(wr.m6 m6Var, wr.e4 e4Var);

    @Override // xr.ue
    /* synthetic */ void flush();

    wr.c getAttributes();

    String getAuthority();

    @Override // xr.ue, xr.k1
    /* synthetic */ boolean isReady();

    @Override // xr.ue
    /* synthetic */ void optimizeForDirectExecutor();

    @Override // xr.ue
    /* synthetic */ void request(int i10);

    @Override // xr.ue
    /* synthetic */ void setCompressor(wr.d0 d0Var);

    void setDecompressor(wr.a1 a1Var);

    void setListener(fe feVar);

    @Override // xr.ue
    /* synthetic */ void setMessageCompression(boolean z10);

    te statsTraceContext();

    int streamId();

    void writeHeaders(wr.e4 e4Var, boolean z10);

    @Override // xr.ue
    /* synthetic */ void writeMessage(InputStream inputStream);
}
