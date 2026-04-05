package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b6 extends wt.a {

    /* renamed from: h, reason: collision with root package name */
    public final st.o f10119h;

    public b6(mt.i0 i0Var, st.o oVar) {
        super(i0Var);
        this.f10119h = oVar;
    }

    @Override // wt.a, mt.i0
    public void onNext(Object obj) {
        if (this.f91242f) {
            return;
        }
        int i10 = this.f91243g;
        mt.i0 i0Var = this.f91239b;
        if (i10 != 0) {
            i0Var.onNext(null);
            return;
        }
        try {
            i0Var.onNext(ut.o0.requireNonNull(this.f10119h.apply(obj), "The mapper function returned a null value."));
        } catch (Throwable th2) {
            a(th2);
        }
    }

    @Override // wt.a, vt.j, vt.k, vt.o
    public Object poll() throws Exception {
        Object objPoll = this.f91241e.poll();
        if (objPoll != null) {
            return ut.o0.requireNonNull(this.f10119h.apply(objPoll), "The mapper function returned a null value.");
        }
        return null;
    }

    @Override // wt.a, vt.j, vt.k
    public int requestFusion(int i10) {
        return b(i10);
    }
}
