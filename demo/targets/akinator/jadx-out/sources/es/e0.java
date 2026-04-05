package es;

import wr.e4;
import wr.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e0 extends u.a {

    /* renamed from: a, reason: collision with root package name */
    public final r f55027a;

    /* renamed from: b, reason: collision with root package name */
    public final u.a f55028b;

    public e0(r rVar, u.a aVar) {
        this.f55027a = rVar;
        this.f55028b = aVar;
    }

    @Override // wr.u.a
    public wr.u newClientStreamTracer(wr.w wVar, e4 e4Var) {
        u.a aVar = this.f55028b;
        return aVar != null ? new c0(this, aVar.newClientStreamTracer(wVar, e4Var)) : new d0(this);
    }
}
