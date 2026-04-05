package com.bytedance.sdk.component.xyk.jd;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: cm, reason: collision with root package name */
    public int f19023cm;

    /* renamed from: jd, reason: collision with root package name */
    public int f19024jd;
    public int jpo;
    public int wqx;

    public jpo(int i10, int i11, int i12, int i13) {
        this.jpo = i10;
        this.f19024jd = i11;
        this.wqx = i12;
        this.f19023cm = i13;
    }

    public JSONObject jpo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.jpo);
            jSONObject.put("sdk_max_thread_num", this.f19024jd);
            jSONObject.put("app_thread_num", this.wqx);
            jSONObject.put("app_max_thread_num", this.f19023cm);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
