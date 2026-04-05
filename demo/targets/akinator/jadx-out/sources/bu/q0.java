package bu;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q0 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final long f10826c;

    /* renamed from: e, reason: collision with root package name */
    public final long f10827e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f10828f;

    /* renamed from: g, reason: collision with root package name */
    public final mt.m0 f10829g;

    /* renamed from: h, reason: collision with root package name */
    public final Callable f10830h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10831i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f10832j;

    public q0(mt.g0 g0Var, long j10, long j11, TimeUnit timeUnit, mt.m0 m0Var, Callable<Collection<Object>> callable, int i10, boolean z10) {
        super(g0Var);
        this.f10826c = j10;
        this.f10827e = j11;
        this.f10828f = timeUnit;
        this.f10829g = m0Var;
        this.f10830h = callable;
        this.f10831i = i10;
        this.f10832j = z10;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        long j10 = this.f10826c;
        long j11 = this.f10827e;
        mt.g0 g0Var = this.f10053b;
        if (j10 == j11 && this.f10831i == Integer.MAX_VALUE) {
            g0Var.subscribe(new m0(new ku.m(i0Var), this.f10830h, this.f10826c, this.f10828f, this.f10829g));
            return;
        }
        m0.a aVarCreateWorker = this.f10829g.createWorker();
        if (j10 == j11) {
            g0Var.subscribe(new l0(new ku.m(i0Var), this.f10830h, this.f10826c, this.f10828f, this.f10831i, this.f10832j, aVarCreateWorker));
            return;
        }
        g0Var.subscribe(new p0(new ku.m(i0Var), this.f10830h, this.f10826c, this.f10827e, this.f10828f, aVarCreateWorker));
    }
}
