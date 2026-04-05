package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class z4 extends k5 {
    public abstract k5 a();

    @Override // wr.k5
    public void close(m6 m6Var, e4 e4Var) {
        a().close(m6Var, e4Var);
    }

    @Override // wr.k5
    public c getAttributes() {
        return a().getAttributes();
    }

    @Override // wr.k5
    public String getAuthority() {
        return a().getAuthority();
    }

    @Override // wr.k5
    public h5 getSecurityLevel() {
        return a().getSecurityLevel();
    }

    @Override // wr.k5
    public boolean isCancelled() {
        return a().isCancelled();
    }

    @Override // wr.k5
    public boolean isReady() {
        return a().isReady();
    }

    @Override // wr.k5
    public void request(int i10) {
        a().request(i10);
    }

    @Override // wr.k5
    public void sendHeaders(e4 e4Var) {
        a().sendHeaders(e4Var);
    }

    @Override // wr.k5
    public void setCompression(String str) {
        a().setCompression(str);
    }

    @Override // wr.k5
    public void setMessageCompression(boolean z10) {
        a().setMessageCompression(z10);
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("delegate", a()).toString();
    }
}
