package du;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z0 extends hu.a implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f52890b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f52891c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f52892e = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    public pt.c f52893f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Iterator f52894g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f52895h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f52896i;

    public z0(tw.c cVar, st.o oVar) {
        this.f52890b = cVar;
        this.f52891c = oVar;
    }

    @Override // hu.a, vt.l, tw.d
    public void cancel() {
        this.f52895h = true;
        this.f52893f.dispose();
        this.f52893f = tt.d.f87352b;
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public void clear() {
        this.f52894g = null;
    }

    public final void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        tw.c cVar = this.f52890b;
        Iterator it = this.f52894g;
        if (this.f52896i && it != null) {
            cVar.onNext(null);
            cVar.onComplete();
            return;
        }
        int iAddAndGet = 1;
        while (true) {
            if (it != null) {
                long j10 = this.f52892e.get();
                if (j10 == Long.MAX_VALUE) {
                    while (!this.f52895h) {
                        try {
                            cVar.onNext(it.next());
                            if (this.f52895h) {
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
                    if (this.f52895h) {
                        return;
                    }
                    try {
                        cVar.onNext(ut.o0.requireNonNull(it.next(), "The iterator returned a null value"));
                        if (this.f52895h) {
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
                    iu.e.produced(this.f52892e, j11);
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            if (it == null) {
                it = this.f52894g;
            }
        }
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public boolean isEmpty() {
        return this.f52894g == null;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52893f = tt.d.f87352b;
        this.f52890b.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f52893f, cVar)) {
            this.f52893f = cVar;
            this.f52890b.onSubscribe(this);
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        try {
            Iterator it = ((Iterable) this.f52891c.apply(obj)).iterator();
            if (!it.hasNext()) {
                this.f52890b.onComplete();
            } else {
                this.f52894g = it;
                drain();
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f52890b.onError(th2);
        }
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public Object poll() throws Exception {
        Iterator it = this.f52894g;
        if (it == null) {
            return null;
        }
        Object objRequireNonNull = ut.o0.requireNonNull(it.next(), "The iterator returned a null value");
        if (!it.hasNext()) {
            this.f52894g = null;
        }
        return objRequireNonNull;
    }

    @Override // hu.a, vt.l, tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f52892e, j10);
            drain();
        }
    }

    @Override // hu.a, vt.l, vt.k
    public int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        this.f52896i = true;
        return 2;
    }
}
