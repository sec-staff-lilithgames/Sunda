package com.fyber.inneractive.sdk.util;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class c1 {
    public static void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj != null) {
            try {
                if (obj instanceof b1) {
                    jSONObject.putOpt(str, ((b1) obj).a());
                } else {
                    jSONObject.putOpt(str, obj);
                }
            } catch (JSONException unused) {
            }
        }
    }
}
