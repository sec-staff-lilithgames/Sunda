package p;

import android.view.MenuItem;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f80116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f80117b;

    public t(v vVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f80117b = vVar;
        this.f80116a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f80116a.onMenuItemActionCollapse(this.f80117b.a(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f80116a.onMenuItemActionExpand(this.f80117b.a(menuItem));
    }
}
