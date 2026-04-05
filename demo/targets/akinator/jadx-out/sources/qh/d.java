package qh;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;
import kotlin.jvm.internal.d0;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final double f83245a = Math.log(2.0d);

    /* renamed from: b, reason: collision with root package name */
    public static final double[] f83246b = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    public static double a(double d10, RoundingMode roundingMode) {
        if (!d0.isFinite(d10)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (c.f83244a[roundingMode.ordinal()]) {
            case 1:
                jh.i.u(isMathematicalInteger(d10));
                return d10;
            case 2:
                return (d10 >= 0.0d || isMathematicalInteger(d10)) ? d10 : ((long) d10) - 1;
            case 3:
                return (d10 <= 0.0d || isMathematicalInteger(d10)) ? d10 : ((long) d10) + 1;
            case 4:
                return d10;
            case 5:
                if (isMathematicalInteger(d10)) {
                    return d10;
                }
                return ((long) d10) + (d10 > 0.0d ? 1 : -1);
            case 6:
                return Math.rint(d10);
            case 7:
                double dRint = Math.rint(d10);
                return Math.abs(d10 - dRint) == 0.5d ? Math.copySign(0.5d, d10) + d10 : dRint;
            case 8:
                double dRint2 = Math.rint(d10);
                return Math.abs(d10 - dRint2) == 0.5d ? d10 : dRint2;
            default:
                throw new AssertionError();
        }
    }

    public static double factorial(int i10) {
        jh.i.m(i10, "n");
        if (i10 > 170) {
            return Double.POSITIVE_INFINITY;
        }
        double d10 = 1.0d;
        for (int i11 = (i10 & (-16)) + 1; i11 <= i10; i11++) {
            d10 *= i11;
        }
        return d10 * f83246b[i10 >> 4];
    }

    public static int fuzzyCompare(double d10, double d11, double d12) {
        if (fuzzyEquals(d10, d11, d12)) {
            return 0;
        }
        if (d10 < d11) {
            return -1;
        }
        if (d10 > d11) {
            return 1;
        }
        return Boolean.compare(Double.isNaN(d10), Double.isNaN(d11));
    }

    public static boolean fuzzyEquals(double d10, double d11, double d12) {
        if (d12 >= 0.0d) {
            if (Math.copySign(d10 - d11, 1.0d) <= d12 || d10 == d11) {
                return true;
            }
            return Double.isNaN(d10) && Double.isNaN(d11);
        }
        throw new IllegalArgumentException("tolerance (" + d12 + ") must be >= 0");
    }

    public static boolean isMathematicalInteger(double d10) {
        if (d0.isFinite(d10)) {
            return d10 == 0.0d || 52 - Long.numberOfTrailingZeros(d0.p(d10)) <= Math.getExponent(d10);
        }
        return false;
    }

    public static boolean isPowerOfTwo(double d10) {
        if (d10 > 0.0d && d0.isFinite(d10)) {
            long jP = d0.p(d10);
            if ((jP & (jP - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    public static double log2(double d10) {
        return Math.log(d10) / f83245a;
    }

    @Deprecated
    public static double mean(double... dArr) {
        p1.checkArgument(dArr.length > 0, "Cannot take mean of 0 values");
        double d10 = dArr[0];
        p1.checkArgument(d0.isFinite(d10));
        long j10 = 1;
        for (int i10 = 1; i10 < dArr.length; i10++) {
            p1.checkArgument(d0.isFinite(dArr[i10]));
            j10++;
            d10 += (dArr[i10] - d10) / j10;
        }
        return d10;
    }

    public static BigInteger roundToBigInteger(double d10, RoundingMode roundingMode) {
        double dA = a(d10, roundingMode);
        if (((-9.223372036854776E18d) - dA < 1.0d) && (dA < 9.223372036854776E18d)) {
            return BigInteger.valueOf((long) dA);
        }
        BigInteger bigIntegerShiftLeft = BigInteger.valueOf(d0.p(dA)).shiftLeft(Math.getExponent(dA) - 52);
        return dA < 0.0d ? bigIntegerShiftLeft.negate() : bigIntegerShiftLeft;
    }

    public static int roundToInt(double d10, RoundingMode roundingMode) {
        double dA = a(d10, roundingMode);
        jh.i.j((dA > -2.147483649E9d) & (dA < 2.147483648E9d), d10, roundingMode);
        return (int) dA;
    }

    public static long roundToLong(double d10, RoundingMode roundingMode) {
        double dA = a(d10, roundingMode);
        jh.i.j(((-9.223372036854776E18d) - dA < 1.0d) & (dA < 9.223372036854776E18d), d10, roundingMode);
        return (long) dA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int log2(double r5, java.math.RoundingMode r7) {
        /*
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L10
            boolean r0 = kotlin.jvm.internal.d0.isFinite(r5)
            if (r0 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            java.lang.String r3 = "x must be positive and finite"
            mh.p1.checkArgument(r0, r3)
            int r0 = java.lang.Math.getExponent(r5)
            int r3 = java.lang.Math.getExponent(r5)
            r4 = -1022(0xfffffffffffffc02, float:NaN)
            if (r3 < r4) goto L71
            int[] r3 = qh.c.f83244a
            int r7 = r7.ordinal()
            r7 = r3[r7]
            switch(r7) {
                case 1: goto L66;
                case 2: goto L6d;
                case 3: goto L5f;
                case 4: goto L57;
                case 5: goto L4d;
                case 6: goto L33;
                case 7: goto L33;
                case 8: goto L33;
                default: goto L2d;
            }
        L2d:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L33:
            long r5 = java.lang.Double.doubleToRawLongBits(r5)
            r3 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r5 = r5 & r3
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r5 = r5 | r3
            double r5 = java.lang.Double.longBitsToDouble(r5)
            double r5 = r5 * r5
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 <= 0) goto L6d
            r1 = r2
            goto L6d
        L4d:
            if (r0 < 0) goto L50
            r1 = r2
        L50:
            boolean r5 = isPowerOfTwo(r5)
        L54:
            r5 = r5 ^ r2
            r1 = r1 & r5
            goto L6d
        L57:
            if (r0 >= 0) goto L5a
            r1 = r2
        L5a:
            boolean r5 = isPowerOfTwo(r5)
            goto L54
        L5f:
            boolean r5 = isPowerOfTwo(r5)
            r1 = r5 ^ 1
            goto L6d
        L66:
            boolean r5 = isPowerOfTwo(r5)
            jh.i.u(r5)
        L6d:
            if (r1 == 0) goto L70
            int r0 = r0 + r2
        L70:
            return r0
        L71:
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r5 = r5 * r0
            int r5 = log2(r5, r7)
            int r5 = r5 + (-52)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qh.d.log2(double, java.math.RoundingMode):int");
    }

    @Deprecated
    public static double mean(int... iArr) {
        p1.checkArgument(iArr.length > 0, "Cannot take mean of 0 values");
        long j10 = 0;
        for (int i10 : iArr) {
            j10 += i10;
        }
        return j10 / iArr.length;
    }

    @Deprecated
    public static double mean(long... jArr) {
        p1.checkArgument(jArr.length > 0, "Cannot take mean of 0 values");
        double d10 = jArr[0];
        long j10 = 1;
        for (int i10 = 1; i10 < jArr.length; i10++) {
            j10++;
            d10 += (jArr[i10] - d10) / j10;
        }
        return d10;
    }

    @Deprecated
    public static double mean(Iterable<? extends Number> iterable) {
        return mean(iterable.iterator());
    }

    @Deprecated
    public static double mean(Iterator<? extends Number> it) {
        p1.checkArgument(it.hasNext(), "Cannot take mean of 0 values");
        double dDoubleValue = it.next().doubleValue();
        p1.checkArgument(d0.isFinite(dDoubleValue));
        long j10 = 1;
        while (it.hasNext()) {
            double dDoubleValue2 = it.next().doubleValue();
            p1.checkArgument(d0.isFinite(dDoubleValue2));
            j10++;
            dDoubleValue += (dDoubleValue2 - dDoubleValue) / j10;
        }
        return dDoubleValue;
    }
}
