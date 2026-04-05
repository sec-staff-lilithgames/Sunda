package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class xc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zc f93240a;

    public xc(zc zcVar) {
        this.f93240a = zcVar;
    }

    public void resolutionAttempted(wr.m6 m6Var) {
        zc zcVar = this.f93240a;
        o0 o0Var = zcVar.f93334b;
        if (m6Var.isOk()) {
            o0Var.reset();
        } else {
            o0Var.schedule(new wc(zcVar));
        }
    }
}
