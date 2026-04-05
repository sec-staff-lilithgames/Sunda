package yt;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p6 extends AtomicInteger implements tw.d, k5 {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96109b;

    /* renamed from: j, reason: collision with root package name */
    public final st.o f96116j;

    /* renamed from: k, reason: collision with root package name */
    public final st.o f96117k;

    /* renamed from: l, reason: collision with root package name */
    public final st.c f96118l;

    /* renamed from: n, reason: collision with root package name */
    public int f96120n;

    /* renamed from: o, reason: collision with root package name */
    public int f96121o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f96122p;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f96110c = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    public final pt.b f96112f = new pt.b();

    /* renamed from: e, reason: collision with root package name */
    public final eu.d f96111e = new eu.d(mt.l.bufferSize());

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f96113g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f96114h = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f96115i = new AtomicReference();

    /* renamed from: m, reason: collision with root package name */
    public final AtomicInteger f96119m = new AtomicInteger(2);

    public p6(tw.c cVar, st.o oVar, st.o oVar2, st.c cVar2) {
        this.f96109b = cVar;
        this.f96116j = oVar;
        this.f96117k = oVar2;
        this.f96118l = cVar2;
    }

    public final void a() {
        this.f96112f.dispose();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        eu.d dVar = this.f96111e;
        tw.c cVar = this.f96109b;
        boolean z10 = true;
        int iAddAndGet = 1;
        while (!this.f96122p) {
            if (((Throwable) this.f96115i.get()) != null) {
                dVar.clear();
                a();
                c(cVar);
                return;
            }
            Object[] objArr = this.f96119m.get() == 0 ? z10 ? 1 : 0 : false;
            Integer num = (Integer) dVar.poll();
            Object[] objArr2 = num == null ? z10 ? 1 : 0 : false;
            if (objArr == true && objArr2 == true) {
                this.f96113g.clear();
                this.f96114h.clear();
                this.f96112f.dispose();
                cVar.onComplete();
                return;
            }
            if (objArr2 == true) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                Object objPoll = dVar.poll();
                if (num == Integer.valueOf(z10 ? 1 : 0)) {
                    int i10 = this.f96120n;
                    this.f96120n = i10 + 1;
                    this.f96113g.put(Integer.valueOf(i10), objPoll);
                    try {
                        tw.b bVar = (tw.b) ut.o0.requireNonNull(this.f96116j.apply(objPoll), "The leftEnd returned a null Publisher");
                        l5 l5Var = new l5(this, z10, i10);
                        this.f96112f.add(l5Var);
                        bVar.subscribe(l5Var);
                        if (((Throwable) this.f96115i.get()) != null) {
                            dVar.clear();
                            a();
                            c(cVar);
                            return;
                        }
                        long j10 = this.f96110c.get();
                        Iterator it = this.f96114h.values().iterator();
                        long j11 = 0;
                        while (it.hasNext()) {
                            try {
                                Object objRequireNonNull = ut.o0.requireNonNull(this.f96118l.apply(objPoll, it.next()), "The resultSelector returned a null value");
                                if (j11 == j10) {
                                    iu.m.addThrowable(this.f96115i, new qt.e("Could not emit value due to lack of requests"));
                                    dVar.clear();
                                    a();
                                    c(cVar);
                                    return;
                                }
                                cVar.onNext(objRequireNonNull);
                                j11++;
                            } catch (Throwable th2) {
                                d(th2, cVar, dVar);
                                return;
                            }
                        }
                        if (j11 != 0) {
                            iu.e.produced(this.f96110c, j11);
                        }
                    } catch (Throwable th3) {
                        d(th3, cVar, dVar);
                        return;
                    }
                } else if (num == 2) {
                    int i11 = this.f96121o;
                    this.f96121o = i11 + 1;
                    this.f96114h.put(Integer.valueOf(i11), objPoll);
                    try {
                        tw.b bVar2 = (tw.b) ut.o0.requireNonNull(this.f96117k.apply(objPoll), "The rightEnd returned a null Publisher");
                        l5 l5Var2 = new l5(this, false, i11);
                        this.f96112f.add(l5Var2);
                        bVar2.subscribe(l5Var2);
                        if (((Throwable) this.f96115i.get()) != null) {
                            dVar.clear();
                            a();
                            c(cVar);
                            return;
                        }
                        long j12 = this.f96110c.get();
                        Iterator it2 = this.f96113g.values().iterator();
                        long j13 = 0;
                        while (it2.hasNext()) {
                            try {
                                Object objRequireNonNull2 = ut.o0.requireNonNull(this.f96118l.apply(it2.next(), objPoll), "The resultSelector returned a null value");
                                if (j13 == j12) {
                                    iu.m.addThrowable(this.f96115i, new qt.e("Could not emit value due to lack of requests"));
                                    dVar.clear();
                                    a();
                                    c(cVar);
                                    return;
                                }
                                cVar.onNext(objRequireNonNull2);
                                j13++;
                            } catch (Throwable th4) {
                                d(th4, cVar, dVar);
                                return;
                            }
                        }
                        if (j13 != 0) {
                            iu.e.produced(this.f96110c, j13);
                        }
                    } catch (Throwable th5) {
                        d(th5, cVar, dVar);
                        return;
                    }
                } else if (num == 3) {
                    l5 l5Var3 = (l5) objPoll;
                    this.f96113g.remove(Integer.valueOf(l5Var3.f95853e));
                    this.f96112f.remove(l5Var3);
                } else if (num == 4) {
                    l5 l5Var4 = (l5) objPoll;
                    this.f96114h.remove(Integer.valueOf(l5Var4.f95853e));
                    this.f96112f.remove(l5Var4);
                }
                z10 = true;
            }
        }
        dVar.clear();
    }

    public final void c(tw.c cVar) {
        Throwable thTerminate = iu.m.terminate(this.f96115i);
        this.f96113g.clear();
        this.f96114h.clear();
        cVar.onError(thTerminate);
    }

    @Override // tw.d
    public void cancel() {
        if (this.f96122p) {
            return;
        }
        this.f96122p = true;
        a();
        if (getAndIncrement() == 0) {
            this.f96111e.clear();
        }
    }

    public final void d(Throwable th2, tw.c cVar, vt.o oVar) {
        qt.d.throwIfFatal(th2);
        iu.m.addThrowable(this.f96115i, th2);
        oVar.clear();
        a();
        c(cVar);
    }

    @Override // yt.k5
    public void innerClose(boolean z10, l5 l5Var) {
        synchronized (this) {
            try {
                this.f96111e.offer(z10 ? 3 : 4, l5Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        b();
    }

    @Override // yt.k5
    public void innerCloseError(Throwable th2) {
        if (iu.m.addThrowable(this.f96115i, th2)) {
            b();
        } else {
            mu.a.onError(th2);
        }
    }

    @Override // yt.k5
    public void innerComplete(m5 m5Var) {
        this.f96112f.delete(m5Var);
        this.f96119m.decrementAndGet();
        b();
    }

    @Override // yt.k5
    public void innerError(Throwable th2) {
        if (!iu.m.addThrowable(this.f96115i, th2)) {
            mu.a.onError(th2);
        } else {
            this.f96119m.decrementAndGet();
            b();
        }
    }

    @Override // yt.k5
    public void innerValue(boolean z10, Object obj) {
        synchronized (this) {
            try {
                this.f96111e.offer(z10 ? 1 : 2, obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        b();
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f96110c, j10);
        }
    }
}
