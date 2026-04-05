package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class I4 {
    public static final JSONObject a(H4 h42) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(h42, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", Float.valueOf(D2.a(h42.f31835a)));
        jSONObject.put("y", Float.valueOf(D2.a(h42.f31836b)));
        jSONObject.put("width", h42.f31837c);
        jSONObject.put("height", h42.f31838d);
        return jSONObject;
    }
}
