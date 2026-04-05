package com.bytedance.adsdk.ugeno.cm.jpo;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    private volatile Map<String, wqx> jpo = new HashMap();

    public wqx jpo(String str) {
        if (this.jpo.containsKey(str) && this.jpo.get(str) != null) {
            return this.jpo.get(str);
        }
        jd jdVar = new jd();
        this.jpo.put(str, jdVar);
        return jdVar;
    }

    public void jpo(String str, wqx wqxVar) {
        if (!this.jpo.containsKey(str) || this.jpo.get(str) == null) {
            this.jpo.put(str, wqxVar);
        }
    }
}
