package com.bytedance.sdk.openadsdk.ju.jpo;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.ef;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.nzb;
import com.bytedance.sdk.openadsdk.utils.duq;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jr extends com.bytedance.sdk.component.jpo.cm<JSONObject, JSONObject> {

    /* renamed from: cm, reason: collision with root package name */
    private String f21257cm;

    /* renamed from: jd, reason: collision with root package name */
    private ef f21258jd;
    private com.bytedance.sdk.component.zz.jj jpo;
    private dt wqx;

    public jr(com.bytedance.sdk.component.zz.jj jjVar, String str, ef efVar, dt dtVar) {
        this.jpo = jjVar;
        this.f21257cm = str;
        this.f21258jd = efVar;
        this.wqx = dtVar;
    }

    public static void jpo(com.bytedance.sdk.component.jpo.prr prrVar, com.bytedance.sdk.component.zz.jj jjVar, ef efVar, dt dtVar) {
        prrVar.jpo("closeWebview", new jr(jjVar, "closeWebview", efVar, dtVar));
        prrVar.jpo("makeVisible", new jr(jjVar, "makeVisible", efVar, dtVar));
        prrVar.jpo("getCurrentVisibleState", new jr(jjVar, "getCurrentVisibleState", efVar, dtVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.jpo.cm
    public JSONObject jpo(String str, JSONObject jSONObject, com.bytedance.sdk.component.jpo.my myVar) throws Exception {
        JSONObject jSONObject2;
        jSONObject2 = new JSONObject();
        String str2 = this.f21257cm;
        str2.getClass();
        switch (str2) {
            case "getCurrentVisibleState":
                dt dtVar = this.wqx;
                if (dtVar != null) {
                    jSONObject2.put("visibleState", !nzb.jpo(this.jpo, 20, dtVar.jp(), false) ? 1 : 0);
                }
                return jSONObject2;
            case "closeWebview":
                duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ju.jpo.jr.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (jr.this.jpo != null) {
                            jr.this.jpo.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) jr.this.jpo.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(jr.this.jpo);
                            }
                        }
                    }
                });
                jSONObject2.put("success", true);
                return jSONObject2;
            case "makeVisible":
                if (this.jpo != null) {
                    jSONObject2.put("success", true);
                    duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ju.jpo.jr.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (jr.this.jpo != null) {
                                jr.this.jpo.setVisibility(0);
                            }
                        }
                    });
                    return jSONObject2;
                }
                jSONObject2.put("success", false);
                return jSONObject2;
            default:
                return jSONObject2;
        }
    }
}
