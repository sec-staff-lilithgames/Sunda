package yt;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class jd extends AtomicLong implements mt.q, tw.d, id {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95756b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f95757c;

    /* renamed from: e, reason: collision with root package name */
    public final tt.h f95758e = new tt.h();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f95759f = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicLong f95760g = new AtomicLong();

    public jd(tw.c cVar, st.o oVar) {
        this.f95756b = cVar;
        this.f95757c = oVar;
    }

    @Override // tw.d
    public void cancel() {
        hu.g.cancel(this.f95759f);
        this.f95758e.dispose();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.f95758e.dispose();
            this.f95756b.onComplete();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            mu.a.onError(th2);
        } else {
            this.f95758e.dispose();
            this.f95756b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        long j10 = get();
        if (j10 != Long.MAX_VALUE) {
            long j11 = 1 + j10;
            if (compareAndSet(j10, j11)) {
                tt.h hVar = this.f95758e;
                pt.c cVar = (pt.c) hVar.get();
                if (cVar != null) {
                    cVar.dispose();
                }
                tw.c cVar2 = this.f95756b;
                cVar2.onNext(obj);
                try {
                    tw.b bVar = (tw.b) ut.o0.requireNonNull(this.f95757c.apply(obj), "The itemTimeoutIndicator returned a null Publisher.");
                    gd gdVar = new gd(j11, this);
                    if (hVar.replace(gdVar)) {
                        bVar.subscribe(gdVar);
                    }
                } catch (Throwable th2) {
                    qt.d.throwIfFatal(th2);
                    ((tw.d) this.f95759f.get()).cancel();
                    getAndSet(Long.MAX_VALUE);
                    cVar2.onError(th2);
                }
            }
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.deferredSetOnce(this.f95759f, this.f95760g, dVar);
    }

    @Override // yt.id, yt.od
    public void onTimeout(long j10) {
        if (compareAndSet(j10, Long.MAX_VALUE)) {
            hu.g.cancel(this.f95759f);
            this.f95756b.onError(new TimeoutException());
        }
    }

    @Override // yt.id
    public void onTimeoutError(long j10, Throwable th2) {
        if (!compareAndSet(j10, Long.MAX_VALUE)) {
            mu.a.onError(th2);
        } else {
            hu.g.cancel(this.f95759f);
            this.f95756b.onError(th2);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        hu.g.deferredRequest(this.f95759f, this.f95760g, j10);
    }
}
