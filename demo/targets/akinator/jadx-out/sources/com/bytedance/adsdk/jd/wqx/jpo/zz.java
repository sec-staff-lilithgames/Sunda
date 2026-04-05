package com.bytedance.adsdk.jd.wqx.jpo;

import android.graphics.PointF;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz implements au<PointF, PointF> {

    /* renamed from: jd, reason: collision with root package name */
    private final jd f17521jd;
    private final jd jpo;

    public zz(jd jdVar, jd jdVar2) {
        this.jpo = jdVar;
        this.f17521jd = jdVar2;
    }

    @Override // com.bytedance.adsdk.jd.wqx.jpo.au
    public boolean jd() {
        return this.jpo.jd() && this.f17521jd.jd();
    }

    @Override // com.bytedance.adsdk.jd.wqx.jpo.au
    public com.bytedance.adsdk.jd.jpo.jd.jpo<PointF, PointF> jpo() {
        return new com.bytedance.adsdk.jd.jpo.jd.oya(this.jpo.jpo(), this.f17521jd.jpo());
    }

    @Override // com.bytedance.adsdk.jd.wqx.jpo.au
    public List<com.bytedance.adsdk.jd.qk.jpo<PointF>> wqx() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
