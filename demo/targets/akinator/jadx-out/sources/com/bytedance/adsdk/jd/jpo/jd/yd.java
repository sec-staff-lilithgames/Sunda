package com.bytedance.adsdk.jd.jpo.jd;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd extends qk<PointF> {

    /* renamed from: cm, reason: collision with root package name */
    private final PointF f17313cm;

    /* renamed from: jj, reason: collision with root package name */
    private final PathMeasure f17314jj;
    private final float[] my;

    /* renamed from: qk, reason: collision with root package name */
    private zz f17315qk;

    public yd(List<? extends com.bytedance.adsdk.jd.qk.jpo<PointF>> list) {
        super(list);
        this.f17313cm = new PointF();
        this.my = new float[2];
        this.f17314jj = new PathMeasure();
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo
    /* renamed from: jd, reason: merged with bridge method [inline-methods] */
    public PointF jpo(com.bytedance.adsdk.jd.qk.jpo<PointF> jpoVar, float f10) {
        zz zzVar = (zz) jpoVar;
        Path pathJd = zzVar.jd();
        if (pathJd == null) {
            return jpoVar.jpo;
        }
        if (this.wqx != null) {
            zzVar.f17436qk.getClass();
            cm();
            xyk();
            throw null;
        }
        if (this.f17315qk != zzVar) {
            this.f17314jj.setPath(pathJd, false);
            this.f17315qk = zzVar;
        }
        PathMeasure pathMeasure = this.f17314jj;
        pathMeasure.getPosTan(pathMeasure.getLength() * f10, this.my, null);
        PointF pointF = this.f17313cm;
        float[] fArr = this.my;
        pointF.set(fArr[0], fArr[1]);
        return this.f17313cm;
    }
}
