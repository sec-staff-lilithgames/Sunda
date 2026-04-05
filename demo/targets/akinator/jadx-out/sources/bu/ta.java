package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ta implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11051b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11052c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f11053e;

    /* renamed from: f, reason: collision with root package name */
    public long f11054f;

    public ta(mt.i0 i0Var, long j10) {
        this.f11051b = i0Var;
        this.f11054f = j10;
    }

    @Override // pt.c
    public void dispose() {
        this.f11053e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11053e.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f11052c) {
            return;
        }
        this.f11052c = true;
        this.f11053e.dispose();
        this.f11051b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f11052c) {
            mu.a.onError(th2);
            return;
        }
        this.f11052c = true;
        this.f11053e.dispose();
        this.f11051b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f11052c) {
            return;
        }
        long j10 = this.f11054f;
        long j11 = j10 - 1;
        this.f11054f = j11;
        if (j10 > 0) {
            boolean z10 = j11 == 0;
            this.f11051b.onNext(obj);
            if (z10) {
                onComplete();
            }
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11053e, cVar)) {
            this.f11053e = cVar;
            long j10 = this.f11054f;
            mt.i0 i0Var = this.f11051b;
            if (j10 != 0) {
                i0Var.onSubscribe(this);
                return;
            }
            this.f11052c = true;
            cVar.dispose();
            tt.e.complete(i0Var);
        }
    }
}
