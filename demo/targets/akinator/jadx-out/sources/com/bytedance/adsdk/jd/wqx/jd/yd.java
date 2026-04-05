package com.bytedance.adsdk.jd.wqx.jd;

import android.graphics.PointF;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd implements wqx {

    /* renamed from: cm, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jpo.au<PointF, PointF> f17501cm;

    /* renamed from: jd, reason: collision with root package name */
    private final jpo f17502jd;

    /* renamed from: jj, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jpo.jd f17503jj;
    private final String jpo;

    /* renamed from: ju, reason: collision with root package name */
    private final boolean f17504ju;
    private final com.bytedance.adsdk.jd.wqx.jpo.jd my;

    /* renamed from: qk, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jpo.jd f17505qk;
    private final com.bytedance.adsdk.jd.wqx.jpo.jd wqx;
    private final com.bytedance.adsdk.jd.wqx.jpo.jd xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final boolean f17506yd;
    private final com.bytedance.adsdk.jd.wqx.jpo.jd zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum jpo {
        STAR(1),
        POLYGON(2);

        private final int wqx;

        jpo(int i10) {
            this.wqx = i10;
        }

        public static jpo jpo(int i10) {
            for (jpo jpoVar : values()) {
                if (jpoVar.wqx == i10) {
                    return jpoVar;
                }
            }
            return null;
        }
    }

    public yd(String str, jpo jpoVar, com.bytedance.adsdk.jd.wqx.jpo.jd jdVar, com.bytedance.adsdk.jd.wqx.jpo.au<PointF, PointF> auVar, com.bytedance.adsdk.jd.wqx.jpo.jd jdVar2, com.bytedance.adsdk.jd.wqx.jpo.jd jdVar3, com.bytedance.adsdk.jd.wqx.jpo.jd jdVar4, com.bytedance.adsdk.jd.wqx.jpo.jd jdVar5, com.bytedance.adsdk.jd.wqx.jpo.jd jdVar6, boolean z10, boolean z11) {
        this.jpo = str;
        this.f17502jd = jpoVar;
        this.wqx = jdVar;
        this.f17501cm = auVar;
        this.my = jdVar2;
        this.f17503jj = jdVar3;
        this.f17505qk = jdVar4;
        this.xyk = jdVar5;
        this.zz = jdVar6;
        this.f17506yd = z10;
        this.f17504ju = z11;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.au<PointF, PointF> cm() {
        return this.f17501cm;
    }

    public jpo jd() {
        return this.f17502jd;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.jd jj() {
        return this.f17503jj;
    }

    public String jpo() {
        return this.jpo;
    }

    public boolean ju() {
        return this.f17504ju;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.jd my() {
        return this.my;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.jd qk() {
        return this.f17505qk;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.jd wqx() {
        return this.wqx;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.jd xyk() {
        return this.xyk;
    }

    public boolean yd() {
        return this.f17506yd;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.jd zz() {
        return this.zz;
    }

    @Override // com.bytedance.adsdk.jd.wqx.jd.wqx
    public com.bytedance.adsdk.jd.jpo.jpo.wqx jpo(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.qk qkVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar) {
        return new com.bytedance.adsdk.jd.jpo.jpo.oya(zzVar, jpoVar, this);
    }
}
