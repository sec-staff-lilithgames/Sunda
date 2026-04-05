package j1;

import com.applovin.shadow.okio.Segment;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 {
    public s0(kotlin.jvm.internal.u uVar) {
    }

    public static final short access$floatToHalf(s0 s0Var, float f10) {
        int i10;
        s0Var.getClass();
        int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        int i11 = iFloatToRawIntBits >>> 31;
        int i12 = (iFloatToRawIntBits >>> 23) & 255;
        int i13 = 8388607 & iFloatToRawIntBits;
        int i14 = 31;
        int i15 = 0;
        if (i12 != 255) {
            int i16 = i12 - 112;
            if (i16 >= 31) {
                i14 = 49;
            } else if (i16 > 0) {
                i15 = i13 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i10 = (((i16 << 10) | i15) + 1) | (i11 << 15);
                    return (short) i10;
                }
                i14 = i16;
            } else if (i16 >= -10) {
                int i17 = (8388608 | i13) >> (1 - i16);
                if ((i17 & 4096) != 0) {
                    i17 += Segment.SIZE;
                }
                i14 = 0;
                i15 = i17 >> 13;
            } else {
                i14 = 0;
            }
        } else if (i13 != 0) {
            i15 = 512;
        }
        i10 = (i11 << 15) | (i14 << 10) | i15;
        return (short) i10;
    }

    public static final int access$toCompareValue(s0 s0Var, short s10) {
        s0Var.getClass();
        return (s10 & Short.MIN_VALUE) != 0 ? 32768 - (s10 & 65535) : s10 & 65535;
    }

    /* renamed from: getEpsilon-slo4al4, reason: not valid java name */
    public final short m4942getEpsilonslo4al4() {
        return t0.f68974e;
    }

    /* renamed from: getLowestValue-slo4al4, reason: not valid java name */
    public final short m4943getLowestValueslo4al4() {
        return t0.f68975f;
    }

    /* renamed from: getMaxValue-slo4al4, reason: not valid java name */
    public final short m4944getMaxValueslo4al4() {
        return t0.f68976g;
    }

    /* renamed from: getMinNormal-slo4al4, reason: not valid java name */
    public final short m4945getMinNormalslo4al4() {
        return t0.f68977h;
    }

    /* renamed from: getMinValue-slo4al4, reason: not valid java name */
    public final short m4946getMinValueslo4al4() {
        return t0.f68978i;
    }

    /* renamed from: getNaN-slo4al4, reason: not valid java name */
    public final short m4947getNaNslo4al4() {
        return t0.f68979j;
    }

    /* renamed from: getNegativeInfinity-slo4al4, reason: not valid java name */
    public final short m4948getNegativeInfinityslo4al4() {
        return t0.f68980k;
    }

    /* renamed from: getNegativeZero-slo4al4, reason: not valid java name */
    public final short m4949getNegativeZeroslo4al4() {
        return t0.f68981l;
    }

    /* renamed from: getPositiveInfinity-slo4al4, reason: not valid java name */
    public final short m4950getPositiveInfinityslo4al4() {
        return t0.f68982m;
    }

    /* renamed from: getPositiveZero-slo4al4, reason: not valid java name */
    public final short m4951getPositiveZeroslo4al4() {
        return t0.f68983n;
    }
}
