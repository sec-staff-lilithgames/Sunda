package v5;

import android.os.Bundle;
import androidx.lifecycle.b1;
import androidx.lifecycle.i0;
import androidx.lifecycle.v0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.v;
import uu.p1;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public final j f89038b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: v5.a$a, reason: collision with other inner class name */
    public static final class C0796a {
        public C0796a(u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements g {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashSet f89039a;

        public b(h registry) {
            e0.checkNotNullParameter(registry, "registry");
            this.f89039a = new LinkedHashSet();
            registry.registerSavedStateProvider("androidx.savedstate.Restarter", this);
        }

        public final void add(String className) {
            e0.checkNotNullParameter(className, "className");
            this.f89039a.add(className);
        }

        @Override // v5.g
        public Bundle saveState() {
            v[] vVarArr;
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
            Bundle bundleBundleOf = t3.e.bundleOf((v[]) Arrays.copyOf(vVarArr, vVarArr.length));
            k.m7556putStringListimpl(k.m7521constructorimpl(bundleBundleOf), "classes_to_restore", y0.toList(this.f89039a));
            return bundleBundleOf;
        }
    }

    static {
        new C0796a(null);
    }

    public a(j owner) {
        e0.checkNotNullParameter(owner, "owner");
        this.f89038b = owner;
    }

    @Override // androidx.lifecycle.v0
    public void onStateChanged(b1 source, i0 event) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(event, "event");
        if (event != i0.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().removeObserver(this);
        j jVar = this.f89038b;
        Bundle bundleConsumeRestoredStateForKey = jVar.getSavedStateRegistry().consumeRestoredStateForKey("androidx.savedstate.Restarter");
        if (bundleConsumeRestoredStateForKey == null) {
            return;
        }
        List<String> listM7510getStringListOrNullimpl = v5.b.m7510getStringListOrNullimpl(v5.b.m7435constructorimpl(bundleConsumeRestoredStateForKey), "classes_to_restore");
        if (listM7510getStringListOrNullimpl == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : listM7510getStringListOrNullimpl) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, a.class.getClassLoader()).asSubclass(f.class);
                e0.checkNotNull(clsAsSubclass);
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        e0.checkNotNull(objNewInstance);
                        ((f) objNewInstance).onRecreated(jVar);
                    } catch (Exception e10) {
                        throw new RuntimeException(a.b.k("Failed to instantiate ", str), e10);
                    }
                } catch (NoSuchMethodException e11) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                }
            } catch (ClassNotFoundException e12) {
                throw new RuntimeException(a.b.l("Class ", str, " wasn't found"), e12);
            }
        }
    }
}
