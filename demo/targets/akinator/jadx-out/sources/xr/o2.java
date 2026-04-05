package xr;

import wr.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o2 extends c2 {

    /* renamed from: c, reason: collision with root package name */
    public final p.a f92840c;

    /* renamed from: e, reason: collision with root package name */
    public final wr.m6 f92841e;

    public o2(u2 u2Var, p.a aVar, wr.m6 m6Var) {
        super(u2Var.f93074c);
        this.f92840c = aVar;
        this.f92841e = m6Var;
    }

    @Override // xr.c2
    public void runInContext() {
        this.f92840c.onClose(this.f92841e, new wr.e4());
    }
}
