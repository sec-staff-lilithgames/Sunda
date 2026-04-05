package com.bytedance.sdk.openadsdk.ju.jpo;

import com.bytedance.sdk.openadsdk.core.ef;
import com.bytedance.sdk.openadsdk.core.model.dt;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends com.bytedance.sdk.component.jpo.cm<JSONObject, JSONObject> {
    private final WeakReference<ef> jpo;

    public jj(ef efVar) {
        this.jpo = new WeakReference<>(efVar);
    }

    public static void jpo(com.bytedance.sdk.component.jpo.prr prrVar, ef efVar) {
        prrVar.jpo("interactiveFinish", new jj(efVar));
    }

    @Override // com.bytedance.sdk.component.jpo.cm
    public JSONObject jpo(String str, JSONObject jSONObject, com.bytedance.sdk.component.jpo.my myVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        WeakReference<ef> weakReference = this.jpo;
        if (weakReference != null && weakReference.get() != null) {
            ef efVar = this.jpo.get();
            dt dtVarCm = efVar.cm();
            try {
                boolean z10 = true;
                int i10 = 0;
                if (jSONObject.optInt("finish", 1) != 1) {
                    z10 = false;
                }
                int iOptInt = jSONObject.optInt("reduce_duration", -1);
                int iYe = dtVarCm != null ? dtVarCm.ye() : 0;
                if (iOptInt >= 0 && iYe >= 0) {
                    iOptInt = Math.min(iOptInt, iYe);
                } else if (iOptInt < 0) {
                    iOptInt = iYe >= 0 ? iYe : 0;
                }
                if (z10) {
                    efVar.wqx(iOptInt);
                } else {
                    i10 = -1;
                }
                jSONObject2.put("code", i10);
                jSONObject2.put("reduce_duration", iOptInt);
                return jSONObject2;
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.nmd.wqx("InteractiveFinishMethod", e10.getMessage());
            }
        }
        return jSONObject2;
    }
}
