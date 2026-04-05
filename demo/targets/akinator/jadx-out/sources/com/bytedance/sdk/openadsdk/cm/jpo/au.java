package com.bytedance.sdk.openadsdk.cm.jpo;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class au implements com.bytedance.sdk.openadsdk.prr.jd {

    /* renamed from: jd, reason: collision with root package name */
    private final boolean f19540jd;
    private final com.bytedance.sdk.component.jj.jpo.jj.cm jpo;

    public au(boolean z10, com.bytedance.sdk.component.jj.jpo.jj.cm cmVar) {
        this.jpo = cmVar;
        this.f19540jd = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.prr.jd
    public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
        if (this.jpo == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.f19540jd);
        jSONObject.put("url", this.jpo.jd());
        int iCm = this.jpo.cm();
        if (iCm <= 0) {
            iCm = 0;
        }
        jSONObject.put("retry_times", iCm);
        jSONObject.put("ad_id", this.jpo.jj());
        jSONObject.put("track_type", this.jpo.my());
        jSONObject.put("upload_scene", this.f19540jd ? this.jpo.yd() ? 3 : this.jpo.cm() <= 0 ? 1 : 2 : 4);
        String strQk = this.jpo.qk();
        if (!TextUtils.isEmpty(strQk)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : strQk.split(",")) {
                jSONArray.put(str);
            }
            jSONObject.put("error_code", jSONArray);
        }
        String strZz = this.jpo.zz();
        if (!TextUtils.isEmpty(strZz)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : strZz.split(",")) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        return com.bytedance.sdk.openadsdk.prr.jpo.cm.jd().jpo("track_link_result").jd(jSONObject.toString());
    }
}
