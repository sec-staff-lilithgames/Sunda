package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q extends AtomicReference implements mt.u, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98731b;

    public q(mt.v vVar) {
        this.f98731b = vVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // mt.u, pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.u
    public void onComplete() {
        pt.c cVar;
        Object obj = get();
        tt.d dVar = tt.d.f87352b;
        if (obj == dVar || (cVar = (pt.c) getAndSet(dVar)) == dVar) {
            return;
        }
        try {
            this.f98731b.onComplete();
        } finally {
            if (cVar != null) {
                cVar.dispose();
            }
        }
    }

    @Override // mt.u
    public void onError(Throwable th2) {
        if (tryOnError(th2)) {
            return;
        }
        mu.a.onError(th2);
    }

    @Override // mt.u
    public void onSuccess(Object obj) {
        pt.c cVar;
        Object obj2 = get();
        tt.d dVar = tt.d.f87352b;
        if (obj2 == dVar || (cVar = (pt.c) getAndSet(dVar)) == dVar) {
            return;
        }
        mt.v vVar = this.f98731b;
        try {
            if (obj == null) {
                vVar.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                vVar.onSuccess(obj);
            }
            if (cVar != null) {
                cVar.dispose();
            }
        } catch (Throwable th2) {
            if (cVar != null) {
                cVar.dispose();
            }
            throw th2;
        }
    }

    @Override // mt.u
    public void setCancellable(st.f fVar) {
        setDisposable(new tt.b(fVar));
    }

    @Override // mt.u
    public void setDisposable(pt.c cVar) {
        tt.d.set(this, cVar);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return e3.g.k(q.class.getSimpleName(), "{", super.toString(), "}");
    }

    @Override // mt.u
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
            this.f98731b.onError(th2);
        } finally {
            if (cVar != null) {
                cVar.dispose();
            }
        }
    }
}
