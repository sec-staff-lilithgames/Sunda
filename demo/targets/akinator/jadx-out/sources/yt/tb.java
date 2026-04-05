package yt;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class tb extends ArrayDeque implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96371b;

    /* renamed from: c, reason: collision with root package name */
    public final int f96372c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f96373e;

    public tb(tw.c cVar, int i10) {
        super(i10);
        this.f96371b = cVar;
        this.f96372c = i10;
    }

    @Override // tw.d
    public void cancel() {
        this.f96373e.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96371b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f96371b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f96372c == size()) {
            this.f96371b.onNext(poll());
        } else {
            this.f96373e.request(1L);
        }
        offer(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96373e, dVar)) {
            this.f96373e = dVar;
            this.f96371b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        this.f96373e.request(j10);
    }
}
