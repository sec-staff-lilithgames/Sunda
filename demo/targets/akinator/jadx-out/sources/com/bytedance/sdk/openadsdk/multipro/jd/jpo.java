package com.bytedance.sdk.openadsdk.multipro.jd;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: cm, reason: collision with root package name */
    public boolean f21285cm;

    /* renamed from: jd, reason: collision with root package name */
    public boolean f21286jd;

    /* renamed from: jj, reason: collision with root package name */
    public long f21287jj;
    public boolean jpo;
    public long my;

    /* renamed from: qk, reason: collision with root package name */
    public long f21288qk;
    public boolean wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.multipro.jd.jpo$jpo, reason: collision with other inner class name */
    public interface InterfaceC0146jpo {
        jpo jj();
    }

    public jpo cm(boolean z10) {
        this.wqx = z10;
        return this;
    }

    public jpo jd(boolean z10) {
        this.jpo = z10;
        return this;
    }

    public jpo jpo(boolean z10) {
        this.f21285cm = z10;
        return this;
    }

    public jpo wqx(boolean z10) {
        this.f21286jd = z10;
        return this;
    }

    public jpo jd(long j10) {
        this.f21287jj = j10;
        return this;
    }

    public jpo jpo(long j10) {
        this.my = j10;
        return this;
    }

    public jpo wqx(long j10) {
        this.f21288qk = j10;
        return this;
    }

    public JSONObject jpo() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.jpo);
            jSONObject.put("isFromVideoDetailPage", this.f21286jd);
            jSONObject.put("isFromDetailPage", this.wqx);
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, this.my);
            jSONObject.put("totalPlayDuration", this.f21287jj);
            jSONObject.put("currentPlayPosition", this.f21288qk);
            jSONObject.put("isAutoPlay", this.f21285cm);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static jpo jpo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        jpo jpoVar = new jpo();
        jpoVar.jd(jSONObject.optBoolean("isCompleted"));
        jpoVar.wqx(jSONObject.optBoolean("isFromVideoDetailPage"));
        jpoVar.cm(jSONObject.optBoolean("isFromDetailPage"));
        jpoVar.jpo(jSONObject.optLong(IronSourceConstants.EVENTS_DURATION));
        jpoVar.jd(jSONObject.optLong("totalPlayDuration"));
        jpoVar.wqx(jSONObject.optLong("currentPlayPosition"));
        jpoVar.jpo(jSONObject.optBoolean("isAutoPlay"));
        return jpoVar;
    }
}
