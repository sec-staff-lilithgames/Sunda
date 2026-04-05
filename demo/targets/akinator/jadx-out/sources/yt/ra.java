package yt;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class ra extends AtomicReference implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final qu.d f96270b;

    /* renamed from: c, reason: collision with root package name */
    public final tw.b f96271c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f96272e = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f96273f = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    public tw.d f96274g;

    public ra(qu.d dVar, tw.b bVar) {
        this.f96270b = dVar;
        this.f96271c = bVar;
    }

    public abstract void a();

    public final void b() {
        Object andSet = getAndSet(null);
        if (andSet != null) {
            AtomicLong atomicLong = this.f96272e;
            long j10 = atomicLong.get();
            qu.d dVar = this.f96270b;
            if (j10 != 0) {
                dVar.onNext(andSet);
                iu.e.produced(atomicLong, 1L);
            } else {
                cancel();
                dVar.onError(new qt.e("Couldn't emit value due to lack of requests!"));
            }
        }
    }

    public abstract void c();

    @Override // tw.d
    public void cancel() {
        hu.g.cancel(this.f96273f);
        this.f96274g.cancel();
    }

    public void complete() {
        this.f96274g.cancel();
        a();
    }

    public void error(Throwable th2) {
        this.f96274g.cancel();
        this.f96270b.onError(th2);
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        hu.g.cancel(this.f96273f);
        a();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        hu.g.cancel(this.f96273f);
        this.f96270b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        lazySet(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96274g, dVar)) {
            this.f96274g = dVar;
            this.f96270b.onSubscribe(this);
            if (this.f96273f.get() == null) {
                this.f96271c.subscribe(new sa(this));
                dVar.request(Long.MAX_VALUE);
            }
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f96272e, j10);
        }
    }
}
