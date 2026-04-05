package com.bytedance.adsdk.jd.wqx.jd;

import a.b;
import android.graphics.Path;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class prr implements wqx {

    /* renamed from: cm, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jpo.jpo f17491cm;

    /* renamed from: jd, reason: collision with root package name */
    private final Path.FillType f17492jd;

    /* renamed from: jj, reason: collision with root package name */
    private final boolean f17493jj;
    private final boolean jpo;
    private final com.bytedance.adsdk.jd.wqx.jpo.cm my;
    private final String wqx;

    public prr(String str, boolean z10, Path.FillType fillType, com.bytedance.adsdk.jd.wqx.jpo.jpo jpoVar, com.bytedance.adsdk.jd.wqx.jpo.cm cmVar, boolean z11) {
        this.wqx = str;
        this.jpo = z10;
        this.f17492jd = fillType;
        this.f17491cm = jpoVar;
        this.my = cmVar;
        this.f17493jj = z11;
    }

    public Path.FillType cm() {
        return this.f17492jd;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.jpo jd() {
        return this.f17491cm;
    }

    public String jpo() {
        return this.wqx;
    }

    public boolean my() {
        return this.f17493jj;
    }

    public String toString() {
        return b.p(new StringBuilder("ShapeFill{color=, fillEnabled="), this.jpo, AbstractJsonLexerKt.END_OBJ);
    }

    public com.bytedance.adsdk.jd.wqx.jpo.cm wqx() {
        return this.my;
    }

    @Override // com.bytedance.adsdk.jd.wqx.jd.wqx
    public com.bytedance.adsdk.jd.jpo.jpo.wqx jpo(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.qk qkVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar) {
        return new com.bytedance.adsdk.jd.jpo.jpo.qk(zzVar, jpoVar, this);
    }
}
