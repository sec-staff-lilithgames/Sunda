package com.bytedance.adsdk.jpo.jd.jd.jpo;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hna implements com.bytedance.adsdk.jpo.jd.jd.jpo {
    private final com.bytedance.adsdk.jpo.jd.cm.wqx jpo;

    public hna(com.bytedance.adsdk.jpo.jd.cm.wqx wqxVar) {
        this.jpo = wqxVar;
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public String jd() {
        return this.jpo.jpo();
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public Object jpo(Map<String, JSONObject> map) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return jd();
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public com.bytedance.adsdk.jpo.jd.cm.my jpo() {
        return this.jpo;
    }
}
