package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b1 extends AtomicReference implements mt.v, mt.f, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f98540b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f98541c;

    public b1(mt.f fVar, st.o oVar) {
        this.f98540b = fVar;
        this.f98541c = oVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.v
    public void onComplete() {
        this.f98540b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98540b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        try {
            mt.i iVar = (mt.i) ut.o0.requireNonNull(this.f98541c.apply(obj), "The mapper returned a null CompletableSource");
            if (isDisposed()) {
                return;
            }
            iVar.subscribe(this);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            onError(th2);
        }
    }
}
