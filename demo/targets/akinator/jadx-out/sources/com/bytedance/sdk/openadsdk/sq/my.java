package com.bytedance.sdk.openadsdk.sq;

import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.zz;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class my implements cm {

    /* renamed from: cm, reason: collision with root package name */
    private int f21486cm;

    /* renamed from: jd, reason: collision with root package name */
    private int f21487jd;
    private cm jpo;
    private int wqx;

    public my(cm cmVar, int i10, int i11, int i12) {
        this.jpo = cmVar;
        this.f21487jd = i10;
        this.wqx = i11;
        this.f21486cm = i12;
    }

    @Override // com.bytedance.sdk.openadsdk.sq.cm
    public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
        com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVarGeneratorModel = this.jpo.generatorModel();
        jpoVarGeneratorModel.jpo(BuildConfig.VERSION_NAME);
        jpoVarGeneratorModel.jpo(this.f21487jd);
        jpoVarGeneratorModel.jd(this.wqx);
        jpoVarGeneratorModel.wqx(this.f21486cm);
        jpoVarGeneratorModel.jj(zz.jd().qk());
        jpoVarGeneratorModel.cm(oya.cm());
        return jpoVarGeneratorModel;
    }
}
