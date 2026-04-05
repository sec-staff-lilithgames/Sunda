package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Map f68591a;

    public w(Map map) {
        this.f68591a = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l9 = (Long) entry2.getKey();
                ConcurrentMap concurrentMap = x.f68592a;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l9));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, x.f68593b);
            map2.put((b0) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, x.f68593b);
    }

    public final String a(long j10, b0 b0Var) {
        Map map = (Map) this.f68591a.get(b0Var);
        if (map != null) {
            return (String) map.get(Long.valueOf(j10));
        }
        return null;
    }
}
