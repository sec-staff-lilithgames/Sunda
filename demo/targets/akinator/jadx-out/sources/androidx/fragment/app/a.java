package androidx.fragment.app;

import android.util.Log;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class a extends h2 implements j1, p1 {

    /* renamed from: t, reason: collision with root package name */
    public final FragmentManager f6269t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6270u;

    /* renamed from: v, reason: collision with root package name */
    public int f6271v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6272w;

    public a(FragmentManager fragmentManager) {
        super(fragmentManager.getFragmentFactory(), fragmentManager.getHost() != null ? fragmentManager.getHost().f6461c.getClassLoader() : null);
        this.f6271v = -1;
        this.f6272w = false;
        this.f6269t = fragmentManager;
    }

    @Override // androidx.fragment.app.h2
    public final void c(int i10, Fragment fragment, String str, int i11) {
        super.c(i10, fragment, str, i11);
        fragment.mFragmentManager = this.f6269t;
    }

    @Override // androidx.fragment.app.h2
    public int commit() {
        return e(false);
    }

    @Override // androidx.fragment.app.h2
    public int commitAllowingStateLoss() {
        return e(true);
    }

    @Override // androidx.fragment.app.h2
    public void commitNow() {
        disallowAddToBackStack();
        this.f6269t.x(this, false);
    }

    @Override // androidx.fragment.app.h2
    public void commitNowAllowingStateLoss() {
        disallowAddToBackStack();
        this.f6269t.x(this, true);
    }

    public final void d(int i10) {
        if (this.f6368i) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            ArrayList arrayList = this.f6362c;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                g2 g2Var = (g2) arrayList.get(i11);
                Fragment fragment = g2Var.f6326b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i10;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + g2Var.f6326b + " to " + g2Var.f6326b.mBackStackNesting);
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.h2
    public h2 detach(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f6269t) {
            return super.detach(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public void dump(String str, PrintWriter printWriter) {
        dump(str, printWriter, true);
    }

    public final int e(boolean z10) {
        if (this.f6270u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new u2());
            dump("  ", printWriter);
            printWriter.close();
        }
        this.f6270u = true;
        boolean z11 = this.f6368i;
        FragmentManager fragmentManager = this.f6269t;
        if (z11) {
            this.f6271v = fragmentManager.f6228i.getAndIncrement();
        } else {
            this.f6271v = -1;
        }
        fragmentManager.u(this, z10);
        return this.f6271v;
    }

    @Override // androidx.fragment.app.p1
    public boolean generateOps(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", QCmNMSGd.qCoxjYsrPt + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f6368i) {
            return true;
        }
        FragmentManager fragmentManager = this.f6269t;
        if (fragmentManager.f6223d == null) {
            fragmentManager.f6223d = new ArrayList();
        }
        fragmentManager.f6223d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.j1
    public CharSequence getBreadCrumbShortTitle() {
        return this.f6373n != 0 ? this.f6269t.getHost().f6461c.getText(this.f6373n) : this.f6374o;
    }

    @Override // androidx.fragment.app.j1
    public int getBreadCrumbShortTitleRes() {
        return this.f6373n;
    }

    @Override // androidx.fragment.app.j1
    public CharSequence getBreadCrumbTitle() {
        return this.f6371l != 0 ? this.f6269t.getHost().f6461c.getText(this.f6371l) : this.f6372m;
    }

    @Override // androidx.fragment.app.j1
    public int getBreadCrumbTitleRes() {
        return this.f6371l;
    }

    @Override // androidx.fragment.app.j1
    public int getId() {
        return this.f6271v;
    }

    @Override // androidx.fragment.app.j1
    public String getName() {
        return this.f6370k;
    }

    @Override // androidx.fragment.app.h2
    public h2 hide(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f6269t) {
            return super.hide(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.h2
    public boolean isEmpty() {
        return this.f6362c.isEmpty();
    }

    @Override // androidx.fragment.app.h2
    public h2 remove(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f6269t) {
            return super.remove(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public void runOnCommitRunnables() {
        if (this.f6378s != null) {
            for (int i10 = 0; i10 < this.f6378s.size(); i10++) {
                ((Runnable) this.f6378s.get(i10)).run();
            }
            this.f6378s = null;
        }
    }

    @Override // androidx.fragment.app.h2
    public h2 setMaxLifecycle(Fragment fragment, androidx.lifecycle.j0 j0Var) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        FragmentManager fragmentManager2 = this.f6269t;
        if (fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + fragmentManager2);
        }
        if (j0Var == androidx.lifecycle.j0.f6615c && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + j0Var + " after the Fragment has been created");
        }
        if (j0Var != androidx.lifecycle.j0.f6614b) {
            return super.setMaxLifecycle(fragment, j0Var);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + j0Var + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    @Override // androidx.fragment.app.h2
    public h2 setPrimaryNavigationFragment(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.mFragmentManager) == null || fragmentManager == this.f6269t) {
            return super.setPrimaryNavigationFragment(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.h2
    public h2 show(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f6269t) {
            return super.show(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f6271v >= 0) {
            sb2.append(" #");
            sb2.append(this.f6271v);
        }
        if (this.f6370k != null) {
            sb2.append(" ");
            sb2.append(this.f6370k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public void dump(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f6370k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f6271v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f6270u);
            if (this.f6367h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f6367h));
            }
            if (this.f6363d != 0 || this.f6364e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f6363d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f6364e));
            }
            if (this.f6365f != 0 || this.f6366g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f6365f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f6366g));
            }
            if (this.f6371l != 0 || this.f6372m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f6371l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f6372m);
            }
            if (this.f6373n != 0 || this.f6374o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f6373n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f6374o);
            }
        }
        ArrayList arrayList = this.f6362c;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            g2 g2Var = (g2) arrayList.get(i10);
            switch (g2Var.f6325a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + g2Var.f6325a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(g2Var.f6326b);
            if (z10) {
                if (g2Var.f6328d != 0 || g2Var.f6329e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(g2Var.f6328d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(g2Var.f6329e));
                }
                if (g2Var.f6330f != 0 || g2Var.f6331g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(g2Var.f6330f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(g2Var.f6331g));
                }
            }
        }
    }

    public a(a aVar) {
        super(aVar.f6269t.getFragmentFactory(), aVar.f6269t.getHost() != null ? aVar.f6269t.getHost().f6461c.getClassLoader() : null);
        Iterator it = aVar.f6362c.iterator();
        while (it.hasNext()) {
            g2 g2Var = (g2) it.next();
            ArrayList arrayList = this.f6362c;
            g2 g2Var2 = new g2();
            g2Var2.f6325a = g2Var.f6325a;
            g2Var2.f6326b = g2Var.f6326b;
            g2Var2.f6327c = g2Var.f6327c;
            g2Var2.f6328d = g2Var.f6328d;
            g2Var2.f6329e = g2Var.f6329e;
            g2Var2.f6330f = g2Var.f6330f;
            g2Var2.f6331g = g2Var.f6331g;
            g2Var2.f6332h = g2Var.f6332h;
            g2Var2.f6333i = g2Var.f6333i;
            arrayList.add(g2Var2);
        }
        this.f6363d = aVar.f6363d;
        this.f6364e = aVar.f6364e;
        this.f6365f = aVar.f6365f;
        this.f6366g = aVar.f6366g;
        this.f6367h = aVar.f6367h;
        this.f6368i = aVar.f6368i;
        this.f6369j = aVar.f6369j;
        this.f6370k = aVar.f6370k;
        this.f6373n = aVar.f6373n;
        this.f6374o = aVar.f6374o;
        this.f6371l = aVar.f6371l;
        this.f6372m = aVar.f6372m;
        if (aVar.f6375p != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f6375p = arrayList2;
            arrayList2.addAll(aVar.f6375p);
        }
        if (aVar.f6376q != null) {
            ArrayList arrayList3 = new ArrayList();
            this.f6376q = arrayList3;
            arrayList3.addAll(aVar.f6376q);
        }
        this.f6377r = aVar.f6377r;
        this.f6271v = -1;
        this.f6272w = false;
        this.f6269t = aVar.f6269t;
        this.f6270u = aVar.f6270u;
        this.f6271v = aVar.f6271v;
        this.f6272w = aVar.f6272w;
    }
}
