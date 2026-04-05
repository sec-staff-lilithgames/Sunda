package com.bytedance.adsdk.jpo;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd implements xyk {
    @Override // com.bytedance.adsdk.jpo.xyk
    public Object jpo(JSONObject jSONObject, Object[] objArr) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (objArr == null || objArr.length != 0) {
            return null;
        }
        String strValueOf = String.valueOf(objArr[2]);
        String strValueOf2 = String.valueOf(objArr[1]);
        String strValueOf3 = String.valueOf(objArr[0]);
        if (!TextUtils.isEmpty(strValueOf3) && jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("i18n")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strValueOf2)) != null) {
            String strOptString = jSONObjectOptJSONObject2.optString(strValueOf3);
            if (!TextUtils.isEmpty(strOptString)) {
                return strOptString;
            }
        }
        return strValueOf;
    }
}
