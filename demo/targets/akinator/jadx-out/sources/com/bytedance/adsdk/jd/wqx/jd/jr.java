package com.bytedance.adsdk.jd.wqx.jd;

import androidx.activity.result.HM.OIPXcgrVyyxoLF;
import com.bytedance.adsdk.jd.jpo.jpo.rq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jr implements wqx {

    /* renamed from: cm, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jpo.jd f17469cm;

    /* renamed from: jd, reason: collision with root package name */
    private final jpo f17470jd;

    /* renamed from: jj, reason: collision with root package name */
    private final boolean f17471jj;
    private final String jpo;
    private final com.bytedance.adsdk.jd.wqx.jpo.jd my;
    private final com.bytedance.adsdk.jd.wqx.jpo.jd wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public enum jpo {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static jpo jpo(int i10) {
            if (i10 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i10 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i10)));
        }
    }

    public jr(String str, jpo jpoVar, com.bytedance.adsdk.jd.wqx.jpo.jd jdVar, com.bytedance.adsdk.jd.wqx.jpo.jd jdVar2, com.bytedance.adsdk.jd.wqx.jpo.jd jdVar3, boolean z10) {
        this.jpo = str;
        this.f17470jd = jpoVar;
        this.wqx = jdVar;
        this.f17469cm = jdVar2;
        this.my = jdVar3;
        this.f17471jj = z10;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.jd cm() {
        return this.wqx;
    }

    public jpo jd() {
        return this.f17470jd;
    }

    public boolean jj() {
        return this.f17471jj;
    }

    public String jpo() {
        return this.jpo;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.jd my() {
        return this.my;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.jd wqx() {
        return this.f17469cm;
    }

    @Override // com.bytedance.adsdk.jd.wqx.jd.wqx
    public com.bytedance.adsdk.jd.jpo.jpo.wqx jpo(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.qk qkVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar) {
        return new rq(jpoVar, this);
    }

    public String toString() {
        return "Trim Path: {start: " + this.wqx + ", end: " + this.f17469cm + ", offset: " + this.my + OIPXcgrVyyxoLF.kpMmGS;
    }
}
