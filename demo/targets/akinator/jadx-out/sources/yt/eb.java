package yt;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class eb extends hu.c implements fb {

    /* renamed from: e, reason: collision with root package name */
    public final st.d f95432e;

    /* renamed from: f, reason: collision with root package name */
    public final gb f95433f;

    /* renamed from: g, reason: collision with root package name */
    public final gb f95434g;

    /* renamed from: h, reason: collision with root package name */
    public final iu.d f95435h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f95436i;

    /* renamed from: j, reason: collision with root package name */
    public Object f95437j;

    /* renamed from: k, reason: collision with root package name */
    public Object f95438k;

    public eb(tw.c cVar, int i10, st.d dVar) {
        super(cVar);
        this.f95432e = dVar;
        this.f95436i = new AtomicInteger();
        this.f95433f = new gb(this, i10);
        this.f95434g = new gb(this, i10);
        this.f95435h = new iu.d();
    }

    public final void a() {
        gb gbVar = this.f95433f;
        gbVar.cancel();
        gbVar.a();
        gb gbVar2 = this.f95434g;
        gbVar2.cancel();
        gbVar2.a();
    }

    @Override // hu.c, hu.a, vt.l, tw.d
    public void cancel() {
        super.cancel();
        gb gbVar = this.f95433f;
        gbVar.cancel();
        gb gbVar2 = this.f95434g;
        gbVar2.cancel();
        if (this.f95436i.getAndIncrement() == 0) {
            gbVar.a();
            gbVar2.a();
        }
    }

    @Override // yt.fb
    public void drain() {
        if (this.f95436i.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        do {
            vt.o oVar = this.f95433f.f95549g;
            vt.o oVar2 = this.f95434g.f95549g;
            if (oVar != null && oVar2 != null) {
                while (!isCancelled()) {
                    if (((Throwable) this.f95435h.get()) != null) {
                        a();
                        this.f59162b.onError(this.f95435h.terminate());
                        return;
                    }
                    boolean z10 = this.f95433f.f95550h;
                    Object objPoll = this.f95437j;
                    if (objPoll == null) {
                        try {
                            objPoll = oVar.poll();
                            this.f95437j = objPoll;
                        } catch (Throwable th2) {
                            qt.d.throwIfFatal(th2);
                            a();
                            this.f95435h.addThrowable(th2);
                            this.f59162b.onError(this.f95435h.terminate());
                            return;
                        }
                    }
                    boolean z11 = objPoll == null;
                    boolean z12 = this.f95434g.f95550h;
                    Object objPoll2 = this.f95438k;
                    if (objPoll2 == null) {
                        try {
                            objPoll2 = oVar2.poll();
                            this.f95438k = objPoll2;
                        } catch (Throwable th3) {
                            qt.d.throwIfFatal(th3);
                            a();
                            this.f95435h.addThrowable(th3);
                            this.f59162b.onError(this.f95435h.terminate());
                            return;
                        }
                    }
                    boolean z13 = objPoll2 == null;
                    if (z10 && z12 && z11 && z13) {
                        complete(Boolean.TRUE);
                        return;
                    }
                    if (z10 && z12 && z11 != z13) {
                        a();
                        complete(Boolean.FALSE);
                        return;
                    }
                    if (!z11 && !z13) {
                        try {
                            if (!((ut.n0) this.f95432e).test(objPoll, objPoll2)) {
                                a();
                                complete(Boolean.FALSE);
                                return;
                            } else {
                                this.f95437j = null;
                                this.f95438k = null;
                                this.f95433f.request();
                                this.f95434g.request();
                            }
                        } catch (Throwable th4) {
                            qt.d.throwIfFatal(th4);
                            a();
                            this.f95435h.addThrowable(th4);
                            this.f59162b.onError(this.f95435h.terminate());
                            return;
                        }
                    }
                }
                this.f95433f.a();
                this.f95434g.a();
                return;
            }
            if (isCancelled()) {
                this.f95433f.a();
                this.f95434g.a();
                return;
            } else if (((Throwable) this.f95435h.get()) != null) {
                a();
                this.f59162b.onError(this.f95435h.terminate());
                return;
            }
            iAddAndGet = this.f95436i.addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // yt.fb
    public void innerError(Throwable th2) {
        if (this.f95435h.addThrowable(th2)) {
            drain();
        } else {
            mu.a.onError(th2);
        }
    }
}
