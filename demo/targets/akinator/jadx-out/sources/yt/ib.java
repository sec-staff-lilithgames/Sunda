package yt;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ib extends AtomicInteger implements pt.c, fb {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f95688b;

    /* renamed from: c, reason: collision with root package name */
    public final st.d f95689c;

    /* renamed from: e, reason: collision with root package name */
    public final gb f95690e;

    /* renamed from: f, reason: collision with root package name */
    public final gb f95691f;

    /* renamed from: g, reason: collision with root package name */
    public final iu.d f95692g = new iu.d();

    /* renamed from: h, reason: collision with root package name */
    public Object f95693h;

    /* renamed from: i, reason: collision with root package name */
    public Object f95694i;

    public ib(mt.q0 q0Var, int i10, st.d dVar) {
        this.f95688b = q0Var;
        this.f95689c = dVar;
        this.f95690e = new gb(this, i10);
        this.f95691f = new gb(this, i10);
    }

    public final void a() {
        gb gbVar = this.f95690e;
        gbVar.cancel();
        gbVar.a();
        gb gbVar2 = this.f95691f;
        gbVar2.cancel();
        gbVar2.a();
    }

    @Override // pt.c
    public void dispose() {
        gb gbVar = this.f95690e;
        gbVar.cancel();
        gb gbVar2 = this.f95691f;
        gbVar2.cancel();
        if (getAndIncrement() == 0) {
            gbVar.a();
            gbVar2.a();
        }
    }

    @Override // yt.fb
    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        do {
            vt.o oVar = this.f95690e.f95549g;
            vt.o oVar2 = this.f95691f.f95549g;
            if (oVar != null && oVar2 != null) {
                while (!isDisposed()) {
                    if (((Throwable) this.f95692g.get()) != null) {
                        a();
                        this.f95688b.onError(this.f95692g.terminate());
                        return;
                    }
                    boolean z10 = this.f95690e.f95550h;
                    Object objPoll = this.f95693h;
                    if (objPoll == null) {
                        try {
                            objPoll = oVar.poll();
                            this.f95693h = objPoll;
                        } catch (Throwable th2) {
                            qt.d.throwIfFatal(th2);
                            a();
                            this.f95692g.addThrowable(th2);
                            this.f95688b.onError(this.f95692g.terminate());
                            return;
                        }
                    }
                    boolean z11 = objPoll == null;
                    boolean z12 = this.f95691f.f95550h;
                    Object objPoll2 = this.f95694i;
                    if (objPoll2 == null) {
                        try {
                            objPoll2 = oVar2.poll();
                            this.f95694i = objPoll2;
                        } catch (Throwable th3) {
                            qt.d.throwIfFatal(th3);
                            a();
                            this.f95692g.addThrowable(th3);
                            this.f95688b.onError(this.f95692g.terminate());
                            return;
                        }
                    }
                    boolean z13 = objPoll2 == null;
                    if (z10 && z12 && z11 && z13) {
                        this.f95688b.onSuccess(Boolean.TRUE);
                        return;
                    }
                    if (z10 && z12 && z11 != z13) {
                        a();
                        this.f95688b.onSuccess(Boolean.FALSE);
                        return;
                    }
                    if (!z11 && !z13) {
                        try {
                            if (!((ut.n0) this.f95689c).test(objPoll, objPoll2)) {
                                a();
                                this.f95688b.onSuccess(Boolean.FALSE);
                                return;
                            } else {
                                this.f95693h = null;
                                this.f95694i = null;
                                this.f95690e.request();
                                this.f95691f.request();
                            }
                        } catch (Throwable th4) {
                            qt.d.throwIfFatal(th4);
                            a();
                            this.f95692g.addThrowable(th4);
                            this.f95688b.onError(this.f95692g.terminate());
                            return;
                        }
                    }
                }
                this.f95690e.a();
                this.f95691f.a();
                return;
            }
            if (isDisposed()) {
                this.f95690e.a();
                this.f95691f.a();
                return;
            } else if (((Throwable) this.f95692g.get()) != null) {
                a();
                this.f95688b.onError(this.f95692g.terminate());
                return;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // yt.fb
    public void innerError(Throwable th2) {
        if (this.f95692g.addThrowable(th2)) {
            drain();
        } else {
            mu.a.onError(th2);
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f95690e.get() == hu.g.f59176b;
    }
}
