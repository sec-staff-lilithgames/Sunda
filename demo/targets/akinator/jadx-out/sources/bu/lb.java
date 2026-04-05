package bu;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class lb extends a {

    /* renamed from: c, reason: collision with root package name */
    public final long f10609c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f10610e;

    /* renamed from: f, reason: collision with root package name */
    public final mt.m0 f10611f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10612g;

    public lb(mt.b0 b0Var, long j10, TimeUnit timeUnit, mt.m0 m0Var, boolean z10) {
        super(b0Var);
        this.f10609c = j10;
        this.f10610e = timeUnit;
        this.f10611f = m0Var;
        this.f10612g = z10;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new kb(i0Var, this.f10609c, this.f10610e, this.f10611f.createWorker(), this.f10612g));
    }
}
