package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s1 extends AtomicReference implements mt.d0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10943b;

    public s1(mt.i0 i0Var) {
        this.f10943b = i0Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // mt.d0, pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.d0, mt.k
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        try {
            this.f10943b.onComplete();
        } finally {
            dispose();
        }
    }

    @Override // mt.d0, mt.k
    public void onError(Throwable th2) {
        if (tryOnError(th2)) {
            return;
        }
        mu.a.onError(th2);
    }

    @Override // mt.d0, mt.k
    public void onNext(Object obj) {
        if (obj == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            if (isDisposed()) {
                return;
            }
            this.f10943b.onNext(obj);
        }
    }

    @Override // mt.d0
    public mt.d0 serialize() {
        return new t1(this);
    }

    @Override // mt.d0
    public void setCancellable(st.f fVar) {
        setDisposable(new tt.b(fVar));
    }

    @Override // mt.d0
    public void setDisposable(pt.c cVar) {
        tt.d.set(this, cVar);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return e3.g.k(s1.class.getSimpleName(), "{", super.toString(), "}");
    }

    @Override // mt.d0
    public boolean tryOnError(Throwable th2) {
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (isDisposed()) {
            return false;
        }
        try {
            this.f10943b.onError(th2);
            dispose();
            return true;
        } catch (Throwable th3) {
            dispose();
            throw th3;
        }
    }
}
