package com.bytedance.adsdk.ugeno.cm.jd;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.cm.jj;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends jpo {
    public my(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, String str, jj.jpo jpoVar) {
        super(wqxVar, str, jpoVar);
    }

    @Override // com.bytedance.adsdk.ugeno.cm.jd.jpo
    public void jpo() throws JSONException {
        Map<String, String> map = this.f17693jj;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.f17693jj.get("id");
        if (TextUtils.isEmpty(str)) {
            jpo(this.wqx);
            return;
        }
        com.bytedance.adsdk.ugeno.jd.wqx wqxVar = this.wqx;
        com.bytedance.adsdk.ugeno.jd.wqx wqxVarJd = wqxVar.jd(wqxVar);
        if (wqxVarJd == null) {
            return;
        }
        jpo(wqxVarJd.cm(str));
    }

    private void jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar) throws JSONException {
        if (wqxVar == null) {
            return;
        }
        for (String str : this.f17693jj.keySet()) {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "id")) {
                wqxVar.jpo(str, this.f17693jj.get(str));
            }
        }
        wqxVar.jpo(this.f17693jj.containsKey("width"), this.f17693jj.containsKey("height"));
        wqxVar.jd();
    }
}
