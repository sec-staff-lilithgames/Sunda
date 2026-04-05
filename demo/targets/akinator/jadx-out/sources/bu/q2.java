package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q2 extends wt.a {

    /* renamed from: h, reason: collision with root package name */
    public final st.o f10836h;

    /* renamed from: i, reason: collision with root package name */
    public final st.d f10837i;

    /* renamed from: j, reason: collision with root package name */
    public Object f10838j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10839k;

    public q2(mt.i0 i0Var, st.o oVar, st.d dVar) {
        super(i0Var);
        this.f10836h = oVar;
        this.f10837i = dVar;
    }

    @Override // wt.a, mt.i0
    public void onNext(Object obj) {
        if (this.f91242f) {
            return;
        }
        int i10 = this.f91243g;
        mt.i0 i0Var = this.f91239b;
        if (i10 != 0) {
            i0Var.onNext(obj);
            return;
        }
        try {
            Object objApply = this.f10836h.apply(obj);
            if (this.f10839k) {
                boolean zTest = ((ut.n0) this.f10837i).test(this.f10838j, objApply);
                this.f10838j = objApply;
                if (zTest) {
                    return;
                }
            } else {
                this.f10839k = true;
                this.f10838j = objApply;
            }
            i0Var.onNext(obj);
        } catch (Throwable th2) {
            a(th2);
        }
    }

    @Override // wt.a, vt.j, vt.k, vt.o
    public Object poll() throws Exception {
        while (true) {
            Object objPoll = this.f91241e.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.f10836h.apply(objPoll);
            if (!this.f10839k) {
                this.f10839k = true;
                this.f10838j = objApply;
                return objPoll;
            }
            if (!((ut.n0) this.f10837i).test(this.f10838j, objApply)) {
                this.f10838j = objApply;
                return objPoll;
            }
            this.f10838j = objApply;
        }
    }

    @Override // wt.a, vt.j, vt.k
    public int requestFusion(int i10) {
        return b(i10);
    }
}
