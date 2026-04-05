package com.bytedance.adsdk.jd.wqx.wqx;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.adsdk.jd.wqx.jd.hna;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk extends jpo {

    /* renamed from: qk, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.jpo.jpo.cm f17570qk;
    private final jd xyk;

    public qk(com.bytedance.adsdk.jd.zz zzVar, my myVar, jd jdVar, com.bytedance.adsdk.jd.qk qkVar) {
        super(zzVar, myVar);
        this.xyk = jdVar;
        com.bytedance.adsdk.jd.jpo.jpo.cm cmVar = new com.bytedance.adsdk.jd.jpo.jpo.cm(zzVar, this, new hna("__container", myVar.oya(), false), qkVar);
        this.f17570qk = cmVar;
        List<com.bytedance.adsdk.jd.jpo.jpo.wqx> list = Collections.EMPTY_LIST;
        cmVar.jpo(list, list);
    }

    @Override // com.bytedance.adsdk.jd.wqx.wqx.jpo
    public void jd(Canvas canvas, Matrix matrix, int i10) {
        super.jd(canvas, matrix, i10);
        this.f17570qk.jpo(canvas, matrix, i10);
    }

    @Override // com.bytedance.adsdk.jd.wqx.wqx.jpo, com.bytedance.adsdk.jd.jpo.jpo.my
    public void jpo(RectF rectF, Matrix matrix, boolean z10) {
        super.jpo(rectF, matrix, z10);
        this.f17570qk.jpo(rectF, this.jpo, z10);
    }

    @Override // com.bytedance.adsdk.jd.wqx.wqx.jpo
    public com.bytedance.adsdk.jd.my.yd ju() {
        com.bytedance.adsdk.jd.my.yd ydVarJu = super.ju();
        return ydVarJu != null ? ydVarJu : this.xyk.ju();
    }

    @Override // com.bytedance.adsdk.jd.wqx.wqx.jpo
    public com.bytedance.adsdk.jd.wqx.jd.jpo yd() {
        com.bytedance.adsdk.jd.wqx.jd.jpo jpoVarYd = super.yd();
        return jpoVarYd != null ? jpoVarYd : this.xyk.yd();
    }
}
