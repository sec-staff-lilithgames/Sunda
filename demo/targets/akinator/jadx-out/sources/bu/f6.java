package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f6 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10304b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f10305c;

    public f6(mt.i0 i0Var) {
        this.f10304b = i0Var;
    }

    @Override // pt.c
    public void dispose() {
        this.f10305c.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10305c.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        mt.a0 a0VarCreateOnComplete = mt.a0.createOnComplete();
        mt.i0 i0Var = this.f10304b;
        i0Var.onNext(a0VarCreateOnComplete);
        i0Var.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        mt.a0 a0VarCreateOnError = mt.a0.createOnError(th2);
        mt.i0 i0Var = this.f10304b;
        i0Var.onNext(a0VarCreateOnError);
        i0Var.onComplete();
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10304b.onNext(mt.a0.createOnNext(obj));
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10305c, cVar)) {
            this.f10305c = cVar;
            this.f10304b.onSubscribe(this);
        }
    }
}
