package com.bytedance.adsdk.jpo.jd.jd.jpo;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk extends sq {
    public xyk() {
        super(com.bytedance.adsdk.jpo.jd.cm.wqx.LT_EQ);
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public Object jpo(Map<String, JSONObject> map) {
        Object objJpo;
        if (this.jpo.jpo(map) == null || (objJpo = this.f17664jd.jpo(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) com.bytedance.adsdk.jpo.jd.my.jpo.wqx.jpo(r0, (Number) objJpo)).booleanValue());
    }
}
