package androidx.appcompat.app;

import android.view.MenuItem;
import android.view.Window;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d1 implements p.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f4725b;

    public d1(f1 f1Var) {
        this.f4725b = f1Var;
    }

    @Override // p.k
    public boolean onMenuItemSelected(p.m mVar, MenuItem menuItem) {
        return false;
    }

    @Override // p.k
    public void onMenuModeChange(p.m mVar) {
        f1 f1Var = this.f4725b;
        Window.Callback callback = f1Var.f4730b;
        if (f1Var.f4729a.isOverflowMenuShowing()) {
            callback.onPanelClosed(108, mVar);
        } else if (callback.onPreparePanel(0, null, mVar)) {
            callback.onMenuOpened(108, mVar);
        }
    }
}
