package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e0 implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public mt.v f98583b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f98584c;

    @Override // pt.c
    public void dispose() {
        this.f98583b = null;
        this.f98584c.dispose();
        this.f98584c = tt.d.f87352b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f98584c.isDisposed();
    }

    @Override // mt.v
    public void onComplete() {
        this.f98584c = tt.d.f87352b;
        mt.v vVar = this.f98583b;
        if (vVar != null) {
            this.f98583b = null;
            vVar.onComplete();
        }
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98584c = tt.d.f87352b;
        mt.v vVar = this.f98583b;
        if (vVar != null) {
            this.f98583b = null;
            vVar.onError(th2);
        }
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98584c, cVar)) {
            this.f98584c = cVar;
            this.f98583b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98584c = tt.d.f87352b;
        mt.v vVar = this.f98583b;
        if (vVar != null) {
            this.f98583b = null;
            vVar.onSuccess(obj);
        }
    }
}
