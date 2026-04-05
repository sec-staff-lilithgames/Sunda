package com.bytedance.adsdk.jd.wqx.jpo;

import android.graphics.PointF;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my implements au<PointF, PointF> {
    private final List<com.bytedance.adsdk.jd.qk.jpo<PointF>> jpo;

    public my(List<com.bytedance.adsdk.jd.qk.jpo<PointF>> list) {
        this.jpo = list;
    }

    @Override // com.bytedance.adsdk.jd.wqx.jpo.au
    public boolean jd() {
        return this.jpo.size() == 1 && this.jpo.get(0).my();
    }

    @Override // com.bytedance.adsdk.jd.wqx.jpo.au
    public com.bytedance.adsdk.jd.jpo.jd.jpo<PointF, PointF> jpo() {
        return this.jpo.get(0).my() ? new com.bytedance.adsdk.jd.jpo.jd.ju(this.jpo) : new com.bytedance.adsdk.jd.jpo.jd.yd(this.jpo);
    }

    @Override // com.bytedance.adsdk.jd.wqx.jpo.au
    public List<com.bytedance.adsdk.jd.qk.jpo<PointF>> wqx() {
        return this.jpo;
    }
}
