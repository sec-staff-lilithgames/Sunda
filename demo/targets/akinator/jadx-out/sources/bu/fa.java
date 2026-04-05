package bu;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class fa extends a {

    /* renamed from: c, reason: collision with root package name */
    public final long f10314c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f10315e;

    /* renamed from: f, reason: collision with root package name */
    public final mt.m0 f10316f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10317g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10318h;

    public fa(mt.g0 g0Var, long j10, TimeUnit timeUnit, mt.m0 m0Var, int i10, boolean z10) {
        super(g0Var);
        this.f10314c = j10;
        this.f10315e = timeUnit;
        this.f10316f = m0Var;
        this.f10317g = i10;
        this.f10318h = z10;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new ea(i0Var, this.f10314c, this.f10315e, this.f10316f, this.f10317g, this.f10318h));
    }
}
