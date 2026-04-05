package bu;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g1 extends AtomicInteger implements mt.i0, pt.c, wt.s {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10331b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10332c;

    /* renamed from: e, reason: collision with root package name */
    public final int f10333e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10334f;

    /* renamed from: g, reason: collision with root package name */
    public final iu.k f10335g;

    /* renamed from: h, reason: collision with root package name */
    public final iu.d f10336h = new iu.d();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayDeque f10337i = new ArrayDeque();

    /* renamed from: j, reason: collision with root package name */
    public vt.o f10338j;

    /* renamed from: k, reason: collision with root package name */
    public pt.c f10339k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f10340l;

    /* renamed from: m, reason: collision with root package name */
    public int f10341m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f10342n;

    /* renamed from: o, reason: collision with root package name */
    public wt.r f10343o;

    /* renamed from: p, reason: collision with root package name */
    public int f10344p;

    public g1(mt.i0 i0Var, st.o oVar, int i10, int i11, iu.k kVar) {
        this.f10331b = i0Var;
        this.f10332c = oVar;
        this.f10333e = i10;
        this.f10334f = i11;
        this.f10335g = kVar;
    }

    public final void a() {
        wt.r rVar = this.f10343o;
        if (rVar != null) {
            rVar.dispose();
        }
        while (true) {
            wt.r rVar2 = (wt.r) this.f10337i.poll();
            if (rVar2 == null) {
                return;
            } else {
                rVar2.dispose();
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        if (this.f10342n) {
            return;
        }
        this.f10342n = true;
        this.f10339k.dispose();
        if (getAndIncrement() == 0) {
            do {
                this.f10338j.clear();
                a();
            } while (decrementAndGet() != 0);
        }
    }

    @Override // wt.s
    public void drain() {
        Object objPoll;
        boolean z10;
        iu.k kVar = iu.k.f68411b;
        if (getAndIncrement() != 0) {
            return;
        }
        vt.o oVar = this.f10338j;
        ArrayDeque arrayDeque = this.f10337i;
        mt.i0 i0Var = this.f10331b;
        iu.k kVar2 = this.f10335g;
        int iAddAndGet = 1;
        while (true) {
            int i10 = this.f10344p;
            while (i10 != this.f10333e) {
                if (this.f10342n) {
                    oVar.clear();
                    a();
                    return;
                }
                if (kVar2 == kVar && ((Throwable) this.f10336h.get()) != null) {
                    oVar.clear();
                    a();
                    i0Var.onError(this.f10336h.terminate());
                    return;
                }
                try {
                    Object objPoll2 = oVar.poll();
                    if (objPoll2 == null) {
                        break;
                    }
                    mt.g0 g0Var = (mt.g0) ut.o0.requireNonNull(this.f10332c.apply(objPoll2), "The mapper returned a null ObservableSource");
                    wt.r rVar = new wt.r(this, this.f10334f);
                    arrayDeque.offer(rVar);
                    g0Var.subscribe(rVar);
                    i10++;
                } catch (Throwable th2) {
                    qt.d.throwIfFatal(th2);
                    this.f10339k.dispose();
                    oVar.clear();
                    a();
                    this.f10336h.addThrowable(th2);
                    i0Var.onError(this.f10336h.terminate());
                    return;
                }
            }
            this.f10344p = i10;
            if (this.f10342n) {
                oVar.clear();
                a();
                return;
            }
            if (kVar2 == kVar && ((Throwable) this.f10336h.get()) != null) {
                oVar.clear();
                a();
                i0Var.onError(this.f10336h.terminate());
                return;
            }
            wt.r rVar2 = this.f10343o;
            if (rVar2 == null) {
                if (kVar2 == iu.k.f68412c && ((Throwable) this.f10336h.get()) != null) {
                    oVar.clear();
                    a();
                    i0Var.onError(this.f10336h.terminate());
                    return;
                }
                boolean z11 = this.f10340l;
                wt.r rVar3 = (wt.r) arrayDeque.poll();
                boolean z12 = rVar3 == null;
                if (z11 && z12) {
                    if (((Throwable) this.f10336h.get()) == null) {
                        i0Var.onComplete();
                        return;
                    }
                    oVar.clear();
                    a();
                    i0Var.onError(this.f10336h.terminate());
                    return;
                }
                if (!z12) {
                    this.f10343o = rVar3;
                }
                rVar2 = rVar3;
            }
            if (rVar2 != null) {
                vt.o oVarQueue = rVar2.queue();
                while (!this.f10342n) {
                    boolean zIsDone = rVar2.isDone();
                    if (kVar2 == kVar && ((Throwable) this.f10336h.get()) != null) {
                        oVar.clear();
                        a();
                        i0Var.onError(this.f10336h.terminate());
                        return;
                    }
                    try {
                        objPoll = oVarQueue.poll();
                        z10 = objPoll == null;
                    } catch (Throwable th3) {
                        qt.d.throwIfFatal(th3);
                        this.f10336h.addThrowable(th3);
                        this.f10343o = null;
                        this.f10344p--;
                    }
                    if (zIsDone && z10) {
                        this.f10343o = null;
                        this.f10344p--;
                    } else if (!z10) {
                        i0Var.onNext(objPoll);
                    }
                }
                oVar.clear();
                a();
                return;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // wt.s
    public void innerComplete(wt.r rVar) {
        rVar.setDone();
        drain();
    }

    @Override // wt.s
    public void innerError(wt.r rVar, Throwable th2) {
        if (!this.f10336h.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (this.f10335g == iu.k.f68411b) {
            this.f10339k.dispose();
        }
        rVar.setDone();
        drain();
    }

    @Override // wt.s
    public void innerNext(wt.r rVar, Object obj) {
        rVar.queue().offer(obj);
        drain();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10342n;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10340l = true;
        drain();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (!this.f10336h.addThrowable(th2)) {
            mu.a.onError(th2);
        } else {
            this.f10340l = true;
            drain();
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10341m == 0) {
            this.f10338j.offer(obj);
        }
        drain();
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10339k, cVar)) {
            this.f10339k = cVar;
            if (cVar instanceof vt.j) {
                vt.j jVar = (vt.j) cVar;
                int iRequestFusion = jVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f10341m = iRequestFusion;
                    this.f10338j = jVar;
                    this.f10340l = true;
                    this.f10331b.onSubscribe(this);
                    drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f10341m = iRequestFusion;
                    this.f10338j = jVar;
                    this.f10331b.onSubscribe(this);
                    return;
                }
            }
            this.f10338j = new eu.d(this.f10334f);
            this.f10331b.onSubscribe(this);
        }
    }
}
