package yt;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p3 extends hu.c implements mt.q {

    /* renamed from: e, reason: collision with root package name */
    public final long f96100e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f96101f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f96102g;

    /* renamed from: h, reason: collision with root package name */
    public tw.d f96103h;

    /* renamed from: i, reason: collision with root package name */
    public long f96104i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f96105j;

    public p3(tw.c cVar, long j10, Object obj, boolean z10) {
        super(cVar);
        this.f96100e = j10;
        this.f96101f = obj;
        this.f96102g = z10;
    }

    @Override // hu.c, hu.a, vt.l, tw.d
    public void cancel() {
        super.cancel();
        this.f96103h.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f96105j) {
            return;
        }
        this.f96105j = true;
        Object obj = this.f96101f;
        if (obj != null) {
            complete(obj);
            return;
        }
        boolean z10 = this.f96102g;
        tw.c cVar = this.f59162b;
        if (z10) {
            cVar.onError(new NoSuchElementException());
        } else {
            cVar.onComplete();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96105j) {
            mu.a.onError(th2);
        } else {
            this.f96105j = true;
            this.f59162b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f96105j) {
            return;
        }
        long j10 = this.f96104i;
        if (j10 != this.f96100e) {
            this.f96104i = j10 + 1;
            return;
        }
        this.f96105j = true;
        this.f96103h.cancel();
        complete(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96103h, dVar)) {
            this.f96103h = dVar;
            this.f59162b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
