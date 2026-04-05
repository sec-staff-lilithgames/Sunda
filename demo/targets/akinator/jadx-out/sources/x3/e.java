package x3;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f91564a;

    /* renamed from: b, reason: collision with root package name */
    public c f91565b;

    /* renamed from: c, reason: collision with root package name */
    public d f91566c;

    public e(Context context) {
        this.f91564a = context;
    }

    public Context getContext() {
        return this.f91564a;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    public abstract View onCreateActionView();

    public View onCreateActionView(MenuItem menuItem) {
        return onCreateActionView();
    }

    public boolean onPerformDefaultAction() {
        return false;
    }

    public boolean overridesItemVisibility() {
        return false;
    }

    public void refreshVisibility() {
        if (this.f91566c == null || !overridesItemVisibility()) {
            return;
        }
        ((p.p) this.f91566c).onActionProviderVisibilityChanged(isVisible());
    }

    public void reset() {
        this.f91566c = null;
        this.f91565b = null;
    }

    public void setSubUiVisibilityListener(c cVar) {
        this.f91565b = cVar;
    }

    public void setVisibilityListener(d dVar) {
        if (this.f91566c != null && dVar != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f91566c = dVar;
    }

    public void subUiVisibilityChanged(boolean z10) {
        c cVar = this.f91565b;
        if (cVar != null) {
            cVar.onSubUiVisibilityChanged(z10);
        }
    }

    public void onPrepareSubMenu(SubMenu subMenu) {
    }
}
