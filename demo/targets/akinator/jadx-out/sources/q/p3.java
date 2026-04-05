package q;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p3 implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f82204a;

    public p3(Toolbar toolbar) {
        this.f82204a = toolbar;
    }

    @Override // q.q
    public boolean onMenuItemClick(MenuItem menuItem) {
        Toolbar toolbar = this.f82204a;
        if (toolbar.I.onMenuItemSelected(menuItem)) {
            return true;
        }
        u3 u3Var = toolbar.K;
        if (u3Var != null) {
            return ((androidx.appcompat.app.b1) u3Var).onMenuItemClick(menuItem);
        }
        return false;
    }
}
