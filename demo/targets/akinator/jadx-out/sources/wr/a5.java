package wr;

import wr.k5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class a5 extends k5.a {
    public abstract k5.a a();

    @Override // wr.k5.a
    public void onCancel() {
        a().onCancel();
    }

    @Override // wr.k5.a
    public void onComplete() {
        a().onComplete();
    }

    @Override // wr.k5.a
    public void onHalfClose() {
        a().onHalfClose();
    }

    @Override // wr.k5.a
    public void onReady() {
        a().onReady();
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("delegate", a()).toString();
    }
}
