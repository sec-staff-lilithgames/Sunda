package com.bytedance.sdk.openadsdk.cm.my.jd;

import com.bytedance.sdk.component.utils.nmd;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm implements wqx {

    /* renamed from: cm, reason: collision with root package name */
    public int f19579cm = 0;

    /* renamed from: jd, reason: collision with root package name */
    public long f19580jd;
    public long jpo;
    public int wqx;

    public void jd(long j10) {
        this.f19580jd = j10;
    }

    public void jpo(long j10) {
        this.jpo = j10;
    }

    public void jd(int i10) {
        this.f19579cm = i10;
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
            jSONObject.put("buffers_time", this.f19580jd);
            jSONObject.put("break_reason", this.wqx);
            jSONObject.put("video_backup", this.f19579cm);
        } catch (Throwable th2) {
            nmd.wqx("FeedBreakModel", th2.getMessage());
        }
    }
}
