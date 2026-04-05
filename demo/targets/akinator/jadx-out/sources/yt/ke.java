package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ke extends qu.b {

    /* renamed from: c, reason: collision with root package name */
    public final le f95829c;

    public ke(le leVar) {
        this.f95829c = leVar;
    }

    @Override // qu.b, mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95829c.onComplete();
    }

    @Override // qu.b, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        le leVar = this.f95829c;
        leVar.f95903o.cancel();
        leVar.f95902n.dispose();
        tt.d.dispose(leVar.f95904p);
        leVar.f58454f.onError(th2);
    }

    @Override // qu.b, mt.q, tw.c
    public void onNext(Object obj) {
        le leVar = this.f95829c;
        leVar.f58455g.offer(new me(null, obj));
        if (leVar.enter()) {
            leVar.U();
        }
    }
}
