package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52712b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f52713c;

    public e(f fVar, mt.q0 q0Var) {
        this.f52713c = fVar;
        this.f52712b = q0Var;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52712b.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        this.f52712b.onSubscribe(cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        mt.q0 q0Var = this.f52712b;
        try {
            f fVar = this.f52713c;
            q0Var.onSuccess(Boolean.valueOf(((ut.n0) fVar.f52722e).test(obj, fVar.f52721c)));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            q0Var.onError(th2);
        }
    }
}
