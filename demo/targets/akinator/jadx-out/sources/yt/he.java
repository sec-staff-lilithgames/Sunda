package yt;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class he extends AtomicInteger implements mt.q, tw.d, Runnable {

    /* renamed from: o, reason: collision with root package name */
    public static final Object f95615o = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95616b;

    /* renamed from: c, reason: collision with root package name */
    public final int f95617c;

    /* renamed from: e, reason: collision with root package name */
    public final ge f95618e = new ge(this);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f95619f = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicInteger f95620g = new AtomicInteger(1);

    /* renamed from: h, reason: collision with root package name */
    public final eu.b f95621h = new eu.b();

    /* renamed from: i, reason: collision with root package name */
    public final iu.d f95622i = new iu.d();

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f95623j = new AtomicBoolean();

    /* renamed from: k, reason: collision with root package name */
    public final AtomicLong f95624k = new AtomicLong();

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f95625l;

    /* renamed from: m, reason: collision with root package name */
    public nu.d f95626m;

    /* renamed from: n, reason: collision with root package name */
    public long f95627n;

    public he(tw.c cVar, int i10) {
        this.f95616b = cVar;
        this.f95617c = i10;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        tw.c cVar = this.f95616b;
        eu.b bVar = this.f95621h;
        iu.d dVar = this.f95622i;
        long j10 = this.f95627n;
        int iAddAndGet = 1;
        while (this.f95620g.get() != 0) {
            nu.d dVar2 = this.f95626m;
            boolean z10 = this.f95625l;
            if (z10 && dVar.get() != null) {
                bVar.clear();
                Throwable thTerminate = dVar.terminate();
                if (dVar2 != null) {
                    this.f95626m = null;
                    dVar2.onError(thTerminate);
                }
                cVar.onError(thTerminate);
                return;
            }
            Object objPoll = bVar.poll();
            boolean z11 = objPoll == null;
            if (z10 && z11) {
                Throwable thTerminate2 = dVar.terminate();
                if (thTerminate2 == null) {
                    if (dVar2 != null) {
                        this.f95626m = null;
                        dVar2.onComplete();
                    }
                    cVar.onComplete();
                    return;
                }
                if (dVar2 != null) {
                    this.f95626m = null;
                    dVar2.onError(thTerminate2);
                }
                cVar.onError(thTerminate2);
                return;
            }
            if (z11) {
                this.f95627n = j10;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else if (objPoll != f95615o) {
                dVar2.onNext(objPoll);
            } else {
                if (dVar2 != null) {
                    this.f95626m = null;
                    dVar2.onComplete();
                }
                if (!this.f95623j.get()) {
                    nu.d dVarCreate = nu.d.create(this.f95617c, this);
                    this.f95626m = dVarCreate;
                    this.f95620g.getAndIncrement();
                    if (j10 != this.f95624k.get()) {
                        j10++;
                        cVar.onNext(dVarCreate);
                    } else {
                        hu.g.cancel(this.f95619f);
                        this.f95618e.dispose();
                        dVar.addThrowable(new qt.e("Could not deliver a window due to lack of requests"));
                        this.f95625l = true;
                    }
                }
            }
        }
        bVar.clear();
        this.f95626m = null;
    }

    @Override // tw.d
    public void cancel() {
        if (this.f95623j.compareAndSet(false, true)) {
            this.f95618e.dispose();
            if (this.f95620g.decrementAndGet() == 0) {
                hu.g.cancel(this.f95619f);
            }
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95618e.dispose();
        this.f95625l = true;
        a();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f95618e.dispose();
        if (!this.f95622i.addThrowable(th2)) {
            mu.a.onError(th2);
        } else {
            this.f95625l = true;
            a();
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f95621h.offer(obj);
        a();
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.setOnce(this.f95619f, dVar, Long.MAX_VALUE);
    }

    @Override // tw.d
    public void request(long j10) {
        iu.e.add(this.f95624k, j10);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f95620g.decrementAndGet() == 0) {
            hu.g.cancel(this.f95619f);
        }
    }
}
