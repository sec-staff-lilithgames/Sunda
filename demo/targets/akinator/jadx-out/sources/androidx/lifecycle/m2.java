package androidx.lifecycle;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f6667c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f6668a;

    /* renamed from: b, reason: collision with root package name */
    public final a5.b f6669b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final m2 createHandle(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                return new m2();
            }
            ClassLoader classLoader = m2.class.getClassLoader();
            kotlin.jvm.internal.e0.checkNotNull(classLoader);
            bundle.setClassLoader(classLoader);
            return new m2(v5.b.m7516toMapimpl(v5.b.m7435constructorimpl(bundle)));
        }

        public final boolean validateValue(Object obj) {
            return a5.c.isAcceptableType(obj);
        }
    }

    public m2(Map<String, ? extends Object> initialState) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialState, "initialState");
        this.f6668a = new LinkedHashMap();
        this.f6669b = new a5.b(initialState);
    }

    public static final m2 createHandle(Bundle bundle, Bundle bundle2) {
        return f6667c.createHandle(bundle, bundle2);
    }

    public final b a(Object obj, String str, boolean z10) {
        b bVar;
        a5.b bVar2 = this.f6669b;
        if (bVar2.getMutableFlows().containsKey(str)) {
            throw new IllegalArgumentException(a.b.l("StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key '", str, "', but not both.").toString());
        }
        LinkedHashMap linkedHashMap = this.f6668a;
        Object bVar3 = linkedHashMap.get(str);
        if (bVar3 == null) {
            if (bVar2.getRegular().containsKey(str)) {
                bVar = new b(this, str, bVar2.getRegular().get(str));
            } else if (z10) {
                bVar2.getRegular().put(str, obj);
                bVar3 = new b(this, str, obj);
                linkedHashMap.put(str, bVar3);
            } else {
                bVar = new b(this, str);
            }
            bVar3 = bVar;
            linkedHashMap.put(str, bVar3);
        }
        return (b) bVar3;
    }

    public final void clearSavedStateProvider(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        this.f6669b.clearSavedStateProvider(key);
    }

    public final boolean contains(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return this.f6669b.contains(key);
    }

    public final <T> T get(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return (T) this.f6669b.get(key);
    }

    public final <T> t1 getLiveData(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        b bVarA = a(null, key, false);
        kotlin.jvm.internal.e0.checkNotNull(bVarA, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return bVarA;
    }

    public final <T> MutableStateFlow<T> getMutableStateFlow(String key, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        if (this.f6668a.containsKey(key)) {
            throw new IllegalArgumentException(a.b.l("StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key '", key, "', but not both.").toString());
        }
        return this.f6669b.getMutableStateFlow(key, t10);
    }

    public final <T> StateFlow<T> getStateFlow(String key, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        a5.b bVar = this.f6669b;
        return bVar.getMutableFlows().containsKey(key) ? FlowKt.asStateFlow(bVar.getMutableStateFlow(key, t10)) : bVar.getStateFlow(key, t10);
    }

    public final Set<String> keys() {
        return uu.d2.plus((Set) this.f6669b.keys(), (Iterable) this.f6668a.keySet());
    }

    public final <T> T remove(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        T t10 = (T) this.f6669b.remove(key);
        b bVar = (b) this.f6668a.remove(key);
        if (bVar != null) {
            bVar.detach();
        }
        return t10;
    }

    public final v5.g savedStateProvider() {
        return this.f6669b.getSavedStateProvider();
    }

    public final <T> void set(String key, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        if (!f6667c.validateValue(t10)) {
            StringBuilder sb2 = new StringBuilder("Can't put value with type ");
            kotlin.jvm.internal.e0.checkNotNull(t10);
            sb2.append(t10.getClass());
            sb2.append(" into saved state");
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        Object obj = this.f6668a.get(key);
        t1 t1Var = obj instanceof t1 ? (t1) obj : null;
        if (t1Var != null) {
            t1Var.setValue(t10);
        }
        this.f6669b.set(key, t10);
    }

    public final void setSavedStateProvider(String key, v5.g provider) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(provider, "provider");
        this.f6669b.setSavedStateProvider(key, provider);
    }

    public final <T> t1 getLiveData(String key, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return a(t10, key, true);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends t1 {

        /* renamed from: l, reason: collision with root package name */
        public final String f6670l;

        /* renamed from: m, reason: collision with root package name */
        public m2 f6671m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m2 m2Var, String key, Object obj) {
            super(obj);
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            this.f6670l = key;
            this.f6671m = m2Var;
        }

        public final void detach() {
            this.f6671m = null;
        }

        @Override // androidx.lifecycle.t1, androidx.lifecycle.l1
        public void setValue(Object obj) {
            a5.b bVar;
            m2 m2Var = this.f6671m;
            if (m2Var != null && (bVar = m2Var.f6669b) != null) {
                bVar.set(this.f6670l, obj);
            }
            super.setValue(obj);
        }

        public b(m2 m2Var, String key) {
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            this.f6670l = key;
            this.f6671m = m2Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m2() {
        this.f6668a = new LinkedHashMap();
        this.f6669b = new a5.b(null, 1, 0 == true ? 1 : 0);
    }
}
