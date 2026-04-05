package yt;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class kc extends AtomicBoolean implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95821b;

    /* renamed from: c, reason: collision with root package name */
    public final long f95822c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f95823e;

    /* renamed from: f, reason: collision with root package name */
    public tw.d f95824f;

    /* renamed from: g, reason: collision with root package name */
    public long f95825g;

    public kc(tw.c cVar, long j10) {
        this.f95821b = cVar;
        this.f95822c = j10;
        this.f95825g = j10;
    }

    @Override // tw.d
    public void cancel() {
        this.f95824f.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95823e) {
            return;
        }
        this.f95823e = true;
        this.f95821b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95823e) {
            mu.a.onError(th2);
            return;
        }
        this.f95823e = true;
        this.f95824f.cancel();
        this.f95821b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95823e) {
            return;
        }
        long j10 = this.f95825g;
        long j11 = j10 - 1;
        this.f95825g = j11;
        if (j10 > 0) {
            boolean z10 = j11 == 0;
            this.f95821b.onNext(obj);
            if (z10) {
                this.f95824f.cancel();
                onComplete();
            }
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95824f, dVar)) {
            this.f95824f = dVar;
            long j10 = this.f95822c;
            tw.c cVar = this.f95821b;
            if (j10 != 0) {
                cVar.onSubscribe(this);
                return;
            }
            dVar.cancel();
            this.f95823e = true;
            hu.d.complete(cVar);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            if (get() || !compareAndSet(false, true) || j10 < this.f95822c) {
                this.f95824f.request(j10);
            } else {
                this.f95824f.request(Long.MAX_VALUE);
            }
        }
    }
}
