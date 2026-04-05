package cu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t extends AtomicReference implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final v f51081b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51082c;

    /* renamed from: e, reason: collision with root package name */
    public final int f51083e;

    /* renamed from: f, reason: collision with root package name */
    public long f51084f;

    /* renamed from: g, reason: collision with root package name */
    public volatile eu.c f51085g;

    public t(v vVar, int i10) {
        this.f51081b = vVar;
        this.f51082c = i10;
        this.f51083e = i10 - (i10 >> 2);
    }

    public final vt.n a() {
        eu.c cVar = this.f51085g;
        if (cVar != null) {
            return cVar;
        }
        eu.c cVar2 = new eu.c(this.f51082c);
        this.f51085g = cVar2;
        return cVar2;
    }

    public boolean cancel() {
        return hu.g.cancel(this);
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f51081b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f51081b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f51081b.onNext(this, obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.setOnce(this, dVar, this.f51082c);
    }

    public void request(long j10) {
        long j11 = this.f51084f + j10;
        if (j11 < this.f51083e) {
            this.f51084f = j11;
        } else {
            this.f51084f = 0L;
            ((tw.d) get()).request(j11);
        }
    }

    public void requestOne() {
        long j10 = this.f51084f + 1;
        if (j10 != this.f51083e) {
            this.f51084f = j10;
        } else {
            this.f51084f = 0L;
            ((tw.d) get()).request(j10);
        }
    }
}
