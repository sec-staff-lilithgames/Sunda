package bu;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t5 extends AtomicInteger implements pt.c, p4 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11020b;

    /* renamed from: i, reason: collision with root package name */
    public final st.o f11026i;

    /* renamed from: j, reason: collision with root package name */
    public final st.o f11027j;

    /* renamed from: k, reason: collision with root package name */
    public final st.c f11028k;

    /* renamed from: m, reason: collision with root package name */
    public int f11030m;

    /* renamed from: n, reason: collision with root package name */
    public int f11031n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f11032o;

    /* renamed from: e, reason: collision with root package name */
    public final pt.b f11022e = new pt.b();

    /* renamed from: c, reason: collision with root package name */
    public final eu.d f11021c = new eu.d(mt.b0.bufferSize());

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f11023f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f11024g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f11025h = new AtomicReference();

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f11029l = new AtomicInteger(2);

    public t5(mt.i0 i0Var, st.o oVar, st.o oVar2, st.c cVar) {
        this.f11020b = i0Var;
        this.f11026i = oVar;
        this.f11027j = oVar2;
        this.f11028k = cVar;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        eu.d dVar = this.f11021c;
        mt.i0 i0Var = this.f11020b;
        int iAddAndGet = 1;
        while (!this.f11032o) {
            if (((Throwable) this.f11025h.get()) != null) {
                dVar.clear();
                this.f11022e.dispose();
                b(i0Var);
                return;
            }
            boolean z10 = this.f11029l.get() == 0;
            Integer num = (Integer) dVar.poll();
            boolean z11 = num == null;
            if (z10 && z11) {
                this.f11023f.clear();
                this.f11024g.clear();
                this.f11022e.dispose();
                i0Var.onComplete();
                return;
            }
            if (z11) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                Object objPoll = dVar.poll();
                if (num == 1) {
                    int i10 = this.f11030m;
                    this.f11030m = i10 + 1;
                    this.f11023f.put(Integer.valueOf(i10), objPoll);
                    try {
                        mt.g0 g0Var = (mt.g0) ut.o0.requireNonNull(this.f11026i.apply(objPoll), "The leftEnd returned a null ObservableSource");
                        q4 q4Var = new q4(this, true, i10);
                        this.f11022e.add(q4Var);
                        g0Var.subscribe(q4Var);
                        if (((Throwable) this.f11025h.get()) != null) {
                            dVar.clear();
                            this.f11022e.dispose();
                            b(i0Var);
                            return;
                        } else {
                            Iterator it = this.f11024g.values().iterator();
                            while (it.hasNext()) {
                                try {
                                    i0Var.onNext(ut.o0.requireNonNull(this.f11028k.apply(objPoll, it.next()), "The resultSelector returned a null value"));
                                } catch (Throwable th2) {
                                    c(th2, i0Var, dVar);
                                    return;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        c(th3, i0Var, dVar);
                        return;
                    }
                } else if (num == 2) {
                    int i11 = this.f11031n;
                    this.f11031n = i11 + 1;
                    this.f11024g.put(Integer.valueOf(i11), objPoll);
                    try {
                        mt.g0 g0Var2 = (mt.g0) ut.o0.requireNonNull(this.f11027j.apply(objPoll), "The rightEnd returned a null ObservableSource");
                        q4 q4Var2 = new q4(this, false, i11);
                        this.f11022e.add(q4Var2);
                        g0Var2.subscribe(q4Var2);
                        if (((Throwable) this.f11025h.get()) != null) {
                            dVar.clear();
                            this.f11022e.dispose();
                            b(i0Var);
                            return;
                        } else {
                            Iterator it2 = this.f11023f.values().iterator();
                            while (it2.hasNext()) {
                                try {
                                    i0Var.onNext(ut.o0.requireNonNull(this.f11028k.apply(it2.next(), objPoll), "The resultSelector returned a null value"));
                                } catch (Throwable th4) {
                                    c(th4, i0Var, dVar);
                                    return;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        c(th5, i0Var, dVar);
                        return;
                    }
                } else if (num == 3) {
                    q4 q4Var3 = (q4) objPoll;
                    this.f11023f.remove(Integer.valueOf(q4Var3.f10849e));
                    this.f11022e.remove(q4Var3);
                } else {
                    q4 q4Var4 = (q4) objPoll;
                    this.f11024g.remove(Integer.valueOf(q4Var4.f10849e));
                    this.f11022e.remove(q4Var4);
                }
            }
        }
        dVar.clear();
    }

    public final void b(mt.i0 i0Var) {
        Throwable thTerminate = iu.m.terminate(this.f11025h);
        this.f11023f.clear();
        this.f11024g.clear();
        i0Var.onError(thTerminate);
    }

    public final void c(Throwable th2, mt.i0 i0Var, eu.d dVar) {
        qt.d.throwIfFatal(th2);
        iu.m.addThrowable(this.f11025h, th2);
        dVar.clear();
        this.f11022e.dispose();
        b(i0Var);
    }

    @Override // pt.c
    public void dispose() {
        if (this.f11032o) {
            return;
        }
        this.f11032o = true;
        this.f11022e.dispose();
        if (getAndIncrement() == 0) {
            this.f11021c.clear();
        }
    }

    @Override // bu.p4
    public void innerClose(boolean z10, q4 q4Var) {
        synchronized (this) {
            try {
                this.f11021c.offer(z10 ? 3 : 4, q4Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a();
    }

    @Override // bu.p4
    public void innerCloseError(Throwable th2) {
        if (iu.m.addThrowable(this.f11025h, th2)) {
            a();
        } else {
            mu.a.onError(th2);
        }
    }

    @Override // bu.p4
    public void innerComplete(r4 r4Var) {
        this.f11022e.delete(r4Var);
        this.f11029l.decrementAndGet();
        a();
    }

    @Override // bu.p4
    public void innerError(Throwable th2) {
        if (!iu.m.addThrowable(this.f11025h, th2)) {
            mu.a.onError(th2);
        } else {
            this.f11029l.decrementAndGet();
            a();
        }
    }

    @Override // bu.p4
    public void innerValue(boolean z10, Object obj) {
        synchronized (this) {
            try {
                this.f11021c.offer(z10 ? 1 : 2, obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11032o;
    }
}
