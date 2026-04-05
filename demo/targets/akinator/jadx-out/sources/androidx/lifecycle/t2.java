package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.j3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t2 {

    /* renamed from: a, reason: collision with root package name */
    public static final q2 f6710a;

    /* renamed from: b, reason: collision with root package name */
    public static final r2 f6711b;

    /* renamed from: c, reason: collision with root package name */
    public static final s2 f6712c;

    static {
        int i10 = b5.a.f8748b;
        f6710a = new q2();
        f6711b = new r2();
        f6712c = new s2();
    }

    public static final m2 createSavedStateHandle(b5.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
        v5.j jVar = (v5.j) aVar.get(f6710a);
        if (jVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        n3 n3Var = (n3) aVar.get(f6711b);
        if (n3Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.get(f6712c);
        String str = (String) aVar.get(j3.f6624c);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        v2 savedStateHandlesProvider = getSavedStateHandlesProvider(jVar);
        w2 savedStateHandlesVM = getSavedStateHandlesVM(n3Var);
        m2 m2Var = savedStateHandlesVM.getHandles().get(str);
        if (m2Var != null) {
            return m2Var;
        }
        m2 m2VarCreateHandle = m2.f6667c.createHandle(savedStateHandlesProvider.consumeRestoredStateForKey(str), bundle);
        savedStateHandlesVM.getHandles().put(str, m2VarCreateHandle);
        return m2VarCreateHandle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends v5.j & n3> void enableSavedStateHandles(T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(t10, "<this>");
        j0 currentState = t10.getLifecycle().getCurrentState();
        if (currentState != j0.f6615c && currentState != j0.f6616e) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t10.getSavedStateRegistry().getSavedStateProvider("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            v2 v2Var = new v2(t10.getSavedStateRegistry(), t10);
            t10.getSavedStateRegistry().registerSavedStateProvider("androidx.lifecycle.internal.SavedStateHandlesProvider", v2Var);
            t10.getLifecycle().addObserver(new n2(v2Var));
        }
    }

    public static final v2 getSavedStateHandlesProvider(v5.j jVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jVar, "<this>");
        v5.g savedStateProvider = jVar.getSavedStateRegistry().getSavedStateProvider("androidx.lifecycle.internal.SavedStateHandlesProvider");
        v2 v2Var = savedStateProvider instanceof v2 ? (v2) savedStateProvider : null;
        if (v2Var != null) {
            return v2Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final w2 getSavedStateHandlesVM(n3 n3Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(n3Var, "<this>");
        return (w2) j3.b.create$default(j3.f6623b, n3Var, new p2(), (b5.a) null, 4, (Object) null).get("androidx.lifecycle.internal.SavedStateHandlesVM", kotlin.jvm.internal.c1.getOrCreateKotlinClass(w2.class));
    }
}
