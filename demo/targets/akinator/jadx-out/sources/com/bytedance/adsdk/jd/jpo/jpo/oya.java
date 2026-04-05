package com.bytedance.adsdk.jd.jpo.jpo;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.jd.jpo.jd.jpo;
import com.bytedance.adsdk.jd.wqx.jd.jr;
import com.bytedance.adsdk.jd.wqx.jd.yd;
import j1.o2;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class oya implements jpo.InterfaceC0058jpo, au, ju {

    /* renamed from: au, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<?, Float> f17352au;

    /* renamed from: cm, reason: collision with root package name */
    private final yd.jpo f17353cm;

    /* renamed from: if, reason: not valid java name */
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<?, Float> f7if;

    /* renamed from: jd, reason: collision with root package name */
    private final String f17354jd;

    /* renamed from: jj, reason: collision with root package name */
    private final boolean f17355jj;

    /* renamed from: ju, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<?, Float> f17356ju;
    private final boolean my;
    private boolean prr;

    /* renamed from: qk, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<?, Float> f17357qk;
    private final com.bytedance.adsdk.jd.zz wqx;
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<?, PointF> xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<?, Float> f17358yd;
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<?, Float> zz;
    private final Path jpo = new Path();
    private final jd oya = new jd();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.jd.jpo.jpo.oya$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] jpo;

        static {
            int[] iArr = new int[yd.jpo.values().length];
            jpo = iArr;
            try {
                iArr[yd.jpo.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                jpo[yd.jpo.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public oya(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar, com.bytedance.adsdk.jd.wqx.jd.yd ydVar) {
        this.wqx = zzVar;
        this.f17354jd = ydVar.jpo();
        yd.jpo jpoVarJd = ydVar.jd();
        this.f17353cm = jpoVarJd;
        this.my = ydVar.yd();
        this.f17355jj = ydVar.ju();
        com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVarJpo = ydVar.wqx().jpo();
        this.f17357qk = jpoVarJpo;
        com.bytedance.adsdk.jd.jpo.jd.jpo<PointF, PointF> jpoVarJpo2 = ydVar.cm().jpo();
        this.xyk = jpoVarJpo2;
        com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVarJpo3 = ydVar.my().jpo();
        this.zz = jpoVarJpo3;
        com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVarJpo4 = ydVar.qk().jpo();
        this.f17356ju = jpoVarJpo4;
        com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVarJpo5 = ydVar.zz().jpo();
        this.f17352au = jpoVarJpo5;
        yd.jpo jpoVar2 = yd.jpo.STAR;
        if (jpoVarJd == jpoVar2) {
            this.f17358yd = ydVar.jj().jpo();
            this.f7if = ydVar.xyk().jpo();
        } else {
            this.f17358yd = null;
            this.f7if = null;
        }
        jpoVar.jpo(jpoVarJpo);
        jpoVar.jpo(jpoVarJpo2);
        jpoVar.jpo(jpoVarJpo3);
        jpoVar.jpo(jpoVarJpo4);
        jpoVar.jpo(jpoVarJpo5);
        if (jpoVarJd == jpoVar2) {
            jpoVar.jpo(this.f17358yd);
            jpoVar.jpo(this.f7if);
        }
        jpoVarJpo.jpo(this);
        jpoVarJpo2.jpo(this);
        jpoVarJpo3.jpo(this);
        jpoVarJpo4.jpo(this);
        jpoVarJpo5.jpo(this);
        if (jpoVarJd == jpoVar2) {
            this.f17358yd.jpo(this);
            this.f7if.jpo(this);
        }
    }

    private void jd() {
        this.prr = false;
        this.wqx.invalidateSelf();
    }

    private void my() {
        double d10;
        int iFloor = (int) Math.floor(this.f17357qk.qk().floatValue());
        double radians = Math.toRadians((this.zz == null ? 0.0d : r2.qk().floatValue()) - 90.0d);
        double d11 = iFloor;
        float fFloatValue = this.f17352au.qk().floatValue() / 100.0f;
        float fFloatValue2 = this.f17356ju.qk().floatValue();
        double d12 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d12);
        float fSin = (float) (Math.sin(radians) * d12);
        this.jpo.moveTo(fCos, fSin);
        double d13 = (float) (6.283185307179586d / d11);
        double d14 = radians + d13;
        double dCeil = Math.ceil(d11);
        int i10 = 0;
        while (i10 < dCeil) {
            float fCos2 = (float) (Math.cos(d14) * d12);
            int i11 = i10;
            double d15 = d14;
            float fSin2 = (float) (Math.sin(d14) * d12);
            if (fFloatValue != 0.0f) {
                d10 = dCeil;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan22 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f10 = fFloatValue2 * fFloatValue * 0.25f;
                this.jpo.cubicTo(fCos - (f10 * fCos3), fSin - (f10 * fSin3), fCos2 + (((float) Math.cos(dAtan22)) * f10), fSin2 + (f10 * ((float) Math.sin(dAtan22))), fCos2, fSin2);
                fCos = fCos2;
                fSin = fSin2;
            } else {
                fSin = fSin2;
                d10 = dCeil;
                fCos = fCos2;
                this.jpo.lineTo(fCos, fSin);
            }
            d14 = d15 + d13;
            i10 = i11 + 1;
            dCeil = d10;
        }
        PointF pointFQk = this.xyk.qk();
        this.jpo.offset(pointFQk.x, pointFQk.y);
        this.jpo.close();
    }

    private void wqx() {
        float f10;
        float f11;
        int i10;
        float fCos;
        float fSin;
        float f12;
        float f13;
        double d10;
        float fA;
        int i11;
        float f14;
        double d11;
        float f15;
        float f16;
        double d12;
        float f17;
        float f18;
        float fFloatValue = this.f17357qk.qk().floatValue();
        double radians = Math.toRadians((this.zz == null ? 0.0d : r2.qk().floatValue()) - 90.0d);
        double d13 = fFloatValue;
        float f19 = (float) (6.283185307179586d / d13);
        if (this.f17355jj) {
            f19 *= -1.0f;
        }
        float f20 = f19 / 2.0f;
        float f21 = fFloatValue - ((int) fFloatValue);
        int i12 = (f21 > 0.0f ? 1 : (f21 == 0.0f ? 0 : -1));
        if (i12 != 0) {
            radians += (1.0f - f21) * f20;
        }
        float fFloatValue2 = this.f17356ju.qk().floatValue();
        float fFloatValue3 = this.f17358yd.qk().floatValue();
        com.bytedance.adsdk.jd.jpo.jd.jpo<?, Float> jpoVar = this.f7if;
        float fFloatValue4 = jpoVar != null ? jpoVar.qk().floatValue() / 100.0f : 0.0f;
        com.bytedance.adsdk.jd.jpo.jd.jpo<?, Float> jpoVar2 = this.f17352au;
        float fFloatValue5 = jpoVar2 != null ? jpoVar2.qk().floatValue() / 100.0f : 0.0f;
        if (i12 != 0) {
            fA = o2.a(fFloatValue2, fFloatValue3, f21, fFloatValue3);
            f11 = 0.0f;
            i10 = i12;
            double d14 = fA;
            f10 = 2.0f;
            float fCos2 = (float) (Math.cos(radians) * d14);
            fSin = (float) (Math.sin(radians) * d14);
            this.jpo.moveTo(fCos2, fSin);
            d10 = radians + ((f19 * f21) / 2.0f);
            f12 = f21;
            fCos = fCos2;
            f13 = f20;
        } else {
            f10 = 2.0f;
            f11 = 0.0f;
            i10 = i12;
            double d15 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d15);
            fSin = (float) (d15 * Math.sin(radians));
            this.jpo.moveTo(fCos, fSin);
            f12 = f21;
            f13 = f20;
            d10 = radians + f13;
            fA = 0.0f;
        }
        double dCeil = Math.ceil(d13) * 2.0d;
        int i13 = 0;
        boolean z10 = false;
        double d16 = d10;
        float f22 = fSin;
        float f23 = fCos;
        double d17 = d16;
        while (true) {
            double d18 = i13;
            if (d18 >= dCeil) {
                PointF pointFQk = this.xyk.qk();
                this.jpo.offset(pointFQk.x, pointFQk.y);
                this.jpo.close();
                return;
            }
            float f24 = z10 ? fFloatValue2 : fFloatValue3;
            if (fA == f11 || d18 != dCeil - 2.0d) {
                i11 = i13;
                f14 = f13;
            } else {
                i11 = i13;
                f14 = (f19 * f12) / f10;
            }
            if (fA == f11 || d18 != dCeil - 1.0d) {
                d11 = d18;
                f15 = f24;
            } else {
                d11 = d18;
                f15 = fA;
            }
            double d19 = f15;
            float fCos3 = (float) (Math.cos(d17) * d19);
            float f25 = f19;
            float fSin2 = (float) (Math.sin(d17) * d19);
            if (fFloatValue4 == f11 && fFloatValue5 == f11) {
                this.jpo.lineTo(fCos3, fSin2);
                f18 = fCos3;
                f17 = fSin2;
                f16 = f13;
                d12 = d17;
            } else {
                f16 = f13;
                d12 = d17;
                double dAtan2 = (float) (Math.atan2(f22, f23) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                float f26 = f23;
                float f27 = f22;
                f17 = fSin2;
                double dAtan22 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan22);
                float fSin4 = (float) Math.sin(dAtan22);
                float f28 = z10 ? fFloatValue4 : fFloatValue5;
                float f29 = z10 ? fFloatValue5 : fFloatValue4;
                float f30 = (z10 ? fFloatValue3 : fFloatValue2) * f28 * 0.47829f;
                float f31 = fCos4 * f30;
                float f32 = f30 * fSin3;
                float f33 = (z10 ? fFloatValue2 : fFloatValue3) * f29 * 0.47829f;
                float f34 = fCos5 * f33;
                float f35 = f33 * fSin4;
                if (i10 != 0) {
                    if (i11 == 0) {
                        f31 *= f12;
                        f32 *= f12;
                    } else if (d11 == dCeil - 1.0d) {
                        f34 *= f12;
                        f35 *= f12;
                    }
                }
                f18 = fCos3;
                this.jpo.cubicTo(f26 - f31, f27 - f32, fCos3 + f34, f17 + f35, f18, f17);
            }
            d17 = d12 + f14;
            z10 = !z10;
            i13 = i11 + 1;
            f13 = f16;
            f23 = f18;
            f22 = f17;
            f19 = f25;
        }
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.au
    public Path cm() {
        if (this.prr) {
            return this.jpo;
        }
        this.jpo.reset();
        if (this.my) {
            this.prr = true;
            return this.jpo;
        }
        int i10 = AnonymousClass1.jpo[this.f17353cm.ordinal()];
        if (i10 == 1) {
            wqx();
        } else if (i10 == 2) {
            my();
        }
        this.jpo.close();
        this.oya.jpo(this.jpo);
        this.prr = true;
        return this.jpo;
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.InterfaceC0058jpo
    public void jpo() {
        jd();
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.wqx
    public void jpo(List<wqx> list, List<wqx> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            wqx wqxVar = list.get(i10);
            if (wqxVar instanceof rq) {
                rq rqVar = (rq) wqxVar;
                if (rqVar.jd() == jr.jpo.SIMULTANEOUSLY) {
                    this.oya.jpo(rqVar);
                    rqVar.jpo(this);
                }
            }
        }
    }
}
