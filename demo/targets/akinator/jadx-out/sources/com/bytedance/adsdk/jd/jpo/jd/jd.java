package com.bytedance.adsdk.jd.jpo.jd;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends qk<Integer> {
    public jd(List<com.bytedance.adsdk.jd.qk.jpo<Integer>> list) {
        super(list);
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo
    /* renamed from: jd, reason: merged with bridge method [inline-methods] */
    public Integer jpo(com.bytedance.adsdk.jd.qk.jpo<Integer> jpoVar, float f10) {
        return Integer.valueOf(wqx(jpoVar, f10));
    }

    public int wqx(com.bytedance.adsdk.jd.qk.jpo<Integer> jpoVar, float f10) {
        if (jpoVar.jpo == null || jpoVar.f17433jd == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.wqx == null) {
            return com.bytedance.adsdk.jd.jj.jd.jpo(com.bytedance.adsdk.jd.jj.my.jd(f10, 0.0f, 1.0f), jpoVar.jpo.intValue(), jpoVar.f17433jd.intValue());
        }
        jpoVar.f17436qk.getClass();
        cm();
        xyk();
        throw null;
    }

    public int zz() {
        return wqx(wqx(), my());
    }
}
