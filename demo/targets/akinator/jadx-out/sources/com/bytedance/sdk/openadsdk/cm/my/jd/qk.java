package com.bytedance.sdk.openadsdk.cm.my.jd;

import com.bytedance.sdk.component.utils.nmd;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class qk implements wqx {

    /* renamed from: jd, reason: collision with root package name */
    private long f19600jd;
    private long jpo;

    public void jd(long j10) {
        this.f19600jd = j10;
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
            jSONObject.put(TJzY.RrgLPyPBSC, this.f19600jd);
        } catch (Throwable th2) {
            nmd.wqx("FeedPauseModel", th2.getMessage());
        }
    }
}
