package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.g3;
import androidx.lifecycle.m3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x1 extends g3 {

    /* renamed from: h, reason: collision with root package name */
    public static final w1 f6487h = new w1();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6491d;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6488a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6489b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6490c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f6492e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6493f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6494g = false;

    public x1(boolean z10) {
        this.f6491d = z10;
    }

    public final void a(Fragment fragment) {
        if (this.f6494g) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = fragment.mWho;
        HashMap map = this.f6488a;
        if (map.containsKey(str)) {
            return;
        }
        map.put(fragment.mWho, fragment);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public final void b(Fragment fragment) {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        c(fragment.mWho);
    }

    public final void c(String str) {
        HashMap map = this.f6489b;
        x1 x1Var = (x1) map.get(str);
        if (x1Var != null) {
            x1Var.onCleared();
            map.remove(str);
        }
        HashMap map2 = this.f6490c;
        m3 m3Var = (m3) map2.get(str);
        if (m3Var != null) {
            m3Var.clear();
            map2.remove(str);
        }
    }

    public final u1 d() {
        HashMap map = this.f6488a;
        boolean zIsEmpty = map.isEmpty();
        HashMap map2 = this.f6489b;
        HashMap map3 = this.f6490c;
        if (zIsEmpty && map2.isEmpty() && map3.isEmpty()) {
            return null;
        }
        HashMap map4 = new HashMap();
        for (Map.Entry entry : map2.entrySet()) {
            u1 u1VarD = ((x1) entry.getValue()).d();
            if (u1VarD != null) {
                map4.put((String) entry.getKey(), u1VarD);
            }
        }
        this.f6493f = true;
        if (map.isEmpty() && map4.isEmpty() && map3.isEmpty()) {
            return null;
        }
        return new u1(new ArrayList(map.values()), map4, new HashMap(map3));
    }

    public final void e(Fragment fragment) {
        if (this.f6494g) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f6488a.remove(fragment.mWho) == null || !FragmentManager.isLoggingEnabled(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x1.class == obj.getClass()) {
            x1 x1Var = (x1) obj;
            if (this.f6488a.equals(x1Var.f6488a) && this.f6489b.equals(x1Var.f6489b) && this.f6490c.equals(x1Var.f6490c)) {
                return true;
            }
        }
        return false;
    }

    public final void f(u1 u1Var) {
        HashMap map = this.f6488a;
        map.clear();
        HashMap map2 = this.f6489b;
        map2.clear();
        HashMap map3 = this.f6490c;
        map3.clear();
        if (u1Var != null) {
            Collection<Fragment> collection = u1Var.f6469a;
            if (collection != null) {
                for (Fragment fragment : collection) {
                    if (fragment != null) {
                        map.put(fragment.mWho, fragment);
                    }
                }
            }
            Map map4 = u1Var.f6470b;
            if (map4 != null) {
                for (Map.Entry entry : map4.entrySet()) {
                    x1 x1Var = new x1(this.f6491d);
                    x1Var.f((u1) entry.getValue());
                    map2.put((String) entry.getKey(), x1Var);
                }
            }
            Map map5 = u1Var.f6471c;
            if (map5 != null) {
                map3.putAll(map5);
            }
        }
        this.f6493f = false;
    }

    public int hashCode() {
        return this.f6490c.hashCode() + ((this.f6489b.hashCode() + (this.f6488a.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.g3
    public final void onCleared() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f6492e = true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f6488a.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f6489b.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f6490c.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
