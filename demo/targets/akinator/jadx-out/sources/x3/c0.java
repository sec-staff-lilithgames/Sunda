package x3;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f91550a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f91551b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f91552c = new HashMap();

    public c0(Runnable runnable) {
        this.f91550a = runnable;
    }

    public void addMenuProvider(g0 g0Var) {
        this.f91551b.add(g0Var);
        this.f91550a.run();
    }

    public void onCreateMenu(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f91551b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.b1) ((g0) it.next())).onCreateMenu(menu, menuInflater);
        }
    }

    public void onMenuClosed(Menu menu) {
        Iterator it = this.f91551b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.b1) ((g0) it.next())).onMenuClosed(menu);
        }
    }

    public boolean onMenuItemSelected(MenuItem menuItem) {
        Iterator it = this.f91551b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.b1) ((g0) it.next())).onMenuItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void onPrepareMenu(Menu menu) {
        Iterator it = this.f91551b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.b1) ((g0) it.next())).onPrepareMenu(menu);
        }
    }

    public void removeMenuProvider(g0 g0Var) {
        this.f91551b.remove(g0Var);
        b0 b0Var = (b0) this.f91552c.remove(g0Var);
        if (b0Var != null) {
            b0Var.f91539a.removeObserver(b0Var.f91540b);
            b0Var.f91540b = null;
        }
        this.f91550a.run();
    }

    public void addMenuProvider(g0 g0Var, androidx.lifecycle.b1 b1Var) {
        addMenuProvider(g0Var);
        androidx.lifecycle.k0 lifecycle = b1Var.getLifecycle();
        HashMap map = this.f91552c;
        b0 b0Var = (b0) map.remove(g0Var);
        if (b0Var != null) {
            b0Var.f91539a.removeObserver(b0Var.f91540b);
            b0Var.f91540b = null;
        }
        map.put(g0Var, new b0(lifecycle, new androidx.lifecycle.l0(3, this, g0Var)));
    }

    public void addMenuProvider(g0 g0Var, androidx.lifecycle.b1 b1Var, androidx.lifecycle.j0 j0Var) {
        androidx.lifecycle.k0 lifecycle = b1Var.getLifecycle();
        HashMap map = this.f91552c;
        b0 b0Var = (b0) map.remove(g0Var);
        if (b0Var != null) {
            b0Var.f91539a.removeObserver(b0Var.f91540b);
            b0Var.f91540b = null;
        }
        map.put(g0Var, new b0(lifecycle, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.g(this, 2, j0Var, g0Var)));
    }
}
