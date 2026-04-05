package com.bytedance.sdk.openadsdk.cm.my.jd;

import com.bytedance.sdk.component.utils.nmd;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class oya implements wqx {

    /* renamed from: cm, reason: collision with root package name */
    private final int f19590cm;

    /* renamed from: jd, reason: collision with root package name */
    private long f19591jd;
    private long jpo;
    private final String my;
    private final int wqx;

    public oya(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jpo jpoVar) {
        this.wqx = jpoVar.jpo();
        this.f19590cm = jpoVar.jd();
        this.my = jpoVar.wqx();
    }

    public void jd(long j10) {
        this.f19591jd = j10;
    }

    public void jpo(long j10) {
        this.jpo = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.cm.my.jd.wqx
    public void jpo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.jpo);
            jSONObject.put("total_duration", this.f19591jd);
            jSONObject.put("error_code", this.wqx);
            jSONObject.put("extra_error_code", this.f19590cm);
            jSONObject.put("error_message", this.my);
        } catch (Throwable th2) {
            nmd.wqx("PlayErrorModel", th2.getMessage());
        }
    }
}
