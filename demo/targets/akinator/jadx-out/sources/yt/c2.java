package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c2 extends y1 {
    @Override // yt.y1, mt.n, mt.k
    public void onNext(Object obj) {
        long j10;
        if (isCancelled()) {
            return;
        }
        if (obj == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        this.f96591b.onNext(obj);
        do {
            j10 = get();
            if (j10 == 0) {
                return;
            }
        } while (!compareAndSet(j10, j10 - 1));
    }
}
