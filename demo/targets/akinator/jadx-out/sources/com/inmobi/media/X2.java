package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class X2 {
    public static final tu.v a(TreeMap treeMap) {
        if (treeMap.isEmpty()) {
            return tu.e0.to(uu.p0.emptyList(), uu.p0.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        S2 s22 = new S2();
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getKey();
            long jA = s22.a(str, ((Config) entry.getValue()).getAccountId$media_release());
            arrayList.add(str);
            arrayList2.add(Long.valueOf(jA));
        }
        return tu.e0.to(arrayList, arrayList2);
    }
}
