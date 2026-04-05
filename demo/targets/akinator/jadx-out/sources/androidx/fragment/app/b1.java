package androidx.fragment.app;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b1 implements x3.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f6283a;

    public b1(FragmentManager fragmentManager) {
        this.f6283a = fragmentManager;
    }

    @Override // x3.g0
    public void onCreateMenu(Menu menu, MenuInflater menuInflater) {
        this.f6283a.j(menu, menuInflater);
    }

    @Override // x3.g0
    public void onMenuClosed(Menu menu) {
        this.f6283a.p(menu);
    }

    @Override // x3.g0
    public boolean onMenuItemSelected(MenuItem menuItem) {
        return this.f6283a.o(menuItem);
    }

    @Override // x3.g0
    public void onPrepareMenu(Menu menu) {
        this.f6283a.s(menu);
    }
}
