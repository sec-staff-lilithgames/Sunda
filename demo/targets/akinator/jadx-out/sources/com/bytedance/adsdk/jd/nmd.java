package com.bytedance.adsdk.jd;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class nmd {

    /* renamed from: jd, reason: collision with root package name */
    private boolean f17407jd;
    private final Map<String, String> jpo;

    public final String jd(String str, String str2) {
        if (this.f17407jd && this.jpo.containsKey(str2)) {
            return this.jpo.get(str2);
        }
        String strJpo = jpo(str, str2);
        if (this.f17407jd) {
            this.jpo.put(str2, strJpo);
        }
        return strJpo;
    }

    public String jpo(String str) {
        return str;
    }

    public String jpo(String str, String str2) {
        return jpo(str2);
    }
}
