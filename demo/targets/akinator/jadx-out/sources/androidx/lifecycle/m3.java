package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class m3 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f6672a = new LinkedHashMap();

    public final void clear() {
        LinkedHashMap linkedHashMap = this.f6672a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((g3) it.next()).clear$lifecycle_viewmodel_release();
        }
        linkedHashMap.clear();
    }

    public final g3 get(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return (g3) this.f6672a.get(key);
    }

    public final Set<String> keys() {
        return new HashSet(this.f6672a.keySet());
    }

    public final void put(String key, g3 viewModel) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewModel, "viewModel");
        g3 g3Var = (g3) this.f6672a.put(key, viewModel);
        if (g3Var != null) {
            g3Var.clear$lifecycle_viewmodel_release();
        }
    }
}
