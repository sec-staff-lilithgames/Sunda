package a0;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f3385a;

    public c() {
        this(0, 0.0f, 3, null);
    }

    public final Object get(Object key) {
        e0.checkNotNullParameter(key, "key");
        return this.f3385a.get(key);
    }

    public final Set<Map.Entry<Object, Object>> getEntries() {
        Set<Map.Entry<Object, Object>> setEntrySet = this.f3385a.entrySet();
        e0.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        return setEntrySet;
    }

    public final boolean isEmpty() {
        return this.f3385a.isEmpty();
    }

    public final Object put(Object key, Object value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        return this.f3385a.put(key, value);
    }

    public final Object remove(Object key) {
        e0.checkNotNullParameter(key, "key");
        return this.f3385a.remove(key);
    }

    public c(int i10, float f10) {
        this.f3385a = new LinkedHashMap(i10, f10, true);
    }

    public /* synthetic */ c(int i10, float f10, int i11, u uVar) {
        this((i11 & 1) != 0 ? 16 : i10, (i11 & 2) != 0 ? 0.75f : f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(c original) {
        this(0, 0.0f, 3, null);
        e0.checkNotNullParameter(original, "original");
        for (Map.Entry<Object, Object> entry : original.getEntries()) {
            put(entry.getKey(), entry.getValue());
        }
    }
}
