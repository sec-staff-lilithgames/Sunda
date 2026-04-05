package com.bytedance.sdk.openadsdk.ju.jpo;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.dm;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.ironsource.C3191e4;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class opi extends com.bytedance.sdk.component.jpo.opi<JSONObject, JSONObject> {
    public static final HashSet<String> jpo = new HashSet<>(Arrays.asList("setStorageItem", "getStorageItem", "removeAllStorage", "removeStorageItem"));

    /* renamed from: jd, reason: collision with root package name */
    private dt f21261jd;

    public opi(dt dtVar) {
        this.f21261jd = dtVar;
    }

    public static void jpo(com.bytedance.sdk.component.jpo.prr prrVar, dt dtVar) {
        prrVar.jpo(jpo, new opi(dtVar));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.sdk.component.jpo.cm
    public JSONObject jpo(String str, JSONObject jSONObject, com.bytedance.sdk.component.jpo.my myVar) throws Exception {
        String strWn;
        dt dtVar = this.f21261jd;
        if (dtVar == null || (strWn = dtVar.wn()) == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1166163208:
                if (str.equals("getStorageItem")) {
                    c10 = 0;
                    break;
                }
                break;
            case 541948222:
                if (str.equals("removeAllStorage")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1357067884:
                if (str.equals("setStorageItem")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1498706186:
                if (str.equals("removeStorageItem")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                String strOptString = jSONObject.optString(C3191e4.h.W);
                if (!TextUtils.isEmpty(strOptString) && dm.jpo().jd(strWn, strOptString)) {
                    jSONObject2.put("value", dm.jpo().jpo(strWn, strOptString));
                    jSONObject2.put("code", "0");
                    break;
                } else {
                    jSONObject2.put("code", "1");
                    break;
                }
                break;
            case 1:
                dm.jpo().jpo(strWn);
                jSONObject2.put("code", "0");
                break;
            case 2:
                String strOptString2 = jSONObject.optString(C3191e4.h.W);
                String strOptString3 = jSONObject.optString("value");
                if (strOptString2 != null) {
                    dm.jpo().jpo(strWn, strOptString2, strOptString3);
                    jSONObject2.put("code", "0");
                    break;
                } else {
                    jSONObject2.put("code", "1");
                    break;
                }
            case 3:
                String strOptString4 = jSONObject.optString(C3191e4.h.W);
                if (!TextUtils.isEmpty(strOptString4)) {
                    jSONObject2.put("code", dm.jpo().wqx(strWn, strOptString4) ? "0" : "1");
                    break;
                } else {
                    jSONObject2.put("code", "1");
                    break;
                }
        }
        return null;
    }
}
