package k1;

import k1.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h {
    public static final double absRcpResponse(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(rcpResponse(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    public static final double absResponse(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(response(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    public static final g adapt(g gVar, d0 whitePoint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(whitePoint, "whitePoint");
        return adapt$default(gVar, whitePoint, null, 2, null);
    }

    public static /* synthetic */ g adapt$default(g gVar, d0 d0Var, d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = d.f70021b.getBradford();
        }
        return adapt(gVar, d0Var, dVar);
    }

    public static final float[] chromaticAdaptation(float[] matrix, float[] srcWhitePoint, float[] dstWhitePoint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(matrix, "matrix");
        kotlin.jvm.internal.e0.checkNotNullParameter(srcWhitePoint, "srcWhitePoint");
        kotlin.jvm.internal.e0.checkNotNullParameter(dstWhitePoint, "dstWhitePoint");
        float[] fArrMul3x3Float3 = mul3x3Float3(matrix, srcWhitePoint);
        float[] fArrMul3x3Float32 = mul3x3Float3(matrix, dstWhitePoint);
        return mul3x3(inverse3x3(matrix), mul3x3Diag(new float[]{fArrMul3x3Float32[0] / fArrMul3x3Float3[0], fArrMul3x3Float32[1] / fArrMul3x3Float3[1], fArrMul3x3Float32[2] / fArrMul3x3Float3[2]}, matrix));
    }

    public static final boolean compare(c0 a10, c0 c0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(a10, "a");
        return c0Var != null && Math.abs(a10.getA() - c0Var.getA()) < 0.001d && Math.abs(a10.getB() - c0Var.getB()) < 0.001d && Math.abs(a10.getC() - c0Var.getC()) < 0.001d && Math.abs(a10.getD() - c0Var.getD()) < 0.002d && Math.abs(a10.getE() - c0Var.getE()) < 0.001d && Math.abs(a10.getF() - c0Var.getF()) < 0.001d && Math.abs(a10.getGamma() - c0Var.getGamma()) < 0.001d;
    }

    /* renamed from: connect-YBCOT_4, reason: not valid java name */
    public static final m m5110connectYBCOT_4(g connect, g destination, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connect, "$this$connect");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        if (connect == destination) {
            return m.f70062g.identity$ui_graphics_release(connect);
        }
        long jM5109getModelxdoWZVw = connect.m5109getModelxdoWZVw();
        e eVar = f.f70028b;
        return (f.m5104equalsimpl0(jM5109getModelxdoWZVw, eVar.m5099getRgbxdoWZVw()) && f.m5104equalsimpl0(destination.m5109getModelxdoWZVw(), eVar.m5099getRgbxdoWZVw())) ? new m.b((z) connect, (z) destination, i10, null) : new m(connect, destination, i10, null);
    }

    /* renamed from: connect-YBCOT_4$default, reason: not valid java name */
    public static /* synthetic */ m m5111connectYBCOT_4$default(g gVar, g gVar2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar2 = k.f70039a.getSrgb();
        }
        if ((i11 & 2) != 0) {
            i10 = r.f70087b.m5115getPerceptualuksYyKA();
        }
        return m5110connectYBCOT_4(gVar, gVar2, i10);
    }

    public static final float[] inverse3x3(float[] m9) {
        kotlin.jvm.internal.e0.checkNotNullParameter(m9, "m");
        float f10 = m9[0];
        float f11 = m9[3];
        float f12 = m9[6];
        float f13 = m9[1];
        float f14 = m9[4];
        float f15 = m9[7];
        float f16 = m9[2];
        float f17 = m9[5];
        float f18 = m9[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f12 * f21) + (f11 * f20) + (f10 * f19);
        float[] fArr = new float[m9.length];
        fArr[0] = f19 / f22;
        fArr[1] = f20 / f22;
        fArr[2] = f21 / f22;
        fArr[3] = ((f12 * f17) - (f11 * f18)) / f22;
        fArr[4] = ((f18 * f10) - (f12 * f16)) / f22;
        fArr[5] = ((f16 * f11) - (f17 * f10)) / f22;
        fArr[6] = ((f11 * f15) - (f12 * f14)) / f22;
        fArr[7] = ((f12 * f13) - (f15 * f10)) / f22;
        fArr[8] = ((f10 * f14) - (f11 * f13)) / f22;
        return fArr;
    }

    public static final float[] mul3x3(float[] lhs, float[] rhs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(lhs, "lhs");
        kotlin.jvm.internal.e0.checkNotNullParameter(rhs, "rhs");
        float f10 = lhs[0];
        float f11 = rhs[0];
        float f12 = lhs[3];
        float f13 = rhs[1];
        float f14 = lhs[6];
        float f15 = rhs[2];
        float f16 = (f14 * f15) + (f12 * f13) + (f10 * f11);
        float f17 = lhs[1];
        float f18 = lhs[4];
        float f19 = lhs[7];
        float f20 = (f19 * f15) + (f18 * f13) + (f17 * f11);
        float f21 = lhs[2];
        float f22 = lhs[5];
        float f23 = lhs[8];
        float f24 = (f15 * f23) + (f13 * f22) + (f11 * f21);
        float f25 = rhs[3];
        float f26 = rhs[4];
        float f27 = rhs[5];
        float f28 = (f14 * f27) + (f12 * f26) + (f10 * f25);
        float f29 = (f19 * f27) + (f18 * f26) + (f17 * f25);
        float f30 = (f27 * f23) + (f26 * f22) + (f25 * f21);
        float f31 = rhs[6];
        float f32 = rhs[7];
        float f33 = rhs[8];
        return new float[]{f16, f20, f24, f28, f29, f30, (f14 * f33) + (f12 * f32) + (f10 * f31), (f19 * f33) + (f18 * f32) + (f17 * f31), (f23 * f33) + (f22 * f32) + (f21 * f31)};
    }

    public static final float[] mul3x3Diag(float[] lhs, float[] rhs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(lhs, "lhs");
        kotlin.jvm.internal.e0.checkNotNullParameter(rhs, "rhs");
        float f10 = lhs[0];
        float f11 = rhs[0] * f10;
        float f12 = lhs[1];
        float f13 = rhs[1] * f12;
        float f14 = lhs[2];
        return new float[]{f11, f13, rhs[2] * f14, rhs[3] * f10, rhs[4] * f12, rhs[5] * f14, f10 * rhs[6], f12 * rhs[7], f14 * rhs[8]};
    }

    public static final float[] mul3x3Float3(float[] lhs, float[] rhs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(lhs, "lhs");
        kotlin.jvm.internal.e0.checkNotNullParameter(rhs, "rhs");
        float f10 = rhs[0];
        float f11 = rhs[1];
        float f12 = rhs[2];
        rhs[0] = (lhs[6] * f12) + (lhs[3] * f11) + (lhs[0] * f10);
        rhs[1] = (lhs[7] * f12) + (lhs[4] * f11) + (lhs[1] * f10);
        rhs[2] = (lhs[8] * f12) + (lhs[5] * f11) + (lhs[2] * f10);
        return rhs;
    }

    public static final double rcpResponse(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 * d13 ? (Math.pow(d10, 1.0d / d15) - d12) / d11 : d10 / d13;
    }

    public static final double response(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d15) : d13 * d10;
    }

    public static final g adapt(g gVar, d0 whitePoint, d adaptation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(whitePoint, "whitePoint");
        kotlin.jvm.internal.e0.checkNotNullParameter(adaptation, "adaptation");
        if (f.m5104equalsimpl0(gVar.m5109getModelxdoWZVw(), f.f70028b.m5099getRgbxdoWZVw())) {
            z zVar = (z) gVar;
            if (!compare(zVar.getWhitePoint(), whitePoint)) {
                return new z(zVar, mul3x3(chromaticAdaptation(adaptation.getTransform$ui_graphics_release(), zVar.getWhitePoint().toXyz$ui_graphics_release(), whitePoint.toXyz$ui_graphics_release()), zVar.getTransform$ui_graphics_release()), whitePoint);
            }
        }
        return gVar;
    }

    public static final double rcpResponse(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 * d13 ? (Math.pow(d10 - d15, 1.0d / d17) - d12) / d11 : (d10 - d16) / d13;
    }

    public static final double response(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d17) + d15 : (d13 * d10) + d16;
    }

    public static final boolean compare(d0 a10, d0 b10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(a10, "a");
        kotlin.jvm.internal.e0.checkNotNullParameter(b10, "b");
        if (a10 == b10) {
            return true;
        }
        return Math.abs(a10.getX() - b10.getX()) < 0.001f && Math.abs(a10.getY() - b10.getY()) < 0.001f;
    }

    public static final boolean compare(float[] a10, float[] b10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(a10, "a");
        kotlin.jvm.internal.e0.checkNotNullParameter(b10, "b");
        if (a10 == b10) {
            return true;
        }
        int length = a10.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Float.compare(a10[i10], b10[i10]) != 0 && Math.abs(a10[i10] - b10[i10]) > 0.001f) {
                return false;
            }
        }
        return true;
    }
}
