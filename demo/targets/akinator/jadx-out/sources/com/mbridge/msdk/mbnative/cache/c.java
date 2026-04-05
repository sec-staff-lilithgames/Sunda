package com.mbridge.msdk.mbnative.cache;

import com.mbridge.msdk.out.Campaign;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static Map<Integer, b<String, List<Campaign>>> f41619a = new HashMap();

    public static b<String, List<Campaign>> a(int i10) {
        if (f41619a.containsKey(Integer.valueOf(i10))) {
            return f41619a.get(Integer.valueOf(i10));
        }
        a aVar = new a(i10);
        f41619a.put(Integer.valueOf(i10), aVar);
        return aVar;
    }
}
