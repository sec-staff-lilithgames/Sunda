package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class sb extends a {

    /* renamed from: c, reason: collision with root package name */
    public final mt.g0 f10980c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f10981e;

    /* renamed from: f, reason: collision with root package name */
    public final mt.g0 f10982f;

    public sb(mt.b0 b0Var, mt.g0 g0Var, st.o oVar, mt.g0 g0Var2) {
        super(b0Var);
        this.f10980c = g0Var;
        this.f10981e = oVar;
        this.f10982f = g0Var2;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        mt.g0 g0Var = this.f10053b;
        mt.g0 g0Var2 = this.f10980c;
        st.o oVar = this.f10981e;
        mt.g0 g0Var3 = this.f10982f;
        if (g0Var3 == null) {
            qb qbVar = new qb(i0Var, oVar);
            i0Var.onSubscribe(qbVar);
            if (g0Var2 != null) {
                ob obVar = new ob(0L, qbVar);
                if (qbVar.f10871e.replace(obVar)) {
                    g0Var2.subscribe(obVar);
                }
            }
            g0Var.subscribe(qbVar);
            return;
        }
        pb pbVar = new pb(g0Var3, i0Var, oVar);
        i0Var.onSubscribe(pbVar);
        if (g0Var2 != null) {
            ob obVar2 = new ob(0L, pbVar);
            if (pbVar.f10811e.replace(obVar2)) {
                g0Var2.subscribe(obVar2);
            }
        }
        g0Var.subscribe(pbVar);
    }
}
