package io.ktor.util;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import lv.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CaseInsensitiveMap<Value> implements Map<String, Value>, g {
    private final Map<CaseInsensitiveString, Value> delegate = new LinkedHashMap();

    @Override // java.util.Map
    public void clear() {
        this.delegate.clear();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.delegate.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Value>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof CaseInsensitiveMap)) {
            return false;
        }
        return e0.areEqual(((CaseInsensitiveMap) obj).delegate, this.delegate);
    }

    @Override // java.util.Map
    public final /* bridge */ Value get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public Set<Map.Entry<String, Value>> getEntries() {
        return new DelegatingMutableSet(this.delegate.entrySet(), CaseInsensitiveMap$entries$1.INSTANCE, CaseInsensitiveMap$entries$2.INSTANCE);
    }

    public Set<String> getKeys() {
        return new DelegatingMutableSet(this.delegate.keySet(), CaseInsensitiveMap$keys$1.INSTANCE, CaseInsensitiveMap$keys$2.INSTANCE);
    }

    public int getSize() {
        return this.delegate.size();
    }

    public Collection<Value> getValues() {
        return this.delegate.values();
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.delegate.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(String str, Object obj) {
        return put2(str, (String) obj);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends Value> from) {
        e0.checkNotNullParameter(from, "from");
        for (Map.Entry<? extends String, ? extends Value> entry : from.entrySet()) {
            put2(entry.getKey(), (String) entry.getValue());
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Value remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Value> values() {
        return getValues();
    }

    public boolean containsKey(String key) {
        e0.checkNotNullParameter(key, "key");
        return this.delegate.containsKey(new CaseInsensitiveString(key));
    }

    public Value get(String key) {
        e0.checkNotNullParameter(key, "key");
        return this.delegate.get(TextKt.caseInsensitive(key));
    }

    /* renamed from: put, reason: avoid collision after fix types in other method */
    public Value put2(String key, Value value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        return this.delegate.put(TextKt.caseInsensitive(key), value);
    }

    public Value remove(String key) {
        e0.checkNotNullParameter(key, "key");
        return this.delegate.remove(TextKt.caseInsensitive(key));
    }
}
