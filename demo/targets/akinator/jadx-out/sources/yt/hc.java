package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class hc extends AtomicReference implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final ic f95602b;

    /* renamed from: c, reason: collision with root package name */
    public final long f95603c;

    /* renamed from: e, reason: collision with root package name */
    public final int f95604e;

    /* renamed from: f, reason: collision with root package name */
    public volatile vt.o f95605f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f95606g;

    /* renamed from: h, reason: collision with root package name */
    public int f95607h;

    public hc(ic icVar, long j10, int i10) {
        this.f95602b = icVar;
        this.f95603c = j10;
        this.f95604e = i10;
    }

    public void cancel() {
        hu.g.cancel(this);
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        ic icVar = this.f95602b;
        if (this.f95603c == icVar.f95706m) {
            this.f95606g = true;
            icVar.b();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        ic icVar = this.f95602b;
        if (this.f95603c != icVar.f95706m || !icVar.f95701h.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (!icVar.f95699f) {
            icVar.f95703j.cancel();
            icVar.f95700g = true;
        }
        this.f95606g = true;
        icVar.b();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        ic icVar = this.f95602b;
        if (this.f95603c == icVar.f95706m) {
            if (this.f95607h != 0 || this.f95605f.offer(obj)) {
                icVar.b();
            } else {
                onError(new qt.e("Queue full?!"));
            }
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.setOnce(this, dVar)) {
            if (dVar instanceof vt.l) {
                vt.l lVar = (vt.l) dVar;
                int iRequestFusion = lVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f95607h = iRequestFusion;
                    this.f95605f = lVar;
                    this.f95606g = true;
                    this.f95602b.b();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f95607h = iRequestFusion;
                    this.f95605f = lVar;
                    dVar.request(this.f95604e);
                    return;
                }
            }
            this.f95605f = new eu.c(this.f95604e);
            dVar.request(this.f95604e);
        }
    }

    public void request(long j10) {
        if (this.f95607h != 1) {
            ((tw.d) get()).request(j10);
        }
    }
}
