package yt;

import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t7 extends r7 {

    /* renamed from: p, reason: collision with root package name */
    public final tw.c f96361p;

    public t7(tw.c cVar, m0.a aVar, boolean z10, int i10) {
        super(aVar, z10, i10);
        this.f96361p = cVar;
    }

    @Override // yt.r7
    public final void b() {
        tw.c cVar = this.f96361p;
        vt.o oVar = this.f96246i;
        long j10 = this.f96251n;
        int iAddAndGet = 1;
        while (true) {
            long jAddAndGet = this.f96244g.get();
            while (j10 != jAddAndGet) {
                boolean z10 = this.f96248k;
                try {
                    Object objPoll = oVar.poll();
                    boolean z11 = objPoll == null;
                    if (a(cVar, z10, z11)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    cVar.onNext(objPoll);
                    j10++;
                    if (j10 == this.f96243f) {
                        if (jAddAndGet != Long.MAX_VALUE) {
                            jAddAndGet = this.f96244g.addAndGet(-j10);
                        }
                        this.f96245h.request(j10);
                        j10 = 0;
                    }
                } catch (Throwable th2) {
                    qt.d.throwIfFatal(th2);
                    this.f96247j = true;
                    this.f96245h.cancel();
                    oVar.clear();
                    cVar.onError(th2);
                    this.f96240b.dispose();
                    return;
                }
            }
            if (j10 == jAddAndGet && a(cVar, this.f96248k, oVar.isEmpty())) {
                return;
            }
            int i10 = get();
            if (iAddAndGet == i10) {
                this.f96251n = j10;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iAddAndGet = i10;
            }
        }
    }

    @Override // yt.r7
    public final void c() {
        int iAddAndGet = 1;
        while (!this.f96247j) {
            boolean z10 = this.f96248k;
            this.f96361p.onNext(null);
            if (z10) {
                this.f96247j = true;
                Throwable th2 = this.f96249l;
                if (th2 != null) {
                    this.f96361p.onError(th2);
                } else {
                    this.f96361p.onComplete();
                }
                this.f96240b.dispose();
                return;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // yt.r7
    public final void d() {
        tw.c cVar = this.f96361p;
        vt.o oVar = this.f96246i;
        long j10 = this.f96251n;
        int iAddAndGet = 1;
        while (true) {
            long j11 = this.f96244g.get();
            while (j10 != j11) {
                try {
                    Object objPoll = oVar.poll();
                    if (this.f96247j) {
                        return;
                    }
                    if (objPoll == null) {
                        this.f96247j = true;
                        cVar.onComplete();
                        this.f96240b.dispose();
                        return;
                    }
                    cVar.onNext(objPoll);
                    j10++;
                } catch (Throwable th2) {
                    qt.d.throwIfFatal(th2);
                    this.f96247j = true;
                    this.f96245h.cancel();
                    cVar.onError(th2);
                    this.f96240b.dispose();
                    return;
                }
            }
            if (this.f96247j) {
                return;
            }
            if (oVar.isEmpty()) {
                this.f96247j = true;
                cVar.onComplete();
                this.f96240b.dispose();
                return;
            } else {
                int i10 = get();
                if (iAddAndGet == i10) {
                    this.f96251n = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i10;
                }
            }
        }
    }

    @Override // yt.r7, mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96245h, dVar)) {
            this.f96245h = dVar;
            if (dVar instanceof vt.l) {
                vt.l lVar = (vt.l) dVar;
                int iRequestFusion = lVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f96250m = 1;
                    this.f96246i = lVar;
                    this.f96248k = true;
                    this.f96361p.onSubscribe(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f96250m = 2;
                    this.f96246i = lVar;
                    this.f96361p.onSubscribe(this);
                    dVar.request(this.f96242e);
                    return;
                }
            }
            this.f96246i = new eu.c(this.f96242e);
            this.f96361p.onSubscribe(this);
            dVar.request(this.f96242e);
        }
    }

    @Override // yt.r7, hu.a, vt.l, vt.k, vt.o
    public Object poll() throws Exception {
        Object objPoll = this.f96246i.poll();
        if (objPoll != null && this.f96250m != 1) {
            long j10 = this.f96251n + 1;
            if (j10 == this.f96243f) {
                this.f96251n = 0L;
                this.f96245h.request(j10);
                return objPoll;
            }
            this.f96251n = j10;
        }
        return objPoll;
    }
}
