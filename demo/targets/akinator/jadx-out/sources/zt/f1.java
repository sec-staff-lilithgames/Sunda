package zt;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f1 extends wt.c implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f98592b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f98593c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f98594e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Iterator f98595f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f98596g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f98597h;

    public f1(mt.i0 i0Var, st.o oVar) {
        this.f98592b = i0Var;
        this.f98593c = oVar;
    }

    @Override // wt.c, vt.j, vt.k, vt.o
    public void clear() {
        this.f98595f = null;
    }

    @Override // wt.c, vt.j, pt.c
    public void dispose() {
        this.f98596g = true;
        this.f98594e.dispose();
        this.f98594e = tt.d.f87352b;
    }

    @Override // wt.c, vt.j, pt.c
    public boolean isDisposed() {
        return this.f98596g;
    }

    @Override // wt.c, vt.j, vt.k, vt.o
    public boolean isEmpty() {
        return this.f98595f == null;
    }

    @Override // mt.v
    public void onComplete() {
        this.f98592b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98594e = tt.d.f87352b;
        this.f98592b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98594e, cVar)) {
            this.f98594e = cVar;
            this.f98592b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        mt.i0 i0Var = this.f98592b;
        try {
            Iterator it = ((Iterable) this.f98593c.apply(obj)).iterator();
            if (!it.hasNext()) {
                i0Var.onComplete();
                return;
            }
            this.f98595f = it;
            if (this.f98597h) {
                i0Var.onNext(null);
                i0Var.onComplete();
                return;
            }
            while (!this.f98596g) {
                try {
                    i0Var.onNext(it.next());
                    if (this.f98596g) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            i0Var.onComplete();
                            return;
                        }
                    } catch (Throwable th2) {
                        qt.d.throwIfFatal(th2);
                        i0Var.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    qt.d.throwIfFatal(th3);
                    i0Var.onError(th3);
                    return;
                }
            }
        } catch (Throwable th4) {
            qt.d.throwIfFatal(th4);
            i0Var.onError(th4);
        }
    }

    @Override // wt.c, vt.j, vt.k, vt.o
    public Object poll() throws Exception {
        Iterator it = this.f98595f;
        if (it == null) {
            return null;
        }
        Object objRequireNonNull = ut.o0.requireNonNull(it.next(), "The iterator returned a null value");
        if (!it.hasNext()) {
            this.f98595f = null;
        }
        return objRequireNonNull;
    }

    @Override // wt.c, vt.j, vt.k
    public int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        this.f98597h = true;
        return 2;
    }
}
