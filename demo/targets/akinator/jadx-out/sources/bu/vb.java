package bu;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class vb extends AtomicLong implements mt.i0, pt.c, wb {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11130b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11131c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f11132e;

    /* renamed from: f, reason: collision with root package name */
    public final m0.a f11133f;

    /* renamed from: g, reason: collision with root package name */
    public final tt.h f11134g = new tt.h();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f11135h = new AtomicReference();

    public vb(mt.i0 i0Var, long j10, TimeUnit timeUnit, m0.a aVar) {
        this.f11130b = i0Var;
        this.f11131c = j10;
        this.f11132e = timeUnit;
        this.f11133f = aVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this.f11135h);
        this.f11133f.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) this.f11135h.get());
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.f11134g.dispose();
            this.f11130b.onComplete();
            this.f11133f.dispose();
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            mu.a.onError(th2);
            return;
        }
        this.f11134g.dispose();
        this.f11130b.onError(th2);
        this.f11133f.dispose();
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        long j10 = get();
        if (j10 != Long.MAX_VALUE) {
            long j11 = 1 + j10;
            if (compareAndSet(j10, j11)) {
                tt.h hVar = this.f11134g;
                ((pt.c) hVar.get()).dispose();
                this.f11130b.onNext(obj);
                hVar.replace(this.f11133f.schedule(new xb(j11, this), this.f11131c, this.f11132e));
            }
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f11135h, cVar);
    }

    @Override // bu.wb
    public void onTimeout(long j10) {
        if (compareAndSet(j10, Long.MAX_VALUE)) {
            tt.d.dispose(this.f11135h);
            this.f11130b.onError(new TimeoutException(iu.m.timeoutMessage(this.f11131c, this.f11132e)));
            this.f11133f.dispose();
        }
    }
}
