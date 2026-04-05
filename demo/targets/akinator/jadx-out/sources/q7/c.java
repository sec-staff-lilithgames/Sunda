package q7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import uu.p0;
import uu.p1;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {
    public static final <R, T> T firstNotNullOfOrNullIndices(List<? extends R> list, kv.l lVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = (T) lVar.invoke(list.get(i10));
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }

    public static final <T, R> R foldIndices(List<? extends T> list, R r10, kv.p pVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            r10 = (R) pVar.invoke(r10, list.get(i10));
        }
        return r10;
    }

    public static final <T> void forEachIndexedIndices(List<? extends T> list, kv.p pVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.invoke(Integer.valueOf(i10), list.get(i10));
        }
    }

    public static final <T> void forEachIndices(List<? extends T> list, kv.l lVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            lVar.invoke(list.get(i10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R> Map<K, R> mapNotNullValues(Map<K, ? extends V> map, kv.l lVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            Object objInvoke = lVar.invoke(entry);
            if (objInvoke != null) {
                linkedHashMap.put(entry.getKey(), objInvoke);
            }
        }
        return linkedHashMap;
    }

    public static final <T> void removeIfIndices(List<T> list, kv.l lVar) {
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = i11 - i10;
            if (((Boolean) lVar.invoke(list.get(i12))).booleanValue()) {
                list.remove(i12);
                i10++;
            }
        }
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(y0.first((List) list)) : p0.emptyList();
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return p1.emptyMap();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) y0.first(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
