package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class d2 extends y1 {
    public abstract void e();

    @Override // yt.y1, mt.n, mt.k
    public final void onNext(Object obj) {
        if (isCancelled()) {
            return;
        }
        if (obj == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else if (get() == 0) {
            e();
        } else {
            this.f96591b.onNext(obj);
            iu.e.produced(this, 1L);
        }
    }
}
