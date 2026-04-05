package com.bytedance.adsdk.jpo;

import com.bytedance.adsdk.ugeno.wqx.jpo;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx implements com.bytedance.adsdk.ugeno.wqx.jpo {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo implements jpo.InterfaceC0067jpo {

        /* renamed from: jd, reason: collision with root package name */
        private String f17670jd;
        private com.bytedance.adsdk.jpo.jd.jpo jpo;

        private jpo(String str) {
            this.f17670jd = str;
            this.jpo = com.bytedance.adsdk.jpo.jd.jpo.jpo(str);
        }

        public static jpo jpo(String str) {
            return new jpo(str);
        }

        @Override // com.bytedance.adsdk.ugeno.wqx.jpo.InterfaceC0067jpo
        public Object jpo(JSONObject jSONObject) {
            com.bytedance.adsdk.jpo.jd.jpo jpoVar = this.jpo;
            if (jpoVar == null) {
                return this.f17670jd;
            }
            Object objJpo = jpoVar.jpo(jSONObject);
            return objJpo instanceof String ? objJpo : objJpo instanceof com.bytedance.adsdk.jpo.jd.jpo.jpo ? String.valueOf(ju.jpo((com.bytedance.adsdk.jpo.jd.jpo.jpo) objJpo)) : String.valueOf(objJpo);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.wqx.jpo
    public jpo.InterfaceC0067jpo jpo(String str) {
        return jpo.jpo(str);
    }
}
