package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class je extends qu.b {

    /* renamed from: c, reason: collision with root package name */
    public final le f95761c;

    /* renamed from: e, reason: collision with root package name */
    public final nu.d f95762e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f95763f;

    public je(le leVar, nu.d dVar) {
        this.f95761c = leVar;
        this.f95762e = dVar;
    }

    @Override // qu.b, mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95763f) {
            return;
        }
        this.f95763f = true;
        le leVar = this.f95761c;
        leVar.f95902n.delete(this);
        leVar.f58455g.offer(new me(this.f95762e, null));
        if (leVar.enter()) {
            leVar.U();
        }
    }

    @Override // qu.b, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95763f) {
            mu.a.onError(th2);
            return;
        }
        this.f95763f = true;
        le leVar = this.f95761c;
        leVar.f95903o.cancel();
        leVar.f95902n.dispose();
        tt.d.dispose(leVar.f95904p);
        leVar.f58454f.onError(th2);
    }

    @Override // qu.b, mt.q, tw.c
    public void onNext(Object obj) {
        dispose();
        onComplete();
    }
}
