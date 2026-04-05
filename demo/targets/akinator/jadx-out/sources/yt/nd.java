package yt;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class nd extends AtomicLong implements mt.q, tw.d, od {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96013b;

    /* renamed from: c, reason: collision with root package name */
    public final long f96014c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f96015e;

    /* renamed from: f, reason: collision with root package name */
    public final m0.a f96016f;

    /* renamed from: g, reason: collision with root package name */
    public final tt.h f96017g = new tt.h();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f96018h = new AtomicReference();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicLong f96019i = new AtomicLong();

    public nd(tw.c cVar, long j10, TimeUnit timeUnit, m0.a aVar) {
        this.f96013b = cVar;
        this.f96014c = j10;
        this.f96015e = timeUnit;
        this.f96016f = aVar;
    }

    @Override // tw.d
    public void cancel() {
        hu.g.cancel(this.f96018h);
        this.f96016f.dispose();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.f96017g.dispose();
            this.f96013b.onComplete();
            this.f96016f.dispose();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            mu.a.onError(th2);
            return;
        }
        this.f96017g.dispose();
        this.f96013b.onError(th2);
        this.f96016f.dispose();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        long j10 = get();
        if (j10 != Long.MAX_VALUE) {
            long j11 = 1 + j10;
            if (compareAndSet(j10, j11)) {
                tt.h hVar = this.f96017g;
                ((pt.c) hVar.get()).dispose();
                this.f96013b.onNext(obj);
                hVar.replace(this.f96016f.schedule(new pd(j11, this), this.f96014c, this.f96015e));
            }
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.deferredSetOnce(this.f96018h, this.f96019i, dVar);
    }

    @Override // yt.od
    public void onTimeout(long j10) {
        if (compareAndSet(j10, Long.MAX_VALUE)) {
            hu.g.cancel(this.f96018h);
            this.f96013b.onError(new TimeoutException(iu.m.timeoutMessage(this.f96014c, this.f96015e)));
            this.f96016f.dispose();
        }
    }

    @Override // tw.d
    public void request(long j10) {
        hu.g.deferredRequest(this.f96018h, this.f96019i, j10);
    }
}
