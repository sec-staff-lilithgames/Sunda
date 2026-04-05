package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f6485a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final FragmentManager f6486b;

    public x0(FragmentManager fragmentManager) {
        this.f6486b = fragmentManager;
    }

    public final void a(Fragment fragment, Bundle bundle, boolean z10) {
        FragmentManager fragmentManager = this.f6486b;
        Fragment fragment2 = fragmentManager.f6243x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6233n.a(fragment, bundle, true);
        }
        Iterator it = this.f6485a.iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (!z10 || w0Var.f6480b) {
                w0Var.f6479a.onFragmentActivityCreated(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void b(Fragment fragment, boolean z10) {
        FragmentManager fragmentManager = this.f6486b;
        Context context = fragmentManager.getHost().f6461c;
        Fragment fragment2 = fragmentManager.f6243x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6233n.b(fragment, true);
        }
        Iterator it = this.f6485a.iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (!z10 || w0Var.f6480b) {
                w0Var.f6479a.onFragmentAttached(fragmentManager, fragment, context);
            }
        }
    }

    public final void c(Fragment fragment, Bundle bundle, boolean z10) {
        FragmentManager fragmentManager = this.f6486b;
        Fragment fragment2 = fragmentManager.f6243x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6233n.c(fragment, bundle, true);
        }
        Iterator it = this.f6485a.iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (!z10 || w0Var.f6480b) {
                w0Var.f6479a.onFragmentCreated(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void d(Fragment fragment, boolean z10) {
        FragmentManager fragmentManager = this.f6486b;
        Fragment fragment2 = fragmentManager.f6243x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6233n.d(fragment, true);
        }
        Iterator it = this.f6485a.iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (!z10 || w0Var.f6480b) {
                w0Var.f6479a.onFragmentDestroyed(fragmentManager, fragment);
            }
        }
    }

    public final void e(Fragment fragment, boolean z10) {
        FragmentManager fragmentManager = this.f6486b;
        Fragment fragment2 = fragmentManager.f6243x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6233n.e(fragment, true);
        }
        Iterator it = this.f6485a.iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (!z10 || w0Var.f6480b) {
                w0Var.f6479a.onFragmentDetached(fragmentManager, fragment);
            }
        }
    }

    public final void f(Fragment fragment, boolean z10) {
        FragmentManager fragmentManager = this.f6486b;
        Fragment fragment2 = fragmentManager.f6243x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6233n.f(fragment, true);
        }
        Iterator it = this.f6485a.iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (!z10 || w0Var.f6480b) {
                w0Var.f6479a.onFragmentPaused(fragmentManager, fragment);
            }
        }
    }

    public final void g(Fragment fragment, boolean z10) {
        FragmentManager fragmentManager = this.f6486b;
        Context context = fragmentManager.getHost().f6461c;
        Fragment fragment2 = fragmentManager.f6243x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6233n.g(fragment, true);
        }
        Iterator it = this.f6485a.iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (!z10 || w0Var.f6480b) {
                w0Var.f6479a.onFragmentPreAttached(fragmentManager, fragment, context);
            }
        }
    }

    public final void h(Fragment fragment, Bundle bundle, boolean z10) {
        FragmentManager fragmentManager = this.f6486b;
        Fragment fragment2 = fragmentManager.f6243x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6233n.h(fragment, bundle, true);
        }
        Iterator it = this.f6485a.iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (!z10 || w0Var.f6480b) {
                w0Var.f6479a.onFragmentPreCreated(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void i(Fragment fragment, boolean z10) {
        FragmentManager fragmentManager = this.f6486b;
        Fragment fragment2 = fragmentManager.f6243x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6233n.i(fragment, true);
        }
        Iterator it = this.f6485a.iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (!z10 || w0Var.f6480b) {
                w0Var.f6479a.onFragmentResumed(fragmentManager, fragment);
            }
        }
    }

    public final void j(Fragment fragment, Bundle bundle, boolean z10) {
        FragmentManager fragmentManager = this.f6486b;
        Fragment fragment2 = fragmentManager.f6243x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6233n.j(fragment, bundle, true);
        }
        Iterator it = this.f6485a.iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (!z10 || w0Var.f6480b) {
                w0Var.f6479a.onFragmentSaveInstanceState(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void k(Fragment fragment, boolean z10) {
        FragmentManager fragmentManager = this.f6486b;
        Fragment fragment2 = fragmentManager.f6243x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6233n.k(fragment, true);
        }
        Iterator it = this.f6485a.iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (!z10 || w0Var.f6480b) {
                w0Var.f6479a.onFragmentStarted(fragmentManager, fragment);
            }
        }
    }

    public final void l(Fragment fragment, boolean z10) {
        FragmentManager fragmentManager = this.f6486b;
        Fragment fragment2 = fragmentManager.f6243x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6233n.l(fragment, true);
        }
        Iterator it = this.f6485a.iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (!z10 || w0Var.f6480b) {
                w0Var.f6479a.onFragmentStopped(fragmentManager, fragment);
            }
        }
    }

    public final void m(Fragment fragment, View view, Bundle bundle, boolean z10) {
        FragmentManager fragmentManager = this.f6486b;
        Fragment fragment2 = fragmentManager.f6243x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6233n.m(fragment, view, bundle, true);
        }
        Iterator it = this.f6485a.iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (!z10 || w0Var.f6480b) {
                w0Var.f6479a.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
            }
        }
    }

    public final void n(Fragment fragment, boolean z10) {
        FragmentManager fragmentManager = this.f6486b;
        Fragment fragment2 = fragmentManager.f6243x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f6233n.n(fragment, true);
        }
        Iterator it = this.f6485a.iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (!z10 || w0Var.f6480b) {
                w0Var.f6479a.onFragmentViewDestroyed(fragmentManager, fragment);
            }
        }
    }

    public void registerFragmentLifecycleCallbacks(FragmentManager.a aVar, boolean z10) {
        this.f6485a.add(new w0(aVar, z10));
    }

    public void unregisterFragmentLifecycleCallbacks(FragmentManager.a aVar) {
        synchronized (this.f6485a) {
            try {
                int size = this.f6485a.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    if (((w0) this.f6485a.get(i10)).f6479a == aVar) {
                        this.f6485a.remove(i10);
                        break;
                    }
                    i10++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
