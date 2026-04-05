package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g0 extends qu.b {

    /* renamed from: c, reason: collision with root package name */
    public final h0 f95505c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f95506e;

    public g0(h0 h0Var) {
        this.f95505c = h0Var;
    }

    @Override // qu.b, mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95506e) {
            return;
        }
        this.f95506e = true;
        this.f95505c.U();
    }

    @Override // qu.b, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95506e) {
            mu.a.onError(th2);
        } else {
            this.f95506e = true;
            this.f95505c.onError(th2);
        }
    }

    @Override // qu.b, mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95506e) {
            return;
        }
        this.f95506e = true;
        dispose();
        this.f95505c.U();
    }
}
