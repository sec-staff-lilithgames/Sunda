package com.bytedance.sdk.openadsdk.ju.jpo;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.ef;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.nzb;
import com.bytedance.sdk.openadsdk.utils.duq;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class nmd extends com.bytedance.sdk.component.jpo.opi<JSONObject, JSONObject> {
    public static final HashSet<String> jpo = new HashSet<>(Arrays.asList("closeWebview", "makeVisible", "getCurrentVisibleState"));

    /* renamed from: cm, reason: collision with root package name */
    private dt f21259cm;

    /* renamed from: jd, reason: collision with root package name */
    private com.bytedance.sdk.component.zz.jj f21260jd;
    private ef wqx;

    public nmd(com.bytedance.sdk.component.zz.jj jjVar, ef efVar, dt dtVar) {
        this.f21260jd = jjVar;
        this.wqx = efVar;
        this.f21259cm = dtVar;
    }

    public static void jpo(com.bytedance.sdk.component.jpo.prr prrVar, com.bytedance.sdk.component.zz.jj jjVar, ef efVar, dt dtVar) {
        prrVar.jpo(jpo, new nmd(jjVar, efVar, dtVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.jpo.cm
    public JSONObject jpo(String str, JSONObject jSONObject, com.bytedance.sdk.component.jpo.my myVar) throws Exception {
        JSONObject jSONObject2;
        jSONObject2 = new JSONObject();
        str.getClass();
        switch (str) {
            case "getCurrentVisibleState":
                dt dtVar = this.f21259cm;
                if (dtVar != null) {
                    jSONObject2.put("visibleState", !nzb.jpo(this.f21260jd, 20, dtVar.jp(), false) ? 1 : 0);
                }
                return jSONObject2;
            case "closeWebview":
                duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ju.jpo.nmd.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (nmd.this.f21260jd != null) {
                            nmd.this.f21260jd.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) nmd.this.f21260jd.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(nmd.this.f21260jd);
                            }
                        }
                    }
                });
                jSONObject2.put("success", true);
                return jSONObject2;
            case "makeVisible":
                if (this.f21260jd != null) {
                    jSONObject2.put("success", true);
                    duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ju.jpo.nmd.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (nmd.this.f21260jd != null) {
                                nmd.this.f21260jd.setVisibility(0);
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
