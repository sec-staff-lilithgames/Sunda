package yt;

import yt.g5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h5 extends rt.b {

    /* renamed from: e, reason: collision with root package name */
    public final i5 f95590e;

    public h5(Object obj, i5 i5Var) {
        super(obj);
        this.f95590e = i5Var;
    }

    public static <T, K> h5 createWith(K k10, int i10, g5.a aVar, boolean z10) {
        return new h5(k10, new i5(k10, i10, aVar, z10));
    }

    public void onComplete() {
        this.f95590e.onComplete();
    }

    public void onError(Throwable th2) {
        this.f95590e.onError(th2);
    }

    public void onNext(Object obj) {
        this.f95590e.onNext(obj);
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95590e.subscribe(cVar);
    }
}
