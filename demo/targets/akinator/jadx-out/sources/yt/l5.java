package yt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l5 extends AtomicReference implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f95851b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f95852c;

    /* renamed from: e, reason: collision with root package name */
    public final int f95853e;

    /* JADX WARN: Multi-variable type inference failed */
    public l5(k5 k5Var, boolean z10, int i10) {
        this.f95851b = (AtomicInteger) k5Var;
        this.f95852c = z10;
        this.f95853e = i10;
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
        this.f95851b.innerClose(this.f95852c, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, yt.k5] */
    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f95851b.innerCloseError(th2);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.atomic.AtomicInteger, yt.k5] */
    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (hu.g.cancel(this)) {
            this.f95851b.innerClose(this.f95852c, this);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.setOnce(this, dVar, Long.MAX_VALUE);
    }
}
