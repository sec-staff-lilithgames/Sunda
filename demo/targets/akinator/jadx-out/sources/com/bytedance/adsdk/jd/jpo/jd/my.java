package com.bytedance.adsdk.jd.jpo.jd;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends qk<com.bytedance.adsdk.jd.wqx.jd.cm> {

    /* renamed from: cm, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jd.cm f17304cm;

    public my(List<com.bytedance.adsdk.jd.qk.jpo<com.bytedance.adsdk.jd.wqx.jd.cm>> list) {
        super(list);
        com.bytedance.adsdk.jd.wqx.jd.cm cmVar = list.get(0).jpo;
        int iWqx = cmVar != null ? cmVar.wqx() : 0;
        this.f17304cm = new com.bytedance.adsdk.jd.wqx.jd.cm(new float[iWqx], new int[iWqx]);
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo
    /* renamed from: jd, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.jd.wqx.jd.cm jpo(com.bytedance.adsdk.jd.qk.jpo<com.bytedance.adsdk.jd.wqx.jd.cm> jpoVar, float f10) {
        this.f17304cm.jpo(jpoVar.jpo, jpoVar.f17433jd, f10);
        return this.f17304cm;
    }
}
