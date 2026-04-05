package yt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o7 extends AtomicInteger implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96055b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f96056c = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final n7 f96057e = new n7(this);

    /* renamed from: f, reason: collision with root package name */
    public final iu.d f96058f = new iu.d();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicLong f96059g = new AtomicLong();

    /* renamed from: h, reason: collision with root package name */
    public final int f96060h;

    /* renamed from: i, reason: collision with root package name */
    public final int f96061i;

    /* renamed from: j, reason: collision with root package name */
    public volatile eu.c f96062j;

    /* renamed from: k, reason: collision with root package name */
    public Object f96063k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f96064l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f96065m;

    /* renamed from: n, reason: collision with root package name */
    public volatile int f96066n;

    /* renamed from: o, reason: collision with root package name */
    public long f96067o;

    /* renamed from: p, reason: collision with root package name */
    public int f96068p;

    public o7(tw.c cVar) {
        this.f96055b = cVar;
        int iBufferSize = mt.l.bufferSize();
        this.f96060h = iBufferSize;
        this.f96061i = iBufferSize - (iBufferSize >> 2);
    }

    public final void a() {
        tw.c cVar = this.f96055b;
        long j10 = this.f96067o;
        int i10 = this.f96068p;
        int i11 = this.f96061i;
        int i12 = 1;
        int iAddAndGet = 1;
        while (true) {
            long j11 = this.f96059g.get();
            while (j10 != j11) {
                if (this.f96064l) {
                    this.f96063k = null;
                    this.f96062j = null;
                    return;
                }
                if (this.f96058f.get() != null) {
                    this.f96063k = null;
                    this.f96062j = null;
                    cVar.onError(this.f96058f.terminate());
                    return;
                }
                int i13 = this.f96066n;
                if (i13 == i12) {
                    Object obj = this.f96063k;
                    this.f96063k = null;
                    this.f96066n = 2;
                    cVar.onNext(obj);
                    j10++;
                } else {
                    boolean z10 = this.f96065m;
                    eu.c cVar2 = this.f96062j;
                    Object objPoll = cVar2 != null ? cVar2.poll() : null;
                    boolean z11 = objPoll == null;
                    if (z10 && z11 && i13 == 2) {
                        this.f96062j = null;
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
                            ((tw.d) this.f96056c.get()).request(i11);
                            i10 = 0;
                        }
                        i12 = 1;
                    }
                }
            }
            if (j10 == j11) {
                if (this.f96064l) {
                    this.f96063k = null;
                    this.f96062j = null;
                    return;
                }
                if (this.f96058f.get() != null) {
                    this.f96063k = null;
                    this.f96062j = null;
                    cVar.onError(this.f96058f.terminate());
                    return;
                }
                boolean z12 = this.f96065m;
                eu.c cVar3 = this.f96062j;
                boolean z13 = cVar3 == null || cVar3.isEmpty();
                if (z12 && z13 && this.f96066n == 2) {
                    this.f96062j = null;
                    cVar.onComplete();
                    return;
                }
            }
            this.f96067o = j10;
            this.f96068p = i10;
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
        this.f96064l = true;
        hu.g.cancel(this.f96056c);
        tt.d.dispose(this.f96057e);
        if (getAndIncrement() == 0) {
            this.f96062j = null;
            this.f96063k = null;
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96065m = true;
        if (getAndIncrement() == 0) {
            a();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (!this.f96058f.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        tt.d.dispose(this.f96057e);
        if (getAndIncrement() == 0) {
            a();
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (compareAndSet(0, 1)) {
            long j10 = this.f96067o;
            if (this.f96059g.get() != j10) {
                eu.c cVar = this.f96062j;
                if (cVar == null || cVar.isEmpty()) {
                    this.f96067o = j10 + 1;
                    this.f96055b.onNext(obj);
                    int i10 = this.f96068p + 1;
                    if (i10 == this.f96061i) {
                        this.f96068p = 0;
                        ((tw.d) this.f96056c.get()).request(i10);
                    } else {
                        this.f96068p = i10;
                    }
                } else {
                    cVar.offer(obj);
                }
            } else {
                eu.c cVar2 = this.f96062j;
                if (cVar2 == null) {
                    cVar2 = new eu.c(mt.l.bufferSize());
                    this.f96062j = cVar2;
                }
                cVar2.offer(obj);
            }
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            eu.c cVar3 = this.f96062j;
            if (cVar3 == null) {
                cVar3 = new eu.c(mt.l.bufferSize());
                this.f96062j = cVar3;
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
        hu.g.setOnce(this.f96056c, dVar, this.f96060h);
    }

    @Override // tw.d
    public void request(long j10) {
        iu.e.add(this.f96059g, j10);
        if (getAndIncrement() == 0) {
            a();
        }
    }
}
