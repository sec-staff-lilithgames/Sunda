package gu;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class c extends CountDownLatch implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public Object f58422b;

    /* renamed from: c, reason: collision with root package name */
    public Throwable f58423c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f58424e;

    public c() {
        super(1);
    }

    public final Object blockingGet() throws InterruptedException {
        if (getCount() != 0) {
            try {
                iu.f.verifyNonBlocking();
                await();
            } catch (InterruptedException e10) {
                tw.d dVar = this.f58424e;
                this.f58424e = hu.g.f59176b;
                if (dVar != null) {
                    dVar.cancel();
                }
                throw iu.m.wrapOrThrow(e10);
            }
        }
        Throwable th2 = this.f58423c;
        if (th2 == null) {
            return this.f58422b;
        }
        throw iu.m.wrapOrThrow(th2);
    }

    @Override // mt.q, tw.c, mt.f
    public final void onComplete() {
        countDown();
    }

    @Override // mt.q, tw.c, mt.f
    public abstract /* synthetic */ void onError(Throwable th2);

    @Override // mt.q, tw.c
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // mt.q, tw.c
    public final void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f58424e, dVar)) {
            this.f58424e = dVar;
            dVar.request(Long.MAX_VALUE);
        }
    }
}
