package com.bytedance.adsdk.jd.jpo.jpo;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz extends jpo {

    /* renamed from: au, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<PointF, PointF> f17388au;

    /* renamed from: cm, reason: collision with root package name */
    private final String f17389cm;

    /* renamed from: if, reason: not valid java name */
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<PointF, PointF> f10if;

    /* renamed from: jj, reason: collision with root package name */
    private final LongSparseArray<LinearGradient> f17390jj;

    /* renamed from: ju, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<com.bytedance.adsdk.jd.wqx.jd.cm, com.bytedance.adsdk.jd.wqx.jd.cm> f17391ju;
    private final boolean my;
    private com.bytedance.adsdk.jd.jpo.jd.sq oya;

    /* renamed from: qk, reason: collision with root package name */
    private final LongSparseArray<RadialGradient> f17392qk;
    private final RectF xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final int f17393yd;
    private final com.bytedance.adsdk.jd.wqx.jd.qk zz;

    public zz(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar, com.bytedance.adsdk.jd.wqx.jd.jj jjVar) {
        super(zzVar, jpoVar, jjVar.xyk().jpo(), jjVar.zz().jpo(), jjVar.m381if(), jjVar.cm(), jjVar.qk(), jjVar.yd(), jjVar.ju());
        this.f17390jj = new LongSparseArray<>();
        this.f17392qk = new LongSparseArray<>();
        this.xyk = new RectF();
        this.f17389cm = jjVar.jpo();
        this.zz = jjVar.jd();
        this.my = jjVar.au();
        this.f17393yd = (int) (zzVar.se().my() / 32.0f);
        com.bytedance.adsdk.jd.jpo.jd.jpo<com.bytedance.adsdk.jd.wqx.jd.cm, com.bytedance.adsdk.jd.wqx.jd.cm> jpoVarJpo = jjVar.wqx().jpo();
        this.f17391ju = jpoVarJpo;
        jpoVarJpo.jpo(this);
        jpoVar.jpo(jpoVarJpo);
        com.bytedance.adsdk.jd.jpo.jd.jpo<PointF, PointF> jpoVarJpo2 = jjVar.my().jpo();
        this.f10if = jpoVarJpo2;
        jpoVarJpo2.jpo(this);
        jpoVar.jpo(jpoVarJpo2);
        com.bytedance.adsdk.jd.jpo.jd.jpo<PointF, PointF> jpoVarJpo3 = jjVar.jj().jpo();
        this.f17388au = jpoVarJpo3;
        jpoVarJpo3.jpo(this);
        jpoVar.jpo(jpoVarJpo3);
    }

    private int cm() {
        int iRound = Math.round(this.f10if.xyk() * this.f17393yd);
        int iRound2 = Math.round(this.f17388au.xyk() * this.f17393yd);
        int iRound3 = Math.round(this.f17391ju.xyk() * this.f17393yd);
        int i10 = iRound != 0 ? iRound * IronSourceError.ERROR_NON_EXISTENT_INSTANCE : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    private LinearGradient jd() {
        long jCm = cm();
        LinearGradient linearGradient = this.f17390jj.get(jCm);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointFQk = this.f10if.qk();
        PointF pointFQk2 = this.f17388au.qk();
        com.bytedance.adsdk.jd.wqx.jd.cm cmVarQk = this.f17391ju.qk();
        LinearGradient linearGradient2 = new LinearGradient(pointFQk.x, pointFQk.y, pointFQk2.x, pointFQk2.y, jpo(cmVarQk.jd()), cmVarQk.jpo(), Shader.TileMode.CLAMP);
        this.f17390jj.put(jCm, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient wqx() {
        long jCm = cm();
        RadialGradient radialGradient = this.f17392qk.get(jCm);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointFQk = this.f10if.qk();
        PointF pointFQk2 = this.f17388au.qk();
        com.bytedance.adsdk.jd.wqx.jd.cm cmVarQk = this.f17391ju.qk();
        int[] iArrJpo = jpo(cmVarQk.jd());
        float[] fArrJpo = cmVarQk.jpo();
        RadialGradient radialGradient2 = new RadialGradient(pointFQk.x, pointFQk.y, (float) Math.hypot(pointFQk2.x - r7, pointFQk2.y - r8), iArrJpo, fArrJpo, Shader.TileMode.CLAMP);
        this.f17392qk.put(jCm, radialGradient2);
        return radialGradient2;
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.jpo, com.bytedance.adsdk.jd.jpo.jpo.my
    public void jpo(Canvas canvas, Matrix matrix, int i10) {
        if (this.my) {
            return;
        }
        jpo(this.xyk, matrix, false);
        Shader shaderJd = this.zz == com.bytedance.adsdk.jd.wqx.jd.qk.LINEAR ? jd() : wqx();
        shaderJd.setLocalMatrix(matrix);
        this.f17338jd.setShader(shaderJd);
        super.jpo(canvas, matrix, i10);
    }

    private int[] jpo(int[] iArr) {
        if (this.oya == null) {
            return iArr;
        }
        throw null;
    }
}
