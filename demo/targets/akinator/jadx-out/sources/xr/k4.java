package xr;

import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class k4 implements k1 {
    @Override // xr.k1
    public void appendTimeoutInsight(l5 l5Var) {
        ((a6) this).f92247a.appendTimeoutInsight(l5Var);
    }

    @Override // xr.k1
    public void cancel(wr.m6 m6Var) {
        ((a6) this).f92247a.cancel(m6Var);
    }

    @Override // xr.k1, xr.ue
    public void flush() {
        ((a6) this).f92247a.flush();
    }

    @Override // xr.k1
    public wr.c getAttributes() {
        return ((a6) this).f92247a.getAttributes();
    }

    @Override // xr.k1
    public void halfClose() {
        ((a6) this).f92247a.halfClose();
    }

    @Override // xr.k1
    public boolean isReady() {
        return ((a6) this).f92247a.isReady();
    }

    @Override // xr.k1, xr.ue
    public void optimizeForDirectExecutor() {
        ((a6) this).f92247a.optimizeForDirectExecutor();
    }

    @Override // xr.k1, xr.ue
    public void request(int i10) {
        ((a6) this).f92247a.request(i10);
    }

    @Override // xr.k1
    public void setAuthority(String str) {
        ((a6) this).f92247a.setAuthority(str);
    }

    @Override // xr.k1, xr.ue
    public void setCompressor(wr.d0 d0Var) {
        ((a6) this).f92247a.setCompressor(d0Var);
    }

    @Override // xr.k1
    public void setDeadline(wr.z0 z0Var) {
        ((a6) this).f92247a.setDeadline(z0Var);
    }

    @Override // xr.k1
    public void setDecompressorRegistry(wr.c1 c1Var) {
        ((a6) this).f92247a.setDecompressorRegistry(c1Var);
    }

    @Override // xr.k1
    public void setFullStreamDecompression(boolean z10) {
        ((a6) this).f92247a.setFullStreamDecompression(z10);
    }

    @Override // xr.k1
    public void setMaxInboundMessageSize(int i10) {
        ((a6) this).f92247a.setMaxInboundMessageSize(i10);
    }

    @Override // xr.k1
    public void setMaxOutboundMessageSize(int i10) {
        ((a6) this).f92247a.setMaxOutboundMessageSize(i10);
    }

    @Override // xr.k1, xr.ue
    public void setMessageCompression(boolean z10) {
        ((a6) this).f92247a.setMessageCompression(z10);
    }

    @Override // xr.k1
    public void start(m1 m1Var) {
        ((a6) this).f92247a.start(m1Var);
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("delegate", ((a6) this).f92247a).toString();
    }

    @Override // xr.k1, xr.ue
    public void writeMessage(InputStream inputStream) {
        ((a6) this).f92247a.writeMessage(inputStream);
    }
}
