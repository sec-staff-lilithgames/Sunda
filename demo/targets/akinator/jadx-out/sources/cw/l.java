package cw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l extends bw.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0 f51175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f51176f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, e0 e0Var, m mVar) {
        super(str, false, 2, null);
        this.f51175e = e0Var;
        this.f51176f = mVar;
    }

    @Override // bw.a
    public long runOnce() throws InterruptedException {
        d0 d0Var;
        e0 e0Var = this.f51175e;
        try {
            d0Var = e0Var.connectTcp();
        } catch (Throwable th2) {
            d0Var = new d0(this.f51175e, null, th2, 2, null);
        }
        m mVar = this.f51176f;
        if (!mVar.f51181e.contains(e0Var)) {
            return -1L;
        }
        mVar.f51182f.put(d0Var);
        return -1L;
    }
}
