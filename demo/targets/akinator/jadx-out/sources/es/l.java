package es;

import mh.p1;
import wr.a3;
import wr.b3;
import wr.f3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l extends d {

    /* renamed from: a, reason: collision with root package name */
    public final b3.c f55067a;

    public l(b3.c cVar) {
        this.f55067a = (b3.c) p1.checkNotNull(cVar, "helper");
    }

    @Override // es.d
    public final b3.c a() {
        return this.f55067a;
    }

    @Override // es.d, wr.b3.c
    public b3.e createSubchannel(a3 a3Var) {
        f3 f3Var = (f3) a3Var.getOption(b3.f90829c);
        b3.e eVarCreateSubchannel = super.createSubchannel(a3Var);
        return (f3Var == null || eVarCreateSubchannel.getAttributes().get(b3.f90830d) != null) ? eVarCreateSubchannel : new k(eVarCreateSubchannel, f3Var);
    }
}
