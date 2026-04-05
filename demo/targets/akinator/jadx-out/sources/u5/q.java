package u5;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract /* synthetic */ class q {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> void recursiveFetchArrayMap(z.f map, boolean z10, kv.l fetchBlock) {
        e0.checkNotNullParameter(map, "map");
        e0.checkNotNullParameter(fetchBlock, "fetchBlock");
        z.f fVar = new z.f(999);
        int size = map.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (z10) {
                fVar.put(map.keyAt(i10), map.valueAt(i10));
            } else {
                fVar.put(map.keyAt(i10), null);
            }
            i10++;
            i11++;
            if (i11 == 999) {
                fetchBlock.invoke(fVar);
                if (!z10) {
                    map.putAll((Map<Object, Object>) fVar);
                }
                fVar.clear();
                i11 = 0;
            }
        }
        if (i11 > 0) {
            fetchBlock.invoke(fVar);
            if (z10) {
                return;
            }
            map.putAll((Map<Object, Object>) fVar);
        }
    }

    public static final <K, V> void recursiveFetchHashMap(HashMap<K, V> map, boolean z10, kv.l fetchBlock) {
        int i10;
        e0.checkNotNullParameter(map, "map");
        e0.checkNotNullParameter(fetchBlock, "fetchBlock");
        HashMap map2 = new HashMap(999);
        loop0: while (true) {
            i10 = 0;
            for (K k10 : map.keySet()) {
                e0.checkNotNullExpressionValue(k10, "next(...)");
                if (z10) {
                    map2.put(k10, map.get(k10));
                } else {
                    map2.put(k10, null);
                }
                i10++;
                if (i10 == 999) {
                    fetchBlock.invoke(map2);
                    if (!z10) {
                        map.putAll(map2);
                    }
                    map2.clear();
                }
            }
            break loop0;
        }
        if (i10 > 0) {
            fetchBlock.invoke(map2);
            if (z10) {
                return;
            }
            map.putAll(map2);
        }
    }
}
