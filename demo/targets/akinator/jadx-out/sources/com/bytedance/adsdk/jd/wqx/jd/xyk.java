package com.bytedance.adsdk.jd.wqx.jd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk {

    /* renamed from: cm, reason: collision with root package name */
    private final boolean f17497cm;

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jpo.xyk f17498jd;
    private final jpo jpo;
    private final com.bytedance.adsdk.jd.wqx.jpo.cm wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum jpo {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public xyk(jpo jpoVar, com.bytedance.adsdk.jd.wqx.jpo.xyk xykVar, com.bytedance.adsdk.jd.wqx.jpo.cm cmVar, boolean z10) {
        this.jpo = jpoVar;
        this.f17498jd = xykVar;
        this.wqx = cmVar;
        this.f17497cm = z10;
    }

    public boolean cm() {
        return this.f17497cm;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.xyk jd() {
        return this.f17498jd;
    }

    public jpo jpo() {
        return this.jpo;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.cm wqx() {
        return this.wqx;
    }
}
