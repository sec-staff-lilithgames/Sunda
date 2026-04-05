package com.bytedance.adsdk.jpo;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj implements xyk {
    @Override // com.bytedance.adsdk.jpo.xyk
    /* renamed from: jd, reason: merged with bridge method [inline-methods] */
    public String jpo(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        String strValueOf = String.valueOf(objArr[0]);
        if (TextUtils.isEmpty(strValueOf)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strValueOf);
            String strValueOf2 = String.valueOf(objArr[1]);
            if (TextUtils.isEmpty(strValueOf2)) {
                return null;
            }
            Object objJpo = com.bytedance.adsdk.jpo.jd.jpo.jpo(strValueOf2).jpo(jSONObject2);
            if (!TextUtils.isEmpty(String.valueOf(objJpo))) {
                return String.valueOf(objJpo);
            }
            if (objArr.length >= 3) {
                return String.valueOf(objArr[2]);
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }
}
