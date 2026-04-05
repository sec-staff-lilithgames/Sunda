package com.bytedance.sdk.openadsdk.cm.my.jd;

import com.bytedance.sdk.openadsdk.cm.my.jd.wqx;
import com.bytedance.sdk.openadsdk.core.model.dt;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo<T extends wqx> {

    /* renamed from: cm, reason: collision with root package name */
    private T f19586cm;

    /* renamed from: jd, reason: collision with root package name */
    private String f19587jd;
    private dt jpo;
    private boolean my = false;
    private JSONObject wqx;

    public jpo(dt dtVar, String str, JSONObject jSONObject, T t10) {
        this.jpo = dtVar;
        this.f19587jd = str;
        this.wqx = jSONObject;
        this.f19586cm = t10;
    }

    public T cm() {
        return this.f19586cm;
    }

    public String jd() {
        return this.f19587jd;
    }

    public dt jpo() {
        return this.jpo;
    }

    public boolean my() {
        return this.my;
    }

    public JSONObject wqx() {
        if (this.wqx == null) {
            this.wqx = new JSONObject();
        }
        return this.wqx;
    }

    public void jpo(boolean z10) {
        this.my = z10;
    }
}
