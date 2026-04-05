package es;

import mh.p1;
import wr.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g extends d {

    /* renamed from: a, reason: collision with root package name */
    public b3 f55031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f55032b;

    public g(i iVar) {
        this.f55032b = iVar;
    }

    @Override // es.d
    public final b3.c a() {
        return this.f55032b.f55044g;
    }

    @Override // es.d, wr.b3.c
    public void updateBalancingState(wr.f0 f0Var, b3.f fVar) {
        b3 b3Var = this.f55031a;
        i iVar = this.f55032b;
        b3 b3Var2 = iVar.f55048k;
        wr.f0 f0Var2 = wr.f0.f90913c;
        if (b3Var == b3Var2) {
            p1.checkState(iVar.f55051n, "there's pending lb while current lb has been out of READY");
            iVar.f55049l = f0Var;
            iVar.f55050m = fVar;
            if (f0Var == f0Var2) {
                iVar.b();
                return;
            }
            return;
        }
        if (b3Var == iVar.f55046i) {
            boolean z10 = f0Var == f0Var2;
            iVar.f55051n = z10;
            if (z10 || b3Var2 == iVar.f55043f) {
                iVar.f55044g.updateBalancingState(f0Var, fVar);
            } else {
                iVar.b();
            }
        }
    }
}
