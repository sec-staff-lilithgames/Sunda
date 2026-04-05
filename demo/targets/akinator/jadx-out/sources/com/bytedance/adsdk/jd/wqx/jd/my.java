package com.bytedance.adsdk.jd.wqx.jd;

import android.graphics.Path;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my implements wqx {

    /* renamed from: cm, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jpo.cm f17475cm;

    /* renamed from: jd, reason: collision with root package name */
    private final Path.FillType f17476jd;

    /* renamed from: jj, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jpo.jj f17477jj;
    private final qk jpo;
    private final com.bytedance.adsdk.jd.wqx.jpo.jj my;

    /* renamed from: qk, reason: collision with root package name */
    private final String f17478qk;
    private final com.bytedance.adsdk.jd.wqx.jpo.wqx wqx;
    private final com.bytedance.adsdk.jd.wqx.jpo.jd xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final boolean f17479yd;
    private final com.bytedance.adsdk.jd.wqx.jpo.jd zz;

    public my(String str, qk qkVar, Path.FillType fillType, com.bytedance.adsdk.jd.wqx.jpo.wqx wqxVar, com.bytedance.adsdk.jd.wqx.jpo.cm cmVar, com.bytedance.adsdk.jd.wqx.jpo.jj jjVar, com.bytedance.adsdk.jd.wqx.jpo.jj jjVar2, com.bytedance.adsdk.jd.wqx.jpo.jd jdVar, com.bytedance.adsdk.jd.wqx.jpo.jd jdVar2, boolean z10) {
        this.jpo = qkVar;
        this.f17476jd = fillType;
        this.wqx = wqxVar;
        this.f17475cm = cmVar;
        this.my = jjVar;
        this.f17477jj = jjVar2;
        this.f17478qk = str;
        this.xyk = jdVar;
        this.zz = jdVar2;
        this.f17479yd = z10;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.wqx cm() {
        return this.wqx;
    }

    public qk jd() {
        return this.jpo;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.jj jj() {
        return this.my;
    }

    public String jpo() {
        return this.f17478qk;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.cm my() {
        return this.f17475cm;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.jj qk() {
        return this.f17477jj;
    }

    public Path.FillType wqx() {
        return this.f17476jd;
    }

    public boolean xyk() {
        return this.f17479yd;
    }

    @Override // com.bytedance.adsdk.jd.wqx.jd.wqx
    public com.bytedance.adsdk.jd.jpo.jpo.wqx jpo(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.qk qkVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar) {
        return new com.bytedance.adsdk.jd.jpo.jpo.xyk(zzVar, qkVar, jpoVar, this);
    }
}
