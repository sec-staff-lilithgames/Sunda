package io.ktor.util;

import com.ironsource.G5;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;
import kotlin.jvm.internal.e0;
import lv.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class Entry<Key, Value> implements Map.Entry<Key, Value>, f {
    private final Key key;
    private Value value;

    public Entry(Key key, Value value) {
        this.key = key;
        this.value = value;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (e0.areEqual(entry.getKey(), getKey()) && e0.areEqual(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public Key getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public Value getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Key key = getKey();
        e0.checkNotNull(key);
        int iHashCode = key.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        Value value = getValue();
        e0.checkNotNull(value);
        return value.hashCode() + iHashCode;
    }

    @Override // java.util.Map.Entry
    public void setValue(Value value) {
        this.value = value;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append(G5.T);
        sb2.append(getValue());
        return sb2.toString();
    }

    @Override // java.util.Map.Entry
    public Value setValue(Value value) {
        setValue((Entry<Key, Value>) value);
        return getValue();
    }
}
