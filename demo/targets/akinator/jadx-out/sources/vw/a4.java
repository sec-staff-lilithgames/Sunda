package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class a4 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final c3 f89685a;

    public a4(i0 i0Var) {
        c3 c3Var = new c3();
        this.f89685a = c3Var;
        uw.k kVar = (uw.k) i0Var.getAnnotation(uw.k.class);
        if (kVar != null) {
            c3Var.set(kVar);
            c3Var.add(kVar);
        }
        uw.l lVar = (uw.l) i0Var.getAnnotation(uw.l.class);
        if (lVar != null) {
            for (uw.k kVar2 : lVar.value()) {
                c3Var.add(kVar2);
            }
        }
    }

    @Override // vw.q0
    public void decorate(yw.h0 h0Var) {
        this.f89685a.decorate(h0Var);
    }

    @Override // vw.q0
    public void decorate(yw.h0 h0Var, q0 q0Var) {
        this.f89685a.decorate(h0Var, q0Var);
    }
}
