package com.bytedance.sdk.openadsdk.ju.jpo;

import com.bytedance.sdk.component.jpo.wqx;
import com.bytedance.sdk.openadsdk.core.ef;
import com.bytedance.sdk.openadsdk.core.model.dt;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class oya extends com.bytedance.sdk.component.jpo.wqx<JSONObject, JSONObject> {

    /* renamed from: cm, reason: collision with root package name */
    private HashSet<Integer> f21262cm = new HashSet<>();

    /* renamed from: jd, reason: collision with root package name */
    private dt f21263jd;
    private WeakReference<ef> jpo;
    private long wqx;

    public oya(ef efVar, dt dtVar) {
        this.jpo = new WeakReference<>(efVar);
        this.f21263jd = dtVar;
    }

    public static void jpo(com.bytedance.sdk.component.jpo.prr prrVar, final ef efVar, final dt dtVar) {
        prrVar.jpo("requestDelayCallback", new wqx.jd() { // from class: com.bytedance.sdk.openadsdk.ju.jpo.oya.1
            @Override // com.bytedance.sdk.component.jpo.wqx.jd
            public com.bytedance.sdk.component.jpo.wqx jpo() {
                return new oya(efVar, dtVar);
            }
        });
    }

    @Override // com.bytedance.sdk.component.jpo.wqx
    public void jpo(JSONObject jSONObject, com.bytedance.sdk.component.jpo.my myVar) throws Exception {
        ef efVar = this.jpo.get();
        if (efVar != null && jSONObject != null) {
            efVar.jpo(new com.bytedance.sdk.openadsdk.p001if.jd() { // from class: com.bytedance.sdk.openadsdk.ju.jpo.oya.2
                @Override // com.bytedance.sdk.openadsdk.p001if.jd
                public void jpo(int i10) {
                    oya.this.f21262cm.add(Integer.valueOf(i10));
                    if (oya.this.f21262cm.size() >= oya.this.wqx) {
                        try {
                            oya.this.jpo((oya) new JSONObject());
                            oya.this.f21262cm.clear();
                        } catch (Exception e10) {
                            e10.getMessage();
                        }
                    }
                }
            });
            if (jSONObject.optInt("delay", -1) < 0) {
                return;
            }
            this.wqx = r2 / 1000;
            return;
        }
        wqx();
    }
}
