package bu;

import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z1 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final ku.m f11286b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11287c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f11288e;

    /* renamed from: f, reason: collision with root package name */
    public final m0.a f11289f;

    /* renamed from: g, reason: collision with root package name */
    public pt.c f11290g;

    /* renamed from: h, reason: collision with root package name */
    public y1 f11291h;

    /* renamed from: i, reason: collision with root package name */
    public volatile long f11292i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11293j;

    public z1(ku.m mVar, long j10, TimeUnit timeUnit, m0.a aVar) {
        this.f11286b = mVar;
        this.f11287c = j10;
        this.f11288e = timeUnit;
        this.f11289f = aVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f11290g.dispose();
        this.f11289f.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11289f.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f11293j) {
            return;
        }
        this.f11293j = true;
        y1 y1Var = this.f11291h;
        if (y1Var != null) {
            y1Var.dispose();
        }
        if (y1Var != null) {
            y1Var.run();
        }
        this.f11286b.onComplete();
        this.f11289f.dispose();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f11293j) {
            mu.a.onError(th2);
            return;
        }
        y1 y1Var = this.f11291h;
        if (y1Var != null) {
            y1Var.dispose();
        }
        this.f11293j = true;
        this.f11286b.onError(th2);
        this.f11289f.dispose();
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f11293j) {
            return;
        }
        long j10 = this.f11292i + 1;
        this.f11292i = j10;
        y1 y1Var = this.f11291h;
        if (y1Var != null) {
            y1Var.dispose();
        }
        y1 y1Var2 = new y1(obj, j10, this);
        this.f11291h = y1Var2;
        y1Var2.setResource(this.f11289f.schedule(y1Var2, this.f11287c, this.f11288e));
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11290g, cVar)) {
            this.f11290g = cVar;
            this.f11286b.onSubscribe(this);
        }
    }
}
