package com.bytedance.adsdk.jd.wqx.jd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.adsdk.jd.wqx.jd.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif implements wqx {

    /* renamed from: cm, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jpo.Cif f17456cm;

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jpo.jd f17457jd;
    private final String jpo;
    private final boolean my;
    private final com.bytedance.adsdk.jd.wqx.jpo.jd wqx;

    public Cif(String str, com.bytedance.adsdk.jd.wqx.jpo.jd jdVar, com.bytedance.adsdk.jd.wqx.jpo.jd jdVar2, com.bytedance.adsdk.jd.wqx.jpo.Cif cif, boolean z10) {
        this.jpo = str;
        this.f17457jd = jdVar;
        this.wqx = jdVar2;
        this.f17456cm = cif;
        this.my = z10;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.Cif cm() {
        return this.f17456cm;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.jd jd() {
        return this.f17457jd;
    }

    public String jpo() {
        return this.jpo;
    }

    public boolean my() {
        return this.my;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.jd wqx() {
        return this.wqx;
    }

    @Override // com.bytedance.adsdk.jd.wqx.jd.wqx
    public com.bytedance.adsdk.jd.jpo.jpo.wqx jpo(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.qk qkVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar) {
        return new com.bytedance.adsdk.jd.jpo.jpo.hna(zzVar, jpoVar, this);
    }
}
