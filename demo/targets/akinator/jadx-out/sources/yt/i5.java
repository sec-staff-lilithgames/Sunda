package yt;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import yt.g5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i5 extends hu.a implements tw.b {

    /* renamed from: b, reason: collision with root package name */
    public final Object f95654b;

    /* renamed from: c, reason: collision with root package name */
    public final eu.d f95655c;

    /* renamed from: e, reason: collision with root package name */
    public final g5.a f95656e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f95657f;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f95659h;

    /* renamed from: i, reason: collision with root package name */
    public Throwable f95660i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f95664m;

    /* renamed from: n, reason: collision with root package name */
    public int f95665n;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicLong f95658g = new AtomicLong();

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f95661j = new AtomicBoolean();

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f95662k = new AtomicReference();

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f95663l = new AtomicBoolean();

    public i5(Object obj, int i10, g5.a aVar, boolean z10) {
        this.f95655c = new eu.d(i10);
        this.f95656e = aVar;
        this.f95654b = obj;
        this.f95657f = z10;
    }

    public final boolean a(boolean z10, boolean z11, tw.c cVar, boolean z12, long j10) {
        boolean z13 = this.f95661j.get();
        eu.d dVar = this.f95655c;
        if (z13) {
            while (dVar.poll() != null) {
                j10++;
            }
            if (j10 != 0) {
                this.f95656e.f95530k.request(j10);
            }
            return true;
        }
        if (!z10) {
            return false;
        }
        if (z12) {
            if (!z11) {
                return false;
            }
            Throwable th2 = this.f95660i;
            if (th2 != null) {
                cVar.onError(th2);
                return true;
            }
            cVar.onComplete();
            return true;
        }
        Throwable th3 = this.f95660i;
        if (th3 != null) {
            dVar.clear();
            cVar.onError(th3);
            return true;
        }
        if (!z11) {
            return false;
        }
        cVar.onComplete();
        return true;
    }

    public final void b() {
        int i10 = this.f95665n;
        if (i10 != 0) {
            this.f95665n = 0;
            this.f95656e.f95530k.request(i10);
        }
    }

    @Override // hu.a, vt.l, tw.d
    public void cancel() {
        if (this.f95661j.compareAndSet(false, true)) {
            this.f95656e.cancel(this.f95654b);
            drain();
        }
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public void clear() {
        while (this.f95655c.poll() != null) {
            this.f95665n++;
        }
        b();
    }

    public final void drain() {
        Throwable th2;
        if (getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        if (this.f95664m) {
            eu.d dVar = this.f95655c;
            tw.c cVar = (tw.c) this.f95662k.get();
            while (true) {
                if (cVar != null) {
                    if (this.f95661j.get()) {
                        return;
                    }
                    boolean z10 = this.f95659h;
                    if (z10 && !this.f95657f && (th2 = this.f95660i) != null) {
                        dVar.clear();
                        cVar.onError(th2);
                        return;
                    }
                    cVar.onNext(null);
                    if (z10) {
                        Throwable th3 = this.f95660i;
                        if (th3 != null) {
                            cVar.onError(th3);
                            return;
                        } else {
                            cVar.onComplete();
                            return;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (cVar == null) {
                    cVar = (tw.c) this.f95662k.get();
                }
            }
        } else {
            eu.d dVar2 = this.f95655c;
            boolean z11 = this.f95657f;
            tw.c cVar2 = (tw.c) this.f95662k.get();
            int iAddAndGet2 = 1;
            while (true) {
                if (cVar2 != null) {
                    long j10 = this.f95658g.get();
                    long j11 = 0;
                    while (j11 != j10) {
                        boolean z12 = this.f95659h;
                        Object objPoll = dVar2.poll();
                        boolean z13 = objPoll == null;
                        if (a(z12, z13, cVar2, z11, j11)) {
                            return;
                        }
                        if (z13) {
                            break;
                        }
                        cVar2.onNext(objPoll);
                        j11++;
                    }
                    if (j11 == j10 && a(this.f95659h, dVar2.isEmpty(), cVar2, z11, j11)) {
                        return;
                    }
                    if (j11 != 0) {
                        if (j10 != Long.MAX_VALUE) {
                            this.f95658g.addAndGet(-j11);
                        }
                        this.f95656e.f95530k.request(j11);
                    }
                }
                iAddAndGet2 = addAndGet(-iAddAndGet2);
                if (iAddAndGet2 == 0) {
                    return;
                }
                if (cVar2 == null) {
                    cVar2 = (tw.c) this.f95662k.get();
                }
            }
        }
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public boolean isEmpty() {
        if (!this.f95655c.isEmpty()) {
            return false;
        }
        b();
        return true;
    }

    public void onComplete() {
        this.f95659h = true;
        drain();
    }

    public void onError(Throwable th2) {
        this.f95660i = th2;
        this.f95659h = true;
        drain();
    }

    public void onNext(Object obj) {
        this.f95655c.offer(obj);
        drain();
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public Object poll() {
        Object objPoll = this.f95655c.poll();
        if (objPoll != null) {
            this.f95665n++;
            return objPoll;
        }
        b();
        return null;
    }

    @Override // hu.a, vt.l, tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f95658g, j10);
            drain();
        }
    }

    @Override // hu.a, vt.l, vt.k
    public int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        this.f95664m = true;
        return 2;
    }

    @Override // tw.b
    public void subscribe(tw.c cVar) {
        if (!this.f95663l.compareAndSet(false, true)) {
            hu.d.error(new IllegalStateException("Only one Subscriber allowed!"), cVar);
            return;
        }
        cVar.onSubscribe(this);
        this.f95662k.lazySet(cVar);
        drain();
    }
}
