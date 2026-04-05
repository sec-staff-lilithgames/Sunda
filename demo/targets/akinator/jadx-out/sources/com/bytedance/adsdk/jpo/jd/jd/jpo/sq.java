package com.bytedance.adsdk.jpo.jd.jd.jpo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class sq implements com.bytedance.adsdk.jpo.jd.jd.jpo {

    /* renamed from: jd, reason: collision with root package name */
    protected com.bytedance.adsdk.jpo.jd.jd.jpo f17664jd;
    protected com.bytedance.adsdk.jpo.jd.jd.jpo jpo;
    protected com.bytedance.adsdk.jpo.jd.cm.wqx wqx;

    public sq(com.bytedance.adsdk.jpo.jd.cm.wqx wqxVar) {
        this.wqx = wqxVar;
    }

    public void jd(com.bytedance.adsdk.jpo.jd.jd.jpo jpoVar) {
        this.f17664jd = jpoVar;
    }

    public void jpo(com.bytedance.adsdk.jpo.jd.jd.jpo jpoVar) {
        this.jpo = jpoVar;
    }

    public String toString() {
        return jd();
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public String jd() {
        return this.jpo.jd() + this.wqx.jpo() + this.f17664jd.jd();
    }

    @Override // com.bytedance.adsdk.jpo.jd.jd.jpo
    public com.bytedance.adsdk.jpo.jd.cm.my jpo() {
        return com.bytedance.adsdk.jpo.jd.cm.jj.OPERATOR_RESULT;
    }
}
