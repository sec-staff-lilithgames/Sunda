package bu;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c9 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final long f10175c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f10176e;

    /* renamed from: f, reason: collision with root package name */
    public final mt.m0 f10177f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10178g;

    public c9(mt.g0 g0Var, long j10, TimeUnit timeUnit, mt.m0 m0Var, boolean z10) {
        super(g0Var);
        this.f10175c = j10;
        this.f10176e = timeUnit;
        this.f10177f = m0Var;
        this.f10178g = z10;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        ku.m mVar = new ku.m(i0Var);
        boolean z10 = this.f10178g;
        mt.g0 g0Var = this.f10053b;
        if (z10) {
            g0Var.subscribe(new z8(mVar, this.f10175c, this.f10176e, this.f10177f));
        } else {
            g0Var.subscribe(new a9(mVar, this.f10175c, this.f10176e, this.f10177f));
        }
    }
}
