package es;

import wr.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n extends d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f55070a;

    public n(o oVar) {
        this.f55070a = oVar;
    }

    @Override // es.d
    public final b3.c a() {
        return this.f55070a.f55084i.f55090g;
    }

    @Override // es.d, wr.b3.c
    public void updateBalancingState(wr.f0 f0Var, b3.f fVar) {
        o oVar = this.f55070a;
        q qVar = oVar.f55084i;
        if (qVar.f55089f.containsKey(oVar.f55076a)) {
            oVar.f55081f = f0Var;
            oVar.f55082g = fVar;
            if (oVar.f55083h || qVar.f55091h) {
                return;
            }
            if (f0Var == wr.f0.f90915f) {
                oVar.f55079d.requestConnection();
            }
            qVar.b();
        }
    }
}
