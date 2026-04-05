package com.bytedance.adsdk.jd.jpo.jpo;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class nmd extends jpo {

    /* renamed from: cm, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.wqx.jpo f17345cm;

    /* renamed from: jj, reason: collision with root package name */
    private final boolean f17346jj;
    private final String my;

    /* renamed from: qk, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> f17347qk;
    private com.bytedance.adsdk.jd.jpo.jd.jpo<ColorFilter, ColorFilter> xyk;

    public nmd(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar, com.bytedance.adsdk.jd.wqx.jd.opi opiVar) {
        super(zzVar, jpoVar, opiVar.qk().jpo(), opiVar.xyk().jpo(), opiVar.zz(), opiVar.wqx(), opiVar.cm(), opiVar.my(), opiVar.jj());
        this.f17345cm = jpoVar;
        this.my = opiVar.jpo();
        this.f17346jj = opiVar.yd();
        com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> jpoVarJpo = opiVar.jd().jpo();
        this.f17347qk = jpoVarJpo;
        jpoVarJpo.jpo(this);
        jpoVar.jpo(jpoVarJpo);
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.jpo, com.bytedance.adsdk.jd.jpo.jpo.my
    public void jpo(Canvas canvas, Matrix matrix, int i10) {
        if (this.f17346jj) {
            return;
        }
        this.f17338jd.setColor(((com.bytedance.adsdk.jd.jpo.jd.jd) this.f17347qk).zz());
        com.bytedance.adsdk.jd.jpo.jd.jpo<ColorFilter, ColorFilter> jpoVar = this.xyk;
        if (jpoVar != null) {
            this.f17338jd.setColorFilter(jpoVar.qk());
        }
        super.jpo(canvas, matrix, i10);
    }
}
