package yt;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q4 extends hu.a implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96175b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f96176c;

    /* renamed from: e, reason: collision with root package name */
    public final int f96177e;

    /* renamed from: f, reason: collision with root package name */
    public final int f96178f;

    /* renamed from: h, reason: collision with root package name */
    public tw.d f96180h;

    /* renamed from: i, reason: collision with root package name */
    public vt.o f96181i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f96182j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f96183k;

    /* renamed from: m, reason: collision with root package name */
    public Iterator f96185m;

    /* renamed from: n, reason: collision with root package name */
    public int f96186n;

    /* renamed from: o, reason: collision with root package name */
    public int f96187o;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f96184l = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicLong f96179g = new AtomicLong();

    public q4(tw.c cVar, st.o oVar, int i10) {
        this.f96175b = cVar;
        this.f96176c = oVar;
        this.f96177e = i10;
        this.f96178f = i10 - (i10 >> 2);
    }

    public final boolean a(boolean z10, boolean z11, tw.c cVar, vt.o oVar) {
        if (this.f96183k) {
            this.f96185m = null;
            oVar.clear();
            return true;
        }
        if (!z10) {
            return false;
        }
        if (((Throwable) this.f96184l.get()) == null) {
            if (!z11) {
                return false;
            }
            cVar.onComplete();
            return true;
        }
        Throwable thTerminate = iu.m.terminate(this.f96184l);
        this.f96185m = null;
        oVar.clear();
        cVar.onError(thTerminate);
        return true;
    }

    @Override // hu.a, vt.l, tw.d
    public void cancel() {
        if (this.f96183k) {
            return;
        }
        this.f96183k = true;
        this.f96180h.cancel();
        if (getAndIncrement() == 0) {
            this.f96181i.clear();
        }
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public void clear() {
        this.f96185m = null;
        this.f96181i.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final void drain() {
        boolean z10;
        if (getAndIncrement() != 0) {
            return;
        }
        tw.c cVar = this.f96175b;
        vt.o oVar = this.f96181i;
        boolean z11 = false;
        ?? r52 = 1;
        boolean z12 = this.f96187o != 1;
        Iterator it = this.f96185m;
        int iAddAndGet = 1;
        while (true) {
            if (it == null) {
                boolean z13 = this.f96182j;
                try {
                    Object objPoll = oVar.poll();
                    if (a(z13, objPoll == null ? r52 : z11 ? 1 : 0, cVar, oVar)) {
                        return;
                    }
                    if (objPoll != null) {
                        try {
                            it = ((Iterable) this.f96176c.apply(objPoll)).iterator();
                            if (it.hasNext()) {
                                this.f96185m = it;
                            } else {
                                if (z12) {
                                    int i10 = this.f96186n + r52;
                                    if (i10 == this.f96178f) {
                                        this.f96186n = z11 ? 1 : 0;
                                        this.f96180h.request(i10);
                                    } else {
                                        this.f96186n = i10;
                                    }
                                }
                                it = null;
                            }
                        } catch (Throwable th2) {
                            qt.d.throwIfFatal(th2);
                            this.f96180h.cancel();
                            iu.m.addThrowable(this.f96184l, th2);
                            cVar.onError(iu.m.terminate(this.f96184l));
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    qt.d.throwIfFatal(th3);
                    this.f96180h.cancel();
                    iu.m.addThrowable(this.f96184l, th3);
                    Throwable thTerminate = iu.m.terminate(this.f96184l);
                    this.f96185m = null;
                    oVar.clear();
                    cVar.onError(thTerminate);
                    return;
                }
            }
            if (it != null) {
                long j10 = this.f96179g.get();
                long j11 = 0;
                boolean z14 = r52;
                while (true) {
                    if (j11 == j10) {
                        z10 = z14;
                        break;
                    }
                    if (a(this.f96182j, z11, cVar, oVar)) {
                        return;
                    }
                    try {
                        z10 = z14;
                        cVar.onNext(ut.o0.requireNonNull(it.next(), "The iterator returned a null value"));
                        if (a(this.f96182j, z11, cVar, oVar)) {
                            return;
                        }
                        j11++;
                        try {
                            if (it.hasNext()) {
                                z14 = z10;
                            } else {
                                if (z12) {
                                    int i11 = this.f96186n + 1;
                                    if (i11 == this.f96178f) {
                                        this.f96186n = z11 ? 1 : 0;
                                        this.f96180h.request(i11);
                                    } else {
                                        this.f96186n = i11;
                                    }
                                }
                                this.f96185m = null;
                                it = null;
                            }
                        } catch (Throwable th4) {
                            qt.d.throwIfFatal(th4);
                            this.f96185m = null;
                            this.f96180h.cancel();
                            iu.m.addThrowable(this.f96184l, th4);
                            cVar.onError(iu.m.terminate(this.f96184l));
                            return;
                        }
                    } catch (Throwable th5) {
                        qt.d.throwIfFatal(th5);
                        this.f96185m = null;
                        this.f96180h.cancel();
                        iu.m.addThrowable(this.f96184l, th5);
                        cVar.onError(iu.m.terminate(this.f96184l));
                        return;
                    }
                }
                if (j11 == j10) {
                    if (a(this.f96182j, (oVar.isEmpty() && it == null) ? z10 : false, cVar, oVar)) {
                        return;
                    }
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.f96179g.addAndGet(-j11);
                }
                if (it != null) {
                }
                r52 = z10;
                z11 = false;
            } else {
                z10 = r52;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            r52 = z10;
            z11 = false;
        }
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public boolean isEmpty() {
        return this.f96185m == null && this.f96181i.isEmpty();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f96182j) {
            return;
        }
        this.f96182j = true;
        drain();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96182j || !iu.m.addThrowable(this.f96184l, th2)) {
            mu.a.onError(th2);
        } else {
            this.f96182j = true;
            drain();
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f96182j) {
            return;
        }
        if (this.f96187o != 0 || this.f96181i.offer(obj)) {
            drain();
        } else {
            onError(new qt.e("Queue is full?!"));
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96180h, dVar)) {
            this.f96180h = dVar;
            if (dVar instanceof vt.l) {
                vt.l lVar = (vt.l) dVar;
                int iRequestFusion = lVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f96187o = iRequestFusion;
                    this.f96181i = lVar;
                    this.f96182j = true;
                    this.f96175b.onSubscribe(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f96187o = iRequestFusion;
                    this.f96181i = lVar;
                    this.f96175b.onSubscribe(this);
                    dVar.request(this.f96177e);
                    return;
                }
            }
            this.f96181i = new eu.c(this.f96177e);
            this.f96175b.onSubscribe(this);
            dVar.request(this.f96177e);
        }
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public Object poll() throws Exception {
        Iterator it = this.f96185m;
        while (true) {
            if (it == null) {
                Object objPoll = this.f96181i.poll();
                if (objPoll != null) {
                    it = ((Iterable) this.f96176c.apply(objPoll)).iterator();
                    if (it.hasNext()) {
                        this.f96185m = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        Object objRequireNonNull = ut.o0.requireNonNull(it.next(), "The iterator returned a null value");
        if (!it.hasNext()) {
            this.f96185m = null;
        }
        return objRequireNonNull;
    }

    @Override // hu.a, vt.l, tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f96179g, j10);
            drain();
        }
    }

    @Override // hu.a, vt.l, vt.k
    public int requestFusion(int i10) {
        return ((i10 & 1) == 0 || this.f96187o != 1) ? 0 : 1;
    }
}
