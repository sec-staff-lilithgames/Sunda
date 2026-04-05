package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j0 implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52754b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0 f52755c;

    public j0(k0 k0Var, mt.q0 q0Var) {
        this.f52755c = k0Var;
        this.f52754b = q0Var;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        try {
            this.f52755c.f52765c.accept(null, th2);
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            th2 = new qt.c(th2, th3);
        }
        this.f52754b.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        this.f52754b.onSubscribe(cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        mt.q0 q0Var = this.f52754b;
        try {
            this.f52755c.f52765c.accept(obj, null);
            q0Var.onSuccess(obj);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            q0Var.onError(th2);
        }
    }
}
