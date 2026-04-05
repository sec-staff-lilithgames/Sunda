package com.bytedance.sdk.openadsdk.ju.jpo;

import com.bytedance.sdk.openadsdk.core.ef;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz extends com.bytedance.sdk.component.jpo.cm<JSONObject, JSONObject> {

    /* renamed from: jd, reason: collision with root package name */
    private String f21268jd;
    private final ef jpo;

    public zz(ef efVar, String str) {
        this.jpo = efVar;
        this.f21268jd = str;
    }

    public static void jpo(com.bytedance.sdk.component.jpo.prr prrVar, ef efVar) {
        prrVar.jpo("endcardDynamicCreatives", new zz(efVar, "endcardDynamicCreatives"));
        prrVar.jpo("multiOpenCovert", new zz(efVar, "multiOpenCovert"));
        prrVar.jpo("skipToNextAd", new zz(efVar, "skipToNextAd"));
        prrVar.jpo("speedVideoOrTimer", new zz(efVar, "speedVideoOrTimer"));
        prrVar.jpo("openPlayable", new zz(efVar, "openPlayable"));
    }

    @Override // com.bytedance.sdk.component.jpo.cm
    public JSONObject jpo(String str, JSONObject jSONObject, com.bytedance.sdk.component.jpo.my myVar) throws Exception {
        if ("endcardDynamicCreatives".equals(this.f21268jd)) {
            return this.jpo.zz(jSONObject);
        }
        if ("multiOpenCovert".equals(this.f21268jd)) {
            this.jpo.yd(jSONObject);
            return null;
        }
        if ("skipToNextAd".equals(this.f21268jd)) {
            this.jpo.jpo(jSONObject, this.f21268jd);
            return null;
        }
        if ("speedVideoOrTimer".equals(this.f21268jd)) {
            return this.jpo.xyk(jSONObject);
        }
        if ("openPlayable".equals(this.f21268jd)) {
            return this.jpo.qk(jSONObject);
        }
        return null;
    }
}
