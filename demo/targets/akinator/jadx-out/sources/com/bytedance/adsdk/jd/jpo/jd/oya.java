package com.bytedance.adsdk.jd.jpo.jd;

import android.graphics.PointF;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class oya extends jpo<PointF, PointF> {

    /* renamed from: cm, reason: collision with root package name */
    protected com.bytedance.adsdk.jd.qk.jd<Float> f17305cm;

    /* renamed from: jj, reason: collision with root package name */
    private final PointF f17306jj;
    protected com.bytedance.adsdk.jd.qk.jd<Float> my;

    /* renamed from: qk, reason: collision with root package name */
    private final PointF f17307qk;
    private final jpo<Float, Float> xyk;
    private final jpo<Float, Float> zz;

    public oya(jpo<Float, Float> jpoVar, jpo<Float, Float> jpoVar2) {
        super(Collections.EMPTY_LIST);
        this.f17306jj = new PointF();
        this.f17307qk = new PointF();
        this.xyk = jpoVar;
        this.zz = jpoVar2;
        jpo(xyk());
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo
    /* renamed from: jd, reason: merged with bridge method [inline-methods] */
    public PointF jpo(com.bytedance.adsdk.jd.qk.jpo<PointF> jpoVar, float f10) {
        if (this.f17305cm != null && this.xyk.wqx() != null) {
            this.xyk.my();
            throw null;
        }
        if (this.my != null && this.zz.wqx() != null) {
            this.zz.my();
            throw null;
        }
        this.f17307qk.set(this.f17306jj.x, 0.0f);
        PointF pointF = this.f17307qk;
        pointF.set(pointF.x, this.f17306jj.y);
        return this.f17307qk;
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo
    /* renamed from: zz, reason: merged with bridge method [inline-methods] */
    public PointF qk() {
        return jpo(null, 0.0f);
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo
    public void jpo(float f10) {
        this.xyk.jpo(f10);
        this.zz.jpo(f10);
        this.f17306jj.set(this.xyk.qk().floatValue(), this.zz.qk().floatValue());
        for (int i10 = 0; i10 < this.jpo.size(); i10++) {
            this.jpo.get(i10).jpo();
        }
    }
}
