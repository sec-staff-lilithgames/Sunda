package yt;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class mc extends ArrayDeque implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95951b;

    /* renamed from: c, reason: collision with root package name */
    public final int f95952c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f95953e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f95954f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f95955g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicLong f95956h = new AtomicLong();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f95957i = new AtomicInteger();

    public mc(tw.c cVar, int i10) {
        this.f95951b = cVar;
        this.f95952c = i10;
    }

    public final void c() {
        if (this.f95957i.getAndIncrement() == 0) {
            tw.c cVar = this.f95951b;
            long jAddAndGet = this.f95956h.get();
            while (!this.f95955g) {
                if (this.f95954f) {
                    long j10 = 0;
                    while (j10 != jAddAndGet) {
                        if (this.f95955g) {
                            return;
                        }
                        Object objPoll = poll();
                        if (objPoll == null) {
                            cVar.onComplete();
                            return;
                        } else {
                            cVar.onNext(objPoll);
                            j10++;
                        }
                    }
                    if (j10 != 0 && jAddAndGet != Long.MAX_VALUE) {
                        jAddAndGet = this.f95956h.addAndGet(-j10);
                    }
                }
                if (this.f95957i.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // tw.d
    public void cancel() {
        this.f95955g = true;
        this.f95953e.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95954f = true;
        c();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f95951b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95952c == size()) {
            poll();
        }
        offer(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95953e, dVar)) {
            this.f95953e = dVar;
            this.f95951b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f95956h, j10);
            c();
        }
    }
}
