package bu;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ea extends AtomicInteger implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10265b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10266c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f10267e;

    /* renamed from: f, reason: collision with root package name */
    public final mt.m0 f10268f;

    /* renamed from: g, reason: collision with root package name */
    public final eu.d f10269g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10270h;

    /* renamed from: i, reason: collision with root package name */
    public pt.c f10271i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f10272j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f10273k;

    /* renamed from: l, reason: collision with root package name */
    public Throwable f10274l;

    public ea(mt.i0 i0Var, long j10, TimeUnit timeUnit, mt.m0 m0Var, int i10, boolean z10) {
        this.f10265b = i0Var;
        this.f10266c = j10;
        this.f10267e = timeUnit;
        this.f10268f = m0Var;
        this.f10269g = new eu.d(i10);
        this.f10270h = z10;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        mt.i0 i0Var = this.f10265b;
        eu.d dVar = this.f10269g;
        boolean z10 = this.f10270h;
        TimeUnit timeUnit = this.f10267e;
        mt.m0 m0Var = this.f10268f;
        long j10 = this.f10266c;
        int iAddAndGet = 1;
        while (!this.f10272j) {
            boolean z11 = this.f10273k;
            Long l9 = (Long) dVar.peek();
            boolean z12 = l9 == null;
            long jNow = m0Var.now(timeUnit);
            if (!z12 && l9.longValue() > jNow - j10) {
                z12 = true;
            }
            if (z11) {
                if (!z10) {
                    Throwable th2 = this.f10274l;
                    if (th2 != null) {
                        this.f10269g.clear();
                        i0Var.onError(th2);
                        return;
                    } else if (z12) {
                        i0Var.onComplete();
                        return;
                    }
                } else if (z12) {
                    Throwable th3 = this.f10274l;
                    if (th3 != null) {
                        i0Var.onError(th3);
                        return;
                    } else {
                        i0Var.onComplete();
                        return;
                    }
                }
            }
            if (z12) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                dVar.poll();
                i0Var.onNext(dVar.poll());
            }
        }
        this.f10269g.clear();
    }

    @Override // pt.c
    public void dispose() {
        if (this.f10272j) {
            return;
        }
        this.f10272j = true;
        this.f10271i.dispose();
        if (getAndIncrement() == 0) {
            this.f10269g.clear();
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10272j;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10273k = true;
        a();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10274l = th2;
        this.f10273k = true;
        a();
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10269g.offer(Long.valueOf(this.f10268f.now(this.f10267e)), obj);
        a();
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10271i, cVar)) {
            this.f10271i = cVar;
            this.f10265b.onSubscribe(this);
        }
    }
}
