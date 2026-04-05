package wt;

import java.util.concurrent.CountDownLatch;
import mt.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class e extends CountDownLatch implements i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public Object f91245b;

    /* renamed from: c, reason: collision with root package name */
    public Throwable f91246c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f91247e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f91248f;

    public e() {
        super(1);
    }

    public final Object blockingGet() throws InterruptedException {
        if (getCount() != 0) {
            try {
                iu.f.verifyNonBlocking();
                await();
            } catch (InterruptedException e10) {
                dispose();
                throw iu.m.wrapOrThrow(e10);
            }
        }
        Throwable th2 = this.f91246c;
        if (th2 == null) {
            return this.f91245b;
        }
        throw iu.m.wrapOrThrow(th2);
    }

    @Override // pt.c
    public final void dispose() {
        this.f91248f = true;
        pt.c cVar = this.f91247e;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // pt.c
    public final boolean isDisposed() {
        return this.f91248f;
    }

    @Override // mt.i0, mt.f
    public final void onComplete() {
        countDown();
    }

    @Override // mt.i0, mt.f
    public abstract /* synthetic */ void onError(Throwable th2);

    @Override // mt.i0
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // mt.i0, mt.f
    public final void onSubscribe(pt.c cVar) {
        this.f91247e = cVar;
        if (this.f91248f) {
            cVar.dispose();
        }
    }
}
