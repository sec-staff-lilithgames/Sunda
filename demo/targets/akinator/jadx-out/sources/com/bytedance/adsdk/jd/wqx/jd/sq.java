package com.bytedance.adsdk.jd.wqx.jd;

import e3.g;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class sq implements wqx {

    /* renamed from: cm, reason: collision with root package name */
    private final boolean f17495cm;

    /* renamed from: jd, reason: collision with root package name */
    private final int f17496jd;
    private final String jpo;
    private final com.bytedance.adsdk.jd.wqx.jpo.xyk wqx;

    public sq(String str, int i10, com.bytedance.adsdk.jd.wqx.jpo.xyk xykVar, boolean z10) {
        this.jpo = str;
        this.f17496jd = i10;
        this.wqx = xykVar;
        this.f17495cm = z10;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.xyk jd() {
        return this.wqx;
    }

    public String jpo() {
        return this.jpo;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.jpo);
        sb2.append(", index=");
        return g.m(sb2, this.f17496jd, AbstractJsonLexerKt.END_OBJ);
    }

    public boolean wqx() {
        return this.f17495cm;
    }

    @Override // com.bytedance.adsdk.jd.wqx.jd.wqx
    public com.bytedance.adsdk.jd.jpo.jpo.wqx jpo(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.qk qkVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar) {
        return new com.bytedance.adsdk.jd.jpo.jpo.opi(zzVar, jpoVar, this);
    }
}
