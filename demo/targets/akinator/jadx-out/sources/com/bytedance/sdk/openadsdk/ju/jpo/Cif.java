package com.bytedance.sdk.openadsdk.ju.jpo;

import com.bytedance.sdk.openadsdk.core.ef;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.sdk.openadsdk.ju.jpo.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif extends com.bytedance.sdk.component.jpo.opi<JSONObject, JSONObject> {
    private static final HashSet<String> jpo = new HashSet<>(Arrays.asList("popupShow", "popupDismiss", "changeCountdownStatus", "getCurrentCountdownStatus", "popupRenderDidFinish"));

    /* renamed from: jd, reason: collision with root package name */
    private final ef f21256jd;

    public Cif(ef efVar) {
        this.f21256jd = efVar;
    }

    public static void jpo(com.bytedance.sdk.component.jpo.prr prrVar, ef efVar) {
        prrVar.jpo(jpo, new Cif(efVar));
    }

    @Override // com.bytedance.sdk.component.jpo.cm
    public JSONObject jpo(String str, JSONObject jSONObject, com.bytedance.sdk.component.jpo.my myVar) throws Exception {
        str.getClass();
        switch (str) {
            case "popupDismiss":
                this.f21256jd.hna();
                break;
            case "popupShow":
                this.f21256jd.prr();
                break;
            case "popupRenderDidFinish":
                this.f21256jd.opi();
                break;
            case "changeCountdownStatus":
                this.f21256jd.ju(jSONObject);
                break;
        }
        return null;
    }
}
