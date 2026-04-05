package du;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b1 extends wt.b implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f52676b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f52677c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f52678e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Iterator f52679f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f52680g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f52681h;

    public b1(mt.i0 i0Var, st.o oVar) {
        this.f52676b = i0Var;
        this.f52677c = oVar;
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public void clear() {
        this.f52679f = null;
    }

    @Override // wt.b, vt.j, pt.c
    public void dispose() {
        this.f52680g = true;
        this.f52678e.dispose();
        this.f52678e = tt.d.f87352b;
    }

    @Override // wt.b, vt.j, pt.c
    public boolean isDisposed() {
        return this.f52680g;
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public boolean isEmpty() {
        return this.f52679f == null;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52678e = tt.d.f87352b;
        this.f52676b.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f52678e, cVar)) {
            this.f52678e = cVar;
            this.f52676b.onSubscribe(this);
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        mt.i0 i0Var = this.f52676b;
        try {
            Iterator it = ((Iterable) this.f52677c.apply(obj)).iterator();
            if (!it.hasNext()) {
                i0Var.onComplete();
                return;
            }
            if (this.f52681h) {
                this.f52679f = it;
                i0Var.onNext(null);
                i0Var.onComplete();
                return;
            }
            while (!this.f52680g) {
                try {
                    i0Var.onNext(it.next());
                    if (this.f52680g) {
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
            this.f52676b.onError(th4);
        }
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public Object poll() throws Exception {
        Iterator it = this.f52679f;
        if (it == null) {
            return null;
        }
        Object objRequireNonNull = ut.o0.requireNonNull(it.next(), "The iterator returned a null value");
        if (!it.hasNext()) {
            this.f52679f = null;
        }
        return objRequireNonNull;
    }

    @Override // wt.b, vt.j, vt.k
    public int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        this.f52681h = true;
        return 2;
    }
}
