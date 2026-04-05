package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class sq {

    /* renamed from: jd, reason: collision with root package name */
    private jpo f20787jd;
    private jpo jpo;

    public sq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("easy_playable");
        if (jSONObjectOptJSONObject != null) {
            this.jpo = new jpo(jSONObjectOptJSONObject.optJSONObject("components"));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("popup");
        if (jSONObjectOptJSONObject2 != null) {
            this.f20787jd = new jpo(jSONObjectOptJSONObject2.optJSONObject("components"));
        }
    }

    public static jpo jd(dt dtVar) {
        sq sqVarTj;
        if (dtVar == null || (sqVarTj = dtVar.tj()) == null) {
            return null;
        }
        return sqVarTj.f20787jd;
    }

    public static boolean jpo(dt dtVar) {
        return jpo(dtVar, false);
    }

    public static jpo wqx(dt dtVar) {
        sq sqVarTj;
        if (dtVar == null || (sqVarTj = dtVar.tj()) == null) {
            return null;
        }
        return sqVarTj.jpo;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: jd, reason: collision with root package name */
        C0130jpo f20788jd;
        C0130jpo jpo;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.bytedance.sdk.openadsdk.core.model.sq$jpo$jpo, reason: collision with other inner class name */
        public static class C0130jpo {
            String jpo;

            public C0130jpo(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return;
                }
                this.jpo = jSONObject.optString("entry");
            }

            public boolean jpo() {
                return !TextUtils.isEmpty(this.jpo);
            }
        }

        public jpo(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            if (jSONObject.has("vertical")) {
                this.jpo = new C0130jpo(jSONObject.optJSONObject("vertical"));
            }
            if (jSONObject.has("horizontal")) {
                this.f20788jd = new C0130jpo(jSONObject.optJSONObject("horizontal"));
            }
        }

        public boolean jpo() {
            C0130jpo c0130jpo = this.f20788jd;
            if (c0130jpo != null && c0130jpo.jpo()) {
                return true;
            }
            C0130jpo c0130jpo2 = this.jpo;
            return c0130jpo2 != null && c0130jpo2.jpo();
        }

        public String jpo(boolean z10) {
            if (z10) {
                C0130jpo c0130jpo = this.jpo;
                if (c0130jpo != null) {
                    return c0130jpo.jpo;
                }
                return "";
            }
            C0130jpo c0130jpo2 = this.f20788jd;
            if (c0130jpo2 != null) {
                return c0130jpo2.jpo;
            }
            return "";
        }
    }

    public static boolean jpo(dt dtVar, boolean z10) {
        sq sqVarTj;
        if (dtVar == null || (sqVarTj = dtVar.tj()) == null) {
            return false;
        }
        if (z10) {
            jpo jpoVar = sqVarTj.f20787jd;
            return jpoVar != null && jpoVar.jpo();
        }
        jpo jpoVar2 = sqVarTj.jpo;
        return jpoVar2 != null && jpoVar2.jpo();
    }
}
