package bu;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class dd extends wt.u implements pt.c, Runnable {

    /* renamed from: j, reason: collision with root package name */
    public final long f10224j;

    /* renamed from: k, reason: collision with root package name */
    public final long f10225k;

    /* renamed from: l, reason: collision with root package name */
    public final TimeUnit f10226l;

    /* renamed from: m, reason: collision with root package name */
    public final m0.a f10227m;

    /* renamed from: n, reason: collision with root package name */
    public final int f10228n;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedList f10229o;

    /* renamed from: p, reason: collision with root package name */
    public pt.c f10230p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f10231q;

    public dd(ku.m mVar, long j10, long j11, TimeUnit timeUnit, m0.a aVar, int i10) {
        super(mVar, new eu.b());
        this.f10224j = j10;
        this.f10225k = j11;
        this.f10226l = timeUnit;
        this.f10227m = aVar;
        this.f10228n = i10;
        this.f10229o = new LinkedList();
    }

    public final void U() {
        eu.b bVar = (eu.b) this.f91286f;
        mt.i0 i0Var = this.f91285e;
        LinkedList linkedList = this.f10229o;
        int iLeave = 1;
        while (!this.f10231q) {
            boolean z10 = this.f91288h;
            Object objPoll = bVar.poll();
            boolean z11 = objPoll == null;
            boolean z12 = objPoll instanceof cd;
            if (z10 && (z11 || z12)) {
                bVar.clear();
                Throwable th2 = this.f91289i;
                if (th2 != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((pu.h) it.next()).onError(th2);
                    }
                } else {
                    Iterator it2 = linkedList.iterator();
                    while (it2.hasNext()) {
                        ((pu.h) it2.next()).onComplete();
                    }
                }
                linkedList.clear();
                this.f10227m.dispose();
                return;
            }
            if (z11) {
                iLeave = leave(-iLeave);
                if (iLeave == 0) {
                    return;
                }
            } else if (z12) {
                cd cdVar = (cd) objPoll;
                if (!cdVar.f10188b) {
                    linkedList.remove(cdVar.f10187a);
                    cdVar.f10187a.onComplete();
                    if (linkedList.isEmpty() && this.f91287g) {
                        this.f10231q = true;
                    }
                } else if (!this.f91287g) {
                    pu.h hVarCreate = pu.h.create(this.f10228n);
                    linkedList.add(hVarCreate);
                    i0Var.onNext(hVarCreate);
                    this.f10227m.schedule(new bd(this, hVarCreate), this.f10224j, this.f10226l);
                }
            } else {
                Iterator it3 = linkedList.iterator();
                while (it3.hasNext()) {
                    ((pu.h) it3.next()).onNext(objPoll);
                }
            }
        }
        this.f10230p.dispose();
        bVar.clear();
        linkedList.clear();
        this.f10227m.dispose();
    }

    @Override // pt.c
    public void dispose() {
        this.f91287g = true;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f91287g;
    }

    @Override // wt.u, mt.i0, mt.f
    public void onComplete() {
        this.f91288h = true;
        if (enter()) {
            U();
        }
        this.f91285e.onComplete();
    }

    @Override // wt.u, mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f91289i = th2;
        this.f91288h = true;
        if (enter()) {
            U();
        }
        this.f91285e.onError(th2);
    }

    @Override // wt.u, mt.i0
    public void onNext(Object obj) {
        if (fastEnter()) {
            Iterator it = this.f10229o.iterator();
            while (it.hasNext()) {
                ((pu.h) it.next()).onNext(obj);
            }
            if (leave(-1) == 0) {
                return;
            }
        } else {
            this.f91286f.offer(obj);
            if (!enter()) {
                return;
            }
        }
        U();
    }

    @Override // wt.u, mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10230p, cVar)) {
            this.f10230p = cVar;
            this.f91285e.onSubscribe(this);
            if (this.f91287g) {
                return;
            }
            pu.h hVarCreate = pu.h.create(this.f10228n);
            this.f10229o.add(hVarCreate);
            this.f91285e.onNext(hVarCreate);
            this.f10227m.schedule(new bd(this, hVarCreate), this.f10224j, this.f10226l);
            m0.a aVar = this.f10227m;
            long j10 = this.f10225k;
            aVar.schedulePeriodically(this, j10, j10, this.f10226l);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        cd cdVar = new cd(pu.h.create(this.f10228n), true);
        if (!this.f91287g) {
            this.f91286f.offer(cdVar);
        }
        if (enter()) {
            U();
        }
    }
}
