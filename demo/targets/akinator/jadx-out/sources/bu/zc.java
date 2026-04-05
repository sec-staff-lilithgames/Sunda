package bu;

import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class zc extends wt.u implements pt.c {

    /* renamed from: j, reason: collision with root package name */
    public final long f11329j;

    /* renamed from: k, reason: collision with root package name */
    public final TimeUnit f11330k;

    /* renamed from: l, reason: collision with root package name */
    public final mt.m0 f11331l;

    /* renamed from: m, reason: collision with root package name */
    public final int f11332m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f11333n;

    /* renamed from: o, reason: collision with root package name */
    public final long f11334o;

    /* renamed from: p, reason: collision with root package name */
    public final m0.a f11335p;

    /* renamed from: q, reason: collision with root package name */
    public long f11336q;

    /* renamed from: r, reason: collision with root package name */
    public long f11337r;

    /* renamed from: s, reason: collision with root package name */
    public pt.c f11338s;

    /* renamed from: t, reason: collision with root package name */
    public pu.h f11339t;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f11340u;

    /* renamed from: v, reason: collision with root package name */
    public final tt.h f11341v;

    public zc(ku.m mVar, long j10, TimeUnit timeUnit, mt.m0 m0Var, int i10, long j11, boolean z10) {
        super(mVar, new eu.b());
        this.f11341v = new tt.h();
        this.f11329j = j10;
        this.f11330k = timeUnit;
        this.f11331l = m0Var;
        this.f11332m = i10;
        this.f11334o = j11;
        this.f11333n = z10;
        if (z10) {
            this.f11335p = m0Var.createWorker();
        } else {
            this.f11335p = null;
        }
    }

    public final void U() {
        eu.b bVar = (eu.b) this.f91286f;
        mt.i0 i0Var = this.f91285e;
        pu.h hVarCreate = this.f11339t;
        int iLeave = 1;
        while (!this.f11340u) {
            boolean z10 = this.f91288h;
            Object objPoll = bVar.poll();
            boolean z11 = objPoll == null;
            boolean z12 = objPoll instanceof yc;
            if (z10 && (z11 || z12)) {
                this.f11339t = null;
                bVar.clear();
                Throwable th2 = this.f91289i;
                if (th2 != null) {
                    hVarCreate.onError(th2);
                } else {
                    hVarCreate.onComplete();
                }
                tt.d.dispose(this.f11341v);
                m0.a aVar = this.f11335p;
                if (aVar != null) {
                    aVar.dispose();
                    return;
                }
                return;
            }
            if (z11) {
                iLeave = leave(-iLeave);
                if (iLeave == 0) {
                    return;
                }
            } else if (z12) {
                yc ycVar = (yc) objPoll;
                if (!this.f11333n || this.f11337r == ycVar.f11266b) {
                    hVarCreate.onComplete();
                    this.f11336q = 0L;
                    hVarCreate = pu.h.create(this.f11332m);
                    this.f11339t = hVarCreate;
                    i0Var.onNext(hVarCreate);
                }
            } else {
                hVarCreate.onNext(iu.u.getValue(objPoll));
                long j10 = this.f11336q + 1;
                if (j10 >= this.f11334o) {
                    this.f11337r++;
                    this.f11336q = 0L;
                    hVarCreate.onComplete();
                    hVarCreate = pu.h.create(this.f11332m);
                    this.f11339t = hVarCreate;
                    this.f91285e.onNext(hVarCreate);
                    if (this.f11333n) {
                        pt.c cVar = (pt.c) this.f11341v.get();
                        cVar.dispose();
                        m0.a aVar2 = this.f11335p;
                        yc ycVar2 = new yc(this.f11337r, this);
                        long j11 = this.f11329j;
                        pt.c cVarSchedulePeriodically = aVar2.schedulePeriodically(ycVar2, j11, j11, this.f11330k);
                        if (!this.f11341v.compareAndSet(cVar, cVarSchedulePeriodically)) {
                            cVarSchedulePeriodically.dispose();
                        }
                    }
                } else {
                    this.f11336q = j10;
                }
            }
        }
        this.f11338s.dispose();
        bVar.clear();
        tt.d.dispose(this.f11341v);
        m0.a aVar3 = this.f11335p;
        if (aVar3 != null) {
            aVar3.dispose();
        }
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
        if (this.f11340u) {
            return;
        }
        if (fastEnter()) {
            pu.h hVar = this.f11339t;
            hVar.onNext(obj);
            long j10 = this.f11336q + 1;
            if (j10 >= this.f11334o) {
                this.f11337r++;
                this.f11336q = 0L;
                hVar.onComplete();
                pu.h hVarCreate = pu.h.create(this.f11332m);
                this.f11339t = hVarCreate;
                this.f91285e.onNext(hVarCreate);
                if (this.f11333n) {
                    ((pt.c) this.f11341v.get()).dispose();
                    m0.a aVar = this.f11335p;
                    yc ycVar = new yc(this.f11337r, this);
                    long j11 = this.f11329j;
                    tt.d.replace(this.f11341v, aVar.schedulePeriodically(ycVar, j11, j11, this.f11330k));
                }
            } else {
                this.f11336q = j10;
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
        pt.c cVarSchedulePeriodicallyDirect;
        if (tt.d.validate(this.f11338s, cVar)) {
            this.f11338s = cVar;
            mt.i0 i0Var = this.f91285e;
            i0Var.onSubscribe(this);
            if (this.f91287g) {
                return;
            }
            pu.h hVarCreate = pu.h.create(this.f11332m);
            this.f11339t = hVarCreate;
            i0Var.onNext(hVarCreate);
            yc ycVar = new yc(this.f11337r, this);
            if (this.f11333n) {
                m0.a aVar = this.f11335p;
                long j10 = this.f11329j;
                cVarSchedulePeriodicallyDirect = aVar.schedulePeriodically(ycVar, j10, j10, this.f11330k);
            } else {
                mt.m0 m0Var = this.f11331l;
                long j11 = this.f11329j;
                cVarSchedulePeriodicallyDirect = m0Var.schedulePeriodicallyDirect(ycVar, j11, j11, this.f11330k);
            }
            this.f11341v.replace(cVarSchedulePeriodicallyDirect);
        }
    }
}
