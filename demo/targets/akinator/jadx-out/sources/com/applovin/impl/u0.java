package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.C3191e4;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class u0 {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f15773a;

    /* renamed from: b, reason: collision with root package name */
    protected final JSONObject f15774b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes2.dex */
    public enum a {
        NONE(0),
        f15776c(1000),
        IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT(1001),
        HAS_TERMS_OF_SERVICE_URI(1002);


        /* renamed from: a, reason: collision with root package name */
        private final int f15780a;

        a(int i10) {
            this.f15780a = i10;
        }

        public int b() {
            return this.f15780a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes2.dex */
    public enum b {
        f15781a,
        POST_ALERT,
        EVENT,
        REINIT,
        CMP_LOAD,
        CMP_SHOW,
        DECISION
    }

    public u0(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f15773a = kVar;
        this.f15774b = jSONObject;
    }

    public static u0 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        b bVarC = c(JsonUtils.getString(jSONObject, "type", null));
        return bVarC == b.f15781a ? new v0(jSONObject, kVar) : bVarC == b.EVENT ? new x0(jSONObject, kVar) : new u0(jSONObject, kVar);
    }

    public int b() {
        return JsonUtils.getInt(this.f15774b, "id", -1);
    }

    public b c() {
        return c(JsonUtils.getString(this.f15774b, "type", null));
    }

    public String toString() {
        return "ConsentFlowState{id=" + b() + ", type=" + c() + "}";
    }

    private static b c(String str) {
        if ("alert".equalsIgnoreCase(str)) {
            return b.f15781a;
        }
        if ("post_alert".equalsIgnoreCase(str)) {
            return b.POST_ALERT;
        }
        if (NotificationCompat.CATEGORY_EVENT.equalsIgnoreCase(str)) {
            return b.EVENT;
        }
        if ("cmp_load".equalsIgnoreCase(str)) {
            return b.CMP_LOAD;
        }
        if ("cmp_show".equalsIgnoreCase(str)) {
            return b.CMP_SHOW;
        }
        if ("decision".equalsIgnoreCase(str)) {
            return b.DECISION;
        }
        if ("reinit".equalsIgnoreCase(str)) {
            return b.REINIT;
        }
        throw new IllegalArgumentException(a.b.k("Invalid type provided: ", str));
    }

    public String b(String str) {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f15774b, str, (JSONObject) null);
        JSONArray jSONArrayT = b0.e2.t(jSONObject, "replacements");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayT.length(); i10++) {
            String string = JsonUtils.getObjectAtIndex(jSONArrayT, i10, "").toString();
            if ("<APP_NAME>".equalsIgnoreCase(string)) {
                String str2 = (String) this.f15773a.B().K().get("app_name");
                if (StringUtils.isValidString(str2)) {
                    arrayList.add(str2);
                } else {
                    arrayList.add(com.applovin.impl.sdk.k.a("THIS_APP"));
                }
            } else {
                arrayList.add(string);
            }
        }
        return com.applovin.impl.sdk.k.a(JsonUtils.getString(jSONObject, C3191e4.h.W, null), arrayList);
    }

    public a a() {
        return a(JsonUtils.getString(this.f15774b, "decision_type", null));
    }

    public int a(Boolean bool) {
        int i10 = JsonUtils.getInt(this.f15774b, "destination_state_id", -1);
        if (i10 > 0) {
            return i10;
        }
        if (bool != null) {
            return bool.booleanValue() ? JsonUtils.getInt(this.f15774b, "destination_state_id_true", -1) : JsonUtils.getInt(this.f15774b, "destination_state_id_false", -1);
        }
        throw new IllegalStateException(a.b.e(i10, "Decision needed for state: "));
    }

    private static a a(String str) {
        if ("is_al_gdpr".equalsIgnoreCase(str)) {
            return a.f15776c;
        }
        if ("is_eligible_for_terms_and_privacy_policy_alert".equalsIgnoreCase(str)) {
            return a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT;
        }
        if ("has_terms_of_service_uri".equalsIgnoreCase(str)) {
            return a.HAS_TERMS_OF_SERVICE_URI;
        }
        return a.NONE;
    }
}
