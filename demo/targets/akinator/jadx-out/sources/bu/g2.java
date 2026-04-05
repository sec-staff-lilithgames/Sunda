package bu;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g2 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final long f10345c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f10346e;

    /* renamed from: f, reason: collision with root package name */
    public final mt.m0 f10347f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10348g;

    public g2(mt.g0 g0Var, long j10, TimeUnit timeUnit, mt.m0 m0Var, boolean z10) {
        super(g0Var);
        this.f10345c = j10;
        this.f10346e = timeUnit;
        this.f10347f = m0Var;
        this.f10348g = z10;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        mt.i0 mVar = this.f10348g ? i0Var : new ku.m(i0Var);
        this.f10053b.subscribe(new f2(mVar, this.f10345c, this.f10346e, this.f10347f.createWorker(), this.f10348g));
    }
}
