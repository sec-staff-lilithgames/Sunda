package jh;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f69548a = new HashMap();

    public final g zza(String str, String str2, String str3) {
        HashMap map = this.f69548a;
        if (!map.containsKey(str2)) {
            map.put(str2, new HashMap());
        }
        ((Map) map.get(str2)).put(str, str3);
        return this;
    }

    public final h zzb() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f69548a.entrySet()) {
            map.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new h(Collections.unmodifiableMap(map));
    }
}
