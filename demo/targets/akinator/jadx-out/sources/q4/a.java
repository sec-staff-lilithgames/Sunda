package q4;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import y3.p;
import y3.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f82398b;

    public a(DrawerLayout drawerLayout) {
        this.f82398b = drawerLayout;
    }

    @Override // y3.x
    public boolean perform(View view, p pVar) {
        DrawerLayout drawerLayout = this.f82398b;
        if (!drawerLayout.isDrawerOpen(view) || drawerLayout.getDrawerLockMode(view) == 2) {
            return false;
        }
        drawerLayout.closeDrawer(view);
        return true;
    }
}
