package com.bytedance.sdk.openadsdk.cm.my.jd;

import com.bytedance.sdk.component.utils.nmd;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk implements wqx {

    /* renamed from: jd, reason: collision with root package name */
    private long f19601jd;
    private long jpo;
    private int wqx;

    public void jd(long j10) {
        this.f19601jd = j10;
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
            jSONObject.put("video_start_duration", this.jpo);
            jSONObject.put("video_cache_size", this.f19601jd);
            jSONObject.put("is_auto_play", this.wqx);
        } catch (Throwable th2) {
            nmd.wqx("FeedPlayModel", th2.getMessage());
        }
    }
}
