package yt;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n9 extends AtomicInteger implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96003b;

    /* renamed from: c, reason: collision with root package name */
    public final hu.f f96004c;

    /* renamed from: e, reason: collision with root package name */
    public final tw.b f96005e;

    /* renamed from: f, reason: collision with root package name */
    public final st.e f96006f;

    /* renamed from: g, reason: collision with root package name */
    public long f96007g;

    public n9(tw.c cVar, st.e eVar, hu.f fVar, tw.b bVar) {
        this.f96003b = cVar;
        this.f96004c = fVar;
        this.f96005e = bVar;
        this.f96006f = eVar;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            do {
                hu.f fVar = this.f96004c;
                if (fVar.isCancelled()) {
                    return;
                }
                long j10 = this.f96007g;
                if (j10 != 0) {
                    this.f96007g = 0L;
                    fVar.produced(j10);
                }
                this.f96005e.subscribe(this);
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        tw.c cVar = this.f96003b;
        try {
            if (((z) this.f96006f).getAsBoolean()) {
                cVar.onComplete();
            } else {
                a();
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            cVar.onError(th2);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f96003b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f96007g++;
        this.f96003b.onNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        this.f96004c.setSubscription(dVar);
    }
}
