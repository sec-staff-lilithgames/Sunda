package com.bytedance.sdk.component.my.my;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements zz {

    /* renamed from: jd, reason: collision with root package name */
    private com.bytedance.sdk.component.my.jj f18880jd;
    private byte[] jpo;

    public jd(byte[] bArr, com.bytedance.sdk.component.my.jj jjVar) {
        this.jpo = bArr;
        this.f18880jd = jjVar;
    }

    @Override // com.bytedance.sdk.component.my.my.zz
    public void jpo(com.bytedance.sdk.component.my.wqx.wqx wqxVar) {
        zz myVar;
        int iM420if = wqxVar.m420if();
        wqxVar.jpo(this.jpo.length);
        if (iM420if == 2) {
            myVar = com.bytedance.sdk.component.utils.jj.jpo(this.jpo) ? new my(this.jpo, this.f18880jd) : this.f18880jd == null ? new ju() : new xyk(1001, "not image format", null);
        } else if (iM420if != 3) {
            boolean zJd = com.bytedance.sdk.component.utils.jj.jd(this.jpo);
            myVar = (!zJd && com.bytedance.sdk.component.utils.jj.jpo(this.jpo)) ? new my(this.jpo, this.f18880jd) : new au(this.jpo, this.f18880jd, zJd);
        } else {
            byte[] bArr = this.jpo;
            myVar = new au(bArr, this.f18880jd, com.bytedance.sdk.component.utils.jj.jd(bArr));
        }
        wqxVar.jpo(myVar);
    }

    @Override // com.bytedance.sdk.component.my.my.zz
    public String jpo() {
        return "image_type";
    }
}
