package com.bytedance.sdk.openadsdk.cm.my.jd;

import com.bytedance.sdk.component.utils.nmd;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class au implements wqx {

    /* renamed from: jd, reason: collision with root package name */
    public int f19578jd;
    public long jpo;
    public long wqx;

    public void jd(long j10) {
        this.wqx = j10;
    }

    public void jpo(long j10) {
        this.jpo = j10;
    }

    public void jpo(int i10) {
        this.f19578jd = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.cm.my.jd.wqx
    public void jpo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.jpo);
            jSONObject.put("buffers_count", this.f19578jd);
            jSONObject.put("total_duration", this.wqx);
        } catch (Throwable th2) {
            nmd.wqx("PlayBufferModel", th2.getMessage());
        }
    }
}
