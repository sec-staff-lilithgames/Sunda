package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h3 extends wt.a {

    /* renamed from: h, reason: collision with root package name */
    public final st.q f10378h;

    public h3(mt.i0 i0Var, st.q qVar) {
        super(i0Var);
        this.f10378h = qVar;
    }

    @Override // wt.a, mt.i0
    public void onNext(Object obj) {
        int i10 = this.f91243g;
        mt.i0 i0Var = this.f91239b;
        if (i10 != 0) {
            i0Var.onNext(null);
            return;
        }
        try {
            if (this.f10378h.test(obj)) {
                i0Var.onNext(obj);
            }
        } catch (Throwable th2) {
            a(th2);
        }
    }

    @Override // wt.a, vt.j, vt.k, vt.o
    public Object poll() throws Exception {
        Object objPoll;
        do {
            objPoll = this.f91241e.poll();
            if (objPoll == null) {
                break;
            }
        } while (!this.f10378h.test(objPoll));
        return objPoll;
    }

    @Override // wt.a, vt.j, vt.k
    public int requestFusion(int i10) {
        return b(i10);
    }
}
