package com.bytedance.adsdk.jd.wqx.jd;

import com.bytedance.adsdk.jd.jpo.jpo.Cif;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz implements wqx {

    /* renamed from: jd, reason: collision with root package name */
    private final jpo f17509jd;
    private final String jpo;
    private final boolean wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum jpo {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static jpo jpo(int i10) {
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public zz(String str, jpo jpoVar, boolean z10) {
        this.jpo = str;
        this.f17509jd = jpoVar;
        this.wqx = z10;
    }

    public jpo jd() {
        return this.f17509jd;
    }

    public String jpo() {
        return this.jpo;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f17509jd + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean wqx() {
        return this.wqx;
    }

    @Override // com.bytedance.adsdk.jd.wqx.jd.wqx
    public com.bytedance.adsdk.jd.jpo.jpo.wqx jpo(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.qk qkVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar) {
        return new Cif(this);
    }
}
