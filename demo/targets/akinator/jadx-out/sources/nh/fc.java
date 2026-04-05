package nh;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface fc {
    Map<Object, Collection<Object>> asMap();

    void clear();

    boolean containsEntry(Object obj, Object obj2);

    boolean containsKey(Object obj);

    boolean containsValue(Object obj);

    Collection<Map.Entry<Object, Object>> entries();

    boolean equals(Object obj);

    Collection<Object> get(Object obj);

    int hashCode();

    boolean isEmpty();

    Set<Object> keySet();

    ud keys();

    boolean put(Object obj, Object obj2);

    boolean putAll(Object obj, Iterable<Object> iterable);

    boolean putAll(fc fcVar);

    boolean remove(Object obj, Object obj2);

    Collection<Object> removeAll(Object obj);

    Collection<Object> replaceValues(Object obj, Iterable<Object> iterable);

    int size();

    Collection<Object> values();
}
