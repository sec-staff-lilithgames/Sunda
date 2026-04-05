package com.bytedance.sdk.openadsdk.cm.my.jd;

import com.bytedance.sdk.component.utils.nmd;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd implements wqx {

    /* renamed from: cm, reason: collision with root package name */
    private int f19602cm;

    /* renamed from: jd, reason: collision with root package name */
    private long f19603jd;

    /* renamed from: jj, reason: collision with root package name */
    private String f19604jj;
    private String jpo;
    private String my;
    private long wqx;

    public void jd(long j10) {
        this.wqx = j10;
    }

    public void jpo(String str) {
        this.jpo = str;
    }

    public void wqx(String str) {
        this.f19604jj = str;
    }

    public void jd(String str) {
        this.my = str;
    }

    public void jpo(long j10) {
        this.f19603jd = j10;
    }

    public void jpo(int i10) {
        this.f19602cm = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.cm.my.jd.wqx
    public void jpo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.jpo);
            jSONObject.put("preload_size", this.f19603jd);
            jSONObject.put("load_time", this.wqx);
            jSONObject.put("error_code", this.f19602cm);
            jSONObject.put("error_message", this.my);
            jSONObject.put("error_message_server", this.f19604jj);
        } catch (Throwable th2) {
            nmd.wqx("LoadVideoErrorModel", th2.getMessage());
        }
    }
}
