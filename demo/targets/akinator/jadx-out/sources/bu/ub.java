package bu;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ub extends AtomicReference implements mt.i0, pt.c, wb {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11095b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11096c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f11097e;

    /* renamed from: f, reason: collision with root package name */
    public final m0.a f11098f;

    /* renamed from: g, reason: collision with root package name */
    public final tt.h f11099g = new tt.h();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicLong f11100h = new AtomicLong();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f11101i = new AtomicReference();

    /* renamed from: j, reason: collision with root package name */
    public mt.g0 f11102j;

    public ub(mt.i0 i0Var, long j10, TimeUnit timeUnit, m0.a aVar, mt.g0 g0Var) {
        this.f11095b = i0Var;
        this.f11096c = j10;
        this.f11097e = timeUnit;
        this.f11098f = aVar;
        this.f11102j = g0Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this.f11101i);
        tt.d.dispose(this);
        this.f11098f.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f11100h.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.f11099g.dispose();
            this.f11095b.onComplete();
            this.f11098f.dispose();
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f11100h.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            mu.a.onError(th2);
            return;
        }
        this.f11099g.dispose();
        this.f11095b.onError(th2);
        this.f11098f.dispose();
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        AtomicLong atomicLong = this.f11100h;
        long j10 = atomicLong.get();
        if (j10 != Long.MAX_VALUE) {
            long j11 = 1 + j10;
            if (atomicLong.compareAndSet(j10, j11)) {
                tt.h hVar = this.f11099g;
                ((pt.c) hVar.get()).dispose();
                this.f11095b.onNext(obj);
                hVar.replace(this.f11098f.schedule(new xb(j11, this), this.f11096c, this.f11097e));
            }
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f11101i, cVar);
    }

    @Override // bu.wb
    public void onTimeout(long j10) {
        if (this.f11100h.compareAndSet(j10, Long.MAX_VALUE)) {
            tt.d.dispose(this.f11101i);
            mt.g0 g0Var = this.f11102j;
            this.f11102j = null;
            g0Var.subscribe(new tb(this.f11095b, this));
            this.f11098f.dispose();
        }
    }
}
