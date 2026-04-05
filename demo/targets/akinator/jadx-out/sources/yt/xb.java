package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class xb extends AtomicReference implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb f96569b;

    public xb(yb ybVar) {
        this.f96569b = ybVar;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96569b.f96614h = true;
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        yb ybVar = this.f96569b;
        hu.g.cancel(ybVar.f96610c);
        iu.n.onError(ybVar.f96609b, th2, ybVar, ybVar.f96613g);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f96569b.f96614h = true;
        ((tw.d) get()).cancel();
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.setOnce(this, dVar, Long.MAX_VALUE);
    }
}
