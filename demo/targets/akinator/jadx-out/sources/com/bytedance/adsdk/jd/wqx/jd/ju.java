package com.bytedance.adsdk.jd.wqx.jd;

import android.graphics.PointF;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju implements wqx {

    /* renamed from: cm, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jpo.jd f17473cm;

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jpo.au<PointF, PointF> f17474jd;
    private final String jpo;
    private final boolean my;
    private final com.bytedance.adsdk.jd.wqx.jpo.au<PointF, PointF> wqx;

    public ju(String str, com.bytedance.adsdk.jd.wqx.jpo.au<PointF, PointF> auVar, com.bytedance.adsdk.jd.wqx.jpo.au<PointF, PointF> auVar2, com.bytedance.adsdk.jd.wqx.jpo.jd jdVar, boolean z10) {
        this.jpo = str;
        this.f17474jd = auVar;
        this.wqx = auVar2;
        this.f17473cm = jdVar;
        this.my = z10;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.au<PointF, PointF> cm() {
        return this.f17474jd;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.jd jd() {
        return this.f17473cm;
    }

    public String jpo() {
        return this.jpo;
    }

    public boolean my() {
        return this.my;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f17474jd + ", size=" + this.wqx + AbstractJsonLexerKt.END_OBJ;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.au<PointF, PointF> wqx() {
        return this.wqx;
    }

    @Override // com.bytedance.adsdk.jd.wqx.jd.wqx
    public com.bytedance.adsdk.jd.jpo.jpo.wqx jpo(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.qk qkVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar) {
        return new com.bytedance.adsdk.jd.jpo.jpo.prr(zzVar, jpoVar, this);
    }
}
