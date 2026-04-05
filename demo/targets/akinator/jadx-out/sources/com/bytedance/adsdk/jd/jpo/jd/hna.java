package com.bytedance.adsdk.jd.jpo.jd;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.bytedance.adsdk.jd.jpo.jd.jpo;
import com.bytedance.adsdk.jd.wqx.jpo.Cif;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hna {

    /* renamed from: au, reason: collision with root package name */
    private jpo<?, Float> f17288au;

    /* renamed from: cm, reason: collision with root package name */
    private final Matrix f17289cm;

    /* renamed from: if, reason: not valid java name */
    private cm f5if;

    /* renamed from: jd, reason: collision with root package name */
    private final Matrix f17290jd;

    /* renamed from: jj, reason: collision with root package name */
    private jpo<PointF, PointF> f17291jj;
    private final Matrix jpo = new Matrix();

    /* renamed from: ju, reason: collision with root package name */
    private cm f17292ju;
    private final float[] my;
    private jpo<?, Float> oya;

    /* renamed from: qk, reason: collision with root package name */
    private jpo<?, PointF> f17293qk;
    private final Matrix wqx;
    private jpo<com.bytedance.adsdk.jd.qk.wqx, com.bytedance.adsdk.jd.qk.wqx> xyk;

    /* renamed from: yd, reason: collision with root package name */
    private jpo<Integer, Integer> f17294yd;
    private jpo<Float, Float> zz;

    public hna(Cif cif) {
        this.f17291jj = cif.jpo() == null ? null : cif.jpo().jpo();
        this.f17293qk = cif.jd() == null ? null : cif.jd().jpo();
        this.xyk = cif.wqx() == null ? null : cif.wqx().jpo();
        this.zz = cif.cm() == null ? null : cif.cm().jpo();
        cm cmVar = cif.xyk() == null ? null : (cm) cif.xyk().jpo();
        this.f17292ju = cmVar;
        if (cmVar != null) {
            this.f17290jd = new Matrix();
            this.wqx = new Matrix();
            this.f17289cm = new Matrix();
            this.my = new float[9];
        } else {
            this.f17290jd = null;
            this.wqx = null;
            this.f17289cm = null;
            this.my = null;
        }
        this.f5if = cif.zz() == null ? null : (cm) cif.zz().jpo();
        if (cif.my() != null) {
            this.f17294yd = cif.my().jpo();
        }
        if (cif.jj() != null) {
            this.f17288au = cif.jj().jpo();
        } else {
            this.f17288au = null;
        }
        if (cif.qk() != null) {
            this.oya = cif.qk().jpo();
        } else {
            this.oya = null;
        }
    }

    private void my() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.my[i10] = 0.0f;
        }
    }

    public Matrix cm() {
        PointF pointFQk;
        PointF pointFQk2;
        this.jpo.reset();
        jpo<?, PointF> jpoVar = this.f17293qk;
        if (jpoVar != null && (pointFQk2 = jpoVar.qk()) != null) {
            float f10 = pointFQk2.x;
            if (f10 != 0.0f || pointFQk2.y != 0.0f) {
                this.jpo.preTranslate(f10, pointFQk2.y);
            }
        }
        jpo<Float, Float> jpoVar2 = this.zz;
        if (jpoVar2 != null) {
            float fFloatValue = jpoVar2 instanceof sq ? jpoVar2.qk().floatValue() : ((cm) jpoVar2).zz();
            if (fFloatValue != 0.0f) {
                this.jpo.preRotate(fFloatValue);
            }
        }
        if (this.f17292ju != null) {
            float fCos = this.f5if == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.zz()) + 90.0f));
            float fSin = this.f5if == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.zz()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r0.zz()));
            my();
            float[] fArr = this.my;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f11 = -fSin;
            fArr[3] = f11;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f17290jd.setValues(fArr);
            my();
            float[] fArr2 = this.my;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.wqx.setValues(fArr2);
            my();
            float[] fArr3 = this.my;
            fArr3[0] = fCos;
            fArr3[1] = f11;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f17289cm.setValues(fArr3);
            this.wqx.preConcat(this.f17290jd);
            this.f17289cm.preConcat(this.wqx);
            this.jpo.preConcat(this.f17289cm);
        }
        jpo<com.bytedance.adsdk.jd.qk.wqx, com.bytedance.adsdk.jd.qk.wqx> jpoVar3 = this.xyk;
        if (jpoVar3 != null) {
            com.bytedance.adsdk.jd.qk.wqx wqxVarQk = jpoVar3.qk();
            if (wqxVarQk.jpo() != 1.0f || wqxVarQk.jd() != 1.0f) {
                this.jpo.preScale(wqxVarQk.jpo(), wqxVarQk.jd());
            }
        }
        jpo<PointF, PointF> jpoVar4 = this.f17291jj;
        if (jpoVar4 != null && (((pointFQk = jpoVar4.qk()) != null && pointFQk.x != 0.0f) || pointFQk.y != 0.0f)) {
            this.jpo.preTranslate(-pointFQk.x, -pointFQk.y);
        }
        return this.jpo;
    }

    public jpo<?, Float> jd() {
        return this.f17288au;
    }

    public void jpo(com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar) {
        jpoVar.jpo(this.f17294yd);
        jpoVar.jpo(this.f17288au);
        jpoVar.jpo(this.oya);
        jpoVar.jpo(this.f17291jj);
        jpoVar.jpo(this.f17293qk);
        jpoVar.jpo(this.xyk);
        jpoVar.jpo(this.zz);
        jpoVar.jpo(this.f17292ju);
        jpoVar.jpo(this.f5if);
    }

    public jpo<?, Float> wqx() {
        return this.oya;
    }

    public Matrix jd(float f10) {
        jpo<?, PointF> jpoVar = this.f17293qk;
        PointF pointFQk = jpoVar == null ? null : jpoVar.qk();
        jpo<com.bytedance.adsdk.jd.qk.wqx, com.bytedance.adsdk.jd.qk.wqx> jpoVar2 = this.xyk;
        com.bytedance.adsdk.jd.qk.wqx wqxVarQk = jpoVar2 == null ? null : jpoVar2.qk();
        this.jpo.reset();
        if (pointFQk != null) {
            this.jpo.preTranslate(pointFQk.x * f10, pointFQk.y * f10);
        }
        if (wqxVarQk != null) {
            double d10 = f10;
            this.jpo.preScale((float) Math.pow(wqxVarQk.jpo(), d10), (float) Math.pow(wqxVarQk.jd(), d10));
        }
        jpo<Float, Float> jpoVar3 = this.zz;
        if (jpoVar3 != null) {
            float fFloatValue = jpoVar3.qk().floatValue();
            jpo<PointF, PointF> jpoVar4 = this.f17291jj;
            PointF pointFQk2 = jpoVar4 != null ? jpoVar4.qk() : null;
            this.jpo.preRotate(fFloatValue * f10, pointFQk2 == null ? 0.0f : pointFQk2.x, pointFQk2 != null ? pointFQk2.y : 0.0f);
        }
        return this.jpo;
    }

    public void jpo(jpo.InterfaceC0058jpo interfaceC0058jpo) {
        jpo<Integer, Integer> jpoVar = this.f17294yd;
        if (jpoVar != null) {
            jpoVar.jpo(interfaceC0058jpo);
        }
        jpo<?, Float> jpoVar2 = this.f17288au;
        if (jpoVar2 != null) {
            jpoVar2.jpo(interfaceC0058jpo);
        }
        jpo<?, Float> jpoVar3 = this.oya;
        if (jpoVar3 != null) {
            jpoVar3.jpo(interfaceC0058jpo);
        }
        jpo<PointF, PointF> jpoVar4 = this.f17291jj;
        if (jpoVar4 != null) {
            jpoVar4.jpo(interfaceC0058jpo);
        }
        jpo<?, PointF> jpoVar5 = this.f17293qk;
        if (jpoVar5 != null) {
            jpoVar5.jpo(interfaceC0058jpo);
        }
        jpo<com.bytedance.adsdk.jd.qk.wqx, com.bytedance.adsdk.jd.qk.wqx> jpoVar6 = this.xyk;
        if (jpoVar6 != null) {
            jpoVar6.jpo(interfaceC0058jpo);
        }
        jpo<Float, Float> jpoVar7 = this.zz;
        if (jpoVar7 != null) {
            jpoVar7.jpo(interfaceC0058jpo);
        }
        cm cmVar = this.f17292ju;
        if (cmVar != null) {
            cmVar.jpo(interfaceC0058jpo);
        }
        cm cmVar2 = this.f5if;
        if (cmVar2 != null) {
            cmVar2.jpo(interfaceC0058jpo);
        }
    }

    public void jpo(float f10) {
        jpo<Integer, Integer> jpoVar = this.f17294yd;
        if (jpoVar != null) {
            jpoVar.jpo(f10);
        }
        jpo<?, Float> jpoVar2 = this.f17288au;
        if (jpoVar2 != null) {
            jpoVar2.jpo(f10);
        }
        jpo<?, Float> jpoVar3 = this.oya;
        if (jpoVar3 != null) {
            jpoVar3.jpo(f10);
        }
        jpo<PointF, PointF> jpoVar4 = this.f17291jj;
        if (jpoVar4 != null) {
            jpoVar4.jpo(f10);
        }
        jpo<?, PointF> jpoVar5 = this.f17293qk;
        if (jpoVar5 != null) {
            jpoVar5.jpo(f10);
        }
        jpo<com.bytedance.adsdk.jd.qk.wqx, com.bytedance.adsdk.jd.qk.wqx> jpoVar6 = this.xyk;
        if (jpoVar6 != null) {
            jpoVar6.jpo(f10);
        }
        jpo<Float, Float> jpoVar7 = this.zz;
        if (jpoVar7 != null) {
            jpoVar7.jpo(f10);
        }
        cm cmVar = this.f17292ju;
        if (cmVar != null) {
            cmVar.jpo(f10);
        }
        cm cmVar2 = this.f5if;
        if (cmVar2 != null) {
            cmVar2.jpo(f10);
        }
    }

    public jpo<?, Integer> jpo() {
        return this.f17294yd;
    }
}
