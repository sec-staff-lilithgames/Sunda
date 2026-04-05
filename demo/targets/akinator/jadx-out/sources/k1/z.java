package k1;

import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import java.util.Arrays;
import kotlin.jvm.internal.c1;
import uu.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class z extends g {

    /* renamed from: q, reason: collision with root package name */
    public static final a f70100q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final y f70101r = y.f70099e;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f70102d;

    /* renamed from: e, reason: collision with root package name */
    public final float f70103e;

    /* renamed from: f, reason: collision with root package name */
    public final float f70104f;

    /* renamed from: g, reason: collision with root package name */
    public final c0 f70105g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f70106h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f70107i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f70108j;

    /* renamed from: k, reason: collision with root package name */
    public final kv.l f70109k;

    /* renamed from: l, reason: collision with root package name */
    public final b0 f70110l;

    /* renamed from: m, reason: collision with root package name */
    public final kv.l f70111m;

    /* renamed from: n, reason: collision with root package name */
    public final a0 f70112n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f70113o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f70114p;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public static float a(float[] fArr) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float fC = e3.g.c(f10, f15, (((f12 * f15) + ((f11 * f14) + (f10 * f13))) - (f13 * f14)) - (f11 * f12), 0.5f);
            return fC < 0.0f ? -fC : fC;
        }

        public static final d0 access$computeWhitePoint(a aVar, float[] fArr) {
            aVar.getClass();
            float[] fArrMul3x3Float3 = h.mul3x3Float3(fArr, new float[]{1.0f, 1.0f, 1.0f});
            float f10 = fArrMul3x3Float3[0];
            float f11 = fArrMul3x3Float3[1];
            float f12 = f10 + f11 + fArrMul3x3Float3[2];
            return new d0(f10 / f12, f11 / f12);
        }

        public static final float[] access$computeXYZMatrix(a aVar, float[] fArr, d0 d0Var) {
            aVar.getClass();
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float x10 = d0Var.getX();
            float y10 = d0Var.getY();
            float f16 = 1;
            float f17 = (f16 - f10) / f11;
            float f18 = (f16 - f12) / f13;
            float f19 = (f16 - f14) / f15;
            float f20 = (f16 - x10) / y10;
            float f21 = f10 / f11;
            float f22 = (f12 / f13) - f21;
            float f23 = (x10 / y10) - f21;
            float f24 = f18 - f17;
            float f25 = (f14 / f15) - f21;
            float f26 = (((f20 - f17) * f22) - (f23 * f24)) / (((f19 - f17) * f22) - (f24 * f25));
            float f27 = (f23 - (f25 * f26)) / f22;
            float f28 = (1.0f - f27) - f26;
            float f29 = f28 / f11;
            float f30 = f27 / f13;
            float f31 = f26 / f15;
            return new float[]{f29 * f10, f28, ((1.0f - f10) - f11) * f29, f30 * f12, f27, ((1.0f - f12) - f13) * f30, f31 * f14, f26, ((1.0f - f14) - f15) * f31};
        }

        public static final boolean access$isSrgb(a aVar, float[] fArr, d0 d0Var, kv.l lVar, kv.l lVar2, float f10, float f11, int i10) {
            aVar.getClass();
            if (i10 == 0) {
                return true;
            }
            k kVar = k.f70039a;
            if (!h.compare(fArr, kVar.getSrgbPrimaries$ui_graphics_release()) || !h.compare(d0Var, n.f70072a.getD65()) || f10 != 0.0f || f11 != 1.0f) {
                return false;
            }
            z srgb = kVar.getSrgb();
            for (double d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                if (!b(d10, lVar, srgb.getOetfOrig$ui_graphics_release()) || !b(d10, lVar2, srgb.getEotfOrig$ui_graphics_release())) {
                    return false;
                }
            }
            return true;
        }

        public static final boolean access$isWideGamut(a aVar, float[] fArr, float f10, float f11) {
            float f12;
            aVar.getClass();
            float fA = a(fArr);
            k kVar = k.f70039a;
            if (fA / a(kVar.getNtsc1953Primaries$ui_graphics_release()) > 0.9f) {
                float[] srgbPrimaries$ui_graphics_release = kVar.getSrgbPrimaries$ui_graphics_release();
                float f13 = fArr[0];
                float f14 = srgbPrimaries$ui_graphics_release[0];
                float f15 = fArr[1];
                float f16 = srgbPrimaries$ui_graphics_release[1];
                float f17 = fArr[2] - srgbPrimaries$ui_graphics_release[2];
                float f18 = fArr[3] - srgbPrimaries$ui_graphics_release[3];
                float f19 = fArr[4];
                float f20 = srgbPrimaries$ui_graphics_release[4];
                float f21 = fArr[5];
                float f22 = srgbPrimaries$ui_graphics_release[5];
                f12 = 0.0f;
                float[] fArr2 = {f13 - f14, f15 - f16, f17, f18, f19 - f20, f21 - f22};
                if (c(fArr2[0], fArr2[1], f14 - f20, f16 - f22) < 0.0f || c(srgbPrimaries$ui_graphics_release[0] - srgbPrimaries$ui_graphics_release[2], srgbPrimaries$ui_graphics_release[1] - srgbPrimaries$ui_graphics_release[3], fArr2[0], fArr2[1]) < 0.0f || c(fArr2[2], fArr2[3], srgbPrimaries$ui_graphics_release[2] - srgbPrimaries$ui_graphics_release[0], srgbPrimaries$ui_graphics_release[3] - srgbPrimaries$ui_graphics_release[1]) < 0.0f || c(srgbPrimaries$ui_graphics_release[2] - srgbPrimaries$ui_graphics_release[4], srgbPrimaries$ui_graphics_release[3] - srgbPrimaries$ui_graphics_release[5], fArr2[2], fArr2[3]) < 0.0f || c(fArr2[4], fArr2[5], srgbPrimaries$ui_graphics_release[4] - srgbPrimaries$ui_graphics_release[2], srgbPrimaries$ui_graphics_release[5] - srgbPrimaries$ui_graphics_release[3]) < 0.0f || c(srgbPrimaries$ui_graphics_release[4] - srgbPrimaries$ui_graphics_release[0], srgbPrimaries$ui_graphics_release[5] - srgbPrimaries$ui_graphics_release[1], fArr2[4], fArr2[5]) < 0.0f) {
                }
            }
            f12 = 0.0f;
            return f10 < f12 && f11 > 1.0f;
        }

        public static final float[] access$xyPrimaries(a aVar, float[] fArr) {
            aVar.getClass();
            float[] fArr2 = new float[6];
            if (fArr.length != 9) {
                f0.copyInto$default(fArr, fArr2, 0, 0, 6, 6, (Object) null);
                return fArr2;
            }
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = f10 + f11 + fArr[2];
            fArr2[0] = f10 / f12;
            fArr2[1] = f11 / f12;
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = f13 + f14 + fArr[5];
            fArr2[2] = f13 / f15;
            fArr2[3] = f14 / f15;
            float f16 = fArr[6];
            float f17 = fArr[7];
            float f18 = f16 + f17 + fArr[8];
            fArr2[4] = f16 / f18;
            fArr2[5] = f17 / f18;
            return fArr2;
        }

        public static boolean b(double d10, kv.l lVar, kv.l lVar2) {
            return Math.abs(((Number) lVar.invoke(Double.valueOf(d10))).doubleValue() - ((Number) lVar2.invoke(Double.valueOf(d10))).doubleValue()) <= 0.001d;
        }

        public static float c(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        public final float[] computePrimaries$ui_graphics_release(float[] toXYZ) {
            kotlin.jvm.internal.e0.checkNotNullParameter(toXYZ, "toXYZ");
            float[] fArrMul3x3Float3 = h.mul3x3Float3(toXYZ, new float[]{1.0f, 0.0f, 0.0f});
            float[] fArrMul3x3Float32 = h.mul3x3Float3(toXYZ, new float[]{0.0f, 1.0f, 0.0f});
            float[] fArrMul3x3Float33 = h.mul3x3Float3(toXYZ, new float[]{0.0f, 0.0f, 1.0f});
            float f10 = fArrMul3x3Float3[0];
            float f11 = fArrMul3x3Float3[1];
            float f12 = f10 + f11 + fArrMul3x3Float3[2];
            float f13 = fArrMul3x3Float32[0];
            float f14 = fArrMul3x3Float32[1];
            float f15 = f13 + f14 + fArrMul3x3Float32[2];
            float f16 = fArrMul3x3Float33[0];
            float f17 = fArrMul3x3Float33[1];
            float f18 = f16 + f17 + fArrMul3x3Float33[2];
            return new float[]{f10 / f12, f11 / f12, f13 / f15, f14 / f15, f16 / f18, f17 / f18};
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(String name, float[] primaries, d0 whitePoint, float[] fArr, kv.l oetf, kv.l eotf, float f10, float f11, c0 c0Var, int i10) {
        super(name, f.f70028b.m5099getRgbxdoWZVw(), i10, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(primaries, "primaries");
        kotlin.jvm.internal.e0.checkNotNullParameter(whitePoint, "whitePoint");
        kotlin.jvm.internal.e0.checkNotNullParameter(oetf, "oetf");
        kotlin.jvm.internal.e0.checkNotNullParameter(eotf, "eotf");
        this.f70102d = whitePoint;
        this.f70103e = f10;
        this.f70104f = f11;
        this.f70105g = c0Var;
        this.f70109k = oetf;
        this.f70110l = new b0(this);
        this.f70111m = eotf;
        this.f70112n = new a0(this);
        if (primaries.length != 6 && primaries.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 >= f11) {
            throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
        }
        a aVar = f70100q;
        float[] fArrAccess$xyPrimaries = a.access$xyPrimaries(aVar, primaries);
        this.f70106h = fArrAccess$xyPrimaries;
        if (fArr == null) {
            this.f70107i = a.access$computeXYZMatrix(aVar, fArrAccess$xyPrimaries, whitePoint);
        } else {
            if (fArr.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr.length);
            }
            this.f70107i = fArr;
        }
        this.f70108j = h.inverse3x3(this.f70107i);
        this.f70113o = a.access$isWideGamut(aVar, fArrAccess$xyPrimaries, f10, f11);
        this.f70114p = a.access$isSrgb(aVar, fArrAccess$xyPrimaries, whitePoint, oetf, eotf, f10, f11, i10);
    }

    @Override // k1.g
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.e0.areEqual(c1.getOrCreateKotlinClass(z.class), c1.getOrCreateKotlinClass(obj.getClass())) || !super.equals(obj)) {
            return false;
        }
        z zVar = (z) obj;
        c0 c0Var = zVar.f70105g;
        if (Float.compare(zVar.f70103e, this.f70103e) != 0 || Float.compare(zVar.f70104f, this.f70104f) != 0 || !kotlin.jvm.internal.e0.areEqual(this.f70102d, zVar.f70102d) || !Arrays.equals(this.f70106h, zVar.f70106h)) {
            return false;
        }
        c0 c0Var2 = this.f70105g;
        if (c0Var2 != null) {
            return kotlin.jvm.internal.e0.areEqual(c0Var2, c0Var);
        }
        if (c0Var == null) {
            return true;
        }
        if (kotlin.jvm.internal.e0.areEqual(this.f70109k, zVar.f70109k)) {
            return kotlin.jvm.internal.e0.areEqual(this.f70111m, zVar.f70111m);
        }
        return false;
    }

    public final float[] fromLinear(float f10, float f11, float f12) {
        return fromLinear(new float[]{f10, f11, f12});
    }

    @Override // k1.g
    public float[] fromXyz(float[] v10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
        h.mul3x3Float3(this.f70108j, v10);
        Double dValueOf = Double.valueOf(v10[0]);
        b0 b0Var = this.f70110l;
        v10[0] = (float) ((Number) b0Var.invoke(dValueOf)).doubleValue();
        v10[1] = (float) ((Number) b0Var.invoke(Double.valueOf(v10[1]))).doubleValue();
        v10[2] = (float) ((Number) b0Var.invoke(Double.valueOf(v10[2]))).doubleValue();
        return v10;
    }

    public final kv.l getEotf() {
        return this.f70112n;
    }

    public final kv.l getEotfOrig$ui_graphics_release() {
        return this.f70111m;
    }

    public final float[] getInverseTransform() {
        float[] fArr = this.f70108j;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    public final float[] getInverseTransform$ui_graphics_release() {
        return this.f70108j;
    }

    @Override // k1.g
    public float getMaxValue(int i10) {
        return this.f70104f;
    }

    @Override // k1.g
    public float getMinValue(int i10) {
        return this.f70103e;
    }

    public final kv.l getOetf() {
        return this.f70110l;
    }

    public final kv.l getOetfOrig$ui_graphics_release() {
        return this.f70109k;
    }

    public final float[] getPrimaries() {
        float[] fArr = this.f70106h;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    public final float[] getPrimaries$ui_graphics_release() {
        return this.f70106h;
    }

    public final c0 getTransferParameters() {
        return this.f70105g;
    }

    public final float[] getTransform() {
        float[] fArr = this.f70107i;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    public final float[] getTransform$ui_graphics_release() {
        return this.f70107i;
    }

    public final d0 getWhitePoint() {
        return this.f70102d;
    }

    @Override // k1.g
    public int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f70106h) + ((this.f70102d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f10 = this.f70103e;
        int iFloatToIntBits = (iHashCode + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.f70104f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        c0 c0Var = this.f70105g;
        int iHashCode2 = iFloatToIntBits2 + (c0Var != null ? c0Var.hashCode() : 0);
        if (c0Var == null) {
            return this.f70111m.hashCode() + ((this.f70109k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    @Override // k1.g
    public boolean isSrgb() {
        return this.f70114p;
    }

    @Override // k1.g
    public boolean isWideGamut() {
        return this.f70113o;
    }

    public final float[] toLinear(float f10, float f11, float f12) {
        return toLinear(new float[]{f10, f11, f12});
    }

    @Override // k1.g
    public float[] toXyz(float[] v10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
        Double dValueOf = Double.valueOf(v10[0]);
        a0 a0Var = this.f70112n;
        v10[0] = (float) ((Number) a0Var.invoke(dValueOf)).doubleValue();
        v10[1] = (float) ((Number) a0Var.invoke(Double.valueOf(v10[1]))).doubleValue();
        v10[2] = (float) ((Number) a0Var.invoke(Double.valueOf(v10[2]))).doubleValue();
        return h.mul3x3Float3(this.f70107i, v10);
    }

    public final float[] fromLinear(float[] v10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
        Double dValueOf = Double.valueOf(v10[0]);
        b0 b0Var = this.f70110l;
        v10[0] = (float) ((Number) b0Var.invoke(dValueOf)).doubleValue();
        v10[1] = (float) ((Number) b0Var.invoke(Double.valueOf(v10[1]))).doubleValue();
        v10[2] = (float) ((Number) b0Var.invoke(Double.valueOf(v10[2]))).doubleValue();
        return v10;
    }

    public final float[] getInverseTransform(float[] inverseTransform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(inverseTransform, "inverseTransform");
        return f0.copyInto$default(this.f70108j, inverseTransform, 0, 0, 0, 14, (Object) null);
    }

    public final float[] getPrimaries(float[] primaries) {
        kotlin.jvm.internal.e0.checkNotNullParameter(primaries, "primaries");
        return f0.copyInto$default(this.f70106h, primaries, 0, 0, 0, 14, (Object) null);
    }

    public final float[] getTransform(float[] transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        return f0.copyInto$default(this.f70107i, transform, 0, 0, 0, 14, (Object) null);
    }

    public final float[] toLinear(float[] v10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
        Double dValueOf = Double.valueOf(v10[0]);
        a0 a0Var = this.f70112n;
        v10[0] = (float) ((Number) a0Var.invoke(dValueOf)).doubleValue();
        v10[1] = (float) ((Number) a0Var.invoke(Double.valueOf(v10[1]))).doubleValue();
        v10[2] = (float) ((Number) a0Var.invoke(Double.valueOf(v10[2]))).doubleValue();
        return v10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z(String name, float[] toXYZ, kv.l oetf, kv.l eotf) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(toXYZ, "toXYZ");
        kotlin.jvm.internal.e0.checkNotNullParameter(oetf, "oetf");
        kotlin.jvm.internal.e0.checkNotNullParameter(eotf, "eotf");
        a aVar = f70100q;
        this(name, aVar.computePrimaries$ui_graphics_release(toXYZ), a.access$computeWhitePoint(aVar, toXYZ), null, oetf, eotf, 0.0f, 1.0f, null, -1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(String name, float[] primaries, d0 whitePoint, kv.l oetf, kv.l eotf, float f10, float f11) {
        this(name, primaries, whitePoint, null, oetf, eotf, f10, f11, null, -1);
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(primaries, "primaries");
        kotlin.jvm.internal.e0.checkNotNullParameter(whitePoint, "whitePoint");
        kotlin.jvm.internal.e0.checkNotNullParameter(oetf, "oetf");
        kotlin.jvm.internal.e0.checkNotNullParameter(eotf, "eotf");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z(String name, float[] toXYZ, c0 function) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(toXYZ, "toXYZ");
        kotlin.jvm.internal.e0.checkNotNullParameter(function, "function");
        a aVar = f70100q;
        this(name, aVar.computePrimaries$ui_graphics_release(toXYZ), a.access$computeWhitePoint(aVar, toXYZ), function, -1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(String name, float[] primaries, d0 whitePoint, c0 function) {
        this(name, primaries, whitePoint, function, -1);
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(primaries, "primaries");
        kotlin.jvm.internal.e0.checkNotNullParameter(whitePoint, "whitePoint");
        kotlin.jvm.internal.e0.checkNotNullParameter(function, "function");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(String name, float[] primaries, d0 whitePoint, c0 function, int i10) {
        this(name, primaries, whitePoint, null, (function.getE() == 0.0d && function.getF() == 0.0d) ? new s(function) : new t(function), (function.getE() == 0.0d && function.getF() == 0.0d) ? new u(function) : new v(function), 0.0f, 1.0f, function, i10);
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(primaries, "primaries");
        kotlin.jvm.internal.e0.checkNotNullParameter(whitePoint, "whitePoint");
        kotlin.jvm.internal.e0.checkNotNullParameter(function, "function");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z(String name, float[] toXYZ, double d10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(toXYZ, "toXYZ");
        a aVar = f70100q;
        this(name, aVar.computePrimaries$ui_graphics_release(toXYZ), a.access$computeWhitePoint(aVar, toXYZ), d10, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(String name, float[] fArr, d0 whitePoint, double d10) {
        this(name, fArr, whitePoint, d10, 0.0f, 1.0f, -1);
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(fArr, OcvDtWCQ.GIfrTCdPf);
        kotlin.jvm.internal.e0.checkNotNullParameter(whitePoint, "whitePoint");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z(String name, float[] primaries, d0 whitePoint, double d10, float f10, float f11, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(primaries, "primaries");
        kotlin.jvm.internal.e0.checkNotNullParameter(whitePoint, "whitePoint");
        kv.l lVar = f70101r;
        this(name, primaries, whitePoint, null, d10 == 1.0d ? lVar : new w(d10), d10 != 1.0d ? new x(d10) : lVar, f10, f11, new c0(d10, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(z colorSpace, float[] transform, d0 whitePoint) {
        this(colorSpace.getName(), colorSpace.f70106h, whitePoint, transform, colorSpace.f70109k, colorSpace.f70111m, colorSpace.f70103e, colorSpace.f70104f, colorSpace.f70105g, -1);
        kotlin.jvm.internal.e0.checkNotNullParameter(colorSpace, "colorSpace");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        kotlin.jvm.internal.e0.checkNotNullParameter(whitePoint, "whitePoint");
    }
}
