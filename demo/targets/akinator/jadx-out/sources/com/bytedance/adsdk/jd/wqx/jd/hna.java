package com.bytedance.adsdk.jd.wqx.jd;

import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hna implements wqx {

    /* renamed from: jd, reason: collision with root package name */
    private final List<wqx> f17455jd;
    private final String jpo;
    private final boolean wqx;

    public hna(String str, List<wqx> list, boolean z10) {
        this.jpo = str;
        this.f17455jd = list;
        this.wqx = z10;
    }

    public List<wqx> jd() {
        return this.f17455jd;
    }

    public String jpo() {
        return this.jpo;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.jpo + "' Shapes: " + Arrays.toString(this.f17455jd.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean wqx() {
        return this.wqx;
    }

    @Override // com.bytedance.adsdk.jd.wqx.jd.wqx
    public com.bytedance.adsdk.jd.jpo.jpo.wqx jpo(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.qk qkVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar) {
        return new com.bytedance.adsdk.jd.jpo.jpo.cm(zzVar, jpoVar, this, qkVar);
    }
}
