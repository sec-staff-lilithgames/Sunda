package fu;

import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g0 extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final m0 f56025b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f56026c;

    public g0(h0 h0Var, m0 m0Var) {
        this.f56026c = h0Var;
        this.f56025b = m0Var;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        n0 n0Var;
        m0 m0Var = this.f56025b;
        fVar.onSubscribe(m0Var);
        m0.a aVar = this.f56026c.f56029b;
        pt.c cVar = (pt.c) m0Var.get();
        if (cVar != o0.f56065i && cVar == (n0Var = o0.f56064h)) {
            pt.c cVarA = m0Var.a(aVar, fVar);
            if (m0Var.compareAndSet(n0Var, cVarA)) {
                return;
            }
            cVarA.dispose();
        }
    }
}
