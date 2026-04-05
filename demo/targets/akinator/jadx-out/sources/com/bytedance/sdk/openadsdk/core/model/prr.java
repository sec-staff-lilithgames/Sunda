package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class prr {

    /* renamed from: jd, reason: collision with root package name */
    private final int f20772jd;
    private final int jpo;

    public prr(JSONObject jSONObject) {
        this.jpo = jSONObject.optInt("auto_click", 0);
        this.f20772jd = jSONObject.optInt("hidden_bar", 0);
    }

    public boolean jd() {
        return this.f20772jd == 1;
    }

    public int jpo() {
        return this.jpo;
    }

    public JSONObject wqx() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            int i10 = this.jpo;
            if (i10 == 1) {
                jSONObject.put("auto_click", i10);
            }
            if (this.f20772jd == 1) {
                jSONObject.put("hidden_bar", 1);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static boolean jpo(dt dtVar) {
        if (dtVar == null || !dtVar.ig() || dtVar.al() == null) {
            return false;
        }
        return dtVar.al().jd();
    }
}
