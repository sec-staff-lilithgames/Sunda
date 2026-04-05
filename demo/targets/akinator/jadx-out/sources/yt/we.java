package yt;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class we extends gu.n implements tw.d, Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final long f96519k;

    /* renamed from: l, reason: collision with root package name */
    public final long f96520l;

    /* renamed from: m, reason: collision with root package name */
    public final TimeUnit f96521m;

    /* renamed from: n, reason: collision with root package name */
    public final m0.a f96522n;

    /* renamed from: o, reason: collision with root package name */
    public final int f96523o;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedList f96524p;

    /* renamed from: q, reason: collision with root package name */
    public tw.d f96525q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f96526r;

    public we(qu.d dVar, long j10, long j11, TimeUnit timeUnit, m0.a aVar, int i10) {
        super(dVar, new eu.b());
        this.f96519k = j10;
        this.f96520l = j11;
        this.f96521m = timeUnit;
        this.f96522n = aVar;
        this.f96523o = i10;
        this.f96524p = new LinkedList();
    }

    public final void U() {
        vt.n nVar = this.f58455g;
        tw.c cVar = this.f58454f;
        LinkedList linkedList = this.f96524p;
        int iLeave = 1;
        while (!this.f96526r) {
            boolean z10 = this.f58457i;
            Object objPoll = nVar.poll();
            boolean z11 = objPoll == null;
            boolean z12 = objPoll instanceof ve;
            if (z10 && (z11 || z12)) {
                nVar.clear();
                Throwable th2 = this.f58458j;
                if (th2 != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((nu.d) it.next()).onError(th2);
                    }
                } else {
                    Iterator it2 = linkedList.iterator();
                    while (it2.hasNext()) {
                        ((nu.d) it2.next()).onComplete();
                    }
                }
                linkedList.clear();
                this.f96522n.dispose();
                return;
            }
            if (z11) {
                iLeave = leave(-iLeave);
                if (iLeave == 0) {
                    return;
                }
            } else if (z12) {
                ve veVar = (ve) objPoll;
                if (!veVar.f96472b) {
                    linkedList.remove(veVar.f96471a);
                    veVar.f96471a.onComplete();
                    if (linkedList.isEmpty() && this.f58456h) {
                        this.f96526r = true;
                    }
                } else if (!this.f58456h) {
                    long jRequested = requested();
                    if (jRequested != 0) {
                        nu.d dVarCreate = nu.d.create(this.f96523o);
                        linkedList.add(dVarCreate);
                        cVar.onNext(dVarCreate);
                        if (jRequested != Long.MAX_VALUE) {
                            produced(1L);
                        }
                        this.f96522n.schedule(new ue(this, dVarCreate), this.f96519k, this.f96521m);
                    } else {
                        cVar.onError(new qt.e("Can't emit window due to lack of requests"));
                    }
                }
            } else {
                Iterator it3 = linkedList.iterator();
                while (it3.hasNext()) {
                    ((nu.d) it3.next()).onNext(objPoll);
                }
            }
        }
        this.f96525q.cancel();
        nVar.clear();
        linkedList.clear();
        this.f96522n.dispose();
    }

    @Override // tw.d
    public void cancel() {
        this.f58456h = true;
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
        if (fastEnter()) {
            Iterator it = this.f96524p.iterator();
            while (it.hasNext()) {
                ((nu.d) it.next()).onNext(obj);
            }
            if (leave(-1) == 0) {
                return;
            }
        } else {
            this.f58455g.offer(obj);
            if (!enter()) {
                return;
            }
        }
        U();
    }

    @Override // gu.n, mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96525q, dVar)) {
            this.f96525q = dVar;
            this.f58454f.onSubscribe(this);
            if (!this.f58456h) {
                long jRequested = requested();
                if (jRequested == 0) {
                    dVar.cancel();
                    this.f58454f.onError(new qt.e("Could not emit the first window due to lack of requests"));
                    return;
                }
                nu.d dVarCreate = nu.d.create(this.f96523o);
                this.f96524p.add(dVarCreate);
                this.f58454f.onNext(dVarCreate);
                if (jRequested != Long.MAX_VALUE) {
                    produced(1L);
                }
                this.f96522n.schedule(new ue(this, dVarCreate), this.f96519k, this.f96521m);
                m0.a aVar = this.f96522n;
                long j10 = this.f96520l;
                aVar.schedulePeriodically(this, j10, j10, this.f96521m);
                dVar.request(Long.MAX_VALUE);
            }
        }
    }

    @Override // tw.d
    public void request(long j10) {
        requested(j10);
    }

    @Override // java.lang.Runnable
    public void run() {
        ve veVar = new ve(nu.d.create(this.f96523o), true);
        if (!this.f58456h) {
            this.f58455g.offer(veVar);
        }
        if (enter()) {
            U();
        }
    }
}
