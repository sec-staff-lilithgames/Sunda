package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final tt.h f52769b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.q0 f52770c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f52771e;

    public l(m mVar, tt.h hVar, mt.q0 q0Var) {
        this.f52771e = mVar;
        this.f52769b = hVar;
        this.f52770c = q0Var;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        m mVar = this.f52771e;
        this.f52769b.replace(mVar.f52780f.scheduleDirect(new j(this, th2), mVar.f52781g ? mVar.f52778c : 0L, mVar.f52779e));
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        this.f52769b.replace(cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        m mVar = this.f52771e;
        this.f52769b.replace(mVar.f52780f.scheduleDirect(new k(this, obj), mVar.f52778c, mVar.f52779e));
    }
}
