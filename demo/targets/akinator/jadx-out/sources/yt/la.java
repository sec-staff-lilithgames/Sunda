package yt;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class la extends AtomicInteger implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95886b;

    /* renamed from: c, reason: collision with root package name */
    public final hu.f f95887c;

    /* renamed from: e, reason: collision with root package name */
    public final tw.b f95888e;

    /* renamed from: f, reason: collision with root package name */
    public final st.q f95889f;

    /* renamed from: g, reason: collision with root package name */
    public long f95890g;

    /* renamed from: h, reason: collision with root package name */
    public long f95891h;

    public la(tw.c cVar, long j10, st.q qVar, hu.f fVar, tw.b bVar) {
        this.f95886b = cVar;
        this.f95887c = fVar;
        this.f95888e = bVar;
        this.f95889f = qVar;
        this.f95890g = j10;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            do {
                hu.f fVar = this.f95887c;
                if (fVar.isCancelled()) {
                    return;
                }
                long j10 = this.f95891h;
                if (j10 != 0) {
                    this.f95891h = 0L;
                    fVar.produced(j10);
                }
                this.f95888e.subscribe(this);
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95886b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        long j10 = this.f95890g;
        if (j10 != Long.MAX_VALUE) {
            this.f95890g = j10 - 1;
        }
        tw.c cVar = this.f95886b;
        if (j10 == 0) {
            cVar.onError(th2);
            return;
        }
        try {
            if (this.f95889f.test(th2)) {
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
        this.f95891h++;
        this.f95886b.onNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        this.f95887c.setSubscription(dVar);
    }
}
