package bu;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ab extends a {

    /* renamed from: c, reason: collision with root package name */
    public final long f10085c;

    /* renamed from: e, reason: collision with root package name */
    public final long f10086e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f10087f;

    /* renamed from: g, reason: collision with root package name */
    public final mt.m0 f10088g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10089h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f10090i;

    public ab(mt.g0 g0Var, long j10, long j11, TimeUnit timeUnit, mt.m0 m0Var, int i10, boolean z10) {
        super(g0Var);
        this.f10085c = j10;
        this.f10086e = j11;
        this.f10087f = timeUnit;
        this.f10088g = m0Var;
        this.f10089h = i10;
        this.f10090i = z10;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new za(i0Var, this.f10085c, this.f10086e, this.f10087f, this.f10088g, this.f10089h, this.f10090i));
    }
}
