package com.bytedance.sdk.openadsdk.hmu.jd;

import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.p000if.jd.wqx;
import com.bytedance.sdk.openadsdk.hmu.jd.my;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.tic;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {
    public static void jpo(final dt dtVar, final jpo jpoVar, final my.jpo jpoVar2) {
        dtVar.ss();
        duq.wqx(new com.bytedance.sdk.component.xyk.xyk("mrc_report") { // from class: com.bytedance.sdk.openadsdk.hmu.jd.cm.1
            @Override // java.lang.Runnable
            public void run() {
                if (dtVar.dd()) {
                    if (dtVar.aul()) {
                        com.bytedance.sdk.openadsdk.core.p000if.jd.wqx.jpo(dtVar.fp(), new wqx.jd("show_urls", dtVar));
                    } else {
                        com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar);
                    }
                }
                String strJpo = tic.jpo(dtVar);
                final JSONObject jSONObject = new JSONObject();
                jpo jpoVar3 = jpoVar;
                JSONObject jSONObjectJpo = null;
                if (jpoVar3 != null) {
                    try {
                        jSONObject.put("root_view", jpo.jpo(jpoVar3));
                        my.jpo jpoVar4 = jpoVar2;
                        if (jpoVar4 != null) {
                            int i10 = jpoVar4.jpo;
                            if (i10 != -1) {
                                jSONObject.put("dynamic_show_type", i10);
                            }
                            int i11 = jpoVar2.f21162jd;
                            if (i11 != -1) {
                                jSONObjectJpo = com.bytedance.sdk.openadsdk.cm.wqx.jpo(i11 + 1);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                final JSONObject jSONObject2 = jSONObjectJpo;
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), dtVar, strJpo, "mrc_show", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.hmu.jd.cm.1.1
                    @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                    public JSONObject jpo() {
                        return jSONObject2;
                    }

                    @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                    public JSONObject wqx() {
                        return jSONObject;
                    }
                });
            }
        });
    }
}
