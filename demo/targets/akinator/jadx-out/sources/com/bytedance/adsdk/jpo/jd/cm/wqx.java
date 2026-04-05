package com.bytedance.adsdk.jpo.jd.cm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public enum wqx implements my {
    jpo("?", 0),
    COLON(":", 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR("||", 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS("+", 3),
    MINUS("-", 3),
    MULTI("*", 4),
    DIVISION("/", 4),
    MOD("%", 4);


    /* renamed from: jr, reason: collision with root package name */
    private final int f17661jr;
    private final String opi;
    private static final Map<String, wqx> hna = new HashMap(128);

    /* renamed from: sq, reason: collision with root package name */
    private static final Set<wqx> f17659sq = new HashSet();

    wqx(String str, int i10) {
        this.opi = str;
        this.f17661jr = i10;
    }

    public static wqx jpo(String str) {
        return hna.get(str);
    }

    public int jd() {
        return this.f17661jr;
    }

    static {
        for (wqx wqxVar : values()) {
            hna.put(wqxVar.jpo(), wqxVar);
            f17659sq.add(wqxVar);
        }
    }

    public static boolean jpo(my myVar) {
        return myVar instanceof wqx;
    }

    public String jpo() {
        return this.opi;
    }
}
