package es;

import java.util.List;
import wr.a3;
import wr.b3;
import wr.f1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t extends d {

    /* renamed from: a, reason: collision with root package name */
    public final l f55101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f55102b;

    public t(k0 k0Var, b3.c cVar) {
        this.f55102b = k0Var;
        this.f55101a = new l(cVar);
    }

    @Override // es.d
    public final b3.c a() {
        return this.f55101a;
    }

    @Override // es.d, wr.b3.c
    public b3.e createSubchannel(a3 a3Var) {
        k0 k0Var = this.f55102b;
        s sVar = k0Var.f55059f;
        h0 h0Var = new h0(k0Var, a3Var, this.f55101a);
        List<f1> addresses = a3Var.getAddresses();
        if (k0.a(addresses) && sVar.containsKey(addresses.get(0).getAddresses().get(0))) {
            r rVar = (r) sVar.get(addresses.get(0).getAddresses().get(0));
            rVar.a(h0Var);
            if (rVar.f55097d != null) {
                h0Var.a();
            }
        }
        return h0Var;
    }

    @Override // es.d, wr.b3.c
    public void updateBalancingState(wr.f0 f0Var, b3.f fVar) {
        this.f55101a.updateBalancingState(f0Var, new f0(fVar));
    }
}
