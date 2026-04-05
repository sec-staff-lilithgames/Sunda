package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju {

    /* renamed from: cm, reason: collision with root package name */
    private Map<String, Object> f17742cm;

    /* renamed from: jd, reason: collision with root package name */
    private JSONObject f17743jd;
    private Context jpo;
    private JSONObject wqx;

    public void jd(JSONObject jSONObject) {
        this.wqx = jSONObject;
    }

    public void jpo(Context context) {
        this.jpo = context;
    }

    public Map<String, Object> jd() {
        return this.f17742cm;
    }

    public void jpo(JSONObject jSONObject) {
        this.f17743jd = jSONObject;
    }

    public JSONObject jpo() {
        return this.wqx;
    }

    public void jpo(Map<String, Object> map) {
        this.f17742cm = map;
    }
}
