package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g1 extends hu.f implements mt.q {

    /* renamed from: k, reason: collision with root package name */
    public final d1 f95507k;

    /* renamed from: l, reason: collision with root package name */
    public long f95508l;

    public g1(d1 d1Var) {
        super(false);
        this.f95507k = d1Var;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        long j10 = this.f95508l;
        if (j10 != 0) {
            this.f95508l = 0L;
            produced(j10);
        }
        this.f95507k.innerComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        long j10 = this.f95508l;
        if (j10 != 0) {
            this.f95508l = 0L;
            produced(j10);
        }
        this.f95507k.innerError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f95508l++;
        this.f95507k.innerNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        setSubscription(dVar);
    }
}
