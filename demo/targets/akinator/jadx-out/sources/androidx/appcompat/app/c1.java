package androidx.appcompat.app;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c1 implements p.z {

    /* renamed from: b, reason: collision with root package name */
    public boolean f4723b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f4724c;

    public c1(f1 f1Var) {
        this.f4724c = f1Var;
    }

    @Override // p.z
    public void onCloseMenu(p.m mVar, boolean z10) {
        if (this.f4723b) {
            return;
        }
        this.f4723b = true;
        f1 f1Var = this.f4724c;
        f1Var.f4729a.dismissPopupMenus();
        f1Var.f4730b.onPanelClosed(108, mVar);
        this.f4723b = false;
    }

    @Override // p.z
    public boolean onOpenSubMenu(p.m mVar) {
        this.f4724c.f4730b.onMenuOpened(108, mVar);
        return true;
    }
}
