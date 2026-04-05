package com.bytedance.adsdk.jpo.jd.jd.jpo;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends sq {
    public cm() {
        super(com.bytedance.adsdk.jpo.jd.cm.wqx.EQ);
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public Object jpo(Map<String, JSONObject> map) {
        Object objJpo = this.jpo.jpo(map);
        Object objJpo2 = this.f17664jd.jpo(map);
        return (objJpo == null && objJpo2 == null) ? Boolean.TRUE : (objJpo != null || objJpo2 == null) ? (objJpo == null || objJpo2 != null) ? ((objJpo instanceof Number) && (objJpo2 instanceof Number)) ? Boolean.valueOf(com.bytedance.adsdk.jpo.jd.my.jpo.jd.jpo((Number) objJpo, (Number) objJpo2)) : Boolean.valueOf(objJpo.equals(objJpo2)) : Boolean.FALSE : Boolean.FALSE;
    }
}
