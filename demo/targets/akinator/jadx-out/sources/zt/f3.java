package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f3 implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98600b;

    /* renamed from: c, reason: collision with root package name */
    public final g3 f98601c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f98602e;

    public f3(mt.v vVar, g3 g3Var) {
        this.f98600b = vVar;
        this.f98601c = g3Var;
    }

    public final void a() {
        try {
            this.f98601c.f98623h.run();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
        }
    }

    public final void b(Throwable th2) {
        try {
            this.f98601c.f98621f.accept(th2);
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            th2 = new qt.c(th2, th3);
        }
        this.f98602e = tt.d.f87352b;
        this.f98600b.onError(th2);
        a();
    }

    @Override // pt.c
    public void dispose() {
        try {
            this.f98601c.f98624i.run();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
        }
        this.f98602e.dispose();
        this.f98602e = tt.d.f87352b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f98602e.isDisposed();
    }

    @Override // mt.v
    public void onComplete() {
        pt.c cVar = this.f98602e;
        tt.d dVar = tt.d.f87352b;
        if (cVar == dVar) {
            return;
        }
        try {
            this.f98601c.f98622g.run();
            this.f98602e = dVar;
            this.f98600b.onComplete();
            a();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            b(th2);
        }
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        if (this.f98602e == tt.d.f87352b) {
            mu.a.onError(th2);
        } else {
            b(th2);
        }
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        mt.v vVar = this.f98600b;
        if (tt.d.validate(this.f98602e, cVar)) {
            try {
                this.f98601c.f98619c.accept(cVar);
                this.f98602e = cVar;
                vVar.onSubscribe(this);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                cVar.dispose();
                this.f98602e = tt.d.f87352b;
                tt.e.error(th2, vVar);
            }
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        pt.c cVar = this.f98602e;
        tt.d dVar = tt.d.f87352b;
        if (cVar == dVar) {
            return;
        }
        try {
            this.f98601c.f98620e.accept(obj);
            this.f98602e = dVar;
            this.f98600b.onSuccess(obj);
            a();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            b(th2);
        }
    }
}
