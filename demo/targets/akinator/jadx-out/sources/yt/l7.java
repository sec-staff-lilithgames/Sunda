package yt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l7 extends AtomicInteger implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95857b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f95858c = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final k7 f95859e = new k7(this);

    /* renamed from: f, reason: collision with root package name */
    public final iu.d f95860f = new iu.d();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicLong f95861g = new AtomicLong();

    /* renamed from: h, reason: collision with root package name */
    public final int f95862h;

    /* renamed from: i, reason: collision with root package name */
    public final int f95863i;

    /* renamed from: j, reason: collision with root package name */
    public volatile eu.c f95864j;

    /* renamed from: k, reason: collision with root package name */
    public Object f95865k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f95866l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f95867m;

    /* renamed from: n, reason: collision with root package name */
    public volatile int f95868n;

    /* renamed from: o, reason: collision with root package name */
    public long f95869o;

    /* renamed from: p, reason: collision with root package name */
    public int f95870p;

    public l7(tw.c cVar) {
        this.f95857b = cVar;
        int iBufferSize = mt.l.bufferSize();
        this.f95862h = iBufferSize;
        this.f95863i = iBufferSize - (iBufferSize >> 2);
    }

    public final void a() {
        tw.c cVar = this.f95857b;
        long j10 = this.f95869o;
        int i10 = this.f95870p;
        int i11 = this.f95863i;
        int i12 = 1;
        int iAddAndGet = 1;
        while (true) {
            long j11 = this.f95861g.get();
            while (j10 != j11) {
                if (this.f95866l) {
                    this.f95865k = null;
                    this.f95864j = null;
                    return;
                }
                if (this.f95860f.get() != null) {
                    this.f95865k = null;
                    this.f95864j = null;
                    cVar.onError(this.f95860f.terminate());
                    return;
                }
                int i13 = this.f95868n;
                if (i13 == i12) {
                    Object obj = this.f95865k;
                    this.f95865k = null;
                    this.f95868n = 2;
                    cVar.onNext(obj);
                    j10++;
                } else {
                    boolean z10 = this.f95867m;
                    eu.c cVar2 = this.f95864j;
                    Object objPoll = cVar2 != null ? cVar2.poll() : null;
                    boolean z11 = objPoll == null;
                    if (z10 && z11 && i13 == 2) {
                        this.f95864j = null;
                        cVar.onComplete();
                        return;
                    } else {
                        if (z11) {
                            break;
                        }
                        cVar.onNext(objPoll);
                        j10++;
                        i10++;
                        if (i10 == i11) {
                            ((tw.d) this.f95858c.get()).request(i11);
                            i10 = 0;
                        }
                        i12 = 1;
                    }
                }
            }
            if (j10 == j11) {
                if (this.f95866l) {
                    this.f95865k = null;
                    this.f95864j = null;
                    return;
                }
                if (this.f95860f.get() != null) {
                    this.f95865k = null;
                    this.f95864j = null;
                    cVar.onError(this.f95860f.terminate());
                    return;
                }
                boolean z12 = this.f95867m;
                eu.c cVar3 = this.f95864j;
                boolean z13 = cVar3 == null || cVar3.isEmpty();
                if (z12 && z13 && this.f95868n == 2) {
                    this.f95864j = null;
                    cVar.onComplete();
                    return;
                }
            }
            this.f95869o = j10;
            this.f95870p = i10;
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                i12 = 1;
            }
        }
    }

    @Override // tw.d
    public void cancel() {
        this.f95866l = true;
        hu.g.cancel(this.f95858c);
        tt.d.dispose(this.f95859e);
        if (getAndIncrement() == 0) {
            this.f95864j = null;
            this.f95865k = null;
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95867m = true;
        if (getAndIncrement() == 0) {
            a();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (!this.f95860f.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        tt.d.dispose(this.f95859e);
        if (getAndIncrement() == 0) {
            a();
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (compareAndSet(0, 1)) {
            long j10 = this.f95869o;
            if (this.f95861g.get() != j10) {
                eu.c cVar = this.f95864j;
                if (cVar == null || cVar.isEmpty()) {
                    this.f95869o = j10 + 1;
                    this.f95857b.onNext(obj);
                    int i10 = this.f95870p + 1;
                    if (i10 == this.f95863i) {
                        this.f95870p = 0;
                        ((tw.d) this.f95858c.get()).request(i10);
                    } else {
                        this.f95870p = i10;
                    }
                } else {
                    cVar.offer(obj);
                }
            } else {
                eu.c cVar2 = this.f95864j;
                if (cVar2 == null) {
                    cVar2 = new eu.c(mt.l.bufferSize());
                    this.f95864j = cVar2;
                }
                cVar2.offer(obj);
            }
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            eu.c cVar3 = this.f95864j;
            if (cVar3 == null) {
                cVar3 = new eu.c(mt.l.bufferSize());
                this.f95864j = cVar3;
            }
            cVar3.offer(obj);
            if (getAndIncrement() != 0) {
                return;
            }
        }
        a();
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.setOnce(this.f95858c, dVar, this.f95862h);
    }

    @Override // tw.d
    public void request(long j10) {
        iu.e.add(this.f95861g, j10);
        if (getAndIncrement() == 0) {
            a();
        }
    }
}
