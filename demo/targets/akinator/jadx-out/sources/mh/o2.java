package mh;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o2 {

    /* renamed from: a, reason: collision with root package name */
    public final r2 f74665a;

    /* renamed from: b, reason: collision with root package name */
    public final r2 f74666b;

    public o2(r2 r2Var, r2 r2Var2) {
        this.f74665a = r2Var;
        this.f74666b = (r2) p1.checkNotNull(r2Var2);
    }

    public Map<String, String> split(CharSequence charSequence) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : this.f74665a.split(charSequence)) {
            r2 r2Var = this.f74666b;
            Iterator<String> it = r2Var.f74684c.iterator(r2Var, str);
            p1.checkArgument(it.hasNext(), "Chunk [%s] is not a valid entry", str);
            String next = it.next();
            p1.checkArgument(!linkedHashMap.containsKey(next), "Duplicate key [%s] found.", next);
            p1.checkArgument(it.hasNext(), "Chunk [%s] is not a valid entry", str);
            linkedHashMap.put(next, it.next());
            p1.checkArgument(!it.hasNext(), "Chunk [%s] is not a valid entry", str);
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
