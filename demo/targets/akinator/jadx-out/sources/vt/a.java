package vt;

import mt.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface a extends q {
    @Override // mt.q, tw.c, mt.f
    /* synthetic */ void onComplete();

    @Override // mt.q, tw.c, mt.f
    /* synthetic */ void onError(Throwable th2);

    @Override // mt.q, tw.c
    /* synthetic */ void onNext(Object obj);

    @Override // mt.q, tw.c
    /* synthetic */ void onSubscribe(tw.d dVar);

    boolean tryOnNext(Object obj);
}
