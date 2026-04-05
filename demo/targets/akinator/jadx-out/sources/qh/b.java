package qh;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import kotlin.jvm.internal.d0;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final BigInteger f83241a = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);

    /* renamed from: b, reason: collision with root package name */
    public static final double f83242b = Math.log(10.0d);

    /* renamed from: c, reason: collision with root package name */
    public static final double f83243c = Math.log(2.0d);

    public static BigInteger a(ArrayList arrayList, int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 == 0) {
            return BigInteger.ONE;
        }
        if (i12 == 1) {
            return (BigInteger) arrayList.get(i10);
        }
        if (i12 == 2) {
            return ((BigInteger) arrayList.get(i10)).multiply((BigInteger) arrayList.get(i10 + 1));
        }
        if (i12 == 3) {
            return ((BigInteger) arrayList.get(i10)).multiply((BigInteger) arrayList.get(i10 + 1)).multiply((BigInteger) arrayList.get(i10 + 2));
        }
        int i13 = (i11 + i10) >>> 1;
        return a(arrayList, i10, i13).multiply(a(arrayList, i13, i11));
    }

    public static BigInteger binomial(int i10, int i11) {
        int i12;
        jh.i.m(i10, "n");
        jh.i.m(i11, CampaignEx.JSON_KEY_AD_K);
        int i13 = 1;
        p1.checkArgument(i11 <= i10, "k (%s) > n (%s)", i11, i10);
        if (i11 > (i10 >> 1)) {
            i11 = i10 - i11;
        }
        if (i11 < 34 && i10 <= h.f83258e[i11]) {
            return BigInteger.valueOf(h.binomial(i10, i11));
        }
        BigInteger bigIntegerDivide = BigInteger.ONE;
        long j10 = i10;
        int iLog2 = h.log2(j10, RoundingMode.CEILING);
        long j11 = 1;
        while (true) {
            int i14 = iLog2;
            while (i13 < i11) {
                i12 = i10 - i13;
                i13++;
                i14 += iLog2;
                if (i14 >= 63) {
                    break;
                }
                j10 *= i12;
                j11 *= i13;
            }
            return bigIntegerDivide.multiply(BigInteger.valueOf(j10)).divide(BigInteger.valueOf(j11));
            bigIntegerDivide = bigIntegerDivide.multiply(BigInteger.valueOf(j10)).divide(BigInteger.valueOf(j11));
            j10 = i12;
            j11 = i13;
        }
    }

    public static BigInteger ceilingPowerOfTwo(BigInteger bigInteger) {
        return BigInteger.ZERO.setBit(log2(bigInteger, RoundingMode.CEILING));
    }

    public static BigInteger divide(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }

    public static BigInteger factorial(int i10) {
        jh.i.m(i10, "n");
        long[] jArr = h.f83257d;
        if (i10 < 21) {
            return BigInteger.valueOf(jArr[i10]);
        }
        RoundingMode roundingMode = RoundingMode.CEILING;
        ArrayList arrayList = new ArrayList(f.divide(f.log2(i10, roundingMode) * i10, 64, roundingMode));
        long j10 = jArr[20];
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
        long j11 = j10 >> iNumberOfTrailingZeros;
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        int i11 = 1;
        int iLog2 = h.log2(j11, roundingMode2) + 1;
        long j12 = 21;
        int iLog22 = h.log2(j12, roundingMode2);
        int i12 = iLog22 + 1;
        int i13 = 1 << iLog22;
        while (j12 <= i10) {
            int i14 = i11;
            long j13 = j12;
            if ((i13 & j13) != 0) {
                i13 <<= 1;
                i12++;
            }
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j13);
            long j14 = j13 >> iNumberOfTrailingZeros2;
            iNumberOfTrailingZeros += iNumberOfTrailingZeros2;
            if ((i12 - iNumberOfTrailingZeros2) + iLog2 >= 64) {
                arrayList.add(BigInteger.valueOf(j11));
                j11 = 1;
            }
            j11 *= j14;
            iLog2 = h.log2(j11, RoundingMode.FLOOR) + i14;
            j12 = j13 + 1;
            i11 = i14;
        }
        if (j11 > 1) {
            arrayList.add(BigInteger.valueOf(j11));
        }
        return a(arrayList, 0, arrayList.size()).shiftLeft(iNumberOfTrailingZeros);
    }

    public static BigInteger floorPowerOfTwo(BigInteger bigInteger) {
        return BigInteger.ZERO.setBit(log2(bigInteger, RoundingMode.FLOOR));
    }

    public static boolean isPowerOfTwo(BigInteger bigInteger) {
        p1.checkNotNull(bigInteger);
        return bigInteger.signum() > 0 && bigInteger.getLowestSetBit() == bigInteger.bitLength() - 1;
    }

    public static int log10(BigInteger bigInteger, RoundingMode roundingMode) {
        int i10;
        int iCompareTo;
        jh.i.s(bigInteger);
        if (bigInteger.bitLength() <= 63) {
            return h.log10(bigInteger.longValue(), roundingMode);
        }
        int iLog2 = (int) ((log2(bigInteger, RoundingMode.FLOOR) * f83243c) / f83242b);
        BigInteger bigInteger2 = BigInteger.TEN;
        BigInteger bigIntegerPow = bigInteger2.pow(iLog2);
        int iCompareTo2 = bigIntegerPow.compareTo(bigInteger);
        if (iCompareTo2 > 0) {
            do {
                iLog2--;
                bigIntegerPow = bigIntegerPow.divide(BigInteger.TEN);
                iCompareTo = bigIntegerPow.compareTo(bigInteger);
            } while (iCompareTo > 0);
        } else {
            BigInteger bigIntegerMultiply = bigInteger2.multiply(bigIntegerPow);
            int iCompareTo3 = bigIntegerMultiply.compareTo(bigInteger);
            while (true) {
                int i11 = iCompareTo3;
                i10 = iCompareTo2;
                iCompareTo2 = i11;
                if (iCompareTo2 > 0) {
                    break;
                }
                iLog2++;
                BigInteger bigIntegerMultiply2 = BigInteger.TEN.multiply(bigIntegerMultiply);
                iCompareTo3 = bigIntegerMultiply2.compareTo(bigInteger);
                bigIntegerPow = bigIntegerMultiply;
                bigIntegerMultiply = bigIntegerMultiply2;
            }
            iCompareTo = i10;
        }
        switch (a.f83240a[roundingMode.ordinal()]) {
            case 1:
                jh.i.u(iCompareTo == 0);
                return iLog2;
            case 2:
            case 3:
                return iLog2;
            case 4:
            case 5:
                return bigIntegerPow.equals(bigInteger) ? iLog2 : iLog2 + 1;
            case 6:
            case 7:
            case 8:
                return bigInteger.pow(2).compareTo(bigIntegerPow.pow(2).multiply(BigInteger.TEN)) <= 0 ? iLog2 : iLog2 + 1;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int log2(java.math.BigInteger r3, java.math.RoundingMode r4) {
        /*
            java.lang.Object r0 = mh.p1.checkNotNull(r3)
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            jh.i.s(r0)
            int r0 = r3.bitLength()
            int r1 = r0 + (-1)
            int[] r2 = qh.a.f83240a
            int r4 = r4.ordinal()
            r4 = r2[r4]
            switch(r4) {
                case 1: goto L4e;
                case 2: goto L4d;
                case 3: goto L4d;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L20;
                case 7: goto L20;
                case 8: goto L20;
                default: goto L1a;
            }
        L1a:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L20:
            r4 = 256(0x100, float:3.59E-43)
            if (r1 >= r4) goto L33
            int r4 = 256 - r1
            java.math.BigInteger r2 = qh.b.f83241a
            java.math.BigInteger r4 = r2.shiftRight(r4)
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L4c
            goto L4d
        L33:
            r4 = 2
            java.math.BigInteger r3 = r3.pow(r4)
            int r3 = r3.bitLength()
            int r3 = r3 + (-1)
            int r4 = r1 * 2
            int r4 = r4 + 1
            if (r3 >= r4) goto L4c
            goto L4d
        L45:
            boolean r3 = isPowerOfTwo(r3)
            if (r3 == 0) goto L4c
            goto L4d
        L4c:
            return r0
        L4d:
            return r1
        L4e:
            boolean r3 = isPowerOfTwo(r3)
            jh.i.u(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qh.b.log2(java.math.BigInteger, java.math.RoundingMode):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double roundToDouble(java.math.BigInteger r13, java.math.RoundingMode r14) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qh.b.roundToDouble(java.math.BigInteger, java.math.RoundingMode):double");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static BigInteger sqrt(BigInteger bigInteger, RoundingMode roundingMode) {
        BigInteger bigIntegerShiftLeft;
        if (bigInteger.signum() < 0) {
            throw new IllegalArgumentException("x (" + bigInteger + ") must be >= 0");
        }
        if (bigInteger.bitLength() <= 63) {
            return BigInteger.valueOf(h.sqrt(bigInteger.longValue(), roundingMode));
        }
        int iLog2 = log2(bigInteger, RoundingMode.FLOOR);
        if (iLog2 < 1023) {
            bigIntegerShiftLeft = d.roundToBigInteger(Math.sqrt(d0.c(bigInteger)), RoundingMode.HALF_EVEN);
        } else {
            int i10 = (iLog2 - 52) & (-2);
            bigIntegerShiftLeft = d.roundToBigInteger(Math.sqrt(d0.c(bigInteger.shiftRight(i10))), RoundingMode.HALF_EVEN).shiftLeft(i10 >> 1);
        }
        BigInteger bigIntegerShiftRight = bigIntegerShiftLeft.add(bigInteger.divide(bigIntegerShiftLeft)).shiftRight(1);
        if (!bigIntegerShiftLeft.equals(bigIntegerShiftRight)) {
            do {
                bigIntegerShiftLeft = bigIntegerShiftRight;
                bigIntegerShiftRight = bigIntegerShiftLeft.add(bigInteger.divide(bigIntegerShiftLeft)).shiftRight(1);
            } while (bigIntegerShiftRight.compareTo(bigIntegerShiftLeft) < 0);
        }
        switch (a.f83240a[roundingMode.ordinal()]) {
            case 1:
                jh.i.u(bigIntegerShiftLeft.pow(2).equals(bigInteger));
                return bigIntegerShiftLeft;
            case 2:
            case 3:
                return bigIntegerShiftLeft;
            case 4:
            case 5:
                int iIntValue = bigIntegerShiftLeft.intValue();
                if (iIntValue * iIntValue != bigInteger.intValue() || !bigIntegerShiftLeft.pow(2).equals(bigInteger)) {
                    return bigIntegerShiftLeft.add(BigInteger.ONE);
                }
                return bigIntegerShiftLeft;
            case 6:
            case 7:
            case 8:
                if (bigIntegerShiftLeft.pow(2).add(bigIntegerShiftLeft).compareTo(bigInteger) < 0) {
                    return bigIntegerShiftLeft.add(BigInteger.ONE);
                }
                return bigIntegerShiftLeft;
            default:
                throw new AssertionError();
        }
    }
}
