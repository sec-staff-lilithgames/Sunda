package com.bytedance.sdk.openadsdk.cm.jpo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class zz implements com.bytedance.sdk.component.jj.jpo.my.cm {
    private final com.bytedance.sdk.component.qk.jd jpo;

    public zz(com.bytedance.sdk.component.qk.jd jdVar) {
        this.jpo = jdVar;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my.cm
    public int jd() {
        com.bytedance.sdk.component.qk.jd jdVar = this.jpo;
        if (jdVar != null) {
            return jdVar.jpo();
        }
        return -1;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my.cm
    public boolean jpo() {
        com.bytedance.sdk.component.qk.jd jdVar = this.jpo;
        if (jdVar != null) {
            return jdVar.jj();
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my.cm
    public String wqx() {
        com.bytedance.sdk.component.qk.jd jdVar = this.jpo;
        return jdVar != null ? jdVar.jd() : "";
    }
}
