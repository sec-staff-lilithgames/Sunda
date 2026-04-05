package yt;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x6 extends AtomicLong implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96549b;

    /* renamed from: c, reason: collision with root package name */
    public long f96550c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f96551e;

    public x6(tw.c cVar, long j10) {
        this.f96549b = cVar;
        this.f96550c = j10;
        lazySet(j10);
    }

    @Override // tw.d
    public void cancel() {
        this.f96551e.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f96550c > 0) {
            this.f96550c = 0L;
            this.f96549b.onComplete();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96550c <= 0) {
            mu.a.onError(th2);
        } else {
            this.f96550c = 0L;
            this.f96549b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        long j10 = this.f96550c;
        if (j10 > 0) {
            long j11 = j10 - 1;
            this.f96550c = j11;
            tw.c cVar = this.f96549b;
            cVar.onNext(obj);
            if (j11 == 0) {
                this.f96551e.cancel();
                cVar.onComplete();
            }
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96551e, dVar)) {
            long j10 = this.f96550c;
            tw.c cVar = this.f96549b;
            if (j10 == 0) {
                dVar.cancel();
                hu.d.complete(cVar);
            } else {
                this.f96551e = dVar;
                cVar.onSubscribe(this);
            }
        }
    }

    @Override // tw.d
    public void request(long j10) {
        long j11;
        long j12;
        if (hu.g.validate(j10)) {
            do {
                j11 = get();
                if (j11 == 0) {
                    return;
                } else {
                    j12 = j11 <= j10 ? j11 : j10;
                }
            } while (!compareAndSet(j11, j11 - j12));
            this.f96551e.request(j12);
        }
    }
}
