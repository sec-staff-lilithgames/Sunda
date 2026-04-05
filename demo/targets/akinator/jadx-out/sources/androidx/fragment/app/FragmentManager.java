package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.j3;
import androidx.lifecycle.m3;
import androidx.lifecycle.n3;
import com.apm.insight.b.El.rJqlArycrfkilN;
import com.digidust.elokence.akinator.freemium.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class FragmentManager implements b2 {
    public static boolean R;
    public i.d C;
    public i.d D;
    public i.d E;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public x1 O;
    public x4.d P;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6221b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f6223d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f6224e;

    /* renamed from: g, reason: collision with root package name */
    public f.d0 f6226g;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f6232m;

    /* renamed from: p, reason: collision with root package name */
    public final y0 f6235p;

    /* renamed from: q, reason: collision with root package name */
    public final y0 f6236q;

    /* renamed from: r, reason: collision with root package name */
    public final y0 f6237r;

    /* renamed from: s, reason: collision with root package name */
    public final y0 f6238s;

    /* renamed from: v, reason: collision with root package name */
    public t0 f6241v;

    /* renamed from: w, reason: collision with root package name */
    public p0 f6242w;

    /* renamed from: x, reason: collision with root package name */
    public Fragment f6243x;

    /* renamed from: y, reason: collision with root package name */
    public Fragment f6244y;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6220a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final f2 f6222c = new f2();

    /* renamed from: f, reason: collision with root package name */
    public final v0 f6225f = new v0(this);

    /* renamed from: h, reason: collision with root package name */
    public final a1 f6227h = new a1(this);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f6228i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f6229j = a.b.u();

    /* renamed from: k, reason: collision with root package name */
    public final Map f6230k = a.b.u();

    /* renamed from: l, reason: collision with root package name */
    public final Map f6231l = a.b.u();

    /* renamed from: n, reason: collision with root package name */
    public final x0 f6233n = new x0(this);

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f6234o = new CopyOnWriteArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final b1 f6239t = new b1(this);

    /* renamed from: u, reason: collision with root package name */
    public int f6240u = -1;

    /* renamed from: z, reason: collision with root package name */
    public s0 f6245z = null;
    public final c1 A = new c1(this);
    public final d1 B = new d1();
    public ArrayDeque F = new ArrayDeque();
    public final e1 Q = new e1(this);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new m1();

        /* renamed from: b, reason: collision with root package name */
        public String f6246b;

        /* renamed from: c, reason: collision with root package name */
        public int f6247c;

        public LaunchedFragmentInfo(String str, int i10) {
            this.f6246b = str;
            this.f6247c = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f6246b);
            parcel.writeInt(this.f6247c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.fragment.app.y0] */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.fragment.app.y0] */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.y0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.y0] */
    public FragmentManager() {
        final int i10 = 0;
        this.f6235p = new w3.b(this) { // from class: androidx.fragment.app.y0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f6498b;

            {
                this.f6498b = this;
            }

            @Override // w3.b
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f6498b;
                        if (fragmentManager.F()) {
                            fragmentManager.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f6498b;
                        if (fragmentManager2.F() && num.intValue() == 80) {
                            fragmentManager2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        k3.z zVar = (k3.z) obj;
                        FragmentManager fragmentManager3 = this.f6498b;
                        if (fragmentManager3.F()) {
                            fragmentManager3.m(zVar.isInMultiWindowMode(), false);
                            break;
                        }
                        break;
                    default:
                        k3.d1 d1Var = (k3.d1) obj;
                        FragmentManager fragmentManager4 = this.f6498b;
                        if (fragmentManager4.F()) {
                            fragmentManager4.r(d1Var.isInPictureInPictureMode(), false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f6236q = new w3.b(this) { // from class: androidx.fragment.app.y0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f6498b;

            {
                this.f6498b = this;
            }

            @Override // w3.b
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f6498b;
                        if (fragmentManager.F()) {
                            fragmentManager.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f6498b;
                        if (fragmentManager2.F() && num.intValue() == 80) {
                            fragmentManager2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        k3.z zVar = (k3.z) obj;
                        FragmentManager fragmentManager3 = this.f6498b;
                        if (fragmentManager3.F()) {
                            fragmentManager3.m(zVar.isInMultiWindowMode(), false);
                            break;
                        }
                        break;
                    default:
                        k3.d1 d1Var = (k3.d1) obj;
                        FragmentManager fragmentManager4 = this.f6498b;
                        if (fragmentManager4.F()) {
                            fragmentManager4.r(d1Var.isInPictureInPictureMode(), false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 2;
        this.f6237r = new w3.b(this) { // from class: androidx.fragment.app.y0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f6498b;

            {
                this.f6498b = this;
            }

            @Override // w3.b
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f6498b;
                        if (fragmentManager.F()) {
                            fragmentManager.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f6498b;
                        if (fragmentManager2.F() && num.intValue() == 80) {
                            fragmentManager2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        k3.z zVar = (k3.z) obj;
                        FragmentManager fragmentManager3 = this.f6498b;
                        if (fragmentManager3.F()) {
                            fragmentManager3.m(zVar.isInMultiWindowMode(), false);
                            break;
                        }
                        break;
                    default:
                        k3.d1 d1Var = (k3.d1) obj;
                        FragmentManager fragmentManager4 = this.f6498b;
                        if (fragmentManager4.F()) {
                            fragmentManager4.r(d1Var.isInPictureInPictureMode(), false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i13 = 3;
        this.f6238s = new w3.b(this) { // from class: androidx.fragment.app.y0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentManager f6498b;

            {
                this.f6498b = this;
            }

            @Override // w3.b
            public final void accept(Object obj) {
                switch (i13) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        FragmentManager fragmentManager = this.f6498b;
                        if (fragmentManager.F()) {
                            fragmentManager.h(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        FragmentManager fragmentManager2 = this.f6498b;
                        if (fragmentManager2.F() && num.intValue() == 80) {
                            fragmentManager2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        k3.z zVar = (k3.z) obj;
                        FragmentManager fragmentManager3 = this.f6498b;
                        if (fragmentManager3.F()) {
                            fragmentManager3.m(zVar.isInMultiWindowMode(), false);
                            break;
                        }
                        break;
                    default:
                        k3.d1 d1Var = (k3.d1) obj;
                        FragmentManager fragmentManager4 = this.f6498b;
                        if (fragmentManager4.F()) {
                            fragmentManager4.r(d1Var.isInPictureInPictureMode(), false);
                            break;
                        }
                        break;
                }
            }
        };
    }

    public static boolean E(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        Iterator it = fragment.mChildFragmentManager.f6222c.e().iterator();
        boolean zE = false;
        while (it.hasNext()) {
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                zE = E(fragment2);
            }
            if (zE) {
                return true;
            }
        }
        return false;
    }

    public static boolean G(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.getPrimaryNavigationFragment()) && G(fragmentManager.f6243x);
    }

    public static void W(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    @Deprecated
    public static void enableDebugLogging(boolean z10) {
        R = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.fragment.app.Fragment] */
    public static <F extends Fragment> F findFragment(View view) {
        F f10;
        View view2 = view;
        while (true) {
            f10 = null;
            if (view2 == null) {
                break;
            }
            Object tag = view2.getTag(R.id.fragment_container_view_tag);
            F f11 = tag instanceof Fragment ? (Fragment) tag : null;
            if (f11 != null) {
                f10 = f11;
                break;
            }
            Object parent = view2.getParent();
            view2 = parent instanceof View ? (View) parent : null;
        }
        if (f10 != null) {
            return f10;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    public static boolean isLoggingEnabled(int i10) {
        return R || Log.isLoggable("FragmentManager", i10);
    }

    public final void A() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            b3 b3Var = (b3) it.next();
            if (b3Var.f6288e) {
                if (isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                b3Var.f6288e = false;
                b3Var.c();
            }
        }
    }

    public final ViewGroup B(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.f6242w.onHasView()) {
            return null;
        }
        View viewOnFindViewById = this.f6242w.onFindViewById(fragment.mContainerId);
        if (viewOnFindViewById instanceof ViewGroup) {
            return (ViewGroup) viewOnFindViewById;
        }
        return null;
    }

    public final c3 C() {
        Fragment fragment = this.f6243x;
        return fragment != null ? fragment.mFragmentManager.C() : this.B;
    }

    public final void D(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        V(fragment);
    }

    public final boolean F() {
        Fragment fragment = this.f6243x;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f6243x.getParentFragmentManager().F();
    }

    public final void H(int i10, boolean z10) {
        t0 t0Var;
        if (this.f6241v == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f6240u) {
            this.f6240u = i10;
            f2 f2Var = this.f6222c;
            HashMap map = f2Var.f6315b;
            Iterator it = f2Var.f6314a.iterator();
            while (it.hasNext()) {
                e2 e2Var = (e2) map.get(((Fragment) it.next()).mWho);
                if (e2Var != null) {
                    e2Var.j();
                }
            }
            for (e2 e2Var2 : map.values()) {
                if (e2Var2 != null) {
                    e2Var2.j();
                    Fragment fragment = e2Var2.f6304c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !f2Var.f6316c.containsKey(fragment.mWho)) {
                            e2Var2.n();
                        }
                        f2Var.h(e2Var2);
                    }
                }
            }
            Iterator it2 = f2Var.d().iterator();
            while (it2.hasNext()) {
                e2 e2Var3 = (e2) it2.next();
                Fragment fragment2 = e2Var3.f6304c;
                if (fragment2.mDeferStart) {
                    if (this.f6221b) {
                        this.K = true;
                    } else {
                        fragment2.mDeferStart = false;
                        e2Var3.j();
                    }
                }
            }
            if (this.G && (t0Var = this.f6241v) != null && this.f6240u == 7) {
                t0Var.onSupportInvalidateOptionsMenu();
                this.G = false;
            }
        }
    }

    public final void I() {
        if (this.f6241v == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.f6494g = false;
        for (Fragment fragment : this.f6222c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void J(int i10, int i11, boolean z10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(a.b.e(i10, "Bad id: "));
        }
        u(new q1(this, null, i10, i11), z10);
    }

    public final boolean K(int i10, int i11, String str) {
        w(false);
        v(true);
        Fragment fragment = this.f6244y;
        if (fragment != null && i10 < 0 && str == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
            return true;
        }
        boolean zL = L(this.L, this.M, str, i10, i11);
        if (zL) {
            this.f6221b = true;
            try {
                N(this.L, this.M);
            } finally {
                d();
            }
        }
        Y();
        boolean z10 = this.K;
        f2 f2Var = this.f6222c;
        if (z10) {
            this.K = false;
            Iterator it = f2Var.d().iterator();
            while (it.hasNext()) {
                e2 e2Var = (e2) it.next();
                Fragment fragment2 = e2Var.f6304c;
                if (fragment2.mDeferStart) {
                    if (this.f6221b) {
                        this.K = true;
                    } else {
                        fragment2.mDeferStart = false;
                        e2Var.j();
                    }
                }
            }
        }
        f2Var.f6315b.values().removeAll(Collections.singleton(null));
        return zL;
    }

    public final boolean L(ArrayList arrayList, ArrayList arrayList2, String str, int i10, int i11) {
        int iZ = z(i10, str, (i11 & 1) != 0);
        if (iZ < 0) {
            return false;
        }
        for (int size = this.f6223d.size() - 1; size >= iZ; size--) {
            arrayList.add((androidx.fragment.app.a) this.f6223d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void M(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        f2 f2Var = this.f6222c;
        synchronized (f2Var.f6314a) {
            f2Var.f6314a.remove(fragment);
        }
        fragment.mAdded = false;
        if (E(fragment)) {
            this.G = true;
        }
        fragment.mRemoving = true;
        V(fragment);
    }

    public final void N(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((androidx.fragment.app.a) arrayList.get(i10)).f6377r) {
                if (i11 != i10) {
                    y(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((androidx.fragment.app.a) arrayList.get(i11)).f6377r) {
                        i11++;
                    }
                }
                y(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            y(arrayList, arrayList2, i11, size);
        }
    }

    public final boolean O(ArrayList arrayList, ArrayList arrayList2, String str) {
        boolean z10;
        BackStackState backStackState = (BackStackState) this.f6229j.remove(str);
        if (backStackState == null) {
            return false;
        }
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) it.next();
            if (aVar.f6272w) {
                Iterator it2 = aVar.f6362c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment = ((g2) it2.next()).f6326b;
                    if (fragment != null) {
                        map.put(fragment.mWho, fragment);
                    }
                }
            }
        }
        ArrayList<String> arrayList3 = backStackState.f6212b;
        HashMap map2 = new HashMap(arrayList3.size());
        for (String str2 : arrayList3) {
            Fragment fragment2 = (Fragment) map.get(str2);
            if (fragment2 != null) {
                map2.put(fragment2.mWho, fragment2);
            } else {
                FragmentState fragmentStateI = this.f6222c.i(str2, null);
                if (fragmentStateI != null) {
                    Fragment fragmentA = fragmentStateI.a(getFragmentFactory(), getHost().f6461c.getClassLoader());
                    map2.put(fragmentA.mWho, fragmentA);
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = backStackState.f6213c.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((BackStackRecordState) it3.next()).instantiate(this, map2));
        }
        Iterator it4 = arrayList4.iterator();
        while (true) {
            while (it4.hasNext()) {
                z10 = ((androidx.fragment.app.a) it4.next()).generateOps(arrayList, arrayList2) || z10;
            }
            return z10;
        }
    }

    public final void P(Parcelable parcelable) {
        x0 x0Var;
        e2 e2Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f6241v.f6461c.getClassLoader());
                this.f6230k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f6241v.f6461c.getClassLoader());
                arrayList.add((FragmentState) bundle.getParcelable("state"));
            }
        }
        f2 f2Var = this.f6222c;
        HashMap map = f2Var.f6316c;
        HashMap map2 = f2Var.f6315b;
        map.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FragmentState fragmentState = (FragmentState) it.next();
            map.put(fragmentState.f6257c, fragmentState);
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        map2.clear();
        Iterator it2 = fragmentManagerState.f6248b.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            x0Var = this.f6233n;
            if (!zHasNext) {
                break;
            }
            FragmentState fragmentStateI = f2Var.i((String) it2.next(), null);
            if (fragmentStateI != null) {
                Fragment fragment = (Fragment) this.O.f6488a.get(fragmentStateI.f6257c);
                if (fragment != null) {
                    if (isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    e2Var = new e2(x0Var, f2Var, fragment, fragmentStateI);
                } else {
                    e2Var = new e2(this.f6233n, this.f6222c, this.f6241v.f6461c.getClassLoader(), getFragmentFactory(), fragmentStateI);
                }
                Fragment fragment2 = e2Var.f6304c;
                fragment2.mFragmentManager = this;
                if (isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                }
                e2Var.k(this.f6241v.f6461c.getClassLoader());
                f2Var.g(e2Var);
                e2Var.f6306e = this.f6240u;
            }
        }
        x1 x1Var = this.O;
        x1Var.getClass();
        Iterator it3 = new ArrayList(x1Var.f6488a.values()).iterator();
        while (it3.hasNext()) {
            Fragment fragment3 = (Fragment) it3.next();
            if (map2.get(fragment3.mWho) == null) {
                if (isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.f6248b);
                }
                this.O.e(fragment3);
                fragment3.mFragmentManager = this;
                e2 e2Var2 = new e2(x0Var, f2Var, fragment3);
                e2Var2.f6306e = 1;
                e2Var2.j();
                fragment3.mRemoving = true;
                e2Var2.j();
            }
        }
        ArrayList<String> arrayList2 = fragmentManagerState.f6249c;
        f2Var.f6314a.clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                Fragment fragmentB = f2Var.b(str3);
                if (fragmentB == null) {
                    throw new IllegalStateException(a.b.l("No instantiated fragment for (", str3, ")"));
                }
                if (isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + fragmentB);
                }
                f2Var.a(fragmentB);
            }
        }
        if (fragmentManagerState.f6250e != null) {
            this.f6223d = new ArrayList(fragmentManagerState.f6250e.length);
            int i10 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f6250e;
                if (i10 >= backStackRecordStateArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarInstantiate = backStackRecordStateArr[i10].instantiate(this);
                if (isLoggingEnabled(2)) {
                    StringBuilder sbT = p0.o2.t(i10, "restoreAllState: back stack #", " (index ");
                    sbT.append(aVarInstantiate.f6271v);
                    sbT.append("): ");
                    sbT.append(aVarInstantiate);
                    Log.v("FragmentManager", sbT.toString());
                    PrintWriter printWriter = new PrintWriter(new u2());
                    aVarInstantiate.dump("  ", printWriter, false);
                    printWriter.close();
                }
                this.f6223d.add(aVarInstantiate);
                i10++;
            }
        } else {
            this.f6223d = null;
        }
        this.f6228i.set(fragmentManagerState.f6251f);
        String str4 = fragmentManagerState.f6252g;
        if (str4 != null) {
            Fragment fragmentB2 = f2Var.b(str4);
            this.f6244y = fragmentB2;
            q(fragmentB2);
        }
        ArrayList arrayList3 = fragmentManagerState.f6253h;
        if (arrayList3 != null) {
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                this.f6229j.put((String) arrayList3.get(i11), (BackStackState) fragmentManagerState.f6254i.get(i11));
            }
        }
        this.F = new ArrayDeque(fragmentManagerState.f6255j);
    }

    public final void R() {
        synchronized (this.f6220a) {
            try {
                if (this.f6220a.size() == 1) {
                    this.f6241v.getHandler().removeCallbacks(this.Q);
                    this.f6241v.getHandler().post(this.Q);
                    Y();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void S(Fragment fragment, boolean z10) {
        ViewGroup viewGroupB = B(fragment);
        if (viewGroupB == null || !(viewGroupB instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupB).setDrawDisappearingViewsLast(!z10);
    }

    public final void T(Fragment fragment, androidx.lifecycle.j0 j0Var) {
        if (fragment.equals(this.f6222c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = j0Var;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void U(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.f6222c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
            }
        }
        Fragment fragment2 = this.f6244y;
        this.f6244y = fragment;
        q(fragment2);
        q(this.f6244y);
    }

    public final void V(Fragment fragment) {
        ViewGroup viewGroupB = B(fragment);
        if (viewGroupB != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (viewGroupB.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupB.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) viewGroupB.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void X(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new u2());
        t0 t0Var = this.f6241v;
        if (t0Var != null) {
            try {
                t0Var.onDump("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    public final void Y() {
        synchronized (this.f6220a) {
            try {
                if (this.f6220a.isEmpty()) {
                    this.f6227h.setEnabled(getBackStackEntryCount() > 0 && G(this.f6243x));
                } else {
                    this.f6227h.setEnabled(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final e2 a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            x4.e.onFragmentReuse(fragment, str);
        }
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        e2 e2VarF = f(fragment);
        fragment.mFragmentManager = this;
        f2 f2Var = this.f6222c;
        f2Var.g(e2VarF);
        if (!fragment.mDetached) {
            f2Var.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (E(fragment)) {
                this.G = true;
            }
        }
        return e2VarF;
    }

    public void addFragmentOnAttachListener(y1 y1Var) {
        this.f6234o.add(y1Var);
    }

    public void addOnBackStackChangedListener(o1 o1Var) {
        if (this.f6232m == null) {
            this.f6232m = new ArrayList();
        }
        this.f6232m.add(o1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(t0 t0Var, p0 p0Var, Fragment fragment) {
        if (this.f6241v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f6241v = t0Var;
        this.f6242w = p0Var;
        this.f6243x = fragment;
        if (fragment != null) {
            addFragmentOnAttachListener(new g1(fragment));
        } else if (t0Var instanceof y1) {
            addFragmentOnAttachListener((y1) t0Var);
        }
        if (this.f6243x != null) {
            Y();
        }
        if (t0Var instanceof f.i0) {
            f.i0 i0Var = (f.i0) t0Var;
            f.d0 onBackPressedDispatcher = i0Var.getOnBackPressedDispatcher();
            this.f6226g = onBackPressedDispatcher;
            androidx.lifecycle.b1 b1Var = i0Var;
            if (fragment != null) {
                b1Var = fragment;
            }
            onBackPressedDispatcher.addCallback(b1Var, this.f6227h);
        }
        if (fragment != null) {
            x1 x1Var = fragment.mFragmentManager.O;
            HashMap map = x1Var.f6489b;
            x1 x1Var2 = (x1) map.get(fragment.mWho);
            if (x1Var2 == null) {
                x1Var2 = new x1(x1Var.f6491d);
                map.put(fragment.mWho, x1Var2);
            }
            this.O = x1Var2;
        } else if (t0Var instanceof n3) {
            m3 viewModelStore = ((n3) t0Var).getViewModelStore();
            w1 w1Var = x1.f6487h;
            this.O = (x1) new j3(viewModelStore, x1.f6487h).get(x1.class);
        } else {
            this.O = new x1(false);
        }
        this.O.f6494g = isStateSaved();
        this.f6222c.f6317d = this.O;
        Object obj = this.f6241v;
        if ((obj instanceof v5.j) && fragment == null) {
            v5.h savedStateRegistry = ((v5.j) obj).getSavedStateRegistry();
            savedStateRegistry.registerSavedStateProvider("android:support:fragments", new k0(this, 1));
            Bundle bundleConsumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey("android:support:fragments");
            if (bundleConsumeRestoredStateForKey != null) {
                P(bundleConsumeRestoredStateForKey);
            }
        }
        Object obj2 = this.f6241v;
        if (obj2 instanceof i.j) {
            i.g activityResultRegistry = ((i.j) obj2).getActivityResultRegistry();
            String strK = a.b.k("FragmentManager:", fragment != null ? j1.o2.o(new StringBuilder(), fragment.mWho, ":") : "");
            this.C = activityResultRegistry.register(j1.o2.l(strK, "StartActivityForResult"), new j.d(), new h1(this));
            this.D = activityResultRegistry.register(j1.o2.l(strK, "StartIntentSenderForResult"), new l1(), new i1(this));
            this.E = activityResultRegistry.register(j1.o2.l(strK, "RequestPermissions"), new j.b(), new z0(this));
        }
        Object obj3 = this.f6241v;
        if (obj3 instanceof m3.f) {
            ((m3.f) obj3).addOnConfigurationChangedListener(this.f6235p);
        }
        Object obj4 = this.f6241v;
        if (obj4 instanceof m3.g) {
            ((m3.g) obj4).addOnTrimMemoryListener(this.f6236q);
        }
        Object obj5 = this.f6241v;
        if (obj5 instanceof k3.s0) {
            ((k3.s0) obj5).addOnMultiWindowModeChangedListener(this.f6237r);
        }
        Object obj6 = this.f6241v;
        if (obj6 instanceof k3.u0) {
            ((k3.u0) obj6).addOnPictureInPictureModeChangedListener(this.f6238s);
        }
        Object obj7 = this.f6241v;
        if ((obj7 instanceof x3.a0) && fragment == null) {
            ((x3.a0) obj7).addMenuProvider(this.f6239t);
        }
    }

    public h2 beginTransaction() {
        return new androidx.fragment.app.a(this);
    }

    public final void c(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f6222c.a(fragment);
            if (isLoggingEnabled(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (E(fragment)) {
                this.G = true;
            }
        }
    }

    public void clearBackStack(String str) {
        u(new k1(this, str), false);
    }

    @Override // androidx.fragment.app.b2
    public final void clearFragmentResult(String str) {
        this.f6230k.remove(str);
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    @Override // androidx.fragment.app.b2
    public final void clearFragmentResultListener(String str) {
        n1 n1Var = (n1) this.f6231l.remove(str);
        if (n1Var != null) {
            n1Var.removeObserver();
        }
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Clearing FragmentResultListener for key " + str);
        }
    }

    public final void d() {
        this.f6221b = false;
        this.M.clear();
        this.L.clear();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strL = j1.o2.l(str, "    ");
        f2 f2Var = this.f6222c;
        ArrayList arrayList = f2Var.f6314a;
        String strL2 = j1.o2.l(str, "    ");
        HashMap map = f2Var.f6315b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (e2 e2Var : map.values()) {
                printWriter.print(str);
                if (e2Var != null) {
                    Fragment fragment = e2Var.f6304c;
                    printWriter.println(fragment);
                    fragment.dump(strL2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(AbstractJsonLexerKt.NULL);
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                Fragment fragment2 = (Fragment) arrayList.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.f6224e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                Fragment fragment3 = (Fragment) this.f6224e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList arrayList3 = this.f6223d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.f6223d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.dump(strL, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f6228i.get());
        synchronized (this.f6220a) {
            try {
                int size4 = this.f6220a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i13 = 0; i13 < size4; i13++) {
                        Object obj = (p1) this.f6220a.get(i13);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f6241v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f6242w);
        if (this.f6243x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f6243x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f6240u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f6222c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((e2) it.next()).f6304c.mContainer;
            if (viewGroup != null) {
                hashSet.add(b3.g(viewGroup, C()));
            }
        }
        return hashSet;
    }

    public boolean executePendingTransactions() {
        boolean zW = w(true);
        A();
        return zW;
    }

    public final e2 f(Fragment fragment) {
        String str = fragment.mWho;
        f2 f2Var = this.f6222c;
        e2 e2Var = (e2) f2Var.f6315b.get(str);
        if (e2Var != null) {
            return e2Var;
        }
        e2 e2Var2 = new e2(this.f6233n, f2Var, fragment);
        e2Var2.k(this.f6241v.f6461c.getClassLoader());
        e2Var2.f6306e = this.f6240u;
        return e2Var2;
    }

    public Fragment findFragmentById(int i10) {
        f2 f2Var = this.f6222c;
        ArrayList arrayList = f2Var.f6314a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i10) {
                return fragment;
            }
        }
        for (e2 e2Var : f2Var.f6315b.values()) {
            if (e2Var != null) {
                Fragment fragment2 = e2Var.f6304c;
                if (fragment2.mFragmentId == i10) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public Fragment findFragmentByTag(String str) {
        f2 f2Var = this.f6222c;
        ArrayList arrayList = f2Var.f6314a;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (e2 e2Var : f2Var.f6315b.values()) {
            if (e2Var != null) {
                Fragment fragment2 = e2Var.f6304c;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final void g(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (isLoggingEnabled(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            f2 f2Var = this.f6222c;
            synchronized (f2Var.f6314a) {
                f2Var.f6314a.remove(fragment);
            }
            fragment.mAdded = false;
            if (E(fragment)) {
                this.G = true;
            }
            V(fragment);
        }
    }

    public j1 getBackStackEntryAt(int i10) {
        return (j1) this.f6223d.get(i10);
    }

    public int getBackStackEntryCount() {
        ArrayList arrayList = this.f6223d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public Fragment getFragment(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentB = this.f6222c.b(string);
        if (fragmentB != null) {
            return fragmentB;
        }
        X(new IllegalStateException(a.b.m("Fragment no longer exists for key ", str, ": unique id ", string)));
        throw null;
    }

    public s0 getFragmentFactory() {
        s0 s0Var = this.f6245z;
        if (s0Var != null) {
            return s0Var;
        }
        Fragment fragment = this.f6243x;
        return fragment != null ? fragment.mFragmentManager.getFragmentFactory() : this.A;
    }

    public List<Fragment> getFragments() {
        return this.f6222c.f();
    }

    public t0 getHost() {
        return this.f6241v;
    }

    public Fragment getPrimaryNavigationFragment() {
        return this.f6244y;
    }

    public x4.d getStrictModePolicy() {
        return this.P;
    }

    public final void h(boolean z10, Configuration configuration) {
        if (z10 && (this.f6241v instanceof m3.f)) {
            X(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f6222c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z10) {
                    fragment.mChildFragmentManager.h(true, configuration);
                }
            }
        }
    }

    public final boolean i(MenuItem menuItem) {
        if (this.f6240u < 1) {
            return false;
        }
        for (Fragment fragment : this.f6222c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean isDestroyed() {
        return this.J;
    }

    public boolean isStateSaved() {
        return this.H || this.I;
    }

    public final boolean j(Menu menu, MenuInflater menuInflater) {
        if (this.f6240u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f6222c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f6224e != null) {
            for (int i10 = 0; i10 < this.f6224e.size(); i10++) {
                Fragment fragment2 = (Fragment) this.f6224e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f6224e = arrayList;
        return z10;
    }

    public final void k() {
        boolean zIsChangingConfigurations = true;
        this.J = true;
        w(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((b3) it.next()).e();
        }
        t0 t0Var = this.f6241v;
        boolean z10 = t0Var instanceof n3;
        f2 f2Var = this.f6222c;
        if (z10) {
            zIsChangingConfigurations = f2Var.f6317d.f6492e;
        } else {
            Context context = t0Var.f6461c;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.f6229j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((BackStackState) it2.next()).f6212b) {
                    x1 x1Var = f2Var.f6317d;
                    x1Var.getClass();
                    if (isLoggingEnabled(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    x1Var.c(str);
                }
            }
        }
        t(-1);
        Object obj = this.f6241v;
        if (obj instanceof m3.g) {
            ((m3.g) obj).removeOnTrimMemoryListener(this.f6236q);
        }
        Object obj2 = this.f6241v;
        if (obj2 instanceof m3.f) {
            ((m3.f) obj2).removeOnConfigurationChangedListener(this.f6235p);
        }
        Object obj3 = this.f6241v;
        if (obj3 instanceof k3.s0) {
            ((k3.s0) obj3).removeOnMultiWindowModeChangedListener(this.f6237r);
        }
        Object obj4 = this.f6241v;
        if (obj4 instanceof k3.u0) {
            ((k3.u0) obj4).removeOnPictureInPictureModeChangedListener(this.f6238s);
        }
        Object obj5 = this.f6241v;
        if (obj5 instanceof x3.a0) {
            ((x3.a0) obj5).removeMenuProvider(this.f6239t);
        }
        this.f6241v = null;
        this.f6242w = null;
        this.f6243x = null;
        if (this.f6226g != null) {
            this.f6227h.remove();
            this.f6226g = null;
        }
        i.d dVar = this.C;
        if (dVar != null) {
            dVar.unregister();
            this.D.unregister();
            this.E.unregister();
        }
    }

    public final void l(boolean z10) {
        if (z10 && (this.f6241v instanceof m3.g)) {
            X(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f6222c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z10) {
                    fragment.mChildFragmentManager.l(true);
                }
            }
        }
    }

    public final void m(boolean z10, boolean z11) {
        if (z11 && (this.f6241v instanceof k3.s0)) {
            X(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f6222c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.m(z10, true);
                }
            }
        }
    }

    public final void n() {
        Iterator it = this.f6222c.e().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.n();
            }
        }
    }

    public final boolean o(MenuItem menuItem) {
        if (this.f6240u < 1) {
            return false;
        }
        for (Fragment fragment : this.f6222c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public h2 openTransaction() {
        return beginTransaction();
    }

    public final void p(Menu menu) {
        if (this.f6240u < 1) {
            return;
        }
        for (Fragment fragment : this.f6222c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public void popBackStack() {
        u(new q1(this, null, -1, 0), false);
    }

    public boolean popBackStackImmediate() {
        return K(-1, 0, null);
    }

    public void putFragment(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            X(new IllegalStateException(a.b.j("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void q(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.f6222c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void r(boolean z10, boolean z11) {
        if (z11 && (this.f6241v instanceof k3.u0)) {
            X(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f6222c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.r(z10, true);
                }
            }
        }
    }

    public void registerFragmentLifecycleCallbacks(a aVar, boolean z10) {
        this.f6233n.registerFragmentLifecycleCallbacks(aVar, z10);
    }

    public void removeFragmentOnAttachListener(y1 y1Var) {
        this.f6234o.remove(y1Var);
    }

    public void removeOnBackStackChangedListener(o1 o1Var) {
        ArrayList arrayList = this.f6232m;
        if (arrayList != null) {
            arrayList.remove(o1Var);
        }
    }

    public void restoreBackStack(String str) {
        u(new r1(this, str), false);
    }

    public final boolean s(Menu menu) {
        boolean z10 = false;
        if (this.f6240u < 1) {
            return false;
        }
        for (Fragment fragment : this.f6222c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public void saveBackStack(String str) {
        u(new s1(this, str), false);
    }

    public Fragment.SavedState saveFragmentInstanceState(Fragment fragment) {
        Bundle bundleM;
        e2 e2Var = (e2) this.f6222c.f6315b.get(fragment.mWho);
        if (e2Var != null) {
            Fragment fragment2 = e2Var.f6304c;
            if (fragment2.equals(fragment)) {
                if (fragment2.mState <= -1 || (bundleM = e2Var.m()) == null) {
                    return null;
                }
                return new Fragment.SavedState(bundleM);
            }
        }
        X(new IllegalStateException(a.b.j("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    public void setFragmentFactory(s0 s0Var) {
        this.f6245z = s0Var;
    }

    @Override // androidx.fragment.app.b2
    public final void setFragmentResult(String str, Bundle bundle) {
        n1 n1Var = (n1) this.f6231l.get(str);
        if (n1Var == null || !n1Var.isAtLeast(androidx.lifecycle.j0.f6617f)) {
            this.f6230k.put(str, bundle);
        } else {
            n1Var.onFragmentResult(str, bundle);
        }
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    @Override // androidx.fragment.app.b2
    public final void setFragmentResultListener(String str, androidx.lifecycle.b1 b1Var, a2 a2Var) {
        androidx.lifecycle.k0 lifecycle = b1Var.getLifecycle();
        if (lifecycle.getCurrentState() == androidx.lifecycle.j0.f6614b) {
            return;
        }
        f1 f1Var = new f1(this, str, a2Var, lifecycle);
        lifecycle.addObserver(f1Var);
        n1 n1Var = (n1) this.f6231l.put(str, new n1(lifecycle, a2Var, f1Var));
        if (n1Var != null) {
            n1Var.removeObserver();
        }
        if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + a2Var);
        }
    }

    public void setStrictModePolicy(x4.d dVar) {
        this.P = dVar;
    }

    public final void t(int i10) {
        try {
            this.f6221b = true;
            for (e2 e2Var : this.f6222c.f6315b.values()) {
                if (e2Var != null) {
                    e2Var.f6306e = i10;
                }
            }
            H(i10, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((b3) it.next()).e();
            }
            this.f6221b = false;
            w(true);
        } catch (Throwable th2) {
            this.f6221b = false;
            throw th2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f6243x;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f6243x)));
            sb2.append("}");
        } else {
            t0 t0Var = this.f6241v;
            if (t0Var != null) {
                sb2.append(t0Var.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f6241v)));
                sb2.append("}");
            } else {
                sb2.append(AbstractJsonLexerKt.NULL);
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(p1 p1Var, boolean z10) {
        if (!z10) {
            if (this.f6241v == null) {
                if (!this.J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (isStateSaved()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f6220a) {
            try {
                if (this.f6241v == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f6220a.add(p1Var);
                    R();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void unregisterFragmentLifecycleCallbacks(a aVar) {
        this.f6233n.unregisterFragmentLifecycleCallbacks(aVar);
    }

    public final void v(boolean z10) {
        if (this.f6221b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f6241v == null) {
            if (!this.J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f6241v.getHandler().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10 && isStateSaved()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }

    public final boolean w(boolean z10) {
        boolean zGenerateOps;
        v(z10);
        boolean z11 = false;
        while (true) {
            ArrayList<androidx.fragment.app.a> arrayList = this.L;
            ArrayList<Boolean> arrayList2 = this.M;
            synchronized (this.f6220a) {
                if (this.f6220a.isEmpty()) {
                    zGenerateOps = false;
                } else {
                    try {
                        int size = this.f6220a.size();
                        zGenerateOps = false;
                        for (int i10 = 0; i10 < size; i10++) {
                            zGenerateOps |= ((p1) this.f6220a.get(i10)).generateOps(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zGenerateOps) {
                break;
            }
            this.f6221b = true;
            try {
                N(this.L, this.M);
                d();
                z11 = true;
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
        Y();
        if (this.K) {
            this.K = false;
            Iterator it = this.f6222c.d().iterator();
            while (it.hasNext()) {
                e2 e2Var = (e2) it.next();
                Fragment fragment = e2Var.f6304c;
                if (fragment.mDeferStart) {
                    if (this.f6221b) {
                        this.K = true;
                    } else {
                        fragment.mDeferStart = false;
                        e2Var.j();
                    }
                }
            }
        }
        this.f6222c.f6315b.values().removeAll(Collections.singleton(null));
        return z11;
    }

    public final void x(androidx.fragment.app.a aVar, boolean z10) {
        if (z10 && (this.f6241v == null || this.J)) {
            return;
        }
        v(z10);
        if (aVar.generateOps(this.L, this.M)) {
            this.f6221b = true;
            try {
                N(this.L, this.M);
            } finally {
                d();
            }
        }
        Y();
        boolean z11 = this.K;
        f2 f2Var = this.f6222c;
        if (z11) {
            this.K = false;
            Iterator it = f2Var.d().iterator();
            while (it.hasNext()) {
                e2 e2Var = (e2) it.next();
                Fragment fragment = e2Var.f6304c;
                if (fragment.mDeferStart) {
                    if (this.f6221b) {
                        this.K = true;
                    } else {
                        fragment.mDeferStart = false;
                        e2Var.j();
                    }
                }
            }
        }
        f2Var.f6315b.values().removeAll(Collections.singleton(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x022c A[PHI: r14
      0x022c: PHI (r14v14 int) = (r14v13 int), (r14v15 int) binds: [B:100:0x021c, B:105:0x0228] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.util.ArrayList r24, java.util.ArrayList r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.y(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final int z(int i10, String str, boolean z10) {
        ArrayList arrayList = this.f6223d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f6223d.size() - 1;
        }
        int size = this.f6223d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.f6223d.get(size);
            if ((str != null && str.equals(aVar.getName())) || (i10 >= 0 && i10 == aVar.f6271v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f6223d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) this.f6223d.get(size - 1);
            if ((str == null || !str.equals(aVar2.getName())) && (i10 < 0 || i10 != aVar2.f6271v)) {
                break;
            }
            size--;
        }
        return size;
    }

    public final Bundle Q() {
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList arrayList;
        int size;
        Bundle bundle = new Bundle();
        A();
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((b3) it.next()).e();
        }
        w(true);
        this.H = true;
        this.O.f6494g = true;
        f2 f2Var = this.f6222c;
        f2Var.getClass();
        HashMap map = f2Var.f6315b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (e2 e2Var : map.values()) {
            if (e2Var != null) {
                Fragment fragment = e2Var.f6304c;
                e2Var.n();
                arrayList2.add(fragment.mWho);
                if (isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        f2 f2Var2 = this.f6222c;
        f2Var2.getClass();
        ArrayList arrayList3 = new ArrayList(f2Var2.f6316c.values());
        if (!arrayList3.isEmpty()) {
            f2 f2Var3 = this.f6222c;
            synchronized (f2Var3.f6314a) {
                try {
                    backStackRecordStateArr = null;
                    if (f2Var3.f6314a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(f2Var3.f6314a.size());
                        Iterator it2 = f2Var3.f6314a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment2 = (Fragment) it2.next();
                            arrayList.add(fragment2.mWho);
                            if (isLoggingEnabled(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList4 = this.f6223d;
            if (arrayList4 != null && (size = arrayList4.size()) > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i10 = 0; i10 < size; i10++) {
                    backStackRecordStateArr[i10] = new BackStackRecordState((androidx.fragment.app.a) this.f6223d.get(i10));
                    if (isLoggingEnabled(2)) {
                        StringBuilder sbT = p0.o2.t(i10, rJqlArycrfkilN.jrGcDlgIRIB, ": ");
                        sbT.append(this.f6223d.get(i10));
                        Log.v("FragmentManager", sbT.toString());
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f6248b = arrayList2;
            fragmentManagerState.f6249c = arrayList;
            fragmentManagerState.f6250e = backStackRecordStateArr;
            fragmentManagerState.f6251f = this.f6228i.get();
            Fragment fragment3 = this.f6244y;
            if (fragment3 != null) {
                fragmentManagerState.f6252g = fragment3.mWho;
            }
            fragmentManagerState.f6253h.addAll(this.f6229j.keySet());
            fragmentManagerState.f6254i.addAll(this.f6229j.values());
            fragmentManagerState.f6255j = new ArrayList(this.F);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f6230k.keySet()) {
                bundle.putBundle(a.b.k("result_", str), (Bundle) this.f6230k.get(str));
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                FragmentState fragmentState = (FragmentState) it3.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", fragmentState);
                bundle.putBundle("fragment_" + fragmentState.f6257c, bundle2);
            }
        } else if (isLoggingEnabled(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public void popBackStack(String str, int i10) {
        u(new q1(this, str, -1, i10), false);
    }

    public boolean popBackStackImmediate(String str, int i10) {
        return K(-1, i10, str);
    }

    public void popBackStack(int i10, int i11) {
        J(i10, i11, false);
    }

    public boolean popBackStackImmediate(int i10, int i11) {
        if (i10 >= 0) {
            return K(i10, i11, null);
        }
        throw new IllegalArgumentException(a.b.e(i10, "Bad id: "));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static abstract class a {
        public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        }

        @Deprecated
        public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }
    }
}
