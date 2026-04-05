package du;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j2 extends AtomicReference implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final i2 f52761b;

    public j2(i2 i2Var) {
        this.f52761b = i2Var;
    }

    public void dispose() {
        hu.g.cancel(this);
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        Object obj = get();
        hu.g gVar = hu.g.f59176b;
        if (obj != gVar) {
            lazySet(gVar);
            this.f52761b.a(new CancellationException());
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f52761b.a(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (hu.g.cancel(this)) {
            this.f52761b.a(new CancellationException());
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.setOnce(this, dVar, Long.MAX_VALUE);
    }
}
