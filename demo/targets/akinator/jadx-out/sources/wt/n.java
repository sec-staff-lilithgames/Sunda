package wt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n extends AtomicReference implements mt.f, pt.c, ku.k {
    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // ku.k
    public boolean hasCustomOnError() {
        return false;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == tt.d.f87352b;
    }

    @Override // mt.f
    public void onComplete() {
        lazySet(tt.d.f87352b);
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        lazySet(tt.d.f87352b);
        mu.a.onError(new qt.f(th2));
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
