package bu;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class kb extends AtomicInteger implements mt.i0, pt.c, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10532b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10533c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f10534e;

    /* renamed from: f, reason: collision with root package name */
    public final m0.a f10535f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10536g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f10537h = new AtomicReference();

    /* renamed from: i, reason: collision with root package name */
    public pt.c f10538i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f10539j;

    /* renamed from: k, reason: collision with root package name */
    public Throwable f10540k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f10541l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f10542m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10543n;

    public kb(mt.i0 i0Var, long j10, TimeUnit timeUnit, m0.a aVar, boolean z10) {
        this.f10532b = i0Var;
        this.f10533c = j10;
        this.f10534e = timeUnit;
        this.f10535f = aVar;
        this.f10536g = z10;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference = this.f10537h;
        mt.i0 i0Var = this.f10532b;
        int iAddAndGet = 1;
        while (!this.f10541l) {
            boolean z10 = this.f10539j;
            if (z10 && this.f10540k != null) {
                atomicReference.lazySet(null);
                i0Var.onError(this.f10540k);
                this.f10535f.dispose();
                return;
            }
            boolean z11 = atomicReference.get() == null;
            if (z10) {
                Object andSet = atomicReference.getAndSet(null);
                if (!z11 && this.f10536g) {
                    i0Var.onNext(andSet);
                }
                i0Var.onComplete();
                this.f10535f.dispose();
                return;
            }
            if (z11) {
                if (this.f10542m) {
                    this.f10543n = false;
                    this.f10542m = false;
                }
            } else if (!this.f10543n || this.f10542m) {
                i0Var.onNext(atomicReference.getAndSet(null));
                this.f10542m = false;
                this.f10543n = true;
                this.f10535f.schedule(this, this.f10533c, this.f10534e);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        atomicReference.lazySet(null);
    }

    @Override // pt.c
    public void dispose() {
        this.f10541l = true;
        this.f10538i.dispose();
        this.f10535f.dispose();
        if (getAndIncrement() == 0) {
            this.f10537h.lazySet(null);
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10541l;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10539j = true;
        a();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10540k = th2;
        this.f10539j = true;
        a();
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10537h.set(obj);
        a();
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10538i, cVar)) {
            this.f10538i = cVar;
            this.f10532b.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f10542m = true;
        a();
    }
}
