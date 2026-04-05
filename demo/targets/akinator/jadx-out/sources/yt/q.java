package yt;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q extends AtomicReference implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final p f96151b;

    /* renamed from: c, reason: collision with root package name */
    public final int f96152c;

    /* renamed from: e, reason: collision with root package name */
    public final tw.c f96153e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f96154f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicLong f96155g = new AtomicLong();

    public q(p pVar, int i10, tw.c cVar) {
        this.f96151b = pVar;
        this.f96152c = i10;
        this.f96153e = cVar;
    }

    @Override // tw.d
    public void cancel() {
        hu.g.cancel(this);
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        boolean z10 = this.f96154f;
        tw.c cVar = this.f96153e;
        if (z10) {
            cVar.onComplete();
        } else if (!this.f96151b.win(this.f96152c)) {
            ((tw.d) get()).cancel();
        } else {
            this.f96154f = true;
            cVar.onComplete();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        boolean z10 = this.f96154f;
        tw.c cVar = this.f96153e;
        if (z10) {
            cVar.onError(th2);
        } else if (this.f96151b.win(this.f96152c)) {
            this.f96154f = true;
            cVar.onError(th2);
        } else {
            ((tw.d) get()).cancel();
            mu.a.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        boolean z10 = this.f96154f;
        tw.c cVar = this.f96153e;
        if (z10) {
            cVar.onNext(obj);
        } else if (!this.f96151b.win(this.f96152c)) {
            ((tw.d) get()).cancel();
        } else {
            this.f96154f = true;
            cVar.onNext(obj);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.deferredSetOnce(this, this.f96155g, dVar);
    }

    @Override // tw.d
    public void request(long j10) {
        hu.g.deferredRequest(this, this.f96155g, j10);
    }
}
