package cu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class m0 extends AtomicInteger implements mt.q, tw.d, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final int f51023b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51024c;

    /* renamed from: e, reason: collision with root package name */
    public final eu.c f51025e;

    /* renamed from: f, reason: collision with root package name */
    public final m0.a f51026f;

    /* renamed from: g, reason: collision with root package name */
    public tw.d f51027g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f51028h;

    /* renamed from: i, reason: collision with root package name */
    public Throwable f51029i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicLong f51030j = new AtomicLong();

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f51031k;

    /* renamed from: l, reason: collision with root package name */
    public int f51032l;

    public m0(int i10, eu.c cVar, m0.a aVar) {
        this.f51023b = i10;
        this.f51025e = cVar;
        this.f51024c = i10 - (i10 >> 2);
        this.f51026f = aVar;
    }

    @Override // tw.d
    public final void cancel() {
        if (this.f51031k) {
            return;
        }
        this.f51031k = true;
        this.f51027g.cancel();
        this.f51026f.dispose();
        if (getAndIncrement() == 0) {
            this.f51025e.clear();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public final void onComplete() {
        if (this.f51028h) {
            return;
        }
        this.f51028h = true;
        if (getAndIncrement() == 0) {
            this.f51026f.schedule(this);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public final void onError(Throwable th2) {
        if (this.f51028h) {
            mu.a.onError(th2);
            return;
        }
        this.f51029i = th2;
        this.f51028h = true;
        if (getAndIncrement() == 0) {
            this.f51026f.schedule(this);
        }
    }

    @Override // mt.q, tw.c
    public final void onNext(Object obj) {
        if (this.f51028h) {
            return;
        }
        if (!this.f51025e.offer(obj)) {
            this.f51027g.cancel();
            onError(new qt.e("Queue is full?!"));
        } else if (getAndIncrement() == 0) {
            this.f51026f.schedule(this);
        }
    }

    @Override // mt.q, tw.c
    public abstract /* synthetic */ void onSubscribe(tw.d dVar);

    @Override // tw.d
    public final void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f51030j, j10);
            if (getAndIncrement() == 0) {
                this.f51026f.schedule(this);
            }
        }
    }
}
