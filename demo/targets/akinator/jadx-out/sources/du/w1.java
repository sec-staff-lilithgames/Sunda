package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w1 implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52866b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f52867c;

    public w1(mt.q0 q0Var, st.o oVar) {
        this.f52866b = q0Var;
        this.f52867c = oVar;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52866b.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        this.f52866b.onSubscribe(cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        try {
            this.f52866b.onSuccess(ut.o0.requireNonNull(this.f52867c.apply(obj), "The mapper function returned a null value."));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            onError(th2);
        }
    }
}
