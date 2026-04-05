package a2;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e3 implements a1.h {

    /* renamed from: a, reason: collision with root package name */
    public final kv.a f3535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1.h f3536b;

    public e3(a1.h saveableStateRegistry, kv.a onDispose) {
        kotlin.jvm.internal.e0.checkNotNullParameter(saveableStateRegistry, "saveableStateRegistry");
        kotlin.jvm.internal.e0.checkNotNullParameter(onDispose, "onDispose");
        this.f3535a = onDispose;
        this.f3536b = saveableStateRegistry;
    }

    @Override // a1.h
    public boolean canBeSaved(Object value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        return this.f3536b.canBeSaved(value);
    }

    @Override // a1.h
    public Object consumeRestored(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return this.f3536b.consumeRestored(key);
    }

    public final void dispose() {
        this.f3535a.invoke();
    }

    @Override // a1.h
    public Map<String, List<Object>> performSave() {
        return this.f3536b.performSave();
    }

    @Override // a1.h
    public a1.g registerProvider(String key, kv.a valueProvider) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(valueProvider, "valueProvider");
        return this.f3536b.registerProvider(key, valueProvider);
    }
}
