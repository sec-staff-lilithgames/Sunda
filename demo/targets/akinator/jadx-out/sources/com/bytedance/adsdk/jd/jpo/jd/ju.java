package com.bytedance.adsdk.jd.jpo.jd;

import android.graphics.PointF;
import j1.o2;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju extends qk<PointF> {

    /* renamed from: cm, reason: collision with root package name */
    private final PointF f17303cm;

    public ju(List<com.bytedance.adsdk.jd.qk.jpo<PointF>> list) {
        super(list);
        this.f17303cm = new PointF();
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo
    /* renamed from: jd, reason: merged with bridge method [inline-methods] */
    public PointF jpo(com.bytedance.adsdk.jd.qk.jpo<PointF> jpoVar, float f10) {
        return jpo(jpoVar, f10, f10, f10);
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo
    /* renamed from: jd, reason: merged with bridge method [inline-methods] */
    public PointF jpo(com.bytedance.adsdk.jd.qk.jpo<PointF> jpoVar, float f10, float f11, float f12) {
        PointF pointF;
        PointF pointF2 = jpoVar.jpo;
        if (pointF2 == null || (pointF = jpoVar.f17433jd) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        if (this.wqx != null) {
            jpoVar.f17436qk.getClass();
            cm();
            xyk();
            throw null;
        }
        PointF pointF5 = this.f17303cm;
        float f13 = pointF3.x;
        float fA = o2.a(pointF4.x, f13, f11, f13);
        float f14 = pointF3.y;
        pointF5.set(fA, o2.a(pointF4.y, f14, f12, f14));
        return this.f17303cm;
    }
}
