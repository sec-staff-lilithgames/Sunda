package w5;

import android.os.Bundle;
import androidx.lifecycle.j0;
import i.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import t3.e;
import tu.v;
import uu.p1;
import v5.g;
import v5.j;
import v5.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f90378i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final j f90379a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.a f90380b;

    /* renamed from: c, reason: collision with root package name */
    public final b f90381c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f90382d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f90383e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f90384f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f90385g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f90386h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: w5.a$a, reason: collision with other inner class name */
    public static final class C0806a {
        public C0806a(u uVar) {
        }
    }

    static {
        new C0806a(null);
    }

    public a(j owner, kv.a onAttach) {
        e0.checkNotNullParameter(owner, "owner");
        e0.checkNotNullParameter(onAttach, "onAttach");
        this.f90379a = owner;
        this.f90380b = onAttach;
        this.f90381c = new b();
        this.f90382d = new LinkedHashMap();
        this.f90386h = true;
    }

    public final Bundle consumeRestoredStateForKey(String key) {
        e0.checkNotNullParameter(key, "key");
        if (!this.f90385g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = this.f90384f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM7435constructorimpl = v5.b.m7435constructorimpl(bundle);
        Bundle bundleM7492getSavedStateimpl = v5.b.m7436containsimpl(bundleM7435constructorimpl, key) ? v5.b.m7492getSavedStateimpl(bundleM7435constructorimpl, key) : null;
        k.m7557removeimpl(k.m7521constructorimpl(bundle), key);
        if (v5.b.m7513isEmptyimpl(v5.b.m7435constructorimpl(bundle))) {
            this.f90384f = null;
        }
        return bundleM7492getSavedStateimpl;
    }

    public final kv.a getOnAttach$savedstate_release() {
        return this.f90380b;
    }

    public final g getSavedStateProvider(String key) {
        g gVar;
        e0.checkNotNullParameter(key, "key");
        synchronized (this.f90381c) {
            Iterator it = this.f90382d.entrySet().iterator();
            do {
                gVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                g gVar2 = (g) entry.getValue();
                if (e0.areEqual(str, key)) {
                    gVar = gVar2;
                }
            } while (gVar == null);
        }
        return gVar;
    }

    public final boolean isAllowingSavingState$savedstate_release() {
        return this.f90386h;
    }

    public final boolean isRestored() {
        return this.f90385g;
    }

    public final void performAttach() {
        j jVar = this.f90379a;
        if (jVar.getLifecycle().getCurrentState() != j0.f6615c) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f90383e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f90380b.invoke();
        jVar.getLifecycle().addObserver(new androidx.lifecycle.e0(this, 1));
        this.f90383e = true;
    }

    public final void performRestore$savedstate_release(Bundle bundle) {
        if (!this.f90383e) {
            performAttach();
        }
        j jVar = this.f90379a;
        if (jVar.getLifecycle().getCurrentState().isAtLeast(j0.f6617f)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + jVar.getLifecycle().getCurrentState()).toString());
        }
        if (this.f90385g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleM7492getSavedStateimpl = null;
        if (bundle != null) {
            Bundle bundleM7435constructorimpl = v5.b.m7435constructorimpl(bundle);
            if (v5.b.m7436containsimpl(bundleM7435constructorimpl, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundleM7492getSavedStateimpl = v5.b.m7492getSavedStateimpl(bundleM7435constructorimpl, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
        }
        this.f90384f = bundleM7492getSavedStateimpl;
        this.f90385g = true;
    }

    public final void performSave$savedstate_release(Bundle outBundle) {
        v[] vVarArr;
        e0.checkNotNullParameter(outBundle, "outBundle");
        Map mapEmptyMap = p1.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            vVarArr = new v[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(tu.e0.to((String) entry.getKey(), entry.getValue()));
            }
            vVarArr = (v[]) arrayList.toArray(new v[0]);
        }
        Bundle bundleBundleOf = e.bundleOf((v[]) Arrays.copyOf(vVarArr, vVarArr.length));
        Bundle bundleM7521constructorimpl = k.m7521constructorimpl(bundleBundleOf);
        Bundle bundle = this.f90384f;
        if (bundle != null) {
            k.m7525putAllimpl(bundleM7521constructorimpl, bundle);
        }
        synchronized (this.f90381c) {
            for (Map.Entry entry2 : this.f90382d.entrySet()) {
                k.m7548putSavedStateimpl(bundleM7521constructorimpl, (String) entry2.getKey(), ((g) entry2.getValue()).saveState());
            }
        }
        if (v5.b.m7513isEmptyimpl(v5.b.m7435constructorimpl(bundleBundleOf))) {
            return;
        }
        k.m7548putSavedStateimpl(k.m7521constructorimpl(outBundle), "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleBundleOf);
    }

    public final void registerSavedStateProvider(String key, g provider) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(provider, "provider");
        synchronized (this.f90381c) {
            if (this.f90382d.containsKey(key)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            this.f90382d.put(key, provider);
        }
    }

    public final void setAllowingSavingState$savedstate_release(boolean z10) {
        this.f90386h = z10;
    }

    public final void unregisterSavedStateProvider(String key) {
        e0.checkNotNullParameter(key, "key");
        synchronized (this.f90381c) {
        }
    }

    public /* synthetic */ a(j jVar, kv.a aVar, int i10, u uVar) {
        this(jVar, (i10 & 2) != 0 ? new f(14) : aVar);
    }
}
