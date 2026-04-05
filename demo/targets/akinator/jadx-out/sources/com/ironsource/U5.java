package com.ironsource;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class U5 {

    /* renamed from: a, reason: collision with root package name */
    public static final U5 f35546a = new U5();

    /* renamed from: b, reason: collision with root package name */
    public static final String f35547b = "ext_";

    private U5() {
    }

    public final Map<String, String> a(Bundle bundle) {
        Set<String> setKeySet = bundle != null ? bundle.keySet() : null;
        if (setKeySet == null) {
            return uu.p1.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(uu.o1.mapCapacity(uu.q0.collectionSizeOrDefault(setKeySet, 10)), 16));
        for (String str : setKeySet) {
            String strK = a.b.k(f35547b, str);
            Object obj = bundle.get(str);
            tu.v vVar = tu.e0.to(strK, obj instanceof Iterable ? uu.y0.joinToString$default((Iterable) obj, ", ", null, null, 0, null, null, 62, null) : obj == null ? null : obj.toString());
            linkedHashMap.put(vVar.getFirst(), vVar.getSecond());
        }
        return linkedHashMap;
    }
}
