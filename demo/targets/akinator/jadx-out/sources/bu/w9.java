package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w9 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f11178b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f11179c;

    /* renamed from: e, reason: collision with root package name */
    public Object f11180e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11181f;

    public w9(mt.v vVar) {
        this.f11178b = vVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f11179c.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11179c.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f11181f) {
            return;
        }
        this.f11181f = true;
        Object obj = this.f11180e;
        this.f11180e = null;
        mt.v vVar = this.f11178b;
        if (obj == null) {
            vVar.onComplete();
        } else {
            vVar.onSuccess(obj);
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f11181f) {
            mu.a.onError(th2);
        } else {
            this.f11181f = true;
            this.f11178b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f11181f) {
            return;
        }
        if (this.f11180e == null) {
            this.f11180e = obj;
            return;
        }
        this.f11181f = true;
        this.f11179c.dispose();
        this.f11178b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11179c, cVar)) {
            this.f11179c = cVar;
            this.f11178b.onSubscribe(this);
        }
    }
}
