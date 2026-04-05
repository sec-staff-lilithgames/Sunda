package xr;

import wr.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a1 extends c2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p.a f92228c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f92229e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(j1 j1Var, p.a aVar, String str) {
        super(j1Var.f92679f);
        this.f92228c = aVar;
        this.f92229e = str;
    }

    @Override // xr.c2
    public void runInContext() {
        this.f92228c.onClose(wr.m6.f91046n.withDescription("Unable to find compressor by name ".concat(this.f92229e)), new wr.e4());
    }
}
