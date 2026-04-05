package qh;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.vungle.ads.internal.protos.Sdk;
import java.math.RoundingMode;
import mh.p1;
import p0.o2;
import rh.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f83248a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f83249b = {1, 10, 100, 1000, 10000, DefaultOggSeeker.MATCH_BYTE_RANGE, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f83250c = {3, 31, Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f83251d = {1, 1, 2, 6, 24, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f83252e = {Integer.MAX_VALUE, Integer.MAX_VALUE, C.DEFAULT_BUFFER_SEGMENT_SIZE, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static int a(int i10, int i11) {
        return (~(~(i10 - i11))) >>> 31;
    }

    public static int binomial(int i10, int i11) {
        jh.i.m(i10, "n");
        jh.i.m(i11, CampaignEx.JSON_KEY_AD_K);
        int i12 = 0;
        p1.checkArgument(i11 <= i10, "k (%s) > n (%s)", i11, i10);
        if (i11 > (i10 >> 1)) {
            i11 = i10 - i11;
        }
        if (i11 >= 17 || i10 > f83252e[i11]) {
            return Integer.MAX_VALUE;
        }
        if (i11 == 0) {
            return 1;
        }
        if (i11 == 1) {
            return i10;
        }
        long j10 = 1;
        while (i12 < i11) {
            long j11 = j10 * (i10 - i12);
            i12++;
            j10 = j11 / i12;
        }
        return (int) j10;
    }

    public static int ceilingPowerOfTwo(int i10) {
        jh.i.q(i10);
        if (i10 <= 1073741824) {
            return 1 << (-Integer.numberOfLeadingZeros(i10 - 1));
        }
        throw new ArithmeticException(o2.k(i10, "ceilingPowerOfTwo(", ") not representable as an int"));
    }

    public static int checkedAdd(int i10, int i11) {
        return Math.addExact(i10, i11);
    }

    public static int checkedMultiply(int i10, int i11) {
        return Math.multiplyExact(i10, i11);
    }

    public static int checkedPow(int i10, int i11) {
        jh.i.m(i11, "exponent");
        if (i10 == -2) {
            jh.i.k(i10, i11, i11 < 32);
            return (i11 & 1) == 0 ? 1 << i11 : (-1) << i11;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        jh.i.k(i10, i11, i11 < 31);
                        return 1 << i11;
                    }
                    int iMultiplyExact = 1;
                    while (i11 != 0) {
                        if (i11 == 1) {
                            return Math.multiplyExact(iMultiplyExact, i10);
                        }
                        if ((i11 & 1) != 0) {
                            iMultiplyExact = Math.multiplyExact(iMultiplyExact, i10);
                        }
                        i11 >>= 1;
                        if (i11 > 0) {
                            jh.i.k(i10, i11, (-46340 <= i10) & (i10 <= 46340));
                            i10 *= i10;
                        }
                    }
                    return iMultiplyExact;
                }
            } else if (i11 != 0) {
                return 0;
            }
        } else if ((i11 & 1) != 0) {
            return -1;
        }
        return 1;
    }

    public static int checkedSubtract(int i10, int i11) {
        return Math.subtractExact(i10, i11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int divide(int i10, int i11, RoundingMode roundingMode) {
        p1.checkNotNull(roundingMode);
        if (i11 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i12 = i10 / i11;
        int i13 = i10 - (i11 * i12);
        if (i13 == 0) {
            return i12;
        }
        int i14 = ((i10 ^ i11) >> 31) | 1;
        switch (e.f83247a[roundingMode.ordinal()]) {
            case 1:
                jh.i.u(i13 == 0);
                return i12;
            case 2:
                return i12;
            case 3:
                if (i14 >= 0) {
                    return i12;
                }
                return i12 + i14;
            case 4:
                return i12 + i14;
            case 5:
                if (i14 <= 0) {
                    return i12;
                }
                return i12 + i14;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i13);
                int iAbs2 = iAbs - (Math.abs(i11) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i12 & 1) != 0))) {
                            return i12;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i12;
                }
                return i12 + i14;
            default:
                throw new AssertionError();
        }
    }

    public static int factorial(int i10) {
        jh.i.m(i10, "n");
        if (i10 < 13) {
            return f83251d[i10];
        }
        return Integer.MAX_VALUE;
    }

    public static int floorPowerOfTwo(int i10) {
        jh.i.q(i10);
        return Integer.highestOneBit(i10);
    }

    public static int gcd(int i10, int i11) {
        jh.i.m(i10, "a");
        jh.i.m(i11, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
        if (i10 == 0) {
            return i11;
        }
        if (i11 == 0) {
            return i10;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i10);
        int iNumberOfTrailingZeros2 = i10 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(i11);
        int i12 = i11 >> iNumberOfTrailingZeros3;
        while (iNumberOfTrailingZeros2 != i12) {
            int i13 = iNumberOfTrailingZeros2 - i12;
            int i14 = (i13 >> 31) & i13;
            int i15 = (i13 - i14) - i14;
            i12 += i14;
            iNumberOfTrailingZeros2 = i15 >> Integer.numberOfTrailingZeros(i15);
        }
        return iNumberOfTrailingZeros2 << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros3);
    }

    public static boolean isPowerOfTwo(int i10) {
        return (i10 > 0) & ((i10 & (i10 + (-1))) == 0);
    }

    public static boolean isPrime(int i10) {
        return h.isPrime(i10);
    }

    public static int log10(int i10, RoundingMode roundingMode) {
        int iA;
        jh.i.q(i10);
        byte b10 = f83248a[Integer.numberOfLeadingZeros(i10)];
        int[] iArr = f83249b;
        int iA2 = b10 - a(i10, iArr[b10]);
        int i11 = iArr[iA2];
        switch (e.f83247a[roundingMode.ordinal()]) {
            case 1:
                jh.i.u(i10 == i11);
                return iA2;
            case 2:
            case 3:
                return iA2;
            case 4:
            case 5:
                iA = a(i11, i10);
                break;
            case 6:
            case 7:
            case 8:
                iA = a(f83250c[iA2], i10);
                break;
            default:
                throw new AssertionError();
        }
        return iA + iA2;
    }

    public static int log2(int i10, RoundingMode roundingMode) {
        jh.i.q(i10);
        switch (e.f83247a[roundingMode.ordinal()]) {
            case 1:
                jh.i.u(isPowerOfTwo(i10));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i10 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i10);
                return a((-1257966797) >>> iNumberOfLeadingZeros, i10) + (31 - iNumberOfLeadingZeros);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    public static int mean(int i10, int i11) {
        return (i10 & i11) + ((i10 ^ i11) >> 1);
    }

    public static int mod(int i10, int i11) {
        if (i11 > 0) {
            return Math.floorMod(i10, i11);
        }
        throw new ArithmeticException(o2.k(i11, "Modulus ", " must be > 0"));
    }

    public static int pow(int i10, int i11) {
        jh.i.m(i11, "exponent");
        if (i10 == -2) {
            if (i11 < 32) {
                return (i11 & 1) == 0 ? 1 << i11 : -(1 << i11);
            }
            return 0;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        if (i11 < 32) {
                            return 1 << i11;
                        }
                        return 0;
                    }
                    int i12 = 1;
                    while (i11 != 0) {
                        if (i11 == 1) {
                            return i10 * i12;
                        }
                        i12 *= (i11 & 1) == 0 ? 1 : i10;
                        i10 *= i10;
                        i11 >>= 1;
                    }
                    return i12;
                }
            } else if (i11 != 0) {
                return 0;
            }
        } else if ((i11 & 1) != 0) {
            return -1;
        }
        return 1;
    }

    public static int saturatedAbs(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }
        return Math.abs(i10);
    }

    public static int saturatedAdd(int i10, int i11) {
        return w.saturatedCast(i10 + i11);
    }

    public static int saturatedMultiply(int i10, int i11) {
        return w.saturatedCast(i10 * i11);
    }

    public static int saturatedPow(int i10, int i11) {
        jh.i.m(i11, "exponent");
        if (i10 == -2) {
            return i11 >= 32 ? (i11 & 1) + Integer.MAX_VALUE : (i11 & 1) == 0 ? 1 << i11 : (-1) << i11;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        if (i11 >= 31) {
                            return Integer.MAX_VALUE;
                        }
                        return 1 << i11;
                    }
                    int i12 = ((i10 >>> 31) & i11 & 1) + Integer.MAX_VALUE;
                    int iSaturatedMultiply = 1;
                    while (i11 != 0) {
                        if (i11 == 1) {
                            return saturatedMultiply(iSaturatedMultiply, i10);
                        }
                        if ((i11 & 1) != 0) {
                            iSaturatedMultiply = saturatedMultiply(iSaturatedMultiply, i10);
                        }
                        i11 >>= 1;
                        if (i11 > 0) {
                            if ((-46340 > i10) || (i10 > 46340)) {
                                return i12;
                            }
                            i10 *= i10;
                        }
                    }
                    return iSaturatedMultiply;
                }
            } else if (i11 != 0) {
                return 0;
            }
        } else if ((i11 & 1) != 0) {
            return -1;
        }
        return 1;
    }

    public static int saturatedSubtract(int i10, int i11) {
        return w.saturatedCast(i10 - i11);
    }

    public static int sqrt(int i10, RoundingMode roundingMode) {
        int iA;
        jh.i.m(i10, "x");
        int iSqrt = (int) Math.sqrt(i10);
        switch (e.f83247a[roundingMode.ordinal()]) {
            case 1:
                jh.i.u(iSqrt * iSqrt == i10);
                return iSqrt;
            case 2:
            case 3:
                return iSqrt;
            case 4:
            case 5:
                iA = a(iSqrt * iSqrt, i10);
                break;
            case 6:
            case 7:
            case 8:
                iA = a((iSqrt * iSqrt) + iSqrt, i10);
                break;
            default:
                throw new AssertionError();
        }
        return iA + iSqrt;
    }
}
