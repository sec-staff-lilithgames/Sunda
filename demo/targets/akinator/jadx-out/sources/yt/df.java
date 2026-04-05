package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class df extends AtomicReference implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final cf f95399b;

    /* renamed from: c, reason: collision with root package name */
    public final int f95400c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f95401e;

    public df(cf cfVar, int i10) {
        this.f95399b = cfVar;
        this.f95400c = i10;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        cf cfVar = this.f95399b;
        int i10 = this.f95400c;
        if (this.f95401e) {
            cfVar.getClass();
            return;
        }
        cfVar.f95306j = true;
        hu.g.cancel(cfVar.f95303g);
        cfVar.a(i10);
        iu.n.onComplete(cfVar.f95299b, cfVar, cfVar.f95305i);
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        cf cfVar = this.f95399b;
        int i10 = this.f95400c;
        cfVar.f95306j = true;
        hu.g.cancel(cfVar.f95303g);
        cfVar.a(i10);
        iu.n.onError(cfVar.f95299b, th2, cfVar, cfVar.f95305i);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (!this.f95401e) {
            this.f95401e = true;
        }
        this.f95399b.f95302f.set(this.f95400c, obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.setOnce(this, dVar, Long.MAX_VALUE);
    }
}
