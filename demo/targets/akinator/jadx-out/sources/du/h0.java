package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h0 implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52740b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f52741c;

    public h0(i0 i0Var, mt.q0 q0Var) {
        this.f52741c = i0Var;
        this.f52740b = q0Var;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        try {
            this.f52741c.f52748c.accept(th2);
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            th2 = new qt.c(th2, th3);
        }
        this.f52740b.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        this.f52740b.onSubscribe(cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f52740b.onSuccess(obj);
    }
}
