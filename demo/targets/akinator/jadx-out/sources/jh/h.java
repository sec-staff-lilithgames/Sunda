package jh;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Map f69549a;

    public final Map zza(Collection collection) {
        Set setUnmodifiableSet;
        HashMap map = new HashMap();
        Map map2 = this.f69549a;
        for (String str : map2.keySet()) {
            if (map2.containsKey(str)) {
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : ((Map) map2.get(str)).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add((String) entry.getValue());
                    }
                }
                setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            } else {
                setUnmodifiableSet = Collections.EMPTY_SET;
            }
            map.put(str, setUnmodifiableSet);
        }
        return map;
    }
}
