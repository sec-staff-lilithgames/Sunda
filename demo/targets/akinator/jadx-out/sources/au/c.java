package au;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c extends AtomicReference implements mt.q, mt.f, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f8014b;

    /* renamed from: c, reason: collision with root package name */
    public tw.b f8015c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f8016e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f8017f = new AtomicLong();

    public c(tw.b bVar, tw.c cVar) {
        this.f8014b = cVar;
        this.f8015c = bVar;
    }

    @Override // tw.d
    public void cancel() {
        this.f8016e.dispose();
        hu.g.cancel(this);
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        tw.b bVar = this.f8015c;
        if (bVar == null) {
            this.f8014b.onComplete();
        } else {
            this.f8015c = null;
            bVar.subscribe(this);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f8014b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f8014b.onNext(obj);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f8016e, cVar)) {
            this.f8016e = cVar;
            this.f8014b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        hu.g.deferredRequest(this, this.f8017f, j10);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.deferredSetOnce(this, this.f8017f, dVar);
    }
}
