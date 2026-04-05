package com.bytedance.adsdk.jpo.jd.cm;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum jpo implements my {
    TRUE,
    FALSE,
    NULL;


    /* renamed from: cm, reason: collision with root package name */
    private static final Map<String, jpo> f17651cm = new HashMap(128);

    static {
        for (jpo jpoVar : values()) {
            f17651cm.put(jpoVar.name().toLowerCase(), jpoVar);
        }
    }

    public static jpo jpo(String str) {
        return f17651cm.get(str.toLowerCase());
    }
}
