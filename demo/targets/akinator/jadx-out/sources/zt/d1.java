package zt;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d1 extends hu.a implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f98563b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f98564c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f98565e = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    public pt.c f98566f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Iterator f98567g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f98568h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f98569i;

    public d1(tw.c cVar, st.o oVar) {
        this.f98563b = cVar;
        this.f98564c = oVar;
    }

    @Override // hu.a, vt.l, tw.d
    public void cancel() {
        this.f98568h = true;
        this.f98566f.dispose();
        this.f98566f = tt.d.f87352b;
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public void clear() {
        this.f98567g = null;
    }

    public final void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        tw.c cVar = this.f98563b;
        Iterator it = this.f98567g;
        if (this.f98569i && it != null) {
            cVar.onNext(null);
            cVar.onComplete();
            return;
        }
        int iAddAndGet = 1;
        while (true) {
            if (it != null) {
                long j10 = this.f98565e.get();
                if (j10 == Long.MAX_VALUE) {
                    while (!this.f98568h) {
                        try {
                            cVar.onNext(it.next());
                            if (this.f98568h) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    cVar.onComplete();
                                    return;
                                }
                            } catch (Throwable th2) {
                                qt.d.throwIfFatal(th2);
                                cVar.onError(th2);
                                return;
                            }
                        } catch (Throwable th3) {
                            qt.d.throwIfFatal(th3);
                            cVar.onError(th3);
                            return;
                        }
                    }
                    return;
                }
                long j11 = 0;
                while (j11 != j10) {
                    if (this.f98568h) {
                        return;
                    }
                    try {
                        cVar.onNext(ut.o0.requireNonNull(it.next(), "The iterator returned a null value"));
                        if (this.f98568h) {
                            return;
                        }
                        j11++;
                        try {
                            if (!it.hasNext()) {
                                cVar.onComplete();
                                return;
                            }
                        } catch (Throwable th4) {
                            qt.d.throwIfFatal(th4);
                            cVar.onError(th4);
                            return;
                        }
                    } catch (Throwable th5) {
                        qt.d.throwIfFatal(th5);
                        cVar.onError(th5);
                        return;
                    }
                }
                if (j11 != 0) {
                    iu.e.produced(this.f98565e, j11);
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            if (it == null) {
                it = this.f98567g;
            }
        }
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public boolean isEmpty() {
        return this.f98567g == null;
    }

    @Override // mt.v
    public void onComplete() {
        this.f98563b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98566f = tt.d.f87352b;
        this.f98563b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98566f, cVar)) {
            this.f98566f = cVar;
            this.f98563b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        try {
            Iterator it = ((Iterable) this.f98564c.apply(obj)).iterator();
            if (!it.hasNext()) {
                this.f98563b.onComplete();
            } else {
                this.f98567g = it;
                drain();
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f98563b.onError(th2);
        }
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public Object poll() throws Exception {
        Iterator it = this.f98567g;
        if (it == null) {
            return null;
        }
        Object objRequireNonNull = ut.o0.requireNonNull(it.next(), "The iterator returned a null value");
        if (!it.hasNext()) {
            this.f98567g = null;
        }
        return objRequireNonNull;
    }

    @Override // hu.a, vt.l, tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f98565e, j10);
            drain();
        }
    }

    @Override // hu.a, vt.l, vt.k
    public int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        this.f98569i = true;
        return 2;
    }
}
