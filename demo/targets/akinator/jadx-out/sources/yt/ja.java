package yt;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ja extends AtomicInteger implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95743b;

    /* renamed from: c, reason: collision with root package name */
    public final hu.f f95744c;

    /* renamed from: e, reason: collision with root package name */
    public final tw.b f95745e;

    /* renamed from: f, reason: collision with root package name */
    public final st.d f95746f;

    /* renamed from: g, reason: collision with root package name */
    public int f95747g;

    /* renamed from: h, reason: collision with root package name */
    public long f95748h;

    public ja(tw.c cVar, st.d dVar, hu.f fVar, tw.b bVar) {
        this.f95743b = cVar;
        this.f95744c = fVar;
        this.f95745e = bVar;
        this.f95746f = dVar;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            do {
                hu.f fVar = this.f95744c;
                if (fVar.isCancelled()) {
                    return;
                }
                long j10 = this.f95748h;
                if (j10 != 0) {
                    this.f95748h = 0L;
                    fVar.produced(j10);
                }
                this.f95745e.subscribe(this);
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95743b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        tw.c cVar = this.f95743b;
        try {
            st.d dVar = this.f95746f;
            int i10 = this.f95747g + 1;
            this.f95747g = i10;
            if (((ut.n0) dVar).test(Integer.valueOf(i10), th2)) {
                a();
            } else {
                cVar.onError(th2);
            }
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            cVar.onError(new qt.c(th2, th3));
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f95748h++;
        this.f95743b.onNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        this.f95744c.setSubscription(dVar);
    }
}
