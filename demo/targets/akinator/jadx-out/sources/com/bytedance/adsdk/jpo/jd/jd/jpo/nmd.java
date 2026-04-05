package com.bytedance.adsdk.jpo.jd.jd.jpo;

import j1.o2;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class nmd implements com.bytedance.adsdk.jpo.jd.jd.jpo {
    private final String jpo;

    public nmd(String str) {
        this.jpo = str;
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public String jd() {
        return o2.o(new StringBuilder("'"), this.jpo, "'");
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public Object jpo(Map<String, JSONObject> map) {
        return this.jpo;
    }

    public String toString() {
        return jd();
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public com.bytedance.adsdk.jpo.jd.cm.my jpo() {
        return com.bytedance.adsdk.jpo.jd.cm.jj.STRING;
    }
}
