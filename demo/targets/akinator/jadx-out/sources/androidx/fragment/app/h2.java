package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f6360a;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f6361b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6362c;

    /* renamed from: d, reason: collision with root package name */
    public int f6363d;

    /* renamed from: e, reason: collision with root package name */
    public int f6364e;

    /* renamed from: f, reason: collision with root package name */
    public int f6365f;

    /* renamed from: g, reason: collision with root package name */
    public int f6366g;

    /* renamed from: h, reason: collision with root package name */
    public int f6367h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6368i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6369j;

    /* renamed from: k, reason: collision with root package name */
    public String f6370k;

    /* renamed from: l, reason: collision with root package name */
    public int f6371l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f6372m;

    /* renamed from: n, reason: collision with root package name */
    public int f6373n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f6374o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f6375p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f6376q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6377r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f6378s;

    @Deprecated
    public h2() {
        this.f6362c = new ArrayList();
        this.f6369j = true;
        this.f6377r = false;
        this.f6360a = null;
        this.f6361b = null;
    }

    public final void a(g2 g2Var) {
        this.f6362c.add(g2Var);
        g2Var.f6328d = this.f6363d;
        g2Var.f6329e = this.f6364e;
        g2Var.f6330f = this.f6365f;
        g2Var.f6331g = this.f6366g;
    }

    public final h2 add(Class<? extends Fragment> cls, Bundle bundle, String str) {
        return add(b(cls, bundle), str);
    }

    public h2 addSharedElement(View view, String str) {
        if (i2.f6384a == null && i2.f6385b == null) {
            return this;
        }
        String transitionName = x3.z1.getTransitionName(view);
        if (transitionName == null) {
            throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
        }
        if (this.f6375p == null) {
            this.f6375p = new ArrayList();
            this.f6376q = new ArrayList();
        } else {
            if (this.f6376q.contains(str)) {
                throw new IllegalArgumentException(a.b.l("A shared element with the target name '", str, "' has already been added to the transaction."));
            }
            if (this.f6375p.contains(transitionName)) {
                throw new IllegalArgumentException(a.b.l("A shared element with the source name '", transitionName, "' has already been added to the transaction."));
            }
        }
        this.f6375p.add(transitionName);
        this.f6376q.add(str);
        return this;
    }

    public h2 addToBackStack(String str) {
        if (!this.f6369j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f6368i = true;
        this.f6370k = str;
        return this;
    }

    public h2 attach(Fragment fragment) {
        a(new g2(7, fragment));
        return this;
    }

    public final Fragment b(Class cls, Bundle bundle) {
        s0 s0Var = this.f6360a;
        if (s0Var == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        ClassLoader classLoader = this.f6361b;
        if (classLoader == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        Fragment fragmentInstantiate = s0Var.instantiate(classLoader, cls.getName());
        if (bundle != null) {
            fragmentInstantiate.setArguments(bundle);
        }
        return fragmentInstantiate;
    }

    public void c(int i10, Fragment fragment, String str, int i11) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            x4.e.onFragmentReuse(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                throw new IllegalStateException(a.b.o(sb2, fragment.mTag, " now ", str));
            }
            fragment.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i10);
            }
            fragment.mFragmentId = i10;
            fragment.mContainerId = i10;
        }
        a(new g2(i11, fragment));
    }

    public abstract int commit();

    public abstract int commitAllowingStateLoss();

    public abstract void commitNow();

    public abstract void commitNowAllowingStateLoss();

    public h2 detach(Fragment fragment) {
        a(new g2(6, fragment));
        return this;
    }

    public h2 disallowAddToBackStack() {
        if (this.f6368i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f6369j = false;
        return this;
    }

    public h2 hide(Fragment fragment) {
        a(new g2(4, fragment));
        return this;
    }

    public boolean isAddToBackStackAllowed() {
        return this.f6369j;
    }

    public boolean isEmpty() {
        return this.f6362c.isEmpty();
    }

    public h2 remove(Fragment fragment) {
        a(new g2(3, fragment));
        return this;
    }

    public final h2 replace(int i10, Class<? extends Fragment> cls, Bundle bundle) {
        return replace(i10, cls, bundle, null);
    }

    public h2 runOnCommit(Runnable runnable) {
        disallowAddToBackStack();
        if (this.f6378s == null) {
            this.f6378s = new ArrayList();
        }
        this.f6378s.add(runnable);
        return this;
    }

    @Deprecated
    public h2 setAllowOptimization(boolean z10) {
        return setReorderingAllowed(z10);
    }

    @Deprecated
    public h2 setBreadCrumbShortTitle(int i10) {
        this.f6373n = i10;
        this.f6374o = null;
        return this;
    }

    @Deprecated
    public h2 setBreadCrumbTitle(int i10) {
        this.f6371l = i10;
        this.f6372m = null;
        return this;
    }

    public h2 setCustomAnimations(int i10, int i11) {
        return setCustomAnimations(i10, i11, 0, 0);
    }

    public h2 setMaxLifecycle(Fragment fragment, androidx.lifecycle.j0 j0Var) {
        g2 g2Var = new g2();
        g2Var.f6325a = 10;
        g2Var.f6326b = fragment;
        g2Var.f6327c = false;
        g2Var.f6332h = fragment.mMaxState;
        g2Var.f6333i = j0Var;
        a(g2Var);
        return this;
    }

    public h2 setPrimaryNavigationFragment(Fragment fragment) {
        a(new g2(8, fragment));
        return this;
    }

    public h2 setReorderingAllowed(boolean z10) {
        this.f6377r = z10;
        return this;
    }

    public h2 setTransition(int i10) {
        this.f6367h = i10;
        return this;
    }

    public h2 show(Fragment fragment) {
        a(new g2(5, fragment));
        return this;
    }

    public h2 add(Fragment fragment, String str) {
        c(0, fragment, str, 1);
        return this;
    }

    public h2 replace(int i10, Fragment fragment) {
        return replace(i10, fragment, (String) null);
    }

    public h2 setCustomAnimations(int i10, int i11, int i12, int i13) {
        this.f6363d = i10;
        this.f6364e = i11;
        this.f6365f = i12;
        this.f6366g = i13;
        return this;
    }

    public final h2 add(int i10, Class<? extends Fragment> cls, Bundle bundle) {
        return add(i10, b(cls, bundle));
    }

    public final h2 replace(int i10, Class<? extends Fragment> cls, Bundle bundle, String str) {
        return replace(i10, b(cls, bundle), str);
    }

    @Deprecated
    public h2 setBreadCrumbShortTitle(CharSequence charSequence) {
        this.f6373n = 0;
        this.f6374o = charSequence;
        return this;
    }

    @Deprecated
    public h2 setBreadCrumbTitle(CharSequence charSequence) {
        this.f6371l = 0;
        this.f6372m = charSequence;
        return this;
    }

    public h2 add(int i10, Fragment fragment) {
        c(i10, fragment, null, 1);
        return this;
    }

    public h2 replace(int i10, Fragment fragment, String str) {
        if (i10 != 0) {
            c(i10, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public final h2 add(int i10, Class<? extends Fragment> cls, Bundle bundle, String str) {
        return add(i10, b(cls, bundle), str);
    }

    public h2 add(int i10, Fragment fragment, String str) {
        c(i10, fragment, str, 1);
        return this;
    }

    public h2(s0 s0Var, ClassLoader classLoader) {
        this.f6362c = new ArrayList();
        this.f6369j = true;
        this.f6377r = false;
        this.f6360a = s0Var;
        this.f6361b = classLoader;
    }

    @Deprecated
    public h2 setTransitionStyle(int i10) {
        return this;
    }
}
