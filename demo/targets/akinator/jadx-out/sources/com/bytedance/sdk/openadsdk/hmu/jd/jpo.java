package com.bytedance.sdk.openadsdk.hmu.jd;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: jd, reason: collision with root package name */
    private final int f21161jd;
    private final int jpo;
    private final float wqx;

    public jpo(int i10, int i11, float f10) {
        this.jpo = i10;
        this.f21161jd = i11;
        this.wqx = f10;
    }

    public static JSONObject jpo(jpo jpoVar) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", jpoVar.jpo);
        jSONObject.put("height", jpoVar.f21161jd);
        jSONObject.put("alpha", jpoVar.wqx);
        return jSONObject;
    }
}
