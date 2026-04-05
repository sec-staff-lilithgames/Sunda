package xr;

import wr.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z0 extends c2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p.a f93275c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j1 f93276e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(j1 j1Var, p.a aVar) {
        super(j1Var.f92679f);
        this.f93276e = j1Var;
        this.f93275c = aVar;
    }

    @Override // xr.c2
    public void runInContext() {
        this.f93275c.onClose(wr.w0.statusFromCancelled(this.f93276e.f92679f), new wr.e4());
    }
}
