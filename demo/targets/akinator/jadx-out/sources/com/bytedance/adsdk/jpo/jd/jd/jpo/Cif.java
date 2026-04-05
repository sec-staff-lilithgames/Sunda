package com.bytedance.adsdk.jpo.jd.jd.jpo;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.adsdk.jpo.jd.jd.jpo.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif extends sq {
    public Cif() {
        super(com.bytedance.adsdk.jpo.jd.cm.wqx.MOD);
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public Object jpo(Map<String, JSONObject> map) {
        Object objJpo;
        Object objJpo2 = this.jpo.jpo(map);
        if (objJpo2 == null || (objJpo = this.f17664jd.jpo(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.jpo.jd.my.jpo.jj.jpo((Number) objJpo2, (Number) objJpo);
    }
}
