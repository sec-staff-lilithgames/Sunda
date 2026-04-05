package wt;

import mt.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a implements i0, vt.j {

    /* renamed from: b, reason: collision with root package name */
    public final i0 f91239b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f91240c;

    /* renamed from: e, reason: collision with root package name */
    public vt.j f91241e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f91242f;

    /* renamed from: g, reason: collision with root package name */
    public int f91243g;

    public a(i0 i0Var) {
        this.f91239b = i0Var;
    }

    public final void a(Throwable th2) {
        qt.d.throwIfFatal(th2);
        this.f91240c.dispose();
        onError(th2);
    }

    public final int b(int i10) {
        vt.j jVar = this.f91241e;
        if (jVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = jVar.requestFusion(i10);
        if (iRequestFusion != 0) {
            this.f91243g = iRequestFusion;
        }
        return iRequestFusion;
    }

    public void clear() {
        this.f91241e.clear();
    }

    @Override // vt.j, pt.c
    public void dispose() {
        this.f91240c.dispose();
    }

    @Override // vt.j, pt.c
    public boolean isDisposed() {
        return this.f91240c.isDisposed();
    }

    @Override // vt.j, vt.k, vt.o
    public boolean isEmpty() {
        return this.f91241e.isEmpty();
    }

    @Override // vt.j, vt.k, vt.o
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f91242f) {
            return;
        }
        this.f91242f = true;
        this.f91239b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f91242f) {
            mu.a.onError(th2);
        } else {
            this.f91242f = true;
            this.f91239b.onError(th2);
        }
    }

    @Override // mt.i0
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // mt.i0, mt.f
    public final void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f91240c, cVar)) {
            this.f91240c = cVar;
            if (cVar instanceof vt.j) {
                this.f91241e = (vt.j) cVar;
            }
            this.f91239b.onSubscribe(this);
        }
    }

    public abstract /* synthetic */ Object poll() throws Exception;

    public abstract /* synthetic */ int requestFusion(int i10);

    @Override // vt.j, vt.k, vt.o
    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
