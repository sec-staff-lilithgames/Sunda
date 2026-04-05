package com.bytedance.sdk.openadsdk.ju.jpo;

import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.bytedance.sdk.openadsdk.core.ef;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class yd extends com.bytedance.sdk.component.jpo.opi<JSONObject, JSONObject> {
    public static final HashSet<String> jpo = new HashSet<>(Arrays.asList("endcardDynamicCreatives", "multiOpenCovert", "speedVideoOrTimer", "openPlayable", "skipToNextAd"));

    /* renamed from: jd, reason: collision with root package name */
    private final ef f21267jd;

    public yd(ef efVar) {
        this.f21267jd = efVar;
    }

    public static void jpo(com.bytedance.sdk.component.jpo.prr prrVar, ef efVar) {
        prrVar.jpo(jpo, new yd(efVar));
    }

    @Override // com.bytedance.sdk.component.jpo.cm
    public JSONObject jpo(String str, JSONObject jSONObject, com.bytedance.sdk.component.jpo.my myVar) throws Exception {
        if (PtLatqAYjEFT.ZwZwHAjZjIQu.equals(str)) {
            return this.f21267jd.zz(jSONObject);
        }
        if ("multiOpenCovert".equals(str)) {
            this.f21267jd.yd(jSONObject);
            return null;
        }
        if ("skipToNextAd".equals(str)) {
            this.f21267jd.jpo(jSONObject, str);
            return null;
        }
        if ("speedVideoOrTimer".equals(str)) {
            return this.f21267jd.xyk(jSONObject);
        }
        if ("openPlayable".equals(str)) {
            return this.f21267jd.qk(jSONObject);
        }
        return null;
    }
}
