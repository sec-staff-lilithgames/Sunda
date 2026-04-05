package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s2 extends wt.a {

    /* renamed from: h, reason: collision with root package name */
    public final st.g f10944h;

    public s2(mt.i0 i0Var, st.g gVar) {
        super(i0Var);
        this.f10944h = gVar;
    }

    @Override // wt.a, mt.i0
    public void onNext(Object obj) {
        this.f91239b.onNext(obj);
        if (this.f91243g == 0) {
            try {
                this.f10944h.accept(obj);
            } catch (Throwable th2) {
                a(th2);
            }
        }
    }

    @Override // wt.a, vt.j, vt.k, vt.o
    public Object poll() throws Exception {
        Object objPoll = this.f91241e.poll();
        if (objPoll != null) {
            this.f10944h.accept(objPoll);
        }
        return objPoll;
    }

    @Override // wt.a, vt.j, vt.k
    public int requestFusion(int i10) {
        return b(i10);
    }
}
