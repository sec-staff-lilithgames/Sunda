package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a4 extends AtomicReference implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final long f95138b;

    /* renamed from: c, reason: collision with root package name */
    public final b4 f95139c;

    /* renamed from: e, reason: collision with root package name */
    public final int f95140e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95141f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f95142g;

    /* renamed from: h, reason: collision with root package name */
    public volatile vt.o f95143h;

    /* renamed from: i, reason: collision with root package name */
    public long f95144i;

    /* renamed from: j, reason: collision with root package name */
    public int f95145j;

    public a4(b4 b4Var, long j10) {
        this.f95138b = j10;
        this.f95139c = b4Var;
        int i10 = b4Var.f95209g;
        this.f95141f = i10;
        this.f95140e = i10 >> 2;
    }

    public final void a(long j10) {
        if (this.f95145j != 1) {
            long j11 = this.f95144i + j10;
            if (j11 < this.f95140e) {
                this.f95144i = j11;
            } else {
                this.f95144i = 0L;
                ((tw.d) get()).request(j11);
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        hu.g.cancel(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == hu.g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95142g = true;
        this.f95139c.b();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        lazySet(hu.g.f59176b);
        b4 b4Var = this.f95139c;
        if (!b4Var.f95212j.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        this.f95142g = true;
        if (!b4Var.f95207e) {
            b4Var.f95216n.cancel();
            for (a4 a4Var : (a4[]) b4Var.f95214l.getAndSet(b4.f95204u)) {
                a4Var.dispose();
            }
        }
        b4Var.b();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95145j == 2) {
            this.f95139c.b();
            return;
        }
        b4 b4Var = this.f95139c;
        if (b4Var.get() == 0 && b4Var.compareAndSet(0, 1)) {
            long j10 = b4Var.f95215m.get();
            vt.o cVar = this.f95143h;
            if (j10 == 0 || !(cVar == null || cVar.isEmpty())) {
                if (cVar == null && (cVar = this.f95143h) == null) {
                    cVar = new eu.c(b4Var.f95209g);
                    this.f95143h = cVar;
                }
                if (!cVar.offer(obj)) {
                    b4Var.onError(new qt.e("Inner queue full?!"));
                    return;
                }
            } else {
                b4Var.f95205b.onNext(obj);
                if (j10 != Long.MAX_VALUE) {
                    b4Var.f95215m.decrementAndGet();
                }
                a(1L);
            }
            if (b4Var.decrementAndGet() == 0) {
                return;
            }
        } else {
            vt.o cVar2 = this.f95143h;
            if (cVar2 == null) {
                cVar2 = new eu.c(b4Var.f95209g);
                this.f95143h = cVar2;
            }
            if (!cVar2.offer(obj)) {
                b4Var.onError(new qt.e("Inner queue full?!"));
                return;
            } else if (b4Var.getAndIncrement() != 0) {
                return;
            }
        }
        b4Var.c();
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.setOnce(this, dVar)) {
            if (dVar instanceof vt.l) {
                vt.l lVar = (vt.l) dVar;
                int iRequestFusion = lVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f95145j = iRequestFusion;
                    this.f95143h = lVar;
                    this.f95142g = true;
                    this.f95139c.b();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f95145j = iRequestFusion;
                    this.f95143h = lVar;
                }
            }
            dVar.request(this.f95141f);
        }
    }
}
