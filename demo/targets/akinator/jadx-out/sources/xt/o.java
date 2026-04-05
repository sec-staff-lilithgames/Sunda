package xt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o extends AtomicReference implements mt.e, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93467b;

    public o(mt.f fVar) {
        this.f93467b = fVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // mt.e, pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.e
    public void onComplete() {
        pt.c cVar;
        Object obj = get();
        tt.d dVar = tt.d.f87352b;
        if (obj == dVar || (cVar = (pt.c) getAndSet(dVar)) == dVar) {
            return;
        }
        try {
            this.f93467b.onComplete();
        } finally {
            if (cVar != null) {
                cVar.dispose();
            }
        }
    }

    @Override // mt.e
    public void onError(Throwable th2) {
        if (tryOnError(th2)) {
            return;
        }
        mu.a.onError(th2);
    }

    @Override // mt.e
    public void setCancellable(st.f fVar) {
        setDisposable(new tt.b(fVar));
    }

    @Override // mt.e
    public void setDisposable(pt.c cVar) {
        tt.d.set(this, cVar);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return e3.g.k(o.class.getSimpleName(), "{", super.toString(), "}");
    }

    @Override // mt.e
    public boolean tryOnError(Throwable th2) {
        pt.c cVar;
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        Object obj = get();
        tt.d dVar = tt.d.f87352b;
        if (obj == dVar || (cVar = (pt.c) getAndSet(dVar)) == dVar) {
            return false;
        }
        try {
            this.f93467b.onError(th2);
        } finally {
            if (cVar != null) {
                cVar.dispose();
            }
        }
    }
}
