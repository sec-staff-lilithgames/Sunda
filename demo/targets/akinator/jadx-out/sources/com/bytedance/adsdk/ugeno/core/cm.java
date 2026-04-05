package com.bytedance.adsdk.ugeno.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {
    private static Map<String, jd> jpo = new HashMap();

    public static void jpo(List<jd> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (jd jdVar : list) {
            if (jdVar != null) {
                jpo.put(jdVar.jpo(), jdVar);
            }
        }
    }

    public static jd jpo(String str) {
        return jpo.get(str);
    }
}
