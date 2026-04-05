package com.bytedance.sdk.openadsdk.cm.jpo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class qk implements com.bytedance.sdk.component.jj.jpo.my.wqx {
    private final com.bytedance.sdk.component.qk.jd.jd jpo;

    public qk() {
        com.bytedance.sdk.component.qk.jd.jd jdVarWqx = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().wqx();
        this.jpo = jdVarWqx;
        jdVarWqx.jpo(7);
        jdVarWqx.jpo("track_url");
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my.wqx
    public void jpo(String str) {
        this.jpo.jd(str);
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my.wqx
    public void jpo(String str, String str2) {
        this.jpo.jd(str, str2);
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my.wqx
    public com.bytedance.sdk.component.jj.jpo.my.cm jpo() {
        return new zz(this.jpo.jpo());
    }
}
