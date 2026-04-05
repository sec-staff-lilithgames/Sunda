package com.bytedance.sdk.openadsdk.cm.my.jd;

import com.bytedance.sdk.component.utils.nmd;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz implements wqx {

    /* renamed from: jd, reason: collision with root package name */
    private final long f19605jd;
    private final String jpo;

    public zz(String str, long j10) {
        this.jpo = str;
        this.f19605jd = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.cm.my.jd.wqx
    public void jpo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.jpo);
            jSONObject.put("preload_size", this.f19605jd);
        } catch (Throwable th2) {
            nmd.wqx("LoadVideoCancelModel", th2.getMessage());
        }
    }
}
