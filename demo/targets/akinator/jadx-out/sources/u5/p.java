package u5;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract /* synthetic */ class p {
    public static final <V> void recursiveFetchLongSparseArray(z.x map, boolean z10, kv.l fetchBlock) {
        e0.checkNotNullParameter(map, "map");
        e0.checkNotNullParameter(fetchBlock, "fetchBlock");
        z.x xVar = new z.x(999);
        int size = map.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (z10) {
                xVar.put(map.keyAt(i10), map.valueAt(i10));
            } else {
                xVar.put(map.keyAt(i10), null);
            }
            i10++;
            i11++;
            if (i11 == 999) {
                fetchBlock.invoke(xVar);
                if (!z10) {
                    map.putAll(xVar);
                }
                xVar.clear();
                i11 = 0;
            }
        }
        if (i11 > 0) {
            fetchBlock.invoke(xVar);
            if (z10) {
                return;
            }
            map.putAll(xVar);
        }
    }

    public static final <K, V> void recursiveFetchMap(Map<K, V> map, boolean z10, kv.l fetchBlock) {
        int i10;
        e0.checkNotNullParameter(map, "map");
        e0.checkNotNullParameter(fetchBlock, "fetchBlock");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        loop0: while (true) {
            i10 = 0;
            for (K k10 : map.keySet()) {
                if (z10) {
                    linkedHashMap.put(k10, map.get(k10));
                } else {
                    linkedHashMap.put(k10, null);
                }
                i10++;
                if (i10 == 999) {
                    fetchBlock.invoke(linkedHashMap);
                    if (!z10) {
                        map.putAll(linkedHashMap);
                    }
                    linkedHashMap.clear();
                }
            }
            break loop0;
        }
        if (i10 > 0) {
            fetchBlock.invoke(linkedHashMap);
            if (z10) {
                return;
            }
            map.putAll(linkedHashMap);
        }
    }
}
