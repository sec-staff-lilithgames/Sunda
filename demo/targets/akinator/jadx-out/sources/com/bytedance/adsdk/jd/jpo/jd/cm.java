package com.bytedance.adsdk.jd.jpo.jd;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends qk<Float> {
    public cm(List<com.bytedance.adsdk.jd.qk.jpo<Float>> list) {
        super(list);
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo
    /* renamed from: jd, reason: merged with bridge method [inline-methods] */
    public Float jpo(com.bytedance.adsdk.jd.qk.jpo<Float> jpoVar, float f10) {
        return Float.valueOf(wqx(jpoVar, f10));
    }

    public float wqx(com.bytedance.adsdk.jd.qk.jpo<Float> jpoVar, float f10) {
        if (jpoVar.jpo == null || jpoVar.f17433jd == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.wqx == null) {
            return com.bytedance.adsdk.jd.jj.my.jpo(jpoVar.jj(), jpoVar.qk(), f10);
        }
        jpoVar.f17436qk.getClass();
        cm();
        xyk();
        throw null;
    }

    public float zz() {
        return wqx(wqx(), my());
    }
}
