package yt;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class pe extends AtomicInteger implements mt.q, tw.d, Runnable {

    /* renamed from: p, reason: collision with root package name */
    public static final oe f96136p = new oe(null);

    /* renamed from: q, reason: collision with root package name */
    public static final Object f96137q = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96138b;

    /* renamed from: c, reason: collision with root package name */
    public final int f96139c;

    /* renamed from: j, reason: collision with root package name */
    public final Callable f96145j;

    /* renamed from: l, reason: collision with root package name */
    public tw.d f96147l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f96148m;

    /* renamed from: n, reason: collision with root package name */
    public nu.d f96149n;

    /* renamed from: o, reason: collision with root package name */
    public long f96150o;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f96140e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f96141f = new AtomicInteger(1);

    /* renamed from: g, reason: collision with root package name */
    public final eu.b f96142g = new eu.b();

    /* renamed from: h, reason: collision with root package name */
    public final iu.d f96143h = new iu.d();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f96144i = new AtomicBoolean();

    /* renamed from: k, reason: collision with root package name */
    public final AtomicLong f96146k = new AtomicLong();

    public pe(tw.c cVar, int i10, Callable callable) {
        this.f96138b = cVar;
        this.f96139c = i10;
        this.f96145j = callable;
    }

    public final void a() {
        AtomicReference atomicReference = this.f96140e;
        oe oeVar = f96136p;
        pt.c cVar = (pt.c) atomicReference.getAndSet(oeVar);
        if (cVar == null || cVar == oeVar) {
            return;
        }
        cVar.dispose();
    }

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        tw.c cVar = this.f96138b;
        eu.b bVar = this.f96142g;
        iu.d dVar = this.f96143h;
        long j10 = this.f96150o;
        int iAddAndGet = 1;
        while (this.f96141f.get() != 0) {
            nu.d dVar2 = this.f96149n;
            boolean z10 = this.f96148m;
            if (z10 && dVar.get() != null) {
                bVar.clear();
                Throwable thTerminate = dVar.terminate();
                if (dVar2 != null) {
                    this.f96149n = null;
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
                        this.f96149n = null;
                        dVar2.onComplete();
                    }
                    cVar.onComplete();
                    return;
                }
                if (dVar2 != null) {
                    this.f96149n = null;
                    dVar2.onError(thTerminate2);
                }
                cVar.onError(thTerminate2);
                return;
            }
            if (z11) {
                this.f96150o = j10;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else if (objPoll != f96137q) {
                dVar2.onNext(objPoll);
            } else {
                if (dVar2 != null) {
                    this.f96149n = null;
                    dVar2.onComplete();
                }
                if (!this.f96144i.get()) {
                    if (j10 != this.f96146k.get()) {
                        nu.d dVarCreate = nu.d.create(this.f96139c, this);
                        this.f96149n = dVarCreate;
                        this.f96141f.getAndIncrement();
                        try {
                            tw.b bVar2 = (tw.b) ut.o0.requireNonNull(this.f96145j.call(), "The other Callable returned a null Publisher");
                            oe oeVar = new oe(this);
                            AtomicReference atomicReference = this.f96140e;
                            while (true) {
                                if (atomicReference.compareAndSet(null, oeVar)) {
                                    bVar2.subscribe(oeVar);
                                    j10++;
                                    cVar.onNext(dVarCreate);
                                    break;
                                } else if (atomicReference.get() != null) {
                                    break;
                                }
                            }
                        } catch (Throwable th2) {
                            qt.d.throwIfFatal(th2);
                            dVar.addThrowable(th2);
                            this.f96148m = true;
                        }
                    } else {
                        this.f96147l.cancel();
                        a();
                        dVar.addThrowable(new qt.e("Could not deliver a window due to lack of requests"));
                        this.f96148m = true;
                    }
                }
            }
        }
        bVar.clear();
        this.f96149n = null;
    }

    @Override // tw.d
    public void cancel() {
        if (this.f96144i.compareAndSet(false, true)) {
            a();
            if (this.f96141f.decrementAndGet() == 0) {
                this.f96147l.cancel();
            }
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        a();
        this.f96148m = true;
        b();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        a();
        if (!this.f96143h.addThrowable(th2)) {
            mu.a.onError(th2);
        } else {
            this.f96148m = true;
            b();
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f96142g.offer(obj);
        b();
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96147l, dVar)) {
            this.f96147l = dVar;
            this.f96138b.onSubscribe(this);
            this.f96142g.offer(f96137q);
            b();
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        iu.e.add(this.f96146k, j10);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f96141f.decrementAndGet() == 0) {
            this.f96147l.cancel();
        }
    }
}
