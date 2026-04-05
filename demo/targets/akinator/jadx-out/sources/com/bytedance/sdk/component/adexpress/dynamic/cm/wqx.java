package com.bytedance.sdk.component.adexpress.dynamic.cm;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {

    /* renamed from: jd, reason: collision with root package name */
    private JSONObject f18199jd;
    private HashMap<String, Object> jpo = new HashMap<>();

    public wqx(JSONObject jSONObject) {
        this.f18199jd = jSONObject;
    }

    public boolean jd(String str) {
        return this.jpo.containsKey(str);
    }

    public Object jpo(String str) {
        if (this.jpo.containsKey(str)) {
            return this.jpo.get(str);
        }
        return null;
    }

    public void jpo() {
        Iterator<String> itKeys = this.f18199jd.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = this.f18199jd.opt(next);
            int i10 = 0;
            if (TextUtils.equals("image", next)) {
                if (objOpt instanceof JSONArray) {
                    while (true) {
                        JSONArray jSONArray = (JSONArray) objOpt;
                        if (i10 < jSONArray.length()) {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                            if (jSONObjectOptJSONObject != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    Object objOpt2 = jSONObjectOptJSONObject.opt(next2);
                                    this.jpo.put(next + "." + i10 + "." + next2, objOpt2);
                                }
                            }
                            i10++;
                        }
                    }
                }
            } else if (TextUtils.equals("dynamic_creative", next)) {
                if (objOpt instanceof String) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) objOpt);
                        Iterator<String> itKeys3 = jSONObject.keys();
                        while (itKeys3.hasNext()) {
                            String next3 = itKeys3.next();
                            Object objOpt3 = jSONObject.opt(next3);
                            if ((objOpt3 instanceof JSONArray) && !TextUtils.equals(next3, "short_phrase") && !TextUtils.equals(next3, "long_phrase")) {
                                for (int i11 = 0; i11 < ((JSONArray) objOpt3).length(); i11++) {
                                    this.jpo.put(next + "." + next3 + "." + i11, ((JSONArray) objOpt3).opt(i11));
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, "coupon")) {
                                Iterator<String> itKeys4 = ((JSONObject) objOpt3).keys();
                                while (itKeys4.hasNext()) {
                                    String next4 = itKeys4.next();
                                    Object objOpt4 = ((JSONObject) objOpt3).opt(next4);
                                    this.jpo.put(next + "." + next3 + "." + next4, objOpt4);
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, "live_room_data")) {
                                jpo(next, next3, objOpt3);
                            } else {
                                this.jpo.put(next + "." + next3, objOpt3);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else if (objOpt instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) objOpt;
                Iterator<String> itKeys5 = jSONObject2.keys();
                while (itKeys5.hasNext()) {
                    String next5 = itKeys5.next();
                    Object objOpt5 = jSONObject2.opt(next5);
                    this.jpo.put(next + "." + next5, objOpt5);
                }
            } else {
                this.jpo.put(next, objOpt);
                if (objOpt instanceof String) {
                    this.jpo.put(next, objOpt);
                }
            }
        }
    }

    private void jpo(String str, String str2, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if ((objOpt instanceof JSONArray) && TextUtils.equals(next, "product_infos")) {
                int i10 = 0;
                while (true) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    if (i10 < jSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            Object objOpt2 = jSONObjectOptJSONObject.opt(next2);
                            this.jpo.put(str + "." + str2 + "." + next + "." + i10 + "." + next2, objOpt2);
                        }
                        i10++;
                    }
                }
            } else {
                this.jpo.put(str + "." + str2 + "." + next, objOpt);
            }
        }
    }
}
