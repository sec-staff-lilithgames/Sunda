package yt;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class lb extends hu.c implements mt.q {

    /* renamed from: e, reason: collision with root package name */
    public final Object f95892e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f95893f;

    /* renamed from: g, reason: collision with root package name */
    public tw.d f95894g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f95895h;

    public lb(tw.c cVar, Object obj, boolean z10) {
        super(cVar);
        this.f95892e = obj;
        this.f95893f = z10;
    }

    @Override // hu.c, hu.a, vt.l, tw.d
    public void cancel() {
        super.cancel();
        this.f95894g.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95895h) {
            return;
        }
        this.f95895h = true;
        Object obj = this.f59163c;
        this.f59163c = null;
        if (obj == null) {
            obj = this.f95892e;
        }
        if (obj != null) {
            complete(obj);
            return;
        }
        boolean z10 = this.f95893f;
        tw.c cVar = this.f59162b;
        if (z10) {
            cVar.onError(new NoSuchElementException());
        } else {
            cVar.onComplete();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95895h) {
            mu.a.onError(th2);
        } else {
            this.f95895h = true;
            this.f59162b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95895h) {
            return;
        }
        if (this.f59163c == null) {
            this.f59163c = obj;
            return;
        }
        this.f95895h = true;
        this.f95894g.cancel();
        this.f59162b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95894g, dVar)) {
            this.f95894g = dVar;
            this.f59162b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
