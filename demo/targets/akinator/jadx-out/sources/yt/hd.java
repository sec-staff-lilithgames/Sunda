package yt;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class hd extends hu.f implements mt.q, id {

    /* renamed from: k, reason: collision with root package name */
    public final tw.c f95608k;

    /* renamed from: l, reason: collision with root package name */
    public final st.o f95609l;

    /* renamed from: m, reason: collision with root package name */
    public final tt.h f95610m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReference f95611n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicLong f95612o;

    /* renamed from: p, reason: collision with root package name */
    public tw.b f95613p;

    /* renamed from: q, reason: collision with root package name */
    public long f95614q;

    public hd(tw.b bVar, tw.c cVar, st.o oVar) {
        super(true);
        this.f95608k = cVar;
        this.f95609l = oVar;
        this.f95610m = new tt.h();
        this.f95611n = new AtomicReference();
        this.f95613p = bVar;
        this.f95612o = new AtomicLong();
    }

    @Override // hu.f, tw.d
    public void cancel() {
        super.cancel();
        this.f95610m.dispose();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95612o.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            tt.h hVar = this.f95610m;
            hVar.dispose();
            this.f95608k.onComplete();
            hVar.dispose();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95612o.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            mu.a.onError(th2);
            return;
        }
        tt.h hVar = this.f95610m;
        hVar.dispose();
        this.f95608k.onError(th2);
        hVar.dispose();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        AtomicLong atomicLong = this.f95612o;
        long j10 = atomicLong.get();
        if (j10 != Long.MAX_VALUE) {
            long j11 = j10 + 1;
            if (atomicLong.compareAndSet(j10, j11)) {
                tt.h hVar = this.f95610m;
                pt.c cVar = (pt.c) hVar.get();
                if (cVar != null) {
                    cVar.dispose();
                }
                this.f95614q++;
                tw.c cVar2 = this.f95608k;
                cVar2.onNext(obj);
                try {
                    tw.b bVar = (tw.b) ut.o0.requireNonNull(this.f95609l.apply(obj), "The itemTimeoutIndicator returned a null Publisher.");
                    gd gdVar = new gd(j11, this);
                    if (hVar.replace(gdVar)) {
                        bVar.subscribe(gdVar);
                    }
                } catch (Throwable th2) {
                    qt.d.throwIfFatal(th2);
                    ((tw.d) this.f95611n.get()).cancel();
                    atomicLong.getAndSet(Long.MAX_VALUE);
                    cVar2.onError(th2);
                }
            }
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.setOnce(this.f95611n, dVar)) {
            setSubscription(dVar);
        }
    }

    @Override // yt.id, yt.od
    public void onTimeout(long j10) {
        if (this.f95612o.compareAndSet(j10, Long.MAX_VALUE)) {
            hu.g.cancel(this.f95611n);
            tw.b bVar = this.f95613p;
            this.f95613p = null;
            long j11 = this.f95614q;
            if (j11 != 0) {
                produced(j11);
            }
            bVar.subscribe(new ld(this.f95608k, this));
        }
    }

    @Override // yt.id
    public void onTimeoutError(long j10, Throwable th2) {
        if (!this.f95612o.compareAndSet(j10, Long.MAX_VALUE)) {
            mu.a.onError(th2);
        } else {
            hu.g.cancel(this.f95611n);
            this.f95608k.onError(th2);
        }
    }
}
