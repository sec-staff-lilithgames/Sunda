package qh;

import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.math.RoundingMode;
import kotlin.jvm.internal.d0;
import mh.p1;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f83254a = {19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f83255b = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, C.NANOS_PER_SECOND, RealConnection.IDLE_CONNECTION_HEALTHY_NS, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    /* renamed from: c, reason: collision with root package name */
    public static final long[] f83256c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f83257d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f83258e = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f83259f = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, MBSupportMuteAdType.INTERSTITIAL_VIDEO, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 169, 139, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};

    /* renamed from: g, reason: collision with root package name */
    public static final long[][] f83260g = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    public static long binomial(int i10, int i11) {
        long j10;
        jh.i.m(i10, "n");
        jh.i.m(i11, CampaignEx.JSON_KEY_AD_K);
        p1.checkArgument(i11 <= i10, "k (%s) > n (%s)", i11, i10);
        if (i11 > (i10 >> 1)) {
            i11 = i10 - i11;
        }
        if (i11 == 0) {
            return 1L;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i10 < 21) {
            long[] jArr = f83257d;
            return jArr[i10] / (jArr[i11] * jArr[i10 - i11]);
        }
        if (i11 >= 34 || i10 > f83258e[i11]) {
            return Long.MAX_VALUE;
        }
        int i12 = 2;
        if (i11 < 31 && i10 <= f83259f[i11]) {
            int i13 = i10 - 1;
            long j11 = i10;
            while (i12 <= i11) {
                j11 = (j11 * i13) / i12;
                i13--;
                i12++;
            }
            return j11;
        }
        long j12 = i10;
        int iLog2 = log2(j12, RoundingMode.CEILING);
        int i14 = i10 - 1;
        int i15 = iLog2;
        long j13 = 1;
        long j14 = 1;
        while (i12 <= i11) {
            i15 += iLog2;
            if (i15 < 63) {
                j12 *= i14;
                j14 *= i12;
            } else {
                if (j13 == 1) {
                    j10 = j12 / j14;
                } else {
                    long jGcd = gcd(j13, j14);
                    j10 = (j12 / (j14 / jGcd)) * (j13 / jGcd);
                }
                j13 = j10;
                j12 = i14;
                j14 = i12;
                i15 = iLog2;
            }
            i12++;
            i14--;
        }
        if (j13 == 1) {
            return j12 / j14;
        }
        long jGcd2 = gcd(j13, j14);
        return (j12 / (j14 / jGcd2)) * (j13 / jGcd2);
    }

    public static long ceilingPowerOfTwo(long j10) {
        jh.i.r(j10);
        if (j10 <= 4611686018427387904L) {
            return 1 << (-Long.numberOfLeadingZeros(j10 - 1));
        }
        throw new ArithmeticException(o2.n(j10, "ceilingPowerOfTwo(", ") is not representable as a long"));
    }

    public static long checkedAdd(long j10, long j11) {
        return Math.addExact(j10, j11);
    }

    public static long checkedMultiply(long j10, long j11) {
        return Math.multiplyExact(j10, j11);
    }

    public static long checkedPow(long j10, int i10) {
        jh.i.m(i10, "exponent");
        long jMultiplyExact = 1;
        if (!(j10 >= -2) || !(j10 <= 2)) {
            while (i10 != 0) {
                if (i10 == 1) {
                    return Math.multiplyExact(jMultiplyExact, j10);
                }
                if ((i10 & 1) != 0) {
                    jMultiplyExact = Math.multiplyExact(jMultiplyExact, j10);
                }
                i10 >>= 1;
                if (i10 > 0) {
                    jh.i.l(j10, i10, -3037000499L <= j10 && j10 <= 3037000499L);
                    j10 *= j10;
                }
            }
            return jMultiplyExact;
        }
        int i11 = (int) j10;
        if (i11 == -2) {
            jh.i.l(j10, i10, i10 < 64);
            return (i10 & 1) == 0 ? 1 << i10 : (-1) << i10;
        }
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new AssertionError();
                    }
                    jh.i.l(j10, i10, i10 < 63);
                    return 1 << i10;
                }
            } else if (i10 != 0) {
                return 0L;
            }
        } else if ((i10 & 1) != 0) {
            return -1L;
        }
        return 1L;
    }

    public static long checkedSubtract(long j10, long j11) {
        return Math.subtractExact(j10, j11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long divide(long j10, long j11, RoundingMode roundingMode) {
        p1.checkNotNull(roundingMode);
        long j12 = j10 / j11;
        long j13 = j10 - (j11 * j12);
        if (j13 == 0) {
            return j12;
        }
        int i10 = ((int) ((j10 ^ j11) >> 63)) | 1;
        switch (g.f83253a[roundingMode.ordinal()]) {
            case 1:
                jh.i.u(j13 == 0);
                return j12;
            case 2:
                return j12;
            case 3:
                if (i10 >= 0) {
                    return j12;
                }
                return j12 + i10;
            case 4:
                return j12 + i10;
            case 5:
                if (i10 <= 0) {
                    return j12;
                }
                return j12 + i10;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j13);
                long jAbs2 = jAbs - (Math.abs(j11) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j12) == 0)) {
                        return j12;
                    }
                } else if (jAbs2 <= 0) {
                    return j12;
                }
                return j12 + i10;
            default:
                throw new AssertionError();
        }
    }

    public static long factorial(int i10) {
        jh.i.m(i10, "n");
        if (i10 < 21) {
            return f83257d[i10];
        }
        return Long.MAX_VALUE;
    }

    public static long floorPowerOfTwo(long j10) {
        jh.i.r(j10);
        return 1 << (63 - Long.numberOfLeadingZeros(j10));
    }

    public static long gcd(long j10, long j11) {
        jh.i.n(j10, "a");
        jh.i.n(j11, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
        if (j10 == 0) {
            return j11;
        }
        if (j11 == 0) {
            return j10;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
        long jNumberOfTrailingZeros = j10 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j11);
        long j12 = j11 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j12) {
            long j13 = jNumberOfTrailingZeros - j12;
            long j14 = (j13 >> 63) & j13;
            long j15 = (j13 - j14) - j14;
            j12 += j14;
            jNumberOfTrailingZeros = j15 >> Long.numberOfTrailingZeros(j15);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static boolean isPowerOfTwo(long j10) {
        return (j10 > 0) & ((j10 & (j10 - 1)) == 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (((722865708377213483 >> (((int) r30) - 2)) & 1) != 0) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isPrime(long r30) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qh.h.isPrime(long):boolean");
    }

    public static int log10(long j10, RoundingMode roundingMode) {
        long j11;
        jh.i.r(j10);
        byte b10 = f83254a[Long.numberOfLeadingZeros(j10)];
        long[] jArr = f83255b;
        int i10 = b10 - ((int) ((~(~(j10 - jArr[b10]))) >>> 63));
        long j12 = jArr[i10];
        switch (g.f83253a[roundingMode.ordinal()]) {
            case 1:
                jh.i.u(j10 == j12);
                return i10;
            case 2:
            case 3:
                return i10;
            case 4:
            case 5:
                j11 = ~(j12 - j10);
                break;
            case 6:
            case 7:
            case 8:
                j11 = ~(f83256c[i10] - j10);
                break;
            default:
                throw new AssertionError();
        }
        return ((int) ((~j11) >>> 63)) + i10;
    }

    public static int log2(long j10, RoundingMode roundingMode) {
        jh.i.r(j10);
        switch (g.f83253a[roundingMode.ordinal()]) {
            case 1:
                jh.i.u(isPowerOfTwo(j10));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 64 - Long.numberOfLeadingZeros(j10 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j10);
                return ((int) ((~(~(((-5402926248376769404) >>> iNumberOfLeadingZeros) - j10))) >>> 63)) + (63 - iNumberOfLeadingZeros);
            default:
                throw new AssertionError("impossible");
        }
        return 63 - Long.numberOfLeadingZeros(j10);
    }

    public static long mean(long j10, long j11) {
        return (j10 & j11) + ((j10 ^ j11) >> 1);
    }

    public static int mod(long j10, int i10) {
        return (int) mod(j10, i10);
    }

    public static long pow(long j10, int i10) {
        jh.i.m(i10, "exponent");
        if (-2 > j10 || j10 > 2) {
            long j11 = 1;
            while (i10 != 0) {
                if (i10 == 1) {
                    return j11 * j10;
                }
                j11 *= (i10 & 1) == 0 ? 1L : j10;
                j10 *= j10;
                i10 >>= 1;
            }
            return j11;
        }
        int i11 = (int) j10;
        if (i11 == -2) {
            if (i10 < 64) {
                return (i10 & 1) == 0 ? 1 << i10 : -(1 << i10);
            }
            return 0L;
        }
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new AssertionError();
                    }
                    if (i10 < 64) {
                        return 1 << i10;
                    }
                    return 0L;
                }
            } else if (i10 != 0) {
                return 0L;
            }
        } else if ((i10 & 1) != 0) {
            return -1L;
        }
        return 1L;
    }

    public static double roundToDouble(long j10, RoundingMode roundingMode) {
        double dNextUp;
        long j11;
        double dNextUp2;
        long jCeil;
        double d10 = j10;
        long j12 = (long) d10;
        int iCompare = j12 == Long.MAX_VALUE ? -1 : Long.compare(j10, j12);
        int[] iArr = g.f83253a;
        switch (iArr[roundingMode.ordinal()]) {
            case 1:
                jh.i.u(iCompare == 0);
                return d10;
            case 2:
                if (j10 >= 0) {
                    if (iCompare < 0) {
                        dNextUp = Math.nextUp(-d10);
                        return -dNextUp;
                    }
                } else if (iCompare > 0) {
                    return Math.nextUp(d10);
                }
                return d10;
            case 3:
                if (iCompare < 0) {
                    dNextUp = Math.nextUp(-d10);
                    return -dNextUp;
                }
                return d10;
            case 4:
                if (j10 >= 0) {
                    if (iCompare > 0) {
                        return Math.nextUp(d10);
                    }
                } else if (iCompare < 0) {
                    dNextUp = Math.nextUp(-d10);
                    return -dNextUp;
                }
                return d10;
            case 5:
                if (iCompare > 0) {
                    return Math.nextUp(d10);
                }
                return d10;
            case 6:
            case 7:
            case 8:
                if (iCompare >= 0) {
                    dNextUp2 = Math.nextUp(d10);
                    j11 = Long.MAX_VALUE;
                    jCeil = (long) Math.ceil(dNextUp2);
                } else {
                    j11 = Long.MAX_VALUE;
                    double d11 = -Math.nextUp(-d10);
                    long jFloor = (long) Math.floor(d11);
                    dNextUp2 = d10;
                    d10 = d11;
                    jCeil = j12;
                    j12 = jFloor;
                }
                long j13 = j10 - j12;
                long j14 = jCeil - j10;
                if (jCeil == j11) {
                    j14++;
                }
                int iCompare2 = Long.compare(j13, j14);
                if (iCompare2 >= 0) {
                    if (iCompare2 <= 0) {
                        int i10 = iArr[roundingMode.ordinal()];
                        if (i10 != 6) {
                            if (i10 != 7) {
                                if (i10 != 8) {
                                    throw new AssertionError("impossible");
                                }
                                if ((d0.p(d10) & 1) == 0) {
                                }
                            } else if (j10 >= 0) {
                            }
                        } else if (j10 >= 0) {
                        }
                    }
                    return dNextUp2;
                }
                return d10;
            default:
                throw new AssertionError("impossible");
        }
    }

    public static long saturatedAbs(long j10) {
        if (j10 == Long.MIN_VALUE) {
            return Long.MAX_VALUE;
        }
        return Math.abs(j10);
    }

    public static long saturatedAdd(long j10, long j11) {
        long j12 = j10 + j11;
        return (((j11 ^ j10) > 0L ? 1 : ((j11 ^ j10) == 0L ? 0 : -1)) < 0) | ((j10 ^ j12) >= 0) ? j12 : ((j12 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static long saturatedMultiply(long j10, long j11) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10);
        if (iNumberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        long j12 = ((j10 ^ j11) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j11 == Long.MIN_VALUE) & (j10 < 0)))) {
            long j13 = j10 * j11;
            if (j10 == 0 || j13 / j10 == j11) {
                return j13;
            }
        }
        return j12;
    }

    public static long saturatedPow(long j10, int i10) {
        jh.i.m(i10, "exponent");
        long jSaturatedMultiply = 1;
        if (!(j10 >= -2) || !(j10 <= 2)) {
            long j11 = ((j10 >>> 63) & i10 & 1) + Long.MAX_VALUE;
            while (i10 != 0) {
                if (i10 == 1) {
                    return saturatedMultiply(jSaturatedMultiply, j10);
                }
                if ((i10 & 1) != 0) {
                    jSaturatedMultiply = saturatedMultiply(jSaturatedMultiply, j10);
                }
                i10 >>= 1;
                if (i10 > 0) {
                    if ((-3037000499L > j10) || (j10 > 3037000499L)) {
                        return j11;
                    }
                    j10 *= j10;
                }
            }
            return jSaturatedMultiply;
        }
        int i11 = (int) j10;
        if (i11 == -2) {
            return i10 >= 64 ? (i10 & 1) + Long.MAX_VALUE : (i10 & 1) == 0 ? 1 << i10 : (-1) << i10;
        }
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new AssertionError();
                    }
                    if (i10 >= 63) {
                        return Long.MAX_VALUE;
                    }
                    return 1 << i10;
                }
            } else if (i10 != 0) {
                return 0L;
            }
        } else if ((i10 & 1) != 0) {
            return -1L;
        }
        return 1L;
    }

    public static long saturatedSubtract(long j10, long j11) {
        long j12 = j10 - j11;
        return (((j11 ^ j10) > 0L ? 1 : ((j11 ^ j10) == 0L ? 0 : -1)) >= 0) | ((j10 ^ j12) >= 0) ? j12 : ((j12 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static long sqrt(long j10, RoundingMode roundingMode) {
        jh.i.n(j10, "x");
        if (((int) j10) == j10) {
            return f.sqrt(r0, roundingMode);
        }
        long jSqrt = (long) Math.sqrt(j10);
        long j11 = jSqrt * jSqrt;
        switch (g.f83253a[roundingMode.ordinal()]) {
            case 1:
                jh.i.u(j11 == j10);
                return jSqrt;
            case 2:
            case 3:
                return j10 < j11 ? jSqrt - 1 : jSqrt;
            case 4:
            case 5:
                return j10 > j11 ? jSqrt + 1 : jSqrt;
            case 6:
            case 7:
            case 8:
                return (jSqrt - (j10 < j11 ? 1 : 0)) + ((int) ((~(~(((r0 * r0) + r0) - j10))) >>> 63));
            default:
                throw new AssertionError();
        }
    }

    public static long mod(long j10, long j11) {
        if (j11 > 0) {
            return Math.floorMod(j10, j11);
        }
        throw new ArithmeticException("Modulus must be positive");
    }
}
