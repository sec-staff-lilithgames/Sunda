package com.bytedance.sdk.openadsdk.cm.my.jd;

import com.bytedance.sdk.component.utils.nmd;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.sdk.openadsdk.cm.my.jd.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif implements wqx {

    /* renamed from: cm, reason: collision with root package name */
    private long f19581cm;

    /* renamed from: jd, reason: collision with root package name */
    private long f19582jd;
    private String jpo;
    private long wqx;

    public void jd(long j10) {
        this.wqx = j10;
    }

    public void jpo(String str) {
        this.jpo = str;
    }

    public void wqx(long j10) {
        this.f19581cm = j10;
    }

    public void jpo(long j10) {
        this.f19582jd = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.cm.my.jd.wqx
    public void jpo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.jpo);
            jSONObject.put("preload_size", this.f19582jd);
            jSONObject.put("load_time", this.wqx);
            jSONObject.put("local_cache", this.f19581cm);
        } catch (Throwable th2) {
            nmd.wqx("LoadVideoSuccessModel", th2.getMessage());
        }
    }
}
