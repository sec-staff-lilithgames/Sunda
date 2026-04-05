package com.bytedance.adsdk.jd.jpo.jd;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.adsdk.jd.jpo.jd.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif extends qk<com.bytedance.adsdk.jd.qk.wqx> {

    /* renamed from: cm, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.qk.wqx f17295cm;

    public Cif(List<com.bytedance.adsdk.jd.qk.jpo<com.bytedance.adsdk.jd.qk.wqx>> list) {
        super(list);
        this.f17295cm = new com.bytedance.adsdk.jd.qk.wqx();
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo
    /* renamed from: jd, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.jd.qk.wqx jpo(com.bytedance.adsdk.jd.qk.jpo<com.bytedance.adsdk.jd.qk.wqx> jpoVar, float f10) {
        com.bytedance.adsdk.jd.qk.wqx wqxVar;
        com.bytedance.adsdk.jd.qk.wqx wqxVar2 = jpoVar.jpo;
        if (wqxVar2 == null || (wqxVar = jpoVar.f17433jd) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.bytedance.adsdk.jd.qk.wqx wqxVar3 = wqxVar2;
        com.bytedance.adsdk.jd.qk.wqx wqxVar4 = wqxVar;
        if (this.wqx == null) {
            this.f17295cm.jpo(com.bytedance.adsdk.jd.jj.my.jpo(wqxVar3.jpo(), wqxVar4.jpo(), f10), com.bytedance.adsdk.jd.jj.my.jpo(wqxVar3.jd(), wqxVar4.jd(), f10));
            return this.f17295cm;
        }
        jpoVar.f17436qk.getClass();
        cm();
        xyk();
        throw null;
    }
}
