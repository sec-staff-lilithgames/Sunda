package gj;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f57702a;

    public d(int i10) {
        this.f57702a = a.newLinkedHashMapWithExpectedSize(i10);
    }

    public static <K, V> d newMapBuilder(int i10) {
        return new d(i10);
    }

    public Map<Object, Object> build() {
        LinkedHashMap linkedHashMap = this.f57702a;
        return linkedHashMap.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMap);
    }

    public d put(Object obj, Object obj2) {
        this.f57702a.put(obj, obj2);
        return this;
    }

    public d putAll(Map<Object, Object> map) {
        this.f57702a.putAll(map);
        return this;
    }
}
