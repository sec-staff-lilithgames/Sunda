package com.bytedance.sdk.openadsdk.cm.my.jd;

import com.bytedance.sdk.component.utils.nmd;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements wqx {

    /* renamed from: cm, reason: collision with root package name */
    private int f19583cm;

    /* renamed from: jd, reason: collision with root package name */
    private long f19584jd;
    private long jpo;
    private int wqx;

    public void jd(long j10) {
        this.f19584jd = j10;
    }

    public void jpo(long j10) {
        this.jpo = j10;
    }

    public void jd(int i10) {
        this.f19583cm = i10;
    }

    public void jpo(int i10) {
        this.wqx = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.cm.my.jd.wqx
    public void jpo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.jpo);
            jSONObject.put("total_duration", this.f19584jd);
            jSONObject.put("vbtt_skip_type", this.wqx);
            jSONObject.put("skip_reason", this.f19583cm);
        } catch (Throwable th2) {
            nmd.wqx("EndcardSkipModel", th2.getMessage());
        }
    }
}
