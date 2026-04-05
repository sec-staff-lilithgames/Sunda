package bu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class sc extends wt.u implements pt.c {

    /* renamed from: j, reason: collision with root package name */
    public final mt.g0 f10983j;

    /* renamed from: k, reason: collision with root package name */
    public final st.o f10984k;

    /* renamed from: l, reason: collision with root package name */
    public final int f10985l;

    /* renamed from: m, reason: collision with root package name */
    public final pt.b f10986m;

    /* renamed from: n, reason: collision with root package name */
    public pt.c f10987n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicReference f10988o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f10989p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicLong f10990q;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f10991r;

    public sc(ku.m mVar, mt.g0 g0Var, st.o oVar, int i10) {
        super(mVar, new eu.b());
        this.f10988o = new AtomicReference();
        AtomicLong atomicLong = new AtomicLong();
        this.f10990q = atomicLong;
        this.f10991r = new AtomicBoolean();
        this.f10983j = g0Var;
        this.f10984k = oVar;
        this.f10985l = i10;
        this.f10986m = new pt.b();
        this.f10989p = new ArrayList();
        atomicLong.lazySet(1L);
    }

    public final void U() {
        eu.b bVar = (eu.b) this.f91286f;
        mt.i0 i0Var = this.f91285e;
        ArrayList arrayList = this.f10989p;
        int iLeave = 1;
        while (true) {
            boolean z10 = this.f91288h;
            Object objPoll = bVar.poll();
            boolean z11 = objPoll == null;
            if (z10 && z11) {
                this.f10986m.dispose();
                tt.d.dispose(this.f10988o);
                Throwable th2 = this.f91289i;
                if (th2 != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((pu.h) it.next()).onError(th2);
                    }
                } else {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((pu.h) it2.next()).onComplete();
                    }
                }
                arrayList.clear();
                return;
            }
            if (z11) {
                iLeave = leave(-iLeave);
                if (iLeave == 0) {
                    return;
                }
            } else if (objPoll instanceof tc) {
                tc tcVar = (tc) objPoll;
                pu.h hVar = tcVar.f11057a;
                if (hVar != null) {
                    if (arrayList.remove(hVar)) {
                        tcVar.f11057a.onComplete();
                        if (this.f10990q.decrementAndGet() == 0) {
                            this.f10986m.dispose();
                            tt.d.dispose(this.f10988o);
                            return;
                        }
                    } else {
                        continue;
                    }
                } else if (!this.f10991r.get()) {
                    pu.h hVarCreate = pu.h.create(this.f10985l);
                    arrayList.add(hVarCreate);
                    i0Var.onNext(hVarCreate);
                    try {
                        mt.g0 g0Var = (mt.g0) ut.o0.requireNonNull(this.f10984k.apply(tcVar.f11058b), "The ObservableSource supplied is null");
                        qc qcVar = new qc(this, hVarCreate);
                        if (this.f10986m.add(qcVar)) {
                            this.f10990q.getAndIncrement();
                            g0Var.subscribe(qcVar);
                        }
                    } catch (Throwable th3) {
                        qt.d.throwIfFatal(th3);
                        this.f10991r.set(true);
                        i0Var.onError(th3);
                    }
                }
            } else {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((pu.h) it3.next()).onNext(iu.u.getValue(objPoll));
                }
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        if (this.f10991r.compareAndSet(false, true)) {
            tt.d.dispose(this.f10988o);
            if (this.f10990q.decrementAndGet() == 0) {
                this.f10987n.dispose();
            }
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10991r.get();
    }

    @Override // wt.u, mt.i0, mt.f
    public void onComplete() {
        if (this.f91288h) {
            return;
        }
        this.f91288h = true;
        if (enter()) {
            U();
        }
        if (this.f10990q.decrementAndGet() == 0) {
            this.f10986m.dispose();
        }
        this.f91285e.onComplete();
    }

    @Override // wt.u, mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f91288h) {
            mu.a.onError(th2);
            return;
        }
        this.f91289i = th2;
        this.f91288h = true;
        if (enter()) {
            U();
        }
        if (this.f10990q.decrementAndGet() == 0) {
            this.f10986m.dispose();
        }
        this.f91285e.onError(th2);
    }

    @Override // wt.u, mt.i0
    public void onNext(Object obj) {
        if (fastEnter()) {
            Iterator it = this.f10989p.iterator();
            while (it.hasNext()) {
                ((pu.h) it.next()).onNext(obj);
            }
            if (leave(-1) == 0) {
                return;
            }
        } else {
            this.f91286f.offer(iu.u.next(obj));
            if (!enter()) {
                return;
            }
        }
        U();
    }

    @Override // wt.u, mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        AtomicReference atomicReference;
        if (tt.d.validate(this.f10987n, cVar)) {
            this.f10987n = cVar;
            this.f91285e.onSubscribe(this);
            if (this.f10991r.get()) {
                return;
            }
            rc rcVar = new rc(this);
            do {
                atomicReference = this.f10988o;
                if (atomicReference.compareAndSet(null, rcVar)) {
                    this.f10983j.subscribe(rcVar);
                    return;
                }
            } while (atomicReference.get() == null);
        }
    }

    @Override // wt.u, iu.v
    public void accept(mt.i0 i0Var, Object obj) {
    }
}
