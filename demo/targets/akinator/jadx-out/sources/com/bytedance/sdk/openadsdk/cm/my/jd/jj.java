package com.bytedance.sdk.openadsdk.cm.my.jd;

import com.bytedance.sdk.component.utils.nmd;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj implements wqx {

    /* renamed from: jd, reason: collision with root package name */
    private long f19585jd;
    private long jpo;
    private int wqx = 0;

    public void jd(long j10) {
        this.f19585jd = j10;
    }

    public void jpo(long j10) {
        this.jpo = j10;
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
            jSONObject.put("total_duration", this.jpo);
            jSONObject.put("buffers_time", this.f19585jd);
            jSONObject.put("video_backup", this.wqx);
        } catch (Throwable th2) {
            nmd.wqx("FeedOverModel", th2.getMessage());
        }
    }
}
