package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class gf extends AtomicReference implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final ff f95557b;

    /* renamed from: c, reason: collision with root package name */
    public final int f95558c;

    /* renamed from: e, reason: collision with root package name */
    public final int f95559e;

    /* renamed from: f, reason: collision with root package name */
    public vt.o f95560f;

    /* renamed from: g, reason: collision with root package name */
    public long f95561g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f95562h;

    /* renamed from: i, reason: collision with root package name */
    public int f95563i;

    public gf(ff ffVar, int i10) {
        this.f95557b = ffVar;
        this.f95558c = i10;
        this.f95559e = i10 - (i10 >> 2);
    }

    @Override // tw.d
    public void cancel() {
        hu.g.cancel(this);
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95562h = true;
        this.f95557b.b();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        ff ffVar = this.f95557b;
        if (!ffVar.f95500g.addThrowable(th2)) {
            mu.a.onError(th2);
        } else {
            this.f95562h = true;
            ffVar.b();
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95563i != 2) {
            this.f95560f.offer(obj);
        }
        this.f95557b.b();
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.setOnce(this, dVar)) {
            if (dVar instanceof vt.l) {
                vt.l lVar = (vt.l) dVar;
                int iRequestFusion = lVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f95563i = iRequestFusion;
                    this.f95560f = lVar;
                    this.f95562h = true;
                    this.f95557b.b();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f95563i = iRequestFusion;
                    this.f95560f = lVar;
                    dVar.request(this.f95558c);
                    return;
                }
            }
            this.f95560f = new eu.c(this.f95558c);
            dVar.request(this.f95558c);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (this.f95563i != 1) {
            long j11 = this.f95561g + j10;
            if (j11 < this.f95559e) {
                this.f95561g = j11;
            } else {
                this.f95561g = 0L;
                ((tw.d) get()).request(j11);
            }
        }
    }
}
