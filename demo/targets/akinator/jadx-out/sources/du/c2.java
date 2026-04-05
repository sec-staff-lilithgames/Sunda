package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c2 implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52692b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d2 f52693c;

    public c2(d2 d2Var, mt.q0 q0Var) {
        this.f52693c = d2Var;
        this.f52692b = q0Var;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        Object objApply;
        d2 d2Var = this.f52693c;
        st.o oVar = d2Var.f52708c;
        mt.q0 q0Var = this.f52692b;
        if (oVar != null) {
            try {
                objApply = oVar.apply(th2);
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                q0Var.onError(new qt.c(th2, th3));
                return;
            }
        } else {
            objApply = d2Var.f52709e;
        }
        if (objApply != null) {
            q0Var.onSuccess(objApply);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
        nullPointerException.initCause(th2);
        q0Var.onError(nullPointerException);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        this.f52692b.onSubscribe(cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f52692b.onSuccess(obj);
    }
}
