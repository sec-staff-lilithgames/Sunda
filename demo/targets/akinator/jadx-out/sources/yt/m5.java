package yt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m5 extends AtomicReference implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f95935b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f95936c;

    /* JADX WARN: Multi-variable type inference failed */
    public m5(k5 k5Var, boolean z10) {
        this.f95935b = (AtomicInteger) k5Var;
        this.f95936c = z10;
    }

    @Override // pt.c
    public void dispose() {
        hu.g.cancel(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == hu.g.f59176b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, yt.k5] */
    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95935b.innerComplete(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, yt.k5] */
    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f95935b.innerError(th2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, yt.k5] */
    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f95935b.innerValue(this.f95936c, obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.setOnce(this, dVar, Long.MAX_VALUE);
    }
}
