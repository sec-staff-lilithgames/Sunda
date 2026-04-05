package yt;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v7 extends hu.a implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96443b;

    /* renamed from: c, reason: collision with root package name */
    public final vt.n f96444c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f96445e;

    /* renamed from: f, reason: collision with root package name */
    public final st.a f96446f;

    /* renamed from: g, reason: collision with root package name */
    public tw.d f96447g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f96448h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f96449i;

    /* renamed from: j, reason: collision with root package name */
    public Throwable f96450j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicLong f96451k = new AtomicLong();

    /* renamed from: l, reason: collision with root package name */
    public boolean f96452l;

    public v7(tw.c cVar, int i10, boolean z10, boolean z11, st.a aVar) {
        this.f96443b = cVar;
        this.f96446f = aVar;
        this.f96445e = z11;
        this.f96444c = z10 ? new eu.d(i10) : new eu.c(i10);
    }

    public final boolean a(tw.c cVar, boolean z10, boolean z11) {
        if (this.f96448h) {
            this.f96444c.clear();
            return true;
        }
        if (!z10) {
            return false;
        }
        if (this.f96445e) {
            if (!z11) {
                return false;
            }
            Throwable th2 = this.f96450j;
            if (th2 != null) {
                cVar.onError(th2);
                return true;
            }
            cVar.onComplete();
            return true;
        }
        Throwable th3 = this.f96450j;
        if (th3 != null) {
            this.f96444c.clear();
            cVar.onError(th3);
            return true;
        }
        if (!z11) {
            return false;
        }
        cVar.onComplete();
        return true;
    }

    @Override // hu.a, vt.l, tw.d
    public void cancel() {
        if (this.f96448h) {
            return;
        }
        this.f96448h = true;
        this.f96447g.cancel();
        if (this.f96452l || getAndIncrement() != 0) {
            return;
        }
        this.f96444c.clear();
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public void clear() {
        this.f96444c.clear();
    }

    public final void drain() {
        if (getAndIncrement() == 0) {
            vt.n nVar = this.f96444c;
            tw.c cVar = this.f96443b;
            int iAddAndGet = 1;
            while (!a(cVar, this.f96449i, nVar.isEmpty())) {
                long j10 = this.f96451k.get();
                long j11 = 0;
                while (j11 != j10) {
                    boolean z10 = this.f96449i;
                    Object objPoll = nVar.poll();
                    boolean z11 = objPoll == null;
                    if (a(cVar, z10, z11)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    cVar.onNext(objPoll);
                    j11++;
                }
                if (j11 == j10 && a(cVar, this.f96449i, nVar.isEmpty())) {
                    return;
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.f96451k.addAndGet(-j11);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public boolean isEmpty() {
        return this.f96444c.isEmpty();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96449i = true;
        if (this.f96452l) {
            this.f96443b.onComplete();
        } else {
            drain();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f96450j = th2;
        this.f96449i = true;
        if (this.f96452l) {
            this.f96443b.onError(th2);
        } else {
            drain();
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f96444c.offer(obj)) {
            if (this.f96452l) {
                this.f96443b.onNext(null);
                return;
            } else {
                drain();
                return;
            }
        }
        this.f96447g.cancel();
        qt.e eVar = new qt.e("Buffer is full");
        try {
            this.f96446f.run();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            eVar.initCause(th2);
        }
        onError(eVar);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96447g, dVar)) {
            this.f96447g = dVar;
            this.f96443b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public Object poll() throws Exception {
        return this.f96444c.poll();
    }

    @Override // hu.a, vt.l, tw.d
    public void request(long j10) {
        if (this.f96452l || !hu.g.validate(j10)) {
            return;
        }
        iu.e.add(this.f96451k, j10);
        drain();
    }

    @Override // hu.a, vt.l, vt.k
    public int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        this.f96452l = true;
        return 2;
    }
}
