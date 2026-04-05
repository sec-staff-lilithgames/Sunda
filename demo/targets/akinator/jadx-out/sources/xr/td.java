package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class td implements wr.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ud f93065a;

    public td(ud udVar) {
        this.f93065a = udVar;
    }

    @Override // wr.o0
    public void cancelled(wr.u0 u0Var) {
        wr.m6 m6VarStatusFromCancelled = wr.w0.statusFromCancelled(u0Var);
        if (wr.m6.f91040h.getCode().equals(m6VarStatusFromCancelled.getCode())) {
            this.f93065a.f93148j.cancel(m6VarStatusFromCancelled);
        }
    }
}
