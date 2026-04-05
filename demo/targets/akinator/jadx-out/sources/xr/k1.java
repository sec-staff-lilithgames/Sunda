package xr;

import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface k1 extends ue {
    void appendTimeoutInsight(l5 l5Var);

    void cancel(wr.m6 m6Var);

    @Override // xr.ue
    /* synthetic */ void flush();

    wr.c getAttributes();

    void halfClose();

    /* synthetic */ boolean isReady();

    @Override // xr.ue
    /* synthetic */ void optimizeForDirectExecutor();

    @Override // xr.ue
    /* synthetic */ void request(int i10);

    void setAuthority(String str);

    @Override // xr.ue
    /* synthetic */ void setCompressor(wr.d0 d0Var);

    void setDeadline(wr.z0 z0Var);

    void setDecompressorRegistry(wr.c1 c1Var);

    void setFullStreamDecompression(boolean z10);

    void setMaxInboundMessageSize(int i10);

    void setMaxOutboundMessageSize(int i10);

    @Override // xr.ue
    /* synthetic */ void setMessageCompression(boolean z10);

    void start(m1 m1Var);

    @Override // xr.ue
    /* synthetic */ void writeMessage(InputStream inputStream);
}
