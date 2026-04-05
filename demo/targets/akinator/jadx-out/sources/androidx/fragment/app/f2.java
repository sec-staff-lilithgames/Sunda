package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6314a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6315b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6316c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public x1 f6317d;

    public final void a(Fragment fragment) {
        if (this.f6314a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f6314a) {
            this.f6314a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final Fragment b(String str) {
        e2 e2Var = (e2) this.f6315b.get(str);
        if (e2Var != null) {
            return e2Var.f6304c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment fragmentFindFragmentByWho;
        for (e2 e2Var : this.f6315b.values()) {
            if (e2Var != null && (fragmentFindFragmentByWho = e2Var.f6304c.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (e2 e2Var : this.f6315b.values()) {
            if (e2Var != null) {
                arrayList.add(e2Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (e2 e2Var : this.f6315b.values()) {
            if (e2Var != null) {
                arrayList.add(e2Var.f6304c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f6314a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f6314a) {
            arrayList = new ArrayList(this.f6314a);
        }
        return arrayList;
    }

    public final void g(e2 e2Var) {
        Fragment fragment = e2Var.f6304c;
        String str = fragment.mWho;
        HashMap map = this.f6315b;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.mWho, e2Var);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f6317d.a(fragment);
            } else {
                this.f6317d.e(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public final void h(e2 e2Var) {
        Fragment fragment = e2Var.f6304c;
        if (fragment.mRetainInstance) {
            this.f6317d.e(fragment);
        }
        if (((e2) this.f6315b.put(fragment.mWho, null)) != null && FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public final FragmentState i(String str, FragmentState fragmentState) {
        HashMap map = this.f6316c;
        return fragmentState != null ? (FragmentState) map.put(str, fragmentState) : (FragmentState) map.remove(str);
    }
}
