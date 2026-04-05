package q;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r3 implements p.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f82228b;

    public r3(Toolbar toolbar) {
        this.f82228b = toolbar;
    }

    @Override // p.k
    public boolean onMenuItemSelected(p.m mVar, MenuItem menuItem) {
        p.k kVar = this.f82228b.Q;
        return kVar != null && kVar.onMenuItemSelected(mVar, menuItem);
    }

    @Override // p.k
    public void onMenuModeChange(p.m mVar) {
        Toolbar toolbar = this.f82228b;
        if (!toolbar.f5110b.isOverflowMenuShowing()) {
            toolbar.I.onPrepareMenu(mVar);
        }
        p.k kVar = toolbar.Q;
        if (kVar != null) {
            kVar.onMenuModeChange(mVar);
        }
    }
}
