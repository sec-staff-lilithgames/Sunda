package bu;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class jb extends a {

    /* renamed from: c, reason: collision with root package name */
    public final long f10474c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f10475e;

    /* renamed from: f, reason: collision with root package name */
    public final mt.m0 f10476f;

    public jb(mt.g0 g0Var, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        super(g0Var);
        this.f10474c = j10;
        this.f10475e = timeUnit;
        this.f10476f = m0Var;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new ib(new ku.m(i0Var), this.f10474c, this.f10475e, this.f10476f.createWorker()));
    }
}
