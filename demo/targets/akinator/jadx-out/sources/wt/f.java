package wt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f extends e {
    @Override // wt.e, mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f91245b == null) {
            this.f91246c = th2;
        }
        countDown();
    }

    @Override // wt.e, mt.i0
    public void onNext(Object obj) {
        if (this.f91245b == null) {
            this.f91245b = obj;
            this.f91247e.dispose();
            countDown();
        }
    }
}
