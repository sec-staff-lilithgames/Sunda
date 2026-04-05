package yt;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class r9 extends hu.f implements mt.q {

    /* renamed from: k, reason: collision with root package name */
    public final qu.d f96266k;

    /* renamed from: l, reason: collision with root package name */
    public final nu.a f96267l;

    /* renamed from: m, reason: collision with root package name */
    public final q9 f96268m;

    /* renamed from: n, reason: collision with root package name */
    public long f96269n;

    public r9(qu.d dVar, nu.a aVar, q9 q9Var) {
        super(false);
        this.f96266k = dVar;
        this.f96267l = aVar;
        this.f96268m = q9Var;
    }

    public final void b(Serializable serializable) {
        setSubscription(hu.d.f59164b);
        long j10 = this.f96269n;
        if (j10 != 0) {
            this.f96269n = 0L;
            produced(j10);
        }
        this.f96268m.request(1L);
        this.f96267l.onNext(serializable);
    }

    @Override // hu.f, tw.d
    public final void cancel() {
        super.cancel();
        this.f96268m.cancel();
    }

    public abstract /* synthetic */ void onComplete();

    public abstract /* synthetic */ void onError(Throwable th2);

    @Override // mt.q, tw.c
    public final void onNext(Object obj) {
        this.f96269n++;
        this.f96266k.onNext(obj);
    }

    @Override // mt.q, tw.c
    public final void onSubscribe(tw.d dVar) {
        setSubscription(dVar);
    }
}
