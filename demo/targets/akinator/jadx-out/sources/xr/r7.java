package xr;

import wr.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r7 extends c2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p.a f92960c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wr.m6 f92961e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(s7 s7Var, p.a aVar, wr.m6 m6Var) {
        super(s7Var.f92987e);
        this.f92960c = aVar;
        this.f92961e = m6Var;
    }

    @Override // xr.c2
    public void runInContext() {
        this.f92960c.onClose(this.f92961e, new wr.e4());
    }
}
