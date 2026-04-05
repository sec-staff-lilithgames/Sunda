package wt;

import mt.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m implements i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final i0 f91261b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f91262c;

    /* renamed from: e, reason: collision with root package name */
    public final st.a f91263e;

    /* renamed from: f, reason: collision with root package name */
    public pt.c f91264f;

    public m(i0 i0Var, st.g gVar, st.a aVar) {
        this.f91261b = i0Var;
        this.f91262c = gVar;
        this.f91263e = aVar;
    }

    @Override // pt.c
    public void dispose() {
        pt.c cVar = this.f91264f;
        tt.d dVar = tt.d.f87352b;
        if (cVar != dVar) {
            this.f91264f = dVar;
            try {
                this.f91263e.run();
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                mu.a.onError(th2);
            }
            cVar.dispose();
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f91264f.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        pt.c cVar = this.f91264f;
        tt.d dVar = tt.d.f87352b;
        if (cVar != dVar) {
            this.f91264f = dVar;
            this.f91261b.onComplete();
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        pt.c cVar = this.f91264f;
        tt.d dVar = tt.d.f87352b;
        if (cVar == dVar) {
            mu.a.onError(th2);
        } else {
            this.f91264f = dVar;
            this.f91261b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f91261b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        i0 i0Var = this.f91261b;
        try {
            this.f91262c.accept(cVar);
            if (tt.d.validate(this.f91264f, cVar)) {
                this.f91264f = cVar;
                i0Var.onSubscribe(this);
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            cVar.dispose();
            this.f91264f = tt.d.f87352b;
            tt.e.error(th2, i0Var);
        }
    }
}
