package yt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class gb extends AtomicReference implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f95545b;

    /* renamed from: c, reason: collision with root package name */
    public final int f95546c;

    /* renamed from: e, reason: collision with root package name */
    public final int f95547e;

    /* renamed from: f, reason: collision with root package name */
    public long f95548f;

    /* renamed from: g, reason: collision with root package name */
    public volatile vt.o f95549g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f95550h;

    /* renamed from: i, reason: collision with root package name */
    public int f95551i;

    /* JADX WARN: Multi-variable type inference failed */
    public gb(fb fbVar, int i10) {
        this.f95545b = (AtomicInteger) fbVar;
        this.f95547e = i10 - (i10 >> 2);
        this.f95546c = i10;
    }

    public final void a() {
        vt.o oVar = this.f95549g;
        if (oVar != null) {
            oVar.clear();
        }
    }

    public void cancel() {
        hu.g.cancel(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.atomic.AtomicInteger, yt.fb] */
    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95550h = true;
        this.f95545b.drain();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, yt.fb] */
    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f95545b.innerError(th2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.atomic.AtomicInteger, yt.fb] */
    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95551i != 0 || this.f95549g.offer(obj)) {
            this.f95545b.drain();
        } else {
            onError(new qt.e());
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.concurrent.atomic.AtomicInteger, yt.fb] */
    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.setOnce(this, dVar)) {
            if (dVar instanceof vt.l) {
                vt.l lVar = (vt.l) dVar;
                int iRequestFusion = lVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f95551i = iRequestFusion;
                    this.f95549g = lVar;
                    this.f95550h = true;
                    this.f95545b.drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f95551i = iRequestFusion;
                    this.f95549g = lVar;
                    dVar.request(this.f95546c);
                    return;
                }
            }
            this.f95549g = new eu.c(this.f95546c);
            dVar.request(this.f95546c);
        }
    }

    public void request() {
        if (this.f95551i != 1) {
            long j10 = this.f95548f + 1;
            if (j10 < this.f95547e) {
                this.f95548f = j10;
            } else {
                this.f95548f = 0L;
                ((tw.d) get()).request(j10);
            }
        }
    }
}
