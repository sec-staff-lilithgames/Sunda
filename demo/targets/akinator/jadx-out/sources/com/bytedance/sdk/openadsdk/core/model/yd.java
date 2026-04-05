package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd {

    /* renamed from: jd, reason: collision with root package name */
    private List<String> f20810jd;
    private String jpo;

    public yd(String str) {
        this.jpo = "";
        this.f20810jd = new ArrayList();
        HashMap<String, Object> map = TextUtils.isEmpty(str) ? new HashMap<>() : jpo(str);
        try {
            this.jpo = (String) map.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) map.get("auto_test_hosts"));
            this.f20810jd = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f20810jd.add(jSONArray.optString(i10));
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.nmd.wqx("AutoTestModel", e10.getMessage());
        }
    }

    public List<String> jd() {
        return this.f20810jd;
    }

    public String jpo() {
        return this.jpo;
    }

    private static final HashMap<String, Object> jpo(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        HashMap<String, Object> map = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                map.put(jSONObjectOptJSONObject.optString("name"), jSONObjectOptJSONObject.optString("value"));
            }
            return map;
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }
}
