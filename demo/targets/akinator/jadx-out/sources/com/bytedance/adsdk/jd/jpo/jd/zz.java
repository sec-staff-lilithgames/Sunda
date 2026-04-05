package com.bytedance.adsdk.jd.jpo.jd;

import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz extends com.bytedance.adsdk.jd.qk.jpo<PointF> {

    /* renamed from: ju, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.qk.jpo<PointF> f17316ju;

    /* renamed from: yd, reason: collision with root package name */
    private Path f17317yd;

    public zz(com.bytedance.adsdk.jd.qk qkVar, com.bytedance.adsdk.jd.qk.jpo<PointF> jpoVar) {
        super(qkVar, jpoVar.jpo, jpoVar.f17433jd, jpoVar.wqx, jpoVar.f17432cm, jpoVar.my, jpoVar.f17434jj, jpoVar.f17436qk);
        this.f17316ju = jpoVar;
        jpo();
    }

    public Path jd() {
        return this.f17317yd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void jpo() {
        T t10;
        T t11;
        T t12 = this.f17433jd;
        boolean z10 = (t12 == 0 || (t11 = this.jpo) == 0 || !((PointF) t11).equals(((PointF) t12).x, ((PointF) t12).y)) ? false : true;
        T t13 = this.jpo;
        if (t13 == 0 || (t10 = this.f17433jd) == 0 || z10) {
            return;
        }
        com.bytedance.adsdk.jd.qk.jpo<PointF> jpoVar = this.f17316ju;
        this.f17317yd = com.bytedance.adsdk.jd.jj.jj.jpo((PointF) t13, (PointF) t10, jpoVar.xyk, jpoVar.zz);
    }
}
