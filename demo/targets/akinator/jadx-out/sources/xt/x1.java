package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x1 extends wt.c implements mt.f {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f93537b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f93538c;

    public x1(mt.i0 i0Var) {
        this.f93537b = i0Var;
    }

    @Override // wt.c, vt.j, pt.c
    public void dispose() {
        this.f93538c.dispose();
    }

    @Override // wt.c, vt.j, pt.c
    public boolean isDisposed() {
        return this.f93538c.isDisposed();
    }

    @Override // wt.c, vt.j, vt.k, vt.o
    public boolean isEmpty() {
        return true;
    }

    @Override // mt.f
    public void onComplete() {
        this.f93537b.onComplete();
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        this.f93537b.onError(th2);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f93538c, cVar)) {
            this.f93538c = cVar;
            this.f93537b.onSubscribe(this);
        }
    }

    @Override // wt.c, vt.j, vt.k
    public int requestFusion(int i10) {
        return i10 & 2;
    }

    @Override // wt.c, vt.j, vt.k, vt.o
    public Void poll() throws Exception {
        return null;
    }

    @Override // wt.c, vt.j, vt.k, vt.o
    public void clear() {
    }
}
