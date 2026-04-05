package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q1 extends gu.o implements mt.v {

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f96163g;

    /* renamed from: h, reason: collision with root package name */
    public mt.y f96164h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f96165i;

    public q1(tw.c cVar, mt.y yVar) {
        super(cVar);
        this.f96164h = yVar;
        this.f96163g = new AtomicReference();
    }

    @Override // gu.o, tw.d
    public void cancel() {
        super.cancel();
        tt.d.dispose(this.f96163g);
    }

    @Override // gu.o, mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f96165i) {
            this.f58459b.onComplete();
            return;
        }
        this.f96165i = true;
        this.f58460c = hu.g.f59176b;
        mt.y yVar = this.f96164h;
        this.f96164h = null;
        yVar.subscribe(this);
    }

    @Override // gu.o, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f58459b.onError(th2);
    }

    @Override // gu.o, mt.q, tw.c
    public void onNext(Object obj) {
        this.f58462f++;
        this.f58459b.onNext(obj);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f96163g, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        a(obj);
    }
}
