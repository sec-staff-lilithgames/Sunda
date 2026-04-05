package gu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q extends AtomicReference implements mt.q, pt.c, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f58469b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f58470c = new AtomicReference();

    public q(tw.c cVar) {
        this.f58469b = cVar;
    }

    @Override // tw.d
    public void cancel() {
        dispose();
    }

    @Override // pt.c
    public void dispose() {
        hu.g.cancel(this.f58470c);
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f58470c.get() == hu.g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        tt.d.dispose(this);
        this.f58469b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        tt.d.dispose(this);
        this.f58469b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f58469b.onNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.setOnce(this.f58470c, dVar)) {
            this.f58469b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            ((tw.d) this.f58470c.get()).request(j10);
        }
    }

    public void setResource(pt.c cVar) {
        tt.d.set(this, cVar);
    }
}
