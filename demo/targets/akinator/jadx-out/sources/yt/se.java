package yt;

import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class se extends gu.n implements tw.d {

    /* renamed from: k, reason: collision with root package name */
    public final long f96327k;

    /* renamed from: l, reason: collision with root package name */
    public final TimeUnit f96328l;

    /* renamed from: m, reason: collision with root package name */
    public final mt.m0 f96329m;

    /* renamed from: n, reason: collision with root package name */
    public final int f96330n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f96331o;

    /* renamed from: p, reason: collision with root package name */
    public final long f96332p;

    /* renamed from: q, reason: collision with root package name */
    public final m0.a f96333q;

    /* renamed from: r, reason: collision with root package name */
    public long f96334r;

    /* renamed from: s, reason: collision with root package name */
    public long f96335s;

    /* renamed from: t, reason: collision with root package name */
    public tw.d f96336t;

    /* renamed from: u, reason: collision with root package name */
    public nu.d f96337u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f96338v;

    /* renamed from: w, reason: collision with root package name */
    public final tt.h f96339w;

    public se(qu.d dVar, long j10, TimeUnit timeUnit, mt.m0 m0Var, int i10, long j11, boolean z10) {
        super(dVar, new eu.b());
        this.f96339w = new tt.h();
        this.f96327k = j10;
        this.f96328l = timeUnit;
        this.f96329m = m0Var;
        this.f96330n = i10;
        this.f96332p = j11;
        this.f96331o = z10;
        if (z10) {
            this.f96333q = m0Var.createWorker();
        } else {
            this.f96333q = null;
        }
    }

    public final void U() {
        vt.n nVar = this.f58455g;
        tw.c cVar = this.f58454f;
        nu.d dVarCreate = this.f96337u;
        int iLeave = 1;
        while (!this.f96338v) {
            boolean z10 = this.f58457i;
            Object objPoll = nVar.poll();
            boolean z11 = objPoll == null;
            boolean z12 = objPoll instanceof re;
            if (z10 && (z11 || z12)) {
                this.f96337u = null;
                nVar.clear();
                Throwable th2 = this.f58458j;
                if (th2 != null) {
                    dVarCreate.onError(th2);
                } else {
                    dVarCreate.onComplete();
                }
                disposeTimer();
                return;
            }
            if (z11) {
                iLeave = leave(-iLeave);
                if (iLeave == 0) {
                    return;
                }
            } else {
                int i10 = iLeave;
                if (z12) {
                    re reVar = (re) objPoll;
                    if (!this.f96331o || this.f96335s == reVar.f96286b) {
                        dVarCreate.onComplete();
                        this.f96334r = 0L;
                        dVarCreate = nu.d.create(this.f96330n);
                        this.f96337u = dVarCreate;
                        long jRequested = requested();
                        if (jRequested == 0) {
                            this.f96337u = null;
                            this.f58455g.clear();
                            this.f96336t.cancel();
                            cVar.onError(new qt.e("Could not deliver first window due to lack of requests."));
                            disposeTimer();
                            return;
                        }
                        cVar.onNext(dVarCreate);
                        if (jRequested != Long.MAX_VALUE) {
                            produced(1L);
                        }
                    }
                } else {
                    dVarCreate.onNext(iu.u.getValue(objPoll));
                    long j10 = this.f96334r + 1;
                    if (j10 >= this.f96332p) {
                        this.f96335s++;
                        this.f96334r = 0L;
                        dVarCreate.onComplete();
                        long jRequested2 = requested();
                        if (jRequested2 == 0) {
                            this.f96337u = null;
                            this.f96336t.cancel();
                            this.f58454f.onError(new qt.e("Could not deliver window due to lack of requests"));
                            disposeTimer();
                            return;
                        }
                        dVarCreate = nu.d.create(this.f96330n);
                        this.f96337u = dVarCreate;
                        this.f58454f.onNext(dVarCreate);
                        if (jRequested2 != Long.MAX_VALUE) {
                            produced(1L);
                        }
                        if (this.f96331o) {
                            ((pt.c) this.f96339w.get()).dispose();
                            m0.a aVar = this.f96333q;
                            re reVar2 = new re(this.f96335s, this);
                            long j11 = this.f96327k;
                            this.f96339w.replace(aVar.schedulePeriodically(reVar2, j11, j11, this.f96328l));
                        }
                    } else {
                        this.f96334r = j10;
                    }
                }
                iLeave = i10;
            }
        }
        this.f96336t.cancel();
        nVar.clear();
        disposeTimer();
    }

    @Override // tw.d
    public void cancel() {
        this.f58456h = true;
    }

    public void disposeTimer() {
        this.f96339w.dispose();
        m0.a aVar = this.f96333q;
        if (aVar != null) {
            aVar.dispose();
        }
    }

    @Override // gu.n, mt.q, tw.c, mt.f
    public void onComplete() {
        this.f58457i = true;
        if (enter()) {
            U();
        }
        this.f58454f.onComplete();
    }

    @Override // gu.n, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f58458j = th2;
        this.f58457i = true;
        if (enter()) {
            U();
        }
        this.f58454f.onError(th2);
    }

    @Override // gu.n, mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f96338v) {
            return;
        }
        if (fastEnter()) {
            nu.d dVar = this.f96337u;
            dVar.onNext(obj);
            long j10 = this.f96334r + 1;
            if (j10 >= this.f96332p) {
                this.f96335s++;
                this.f96334r = 0L;
                dVar.onComplete();
                long jRequested = requested();
                if (jRequested == 0) {
                    this.f96337u = null;
                    this.f96336t.cancel();
                    this.f58454f.onError(new qt.e("Could not deliver window due to lack of requests"));
                    disposeTimer();
                    return;
                }
                nu.d dVarCreate = nu.d.create(this.f96330n);
                this.f96337u = dVarCreate;
                this.f58454f.onNext(dVarCreate);
                if (jRequested != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (this.f96331o) {
                    ((pt.c) this.f96339w.get()).dispose();
                    m0.a aVar = this.f96333q;
                    re reVar = new re(this.f96335s, this);
                    long j11 = this.f96327k;
                    this.f96339w.replace(aVar.schedulePeriodically(reVar, j11, j11, this.f96328l));
                }
            } else {
                this.f96334r = j10;
            }
            if (leave(-1) == 0) {
                return;
            }
        } else {
            this.f58455g.offer(iu.u.next(obj));
            if (!enter()) {
                return;
            }
        }
        U();
    }

    @Override // gu.n, mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        pt.c cVarSchedulePeriodicallyDirect;
        if (hu.g.validate(this.f96336t, dVar)) {
            this.f96336t = dVar;
            tw.c cVar = this.f58454f;
            cVar.onSubscribe(this);
            if (this.f58456h) {
                return;
            }
            nu.d dVarCreate = nu.d.create(this.f96330n);
            this.f96337u = dVarCreate;
            long jRequested = requested();
            if (jRequested == 0) {
                this.f58456h = true;
                dVar.cancel();
                cVar.onError(new qt.e("Could not deliver initial window due to lack of requests."));
                return;
            }
            cVar.onNext(dVarCreate);
            if (jRequested != Long.MAX_VALUE) {
                produced(1L);
            }
            re reVar = new re(this.f96335s, this);
            if (this.f96331o) {
                m0.a aVar = this.f96333q;
                long j10 = this.f96327k;
                cVarSchedulePeriodicallyDirect = aVar.schedulePeriodically(reVar, j10, j10, this.f96328l);
            } else {
                mt.m0 m0Var = this.f96329m;
                long j11 = this.f96327k;
                cVarSchedulePeriodicallyDirect = m0Var.schedulePeriodicallyDirect(reVar, j11, j11, this.f96328l);
            }
            if (this.f96339w.replace(cVarSchedulePeriodicallyDirect)) {
                dVar.request(Long.MAX_VALUE);
            }
        }
    }

    @Override // tw.d
    public void request(long j10) {
        requested(j10);
    }
}
