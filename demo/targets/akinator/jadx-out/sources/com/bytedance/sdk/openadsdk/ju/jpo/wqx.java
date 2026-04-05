package com.bytedance.sdk.openadsdk.ju.jpo;

import com.bytedance.sdk.component.jpo.wqx;
import com.bytedance.sdk.openadsdk.core.ef;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends com.bytedance.sdk.component.jpo.wqx<JSONObject, JSONObject> {
    private final WeakReference<ef> jpo;

    public wqx(ef efVar) {
        this.jpo = new WeakReference<>(efVar);
    }

    public static void jpo(com.bytedance.sdk.component.jpo.prr prrVar, final ef efVar) {
        prrVar.jpo("newClickEvent", new wqx.jd() { // from class: com.bytedance.sdk.openadsdk.ju.jpo.wqx.1
            @Override // com.bytedance.sdk.component.jpo.wqx.jd
            public com.bytedance.sdk.component.jpo.wqx jpo() {
                return new wqx(efVar);
            }
        });
    }

    @Override // com.bytedance.sdk.component.jpo.wqx
    public void jpo(JSONObject jSONObject, com.bytedance.sdk.component.jpo.my myVar) throws Exception {
        ef efVar = this.jpo.get();
        if (efVar == null) {
            wqx();
        } else {
            efVar.my(jSONObject);
        }
    }
}
