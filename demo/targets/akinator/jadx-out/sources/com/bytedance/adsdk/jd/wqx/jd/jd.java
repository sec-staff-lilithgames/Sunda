package com.bytedance.adsdk.jd.wqx.jd;

import android.graphics.PointF;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements wqx {

    /* renamed from: cm, reason: collision with root package name */
    private final boolean f17458cm;

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jpo.au<PointF, PointF> f17459jd;
    private final String jpo;
    private final boolean my;
    private final com.bytedance.adsdk.jd.wqx.jpo.jj wqx;

    public jd(String str, com.bytedance.adsdk.jd.wqx.jpo.au<PointF, PointF> auVar, com.bytedance.adsdk.jd.wqx.jpo.jj jjVar, boolean z10, boolean z11) {
        this.jpo = str;
        this.f17459jd = auVar;
        this.wqx = jjVar;
        this.f17458cm = z10;
        this.my = z11;
    }

    public boolean cm() {
        return this.f17458cm;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.au<PointF, PointF> jd() {
        return this.f17459jd;
    }

    @Override // com.bytedance.adsdk.jd.wqx.jd.wqx
    public com.bytedance.adsdk.jd.jpo.jpo.wqx jpo(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.qk qkVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar) {
        return new com.bytedance.adsdk.jd.jpo.jpo.jj(zzVar, jpoVar, this);
    }

    public boolean my() {
        return this.my;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.jj wqx() {
        return this.wqx;
    }

    public String jpo() {
        return this.jpo;
    }
}
