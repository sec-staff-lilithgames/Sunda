package com.bytedance.adsdk.ugeno.cm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd {
    private static Map<String, qk> jpo = new HashMap();

    public static void jpo(List<qk> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (qk qkVar : list) {
            if (qkVar != null) {
                jpo.put(qkVar.jpo(), qkVar);
            }
        }
    }

    public static qk jpo(String str) {
        return jpo.get(str);
    }
}
