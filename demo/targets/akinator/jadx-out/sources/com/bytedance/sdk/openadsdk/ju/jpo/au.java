package com.bytedance.sdk.openadsdk.ju.jpo;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class au extends com.bytedance.sdk.component.jpo.cm<JSONObject, JSONObject> {
    private WeakReference<com.bytedance.sdk.component.zz.jj> jpo;

    public au(com.bytedance.sdk.component.zz.jj jjVar) {
        this.jpo = new WeakReference<>(jjVar);
    }

    public static void jpo(com.bytedance.sdk.component.jpo.prr prrVar, com.bytedance.sdk.component.zz.jj jjVar) {
        prrVar.jpo("preventTouchEvent", new au(jjVar));
    }

    @Override // com.bytedance.sdk.component.jpo.cm
    public JSONObject jpo(String str, JSONObject jSONObject, com.bytedance.sdk.component.jpo.my myVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isPrevent", false);
            com.bytedance.sdk.component.zz.jj jjVar = this.jpo.get();
            if (jjVar != null) {
                jjVar.setIsPreventTouchEvent(zOptBoolean);
                jSONObject2.put("success", true);
                return jSONObject2;
            }
            jSONObject2.put("success", false);
            return jSONObject2;
        } catch (Throwable unused) {
            jSONObject2.put("success", false);
            return jSONObject2;
        }
    }
}
