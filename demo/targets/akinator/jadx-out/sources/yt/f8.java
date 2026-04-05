package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f8 extends hu.f implements mt.q {

    /* renamed from: k, reason: collision with root package name */
    public final tw.c f95473k;

    /* renamed from: l, reason: collision with root package name */
    public final st.o f95474l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f95475m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f95476n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f95477o;

    /* renamed from: p, reason: collision with root package name */
    public long f95478p;

    public f8(tw.c cVar, st.o oVar, boolean z10) {
        super(false);
        this.f95473k = cVar;
        this.f95474l = oVar;
        this.f95475m = z10;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95477o) {
            return;
        }
        this.f95477o = true;
        this.f95476n = true;
        this.f95473k.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        boolean z10 = this.f95476n;
        tw.c cVar = this.f95473k;
        if (z10) {
            if (this.f95477o) {
                mu.a.onError(th2);
                return;
            } else {
                cVar.onError(th2);
                return;
            }
        }
        this.f95476n = true;
        if (this.f95475m && !(th2 instanceof Exception)) {
            cVar.onError(th2);
            return;
        }
        try {
            tw.b bVar = (tw.b) ut.o0.requireNonNull(this.f95474l.apply(th2), "The nextSupplier returned a null Publisher");
            long j10 = this.f95478p;
            if (j10 != 0) {
                produced(j10);
            }
            bVar.subscribe(this);
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            cVar.onError(new qt.c(th2, th3));
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95477o) {
            return;
        }
        if (!this.f95476n) {
            this.f95478p++;
        }
        this.f95473k.onNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        setSubscription(dVar);
    }
}
