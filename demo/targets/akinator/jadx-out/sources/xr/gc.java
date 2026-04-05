package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class gc implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.manager.d0 f92570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tc f92571c;

    public gc(tc tcVar, com.bumptech.glide.manager.d0 d0Var) {
        this.f92571c = tcVar;
        this.f92570b = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        tc tcVar = this.f92571c;
        rc rcVarC = tcVar.c(tcVar.f93053o.f92644e, false);
        if (rcVarC == null) {
            return;
        }
        this.f92571c.f93040b.execute(new fc(this, rcVarC));
    }
}
