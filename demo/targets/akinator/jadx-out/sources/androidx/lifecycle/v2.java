package androidx.lifecycle;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v2 implements v5.g {

    /* renamed from: a, reason: collision with root package name */
    public final v5.h f6719a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6720b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f6721c;

    /* renamed from: d, reason: collision with root package name */
    public final tu.o f6722d;

    public v2(v5.h savedStateRegistry, n3 viewModelStoreOwner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f6719a = savedStateRegistry;
        this.f6722d = tu.q.lazy(new a1.e(viewModelStoreOwner, 2));
    }

    public final Bundle consumeRestoredStateForKey(String key) {
        tu.v[] vVarArr;
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        performRestore();
        Bundle bundle = this.f6721c;
        if (bundle == null || !v5.b.m7436containsimpl(v5.b.m7435constructorimpl(bundle), key)) {
            return null;
        }
        Bundle bundleM7497getSavedStateOrNullimpl = v5.b.m7497getSavedStateOrNullimpl(v5.b.m7435constructorimpl(bundle), key);
        if (bundleM7497getSavedStateOrNullimpl == null) {
            Map mapEmptyMap = uu.p1.emptyMap();
            if (mapEmptyMap.isEmpty()) {
                vVarArr = new tu.v[0];
            } else {
                ArrayList arrayList = new ArrayList(mapEmptyMap.size());
                for (Map.Entry entry : mapEmptyMap.entrySet()) {
                    arrayList.add(tu.e0.to((String) entry.getKey(), entry.getValue()));
                }
                vVarArr = (tu.v[]) arrayList.toArray(new tu.v[0]);
            }
            bundleM7497getSavedStateOrNullimpl = t3.e.bundleOf((tu.v[]) Arrays.copyOf(vVarArr, vVarArr.length));
            v5.k.m7521constructorimpl(bundleM7497getSavedStateOrNullimpl);
        }
        v5.k.m7557removeimpl(v5.k.m7521constructorimpl(bundle), key);
        if (v5.b.m7513isEmptyimpl(v5.b.m7435constructorimpl(bundle))) {
            this.f6721c = null;
        }
        return bundleM7497getSavedStateOrNullimpl;
    }

    public final void performRestore() {
        tu.v[] vVarArr;
        if (this.f6720b) {
            return;
        }
        Bundle bundleConsumeRestoredStateForKey = this.f6719a.consumeRestoredStateForKey("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Map mapEmptyMap = uu.p1.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            vVarArr = new tu.v[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(tu.e0.to((String) entry.getKey(), entry.getValue()));
            }
            vVarArr = (tu.v[]) arrayList.toArray(new tu.v[0]);
        }
        Bundle bundleBundleOf = t3.e.bundleOf((tu.v[]) Arrays.copyOf(vVarArr, vVarArr.length));
        Bundle bundleM7521constructorimpl = v5.k.m7521constructorimpl(bundleBundleOf);
        Bundle bundle = this.f6721c;
        if (bundle != null) {
            v5.k.m7525putAllimpl(bundleM7521constructorimpl, bundle);
        }
        if (bundleConsumeRestoredStateForKey != null) {
            v5.k.m7525putAllimpl(bundleM7521constructorimpl, bundleConsumeRestoredStateForKey);
        }
        this.f6721c = bundleBundleOf;
        this.f6720b = true;
    }

    @Override // v5.g
    public Bundle saveState() {
        tu.v[] vVarArr;
        Map mapEmptyMap = uu.p1.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            vVarArr = new tu.v[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(tu.e0.to((String) entry.getKey(), entry.getValue()));
            }
            vVarArr = (tu.v[]) arrayList.toArray(new tu.v[0]);
        }
        Bundle bundleBundleOf = t3.e.bundleOf((tu.v[]) Arrays.copyOf(vVarArr, vVarArr.length));
        Bundle bundleM7521constructorimpl = v5.k.m7521constructorimpl(bundleBundleOf);
        Bundle bundle = this.f6721c;
        if (bundle != null) {
            v5.k.m7525putAllimpl(bundleM7521constructorimpl, bundle);
        }
        for (Map.Entry<String, m2> entry2 : ((w2) this.f6722d.getValue()).getHandles().entrySet()) {
            String key = entry2.getKey();
            Bundle bundleSaveState = entry2.getValue().savedStateProvider().saveState();
            if (!v5.b.m7513isEmptyimpl(v5.b.m7435constructorimpl(bundleSaveState))) {
                v5.k.m7548putSavedStateimpl(bundleM7521constructorimpl, key, bundleSaveState);
            }
        }
        this.f6720b = false;
        return bundleBundleOf;
    }
}
