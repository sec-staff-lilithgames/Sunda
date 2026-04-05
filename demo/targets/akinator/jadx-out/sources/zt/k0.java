package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k0 implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98668b;

    /* renamed from: c, reason: collision with root package name */
    public final st.b f98669c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f98670e;

    public k0(mt.v vVar, st.b bVar) {
        this.f98668b = vVar;
        this.f98669c = bVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f98670e.dispose();
        this.f98670e = tt.d.f87352b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f98670e.isDisposed();
    }

    @Override // mt.v
    public void onComplete() {
        mt.v vVar = this.f98668b;
        this.f98670e = tt.d.f87352b;
        try {
            this.f98669c.accept(null, null);
            vVar.onComplete();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            vVar.onError(th2);
        }
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98670e = tt.d.f87352b;
        try {
            this.f98669c.accept(null, th2);
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            th2 = new qt.c(th2, th3);
        }
        this.f98668b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98670e, cVar)) {
            this.f98670e = cVar;
            this.f98668b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        mt.v vVar = this.f98668b;
        this.f98670e = tt.d.f87352b;
        try {
            this.f98669c.accept(obj, null);
            vVar.onSuccess(obj);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            vVar.onError(th2);
        }
    }
}
