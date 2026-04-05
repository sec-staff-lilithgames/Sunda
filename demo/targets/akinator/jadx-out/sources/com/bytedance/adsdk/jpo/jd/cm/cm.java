package com.bytedance.adsdk.jpo.jd.cm;

import com.ironsource.C3191e4;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum cm implements my {
    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACKET(C3191e4.i.f36529d),
    RIGHT_BRACKET(C3191e4.i.f36531e),
    COMMA(",");


    /* renamed from: jj, reason: collision with root package name */
    private static final Map<String, cm> f17642jj;

    /* renamed from: qk, reason: collision with root package name */
    private final String f17643qk;

    static {
        HashMap map = new HashMap(128);
        f17642jj = map;
        for (cm cmVar : map.values()) {
            f17642jj.put(cmVar.jpo(), cmVar);
        }
    }

    cm(String str) {
        this.f17643qk = str;
    }

    public static boolean jpo(my myVar) {
        return myVar instanceof cm;
    }

    public String jpo() {
        return this.f17643qk;
    }
}
