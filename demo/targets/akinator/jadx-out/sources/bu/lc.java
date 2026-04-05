package bu;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class lc extends AtomicBoolean implements mt.i0, pt.c, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10613b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10614c;

    /* renamed from: e, reason: collision with root package name */
    public final long f10615e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10616f;

    /* renamed from: h, reason: collision with root package name */
    public long f10618h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f10619i;

    /* renamed from: j, reason: collision with root package name */
    public long f10620j;

    /* renamed from: k, reason: collision with root package name */
    public pt.c f10621k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f10622l = new AtomicInteger();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f10617g = new ArrayDeque();

    public lc(mt.i0 i0Var, long j10, long j11, int i10) {
        this.f10613b = i0Var;
        this.f10614c = j10;
        this.f10615e = j11;
        this.f10616f = i10;
    }

    @Override // pt.c
    public void dispose() {
        this.f10619i = true;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10619i;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        while (true) {
            ArrayDeque arrayDeque = this.f10617g;
            if (arrayDeque.isEmpty()) {
                this.f10613b.onComplete();
                return;
            }
            ((pu.h) arrayDeque.poll()).onComplete();
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        while (true) {
            ArrayDeque arrayDeque = this.f10617g;
            if (arrayDeque.isEmpty()) {
                this.f10613b.onError(th2);
                return;
            }
            ((pu.h) arrayDeque.poll()).onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        ArrayDeque arrayDeque = this.f10617g;
        long j10 = this.f10618h;
        long j11 = this.f10615e;
        if (j10 % j11 == 0 && !this.f10619i) {
            this.f10622l.getAndIncrement();
            pu.h hVarCreate = pu.h.create(this.f10616f, this);
            arrayDeque.offer(hVarCreate);
            this.f10613b.onNext(hVarCreate);
        }
        long j12 = this.f10620j + 1;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((pu.h) it.next()).onNext(obj);
        }
        if (j12 >= this.f10614c) {
            ((pu.h) arrayDeque.poll()).onComplete();
            if (arrayDeque.isEmpty() && this.f10619i) {
                this.f10621k.dispose();
                return;
            }
            this.f10620j = j12 - j11;
        } else {
            this.f10620j = j12;
        }
        this.f10618h = j10 + 1;
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10621k, cVar)) {
            this.f10621k = cVar;
            this.f10613b.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f10622l.decrementAndGet() == 0 && this.f10619i) {
            this.f10621k.dispose();
        }
    }
}
