package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class tc extends AtomicReference implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uc f96374b;

    public tc(uc ucVar) {
        this.f96374b = ucVar;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        uc ucVar = this.f96374b;
        hu.g.cancel(ucVar.f96417e);
        iu.n.onComplete(ucVar.f96415b, ucVar, ucVar.f96418f);
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        uc ucVar = this.f96374b;
        hu.g.cancel(ucVar.f96417e);
        iu.n.onError(ucVar.f96415b, th2, ucVar, ucVar.f96418f);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        hu.g.cancel(this);
        onComplete();
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.setOnce(this, dVar, Long.MAX_VALUE);
    }
}
