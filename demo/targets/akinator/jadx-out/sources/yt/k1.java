package yt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k1 extends AtomicInteger implements mt.q, tw.d, gu.l {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95775b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f95776c;

    /* renamed from: e, reason: collision with root package name */
    public final int f95777e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95778f;

    /* renamed from: g, reason: collision with root package name */
    public final iu.k f95779g;

    /* renamed from: h, reason: collision with root package name */
    public final iu.d f95780h = new iu.d();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicLong f95781i = new AtomicLong();

    /* renamed from: j, reason: collision with root package name */
    public final eu.d f95782j;

    /* renamed from: k, reason: collision with root package name */
    public tw.d f95783k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f95784l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f95785m;

    /* renamed from: n, reason: collision with root package name */
    public volatile gu.k f95786n;

    public k1(tw.c cVar, st.o oVar, int i10, int i11, iu.k kVar) {
        this.f95775b = cVar;
        this.f95776c = oVar;
        this.f95777e = i10;
        this.f95778f = i11;
        this.f95779g = kVar;
        this.f95782j = new eu.d(Math.min(i11, i10));
    }

    public final void a() {
        gu.k kVar = this.f95786n;
        this.f95786n = null;
        if (kVar != null) {
            kVar.cancel();
        }
        while (true) {
            gu.k kVar2 = (gu.k) this.f95782j.poll();
            if (kVar2 == null) {
                return;
            } else {
                kVar2.cancel();
            }
        }
    }

    @Override // tw.d
    public void cancel() {
        if (this.f95784l) {
            return;
        }
        this.f95784l = true;
        this.f95783k.cancel();
        if (getAndIncrement() == 0) {
            do {
                a();
            } while (decrementAndGet() != 0);
        }
    }

    @Override // gu.l
    public void drain() {
        long j10;
        long j11;
        boolean z10;
        vt.o oVarQueue;
        iu.k kVar = iu.k.f68411b;
        if (getAndIncrement() != 0) {
            return;
        }
        gu.k kVar2 = this.f95786n;
        tw.c cVar = this.f95775b;
        iu.k kVar3 = this.f95779g;
        int iAddAndGet = 1;
        while (true) {
            long j12 = this.f95781i.get();
            if (kVar2 == null) {
                if (kVar3 != iu.k.f68413e && ((Throwable) this.f95780h.get()) != null) {
                    a();
                    cVar.onError(this.f95780h.terminate());
                    return;
                }
                boolean z11 = this.f95785m;
                gu.k kVar4 = (gu.k) this.f95782j.poll();
                if (z11 && kVar4 == null) {
                    Throwable thTerminate = this.f95780h.terminate();
                    if (thTerminate != null) {
                        cVar.onError(thTerminate);
                        return;
                    } else {
                        cVar.onComplete();
                        return;
                    }
                }
                if (kVar4 != null) {
                    this.f95786n = kVar4;
                }
                kVar2 = kVar4;
            }
            if (kVar2 == null || (oVarQueue = kVar2.queue()) == null) {
                j10 = 0;
                j11 = 0;
                z10 = false;
            } else {
                j11 = 0;
                while (true) {
                    j10 = 0;
                    if (j11 == j12) {
                        break;
                    }
                    if (this.f95784l) {
                        a();
                        return;
                    }
                    if (kVar3 == kVar && ((Throwable) this.f95780h.get()) != null) {
                        this.f95786n = null;
                        kVar2.cancel();
                        a();
                        cVar.onError(this.f95780h.terminate());
                        return;
                    }
                    boolean zIsDone = kVar2.isDone();
                    try {
                        Object objPoll = oVarQueue.poll();
                        boolean z12 = objPoll == null;
                        if (zIsDone && z12) {
                            this.f95786n = null;
                            this.f95783k.request(1L);
                            kVar2 = null;
                            z10 = true;
                            break;
                        }
                        if (z12) {
                            break;
                        }
                        cVar.onNext(objPoll);
                        j11++;
                        kVar2.requestOne();
                    } catch (Throwable th2) {
                        qt.d.throwIfFatal(th2);
                        this.f95786n = null;
                        kVar2.cancel();
                        a();
                        cVar.onError(th2);
                        return;
                    }
                }
                z10 = false;
                if (j11 == j12) {
                    if (this.f95784l) {
                        a();
                        return;
                    }
                    if (kVar3 == kVar && ((Throwable) this.f95780h.get()) != null) {
                        this.f95786n = null;
                        kVar2.cancel();
                        a();
                        cVar.onError(this.f95780h.terminate());
                        return;
                    }
                    boolean zIsDone2 = kVar2.isDone();
                    boolean zIsEmpty = oVarQueue.isEmpty();
                    if (zIsDone2 && zIsEmpty) {
                        this.f95786n = null;
                        this.f95783k.request(1L);
                        kVar2 = null;
                        z10 = true;
                    }
                }
            }
            if (j11 != j10 && j12 != Long.MAX_VALUE) {
                this.f95781i.addAndGet(-j11);
            }
            if (!z10 && (iAddAndGet = addAndGet(-iAddAndGet)) == 0) {
                return;
            }
        }
    }

    @Override // gu.l
    public void innerComplete(gu.k kVar) {
        kVar.setDone();
        drain();
    }

    @Override // gu.l
    public void innerError(gu.k kVar, Throwable th2) {
        if (!this.f95780h.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        kVar.setDone();
        if (this.f95779g != iu.k.f68413e) {
            this.f95783k.cancel();
        }
        drain();
    }

    @Override // gu.l
    public void innerNext(gu.k kVar, Object obj) {
        if (kVar.queue().offer(obj)) {
            drain();
        } else {
            kVar.cancel();
            innerError(kVar, new qt.e());
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95785m = true;
        drain();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (!this.f95780h.addThrowable(th2)) {
            mu.a.onError(th2);
        } else {
            this.f95785m = true;
            drain();
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        try {
            tw.b bVar = (tw.b) ut.o0.requireNonNull(this.f95776c.apply(obj), "The mapper returned a null Publisher");
            gu.k kVar = new gu.k(this, this.f95778f);
            if (this.f95784l) {
                return;
            }
            this.f95782j.offer(kVar);
            bVar.subscribe(kVar);
            if (this.f95784l) {
                kVar.cancel();
                if (getAndIncrement() == 0) {
                    do {
                        a();
                    } while (decrementAndGet() != 0);
                }
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f95783k.cancel();
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95783k, dVar)) {
            this.f95783k = dVar;
            this.f95775b.onSubscribe(this);
            int i10 = this.f95777e;
            dVar.request(i10 == Integer.MAX_VALUE ? Long.MAX_VALUE : i10);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f95781i, j10);
            drain();
        }
    }
}
