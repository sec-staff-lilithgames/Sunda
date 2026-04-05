package com.bytedance.adsdk.jd.jpo.jpo;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.jd.jpo.jd.jpo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk implements jpo.InterfaceC0058jpo, ju, my {

    /* renamed from: au, reason: collision with root package name */
    private com.bytedance.adsdk.jd.jpo.jd.wqx f17365au;

    /* renamed from: cm, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.wqx.jpo f17366cm;

    /* renamed from: if, reason: not valid java name */
    private com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> f8if;

    /* renamed from: jd, reason: collision with root package name */
    private final Path f17367jd;

    /* renamed from: jj, reason: collision with root package name */
    private final boolean f17368jj;
    float jpo;

    /* renamed from: ju, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.zz f17369ju;
    private final String my;

    /* renamed from: qk, reason: collision with root package name */
    private final List<au> f17370qk;
    private final Paint wqx;
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> xyk;

    /* renamed from: yd, reason: collision with root package name */
    private com.bytedance.adsdk.jd.jpo.jd.jpo<ColorFilter, ColorFilter> f17371yd;
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> zz;

    public qk(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar, com.bytedance.adsdk.jd.wqx.jd.prr prrVar) {
        Path path = new Path();
        this.f17367jd = path;
        this.wqx = new com.bytedance.adsdk.jd.jpo.jpo(1);
        this.f17370qk = new ArrayList();
        this.f17366cm = jpoVar;
        this.my = prrVar.jpo();
        this.f17368jj = prrVar.my();
        this.f17369ju = zzVar;
        if (jpoVar.yd() != null) {
            com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVarJpo = jpoVar.yd().jpo().jpo();
            this.f8if = jpoVarJpo;
            jpoVarJpo.jpo(this);
            jpoVar.jpo(this.f8if);
        }
        if (jpoVar.ju() != null) {
            this.f17365au = new com.bytedance.adsdk.jd.jpo.jd.wqx(this, jpoVar, jpoVar.ju());
        }
        if (prrVar.jd() == null || prrVar.wqx() == null) {
            this.xyk = null;
            this.zz = null;
            return;
        }
        path.setFillType(prrVar.cm());
        com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> jpoVarJpo2 = prrVar.jd().jpo();
        this.xyk = jpoVarJpo2;
        jpoVarJpo2.jpo(this);
        jpoVar.jpo(jpoVarJpo2);
        com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> jpoVarJpo3 = prrVar.wqx().jpo();
        this.zz = jpoVarJpo3;
        jpoVarJpo3.jpo(this);
        jpoVar.jpo(jpoVarJpo3);
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.InterfaceC0058jpo
    public void jpo() {
        this.f17369ju.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.wqx
    public void jpo(List<wqx> list, List<wqx> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            wqx wqxVar = list2.get(i10);
            if (wqxVar instanceof au) {
                this.f17370qk.add((au) wqxVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.my
    public void jpo(Canvas canvas, Matrix matrix, int i10) {
        if (this.f17368jj) {
            return;
        }
        com.bytedance.adsdk.jd.my.jpo("FillContent#draw");
        this.wqx.setColor((com.bytedance.adsdk.jd.jj.my.jpo((int) ((((i10 / 255.0f) * this.zz.qk().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((com.bytedance.adsdk.jd.jpo.jd.jd) this.xyk).zz() & 16777215));
        com.bytedance.adsdk.jd.jpo.jd.jpo<ColorFilter, ColorFilter> jpoVar = this.f17371yd;
        if (jpoVar != null) {
            this.wqx.setColorFilter(jpoVar.qk());
        }
        com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVar2 = this.f8if;
        if (jpoVar2 != null) {
            float fFloatValue = jpoVar2.qk().floatValue();
            if (fFloatValue == 0.0f) {
                this.wqx.setMaskFilter(null);
            } else if (fFloatValue != this.jpo) {
                this.wqx.setMaskFilter(this.f17366cm.jd(fFloatValue));
            }
            this.jpo = fFloatValue;
        }
        com.bytedance.adsdk.jd.jpo.jd.wqx wqxVar = this.f17365au;
        if (wqxVar != null) {
            wqxVar.jpo(this.wqx);
        }
        this.f17367jd.reset();
        for (int i11 = 0; i11 < this.f17370qk.size(); i11++) {
            this.f17367jd.addPath(this.f17370qk.get(i11).cm(), matrix);
        }
        canvas.drawPath(this.f17367jd, this.wqx);
        com.bytedance.adsdk.jd.my.jd("FillContent#draw");
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.my
    public void jpo(RectF rectF, Matrix matrix, boolean z10) {
        this.f17367jd.reset();
        for (int i10 = 0; i10 < this.f17370qk.size(); i10++) {
            this.f17367jd.addPath(this.f17370qk.get(i10).cm(), matrix);
        }
        this.f17367jd.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
}
