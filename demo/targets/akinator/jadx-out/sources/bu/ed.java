package bu;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ed extends a {

    /* renamed from: c, reason: collision with root package name */
    public final long f10281c;

    /* renamed from: e, reason: collision with root package name */
    public final long f10282e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f10283f;

    /* renamed from: g, reason: collision with root package name */
    public final mt.m0 f10284g;

    /* renamed from: h, reason: collision with root package name */
    public final long f10285h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10286i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f10287j;

    public ed(mt.g0 g0Var, long j10, long j11, TimeUnit timeUnit, mt.m0 m0Var, long j12, int i10, boolean z10) {
        super(g0Var);
        this.f10281c = j10;
        this.f10282e = j11;
        this.f10283f = timeUnit;
        this.f10284g = m0Var;
        this.f10285h = j12;
        this.f10286i = i10;
        this.f10287j = z10;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        ku.m mVar = new ku.m(i0Var);
        long j10 = this.f10281c;
        long j11 = this.f10282e;
        mt.g0 g0Var = this.f10053b;
        if (j10 != j11) {
            g0Var.subscribe(new dd(mVar, j10, j11, this.f10283f, this.f10284g.createWorker(), this.f10286i));
            return;
        }
        long j12 = this.f10285h;
        if (j12 == Long.MAX_VALUE) {
            g0Var.subscribe(new ad(mVar, j10, this.f10283f, this.f10284g, this.f10286i));
        } else {
            g0Var.subscribe(new zc(mVar, j10, this.f10283f, this.f10284g, this.f10286i, j12, this.f10287j));
        }
    }
}
