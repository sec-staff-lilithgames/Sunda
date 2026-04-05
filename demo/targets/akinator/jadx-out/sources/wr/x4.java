package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class x4 extends p {
    public abstract p a();

    @Override // wr.p
    public void cancel(String str, Throwable th2) {
        a().cancel(str, th2);
    }

    @Override // wr.p
    public c getAttributes() {
        return a().getAttributes();
    }

    @Override // wr.p
    public void halfClose() {
        a().halfClose();
    }

    @Override // wr.p
    public boolean isReady() {
        return a().isReady();
    }

    @Override // wr.p
    public void request(int i10) {
        a().request(i10);
    }

    @Override // wr.p
    public void setMessageCompression(boolean z10) {
        a().setMessageCompression(z10);
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("delegate", a()).toString();
    }
}
