package com.bytedance.adsdk.jd.jpo.jpo;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import com.bytedance.adsdk.jd.jpo.jd.jpo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk implements jpo.InterfaceC0058jpo, ju, my {

    /* renamed from: au, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> f17378au;

    /* renamed from: cm, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.wqx.jpo f17379cm;
    private com.bytedance.adsdk.jd.jpo.jd.jpo<ColorFilter, ColorFilter> hna;

    /* renamed from: if, reason: not valid java name */
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<com.bytedance.adsdk.jd.wqx.jd.cm, com.bytedance.adsdk.jd.wqx.jd.cm> f9if;

    /* renamed from: jd, reason: collision with root package name */
    private final String f17380jd;
    float jpo;

    /* renamed from: jr, reason: collision with root package name */
    private final int f17382jr;

    /* renamed from: ju, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jd.qk f17383ju;
    private com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> nmd;
    private final com.bytedance.adsdk.jd.zz opi;
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<PointF, PointF> oya;
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<PointF, PointF> prr;

    /* renamed from: qk, reason: collision with root package name */
    private final Path f17384qk;

    /* renamed from: rq, reason: collision with root package name */
    private com.bytedance.adsdk.jd.jpo.jd.wqx f17385rq;

    /* renamed from: sq, reason: collision with root package name */
    private com.bytedance.adsdk.jd.jpo.jd.sq f17386sq;
    private final boolean wqx;
    private final Paint xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final List<au> f17387yd;
    private final RectF zz;
    private final LongSparseArray<LinearGradient> my = new LongSparseArray<>();

    /* renamed from: jj, reason: collision with root package name */
    private final LongSparseArray<RadialGradient> f17381jj = new LongSparseArray<>();

    public xyk(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.qk qkVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar, com.bytedance.adsdk.jd.wqx.jd.my myVar) {
        Path path = new Path();
        this.f17384qk = path;
        this.xyk = new com.bytedance.adsdk.jd.jpo.jpo(1);
        this.zz = new RectF();
        this.f17387yd = new ArrayList();
        this.jpo = 0.0f;
        this.f17379cm = jpoVar;
        this.f17380jd = myVar.jpo();
        this.wqx = myVar.xyk();
        this.opi = zzVar;
        this.f17383ju = myVar.jd();
        path.setFillType(myVar.wqx());
        this.f17382jr = (int) (qkVar.my() / 32.0f);
        com.bytedance.adsdk.jd.jpo.jd.jpo<com.bytedance.adsdk.jd.wqx.jd.cm, com.bytedance.adsdk.jd.wqx.jd.cm> jpoVarJpo = myVar.cm().jpo();
        this.f9if = jpoVarJpo;
        jpoVarJpo.jpo(this);
        jpoVar.jpo(jpoVarJpo);
        com.bytedance.adsdk.jd.jpo.jd.jpo<Integer, Integer> jpoVarJpo2 = myVar.my().jpo();
        this.f17378au = jpoVarJpo2;
        jpoVarJpo2.jpo(this);
        jpoVar.jpo(jpoVarJpo2);
        com.bytedance.adsdk.jd.jpo.jd.jpo<PointF, PointF> jpoVarJpo3 = myVar.jj().jpo();
        this.oya = jpoVarJpo3;
        jpoVarJpo3.jpo(this);
        jpoVar.jpo(jpoVarJpo3);
        com.bytedance.adsdk.jd.jpo.jd.jpo<PointF, PointF> jpoVarJpo4 = myVar.qk().jpo();
        this.prr = jpoVarJpo4;
        jpoVarJpo4.jpo(this);
        jpoVar.jpo(jpoVarJpo4);
        if (jpoVar.yd() != null) {
            com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVarJpo5 = jpoVar.yd().jpo().jpo();
            this.nmd = jpoVarJpo5;
            jpoVarJpo5.jpo(this);
            jpoVar.jpo(this.nmd);
        }
        if (jpoVar.ju() != null) {
            this.f17385rq = new com.bytedance.adsdk.jd.jpo.jd.wqx(this, jpoVar, jpoVar.ju());
        }
    }

    private int cm() {
        int iRound = Math.round(this.oya.xyk() * this.f17382jr);
        int iRound2 = Math.round(this.prr.xyk() * this.f17382jr);
        int iRound3 = Math.round(this.f9if.xyk() * this.f17382jr);
        int i10 = iRound != 0 ? iRound * IronSourceError.ERROR_NON_EXISTENT_INSTANCE : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    private LinearGradient jd() {
        long jCm = cm();
        LinearGradient linearGradient = this.my.get(jCm);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFQk = this.oya.qk();
        PointF pointFQk2 = this.prr.qk();
        com.bytedance.adsdk.jd.wqx.jd.cm cmVarQk = this.f9if.qk();
        LinearGradient linearGradient2 = new LinearGradient(pointFQk.x, pointFQk.y, pointFQk2.x, pointFQk2.y, jpo(cmVarQk.jd()), cmVarQk.jpo(), Shader.TileMode.CLAMP);
        this.my.put(jCm, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient wqx() {
        long jCm = cm();
        RadialGradient radialGradient = this.f17381jj.get(jCm);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFQk = this.oya.qk();
        PointF pointFQk2 = this.prr.qk();
        com.bytedance.adsdk.jd.wqx.jd.cm cmVarQk = this.f9if.qk();
        int[] iArrJpo = jpo(cmVarQk.jd());
        float[] fArrJpo = cmVarQk.jpo();
        float f10 = pointFQk.x;
        float f11 = pointFQk.y;
        float fHypot = (float) Math.hypot(pointFQk2.x - f10, pointFQk2.y - f11);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f10, f11, fHypot, iArrJpo, fArrJpo, Shader.TileMode.CLAMP);
        this.f17381jj.put(jCm, radialGradient2);
        return radialGradient2;
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.InterfaceC0058jpo
    public void jpo() {
        this.opi.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.wqx
    public void jpo(List<wqx> list, List<wqx> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            wqx wqxVar = list2.get(i10);
            if (wqxVar instanceof au) {
                this.f17387yd.add((au) wqxVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.my
    public void jpo(Canvas canvas, Matrix matrix, int i10) {
        Shader shaderWqx;
        if (this.wqx) {
            return;
        }
        com.bytedance.adsdk.jd.my.jpo("GradientFillContent#draw");
        this.f17384qk.reset();
        for (int i11 = 0; i11 < this.f17387yd.size(); i11++) {
            this.f17384qk.addPath(this.f17387yd.get(i11).cm(), matrix);
        }
        this.f17384qk.computeBounds(this.zz, false);
        if (this.f17383ju == com.bytedance.adsdk.jd.wqx.jd.qk.LINEAR) {
            shaderWqx = jd();
        } else {
            shaderWqx = wqx();
        }
        shaderWqx.setLocalMatrix(matrix);
        this.xyk.setShader(shaderWqx);
        com.bytedance.adsdk.jd.jpo.jd.jpo<ColorFilter, ColorFilter> jpoVar = this.hna;
        if (jpoVar != null) {
            this.xyk.setColorFilter(jpoVar.qk());
        }
        com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVar2 = this.nmd;
        if (jpoVar2 != null) {
            float fFloatValue = jpoVar2.qk().floatValue();
            if (fFloatValue == 0.0f) {
                this.xyk.setMaskFilter(null);
            } else if (fFloatValue != this.jpo) {
                this.xyk.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.jpo = fFloatValue;
        }
        com.bytedance.adsdk.jd.jpo.jd.wqx wqxVar = this.f17385rq;
        if (wqxVar != null) {
            wqxVar.jpo(this.xyk);
        }
        this.xyk.setAlpha(com.bytedance.adsdk.jd.jj.my.jpo((int) ((((i10 / 255.0f) * this.f17378au.qk().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f17384qk, this.xyk);
        com.bytedance.adsdk.jd.my.jd("GradientFillContent#draw");
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.my
    public void jpo(RectF rectF, Matrix matrix, boolean z10) {
        this.f17384qk.reset();
        for (int i10 = 0; i10 < this.f17387yd.size(); i10++) {
            this.f17384qk.addPath(this.f17387yd.get(i10).cm(), matrix);
        }
        this.f17384qk.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    private int[] jpo(int[] iArr) {
        if (this.f17386sq == null) {
            return iArr;
        }
        throw null;
    }
}
