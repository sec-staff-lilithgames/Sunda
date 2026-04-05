package gu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e extends c {
    @Override // gu.c, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f58422b = null;
        this.f58423c = th2;
        countDown();
    }

    @Override // gu.c, mt.q, tw.c
    public void onNext(Object obj) {
        this.f58422b = obj;
    }
}
