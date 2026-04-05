package p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p implements x3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f80085a;

    public p(q qVar) {
        this.f80085a = qVar;
    }

    @Override // x3.d
    public void onActionProviderVisibilityChanged(boolean z10) {
        m mVar = this.f80085a.f80099n;
        mVar.f80062h = true;
        mVar.onItemsChanged(true);
    }
}
