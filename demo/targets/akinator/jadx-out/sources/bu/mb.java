package bu;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class mb implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10658b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f10659c;

    /* renamed from: e, reason: collision with root package name */
    public final mt.m0 f10660e;

    /* renamed from: f, reason: collision with root package name */
    public long f10661f;

    /* renamed from: g, reason: collision with root package name */
    public pt.c f10662g;

    public mb(mt.i0 i0Var, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f10658b = i0Var;
        this.f10660e = m0Var;
        this.f10659c = timeUnit;
    }

    @Override // pt.c
    public void dispose() {
        this.f10662g.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10662g.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10658b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10658b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        mt.m0 m0Var = this.f10660e;
        TimeUnit timeUnit = this.f10659c;
        long jNow = m0Var.now(timeUnit);
        long j10 = this.f10661f;
        this.f10661f = jNow;
        this.f10658b.onNext(new ou.k(obj, jNow - j10, timeUnit));
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10662g, cVar)) {
            this.f10662g = cVar;
            this.f10661f = this.f10660e.now(this.f10659c);
            this.f10658b.onSubscribe(this);
        }
    }
}
