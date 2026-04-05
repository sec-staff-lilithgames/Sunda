package q;

import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p implements p.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f82200b;

    public p(ActionMenuView actionMenuView) {
        this.f82200b = actionMenuView;
    }

    @Override // p.k
    public boolean onMenuItemSelected(p.m mVar, MenuItem menuItem) {
        q qVar = this.f82200b.f5010n;
        return qVar != null && ((p3) qVar).onMenuItemClick(menuItem);
    }

    @Override // p.k
    public void onMenuModeChange(p.m mVar) {
        p.k kVar = this.f82200b.f5005i;
        if (kVar != null) {
            kVar.onMenuModeChange(mVar);
        }
    }
}
