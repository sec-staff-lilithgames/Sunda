package wr;

import wr.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class y4 extends p.a {
    public abstract p.a a();

    @Override // wr.p.a
    public void onClose(m6 m6Var, e4 e4Var) {
        a().onClose(m6Var, e4Var);
    }

    @Override // wr.p.a
    public void onHeaders(e4 e4Var) {
        a().onHeaders(e4Var);
    }

    @Override // wr.p.a
    public void onReady() {
        a().onReady();
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("delegate", a()).toString();
    }
}
