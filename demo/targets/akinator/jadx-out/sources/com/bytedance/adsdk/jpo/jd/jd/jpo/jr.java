package com.bytedance.adsdk.jpo.jd.jd.jpo;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jr implements com.bytedance.adsdk.jpo.jd.jd.jd {

    /* renamed from: jd, reason: collision with root package name */
    private com.bytedance.adsdk.jpo.jd.jd.jpo f17662jd;
    private com.bytedance.adsdk.jpo.jd.jd.jpo jpo;
    private com.bytedance.adsdk.jpo.jd.jd.jpo wqx;

    @Override // com.bytedance.adsdk.jpo.jd.jd.jd
    public void jd(com.bytedance.adsdk.jpo.jd.jd.jpo jpoVar) {
        this.f17662jd = jpoVar;
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public Object jpo(Map<String, JSONObject> map) {
        Object objJpo = this.jpo.jpo(map);
        if (objJpo == null) {
            return null;
        }
        return ((Boolean) objJpo).booleanValue() ? this.f17662jd.jpo(map) : this.wqx.jpo(map);
    }

    public String toString() {
        return jd();
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jd
    public void wqx(com.bytedance.adsdk.jpo.jd.jd.jpo jpoVar) {
        this.wqx = jpoVar;
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public String jd() {
        return this.jpo.jd() + "?" + this.f17662jd.jd() + ":" + this.wqx.jd();
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public com.bytedance.adsdk.jpo.jd.cm.my jpo() {
        return com.bytedance.adsdk.jpo.jd.cm.jj.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jd
    public void jpo(com.bytedance.adsdk.jpo.jd.jd.jpo jpoVar) {
        this.jpo = jpoVar;
    }
}
