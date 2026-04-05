package p;

import android.view.MenuItem;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u implements MenuItem.OnMenuItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f80118b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f80119c;

    public u(v vVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f80119c = vVar;
        this.f80118b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        return this.f80118b.onMenuItemClick(this.f80119c.a(menuItem));
    }
}
