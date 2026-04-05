package a5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import uu.d2;
import uu.p1;
import v5.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f4066a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4067b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f4068c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f4069d;

    /* renamed from: e, reason: collision with root package name */
    public final a f4070e;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void clearSavedStateProvider(String key) {
        e0.checkNotNullParameter(key, "key");
        this.f4067b.remove(key);
    }

    public final boolean contains(String key) {
        e0.checkNotNullParameter(key, "key");
        return this.f4066a.containsKey(key);
    }

    public final <T> T get(String key) {
        T t10;
        e0.checkNotNullParameter(key, "key");
        try {
            MutableStateFlow mutableStateFlow = (MutableStateFlow) this.f4069d.get(key);
            if (mutableStateFlow != null && (t10 = (T) mutableStateFlow.getValue()) != null) {
                return t10;
            }
            return (T) this.f4066a.get(key);
        } catch (ClassCastException unused) {
            remove(key);
            return null;
        }
    }

    public final Map<String, MutableStateFlow<Object>> getMutableFlows() {
        return this.f4069d;
    }

    public final <T> MutableStateFlow<T> getMutableStateFlow(String key, T t10) {
        e0.checkNotNullParameter(key, "key");
        LinkedHashMap linkedHashMap = this.f4069d;
        Object objMutableStateFlow = linkedHashMap.get(key);
        if (objMutableStateFlow == null) {
            Map map = this.f4066a;
            if (!map.containsKey(key)) {
                map.put(key, t10);
            }
            objMutableStateFlow = StateFlowKt.MutableStateFlow(map.get(key));
            linkedHashMap.put(key, objMutableStateFlow);
        }
        MutableStateFlow<T> mutableStateFlow = (MutableStateFlow) objMutableStateFlow;
        e0.checkNotNull(mutableStateFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<T of androidx.lifecycle.internal.SavedStateHandleImpl.getMutableStateFlow>");
        return mutableStateFlow;
    }

    public final Map<String, Object> getRegular() {
        return this.f4066a;
    }

    public final g getSavedStateProvider() {
        return this.f4070e;
    }

    public final <T> StateFlow<T> getStateFlow(String key, T t10) {
        e0.checkNotNullParameter(key, "key");
        LinkedHashMap linkedHashMap = this.f4068c;
        Object objMutableStateFlow = linkedHashMap.get(key);
        if (objMutableStateFlow == null) {
            Map map = this.f4066a;
            if (!map.containsKey(key)) {
                map.put(key, t10);
            }
            objMutableStateFlow = StateFlowKt.MutableStateFlow(map.get(key));
            linkedHashMap.put(key, objMutableStateFlow);
        }
        StateFlow<T> stateFlowAsStateFlow = FlowKt.asStateFlow((MutableStateFlow) objMutableStateFlow);
        e0.checkNotNull(stateFlowAsStateFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.internal.SavedStateHandleImpl.getStateFlow>");
        return stateFlowAsStateFlow;
    }

    public final Set<String> keys() {
        return d2.plus(this.f4066a.keySet(), (Iterable) this.f4067b.keySet());
    }

    public final <T> T remove(String key) {
        e0.checkNotNullParameter(key, "key");
        T t10 = (T) this.f4066a.remove(key);
        this.f4068c.remove(key);
        this.f4069d.remove(key);
        return t10;
    }

    public final g savedStateProvider() {
        return this.f4070e;
    }

    public final <T> void set(String key, T t10) {
        e0.checkNotNullParameter(key, "key");
        this.f4066a.put(key, t10);
        MutableStateFlow mutableStateFlow = (MutableStateFlow) this.f4068c.get(key);
        if (mutableStateFlow != null) {
            mutableStateFlow.setValue(t10);
        }
        MutableStateFlow mutableStateFlow2 = (MutableStateFlow) this.f4069d.get(key);
        if (mutableStateFlow2 != null) {
            mutableStateFlow2.setValue(t10);
        }
    }

    public final void setSavedStateProvider(String key, g provider) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(provider, "provider");
        this.f4067b.put(key, provider);
    }

    public b(Map<String, ? extends Object> initialState) {
        e0.checkNotNullParameter(initialState, "initialState");
        this.f4066a = p1.toMutableMap(initialState);
        this.f4067b = new LinkedHashMap();
        this.f4068c = new LinkedHashMap();
        this.f4069d = new LinkedHashMap();
        this.f4070e = new a(this, 0);
    }

    public /* synthetic */ b(Map map, int i10, u uVar) {
        this((i10 & 1) != 0 ? p1.emptyMap() : map);
    }
}
