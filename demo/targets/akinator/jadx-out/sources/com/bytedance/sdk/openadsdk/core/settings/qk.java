package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk {

    /* renamed from: cm, reason: collision with root package name */
    public boolean f20883cm;

    /* renamed from: jj, reason: collision with root package name */
    public boolean f20884jj;
    public boolean my;
    public String wqx;
    public static final qk jpo = new qk(null);

    /* renamed from: jd, reason: collision with root package name */
    public static String f20882jd = "";

    public qk(String str) {
        this.wqx = "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js";
        this.f20883cm = true;
        this.my = true;
        this.f20884jj = true;
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("performance_js");
            String strOptString = jSONObjectOptJSONObject.optString("url", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js");
            if (!TextUtils.isEmpty(strOptString)) {
                this.wqx = strOptString;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i10));
            }
            this.f20883cm = arrayList.contains("load_finish");
            this.f20884jj = arrayList.contains("load_fail");
            this.my = arrayList.contains("load");
        } catch (Exception unused) {
        }
    }
}
