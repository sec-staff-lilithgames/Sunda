package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h1 implements mt.f, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93417b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f93418c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i1 f93419e;

    public h1(i1 i1Var, mt.f fVar) {
        this.f93419e = i1Var;
        this.f93417b = fVar;
    }

    @Override // pt.c
    public void dispose() {
        try {
            this.f93419e.f93439i.run();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
        }
        this.f93418c.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f93418c.isDisposed();
    }

    @Override // mt.f
    public void onComplete() {
        mt.f fVar = this.f93417b;
        i1 i1Var = this.f93419e;
        if (this.f93418c == tt.d.f87352b) {
            return;
        }
        try {
            i1Var.f93436f.run();
            i1Var.f93437g.run();
            fVar.onComplete();
            try {
                i1Var.f93438h.run();
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                mu.a.onError(th2);
            }
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            fVar.onError(th3);
        }
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        i1 i1Var = this.f93419e;
        if (this.f93418c == tt.d.f87352b) {
            mu.a.onError(th2);
            return;
        }
        try {
            i1Var.f93435e.accept(th2);
            i1Var.f93437g.run();
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            th2 = new qt.c(th2, th3);
        }
        this.f93417b.onError(th2);
        try {
            i1Var.f93438h.run();
        } catch (Throwable th4) {
            qt.d.throwIfFatal(th4);
            mu.a.onError(th4);
        }
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        mt.f fVar = this.f93417b;
        try {
            this.f93419e.f93434c.accept(cVar);
            if (tt.d.validate(this.f93418c, cVar)) {
                this.f93418c = cVar;
                fVar.onSubscribe(this);
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            cVar.dispose();
            this.f93418c = tt.d.f87352b;
            tt.e.error(th2, fVar);
        }
    }
}
