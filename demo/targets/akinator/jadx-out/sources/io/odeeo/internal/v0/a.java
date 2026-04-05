package io.odeeo.internal.v0;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.vungle.ads.internal.protos.Sdk;
import io.odeeo.internal.t0.u;
import io.odeeo.internal.w0.d;
import java.math.RoundingMode;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f67252a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f67253b = {1, 10, 100, 1000, 10000, DefaultOggSeeker.MATCH_BYTE_RANGE, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f67254c = {3, 31, Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f67255d = {1, 1, 2, 6, 24, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* renamed from: e, reason: collision with root package name */
    public static int[] f67256e = {Integer.MAX_VALUE, Integer.MAX_VALUE, C.DEFAULT_BUFFER_SEGMENT_SIZE, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.v0.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0677a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67257a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f67257a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67257a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67257a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67257a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f67257a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f67257a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f67257a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f67257a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int a(int i10, int i11) {
        return (~(~(i10 - i11))) >>> 31;
    }

    public static int b(int i10) {
        return (int) Math.sqrt(i10);
    }

    public static int binomial(int i10, int i11) {
        c.a("n", i10);
        c.a(CampaignEx.JSON_KEY_AD_K, i11);
        int i12 = 0;
        u.checkArgument(i11 <= i10, "k (%s) > n (%s)", i11, i10);
        if (i11 > (i10 >> 1)) {
            i11 = i10 - i11;
        }
        int[] iArr = f67256e;
        if (i11 >= iArr.length || i10 > iArr[i11]) {
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
        c.b("x", i10);
        if (i10 <= 1073741824) {
            return 1 << (-Integer.numberOfLeadingZeros(i10 - 1));
        }
        throw new ArithmeticException(o2.k(i10, "ceilingPowerOfTwo(", ") not representable as an int"));
    }

    public static int checkedAdd(int i10, int i11) {
        long j10 = i10 + i11;
        int i12 = (int) j10;
        c.a(j10 == ((long) i12), "checkedAdd", i10, i11);
        return i12;
    }

    public static int checkedMultiply(int i10, int i11) {
        long j10 = i10 * i11;
        int i12 = (int) j10;
        c.a(j10 == ((long) i12), "checkedMultiply", i10, i11);
        return i12;
    }

    public static int checkedPow(int i10, int i11) {
        c.a("exponent", i11);
        if (i10 == -2) {
            c.a(i11 < 32, "checkedPow", i10, i11);
            return (i11 & 1) == 0 ? 1 << i11 : (-1) << i11;
        }
        if (i10 == -1) {
            return (i11 & 1) == 0 ? 1 : -1;
        }
        if (i10 == 0) {
            return i11 == 0 ? 1 : 0;
        }
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            c.a(i11 < 31, "checkedPow", i10, i11);
            return 1 << i11;
        }
        int iCheckedMultiply = 1;
        while (i11 != 0) {
            if (i11 == 1) {
                return checkedMultiply(iCheckedMultiply, i10);
            }
            if ((i11 & 1) != 0) {
                iCheckedMultiply = checkedMultiply(iCheckedMultiply, i10);
            }
            i11 >>= 1;
            if (i11 > 0) {
                c.a((-46340 <= i10) & (i10 <= 46340), "checkedPow", i10, i11);
                i10 *= i10;
            }
        }
        return iCheckedMultiply;
    }

    public static int checkedSubtract(int i10, int i11) {
        long j10 = i10 - i11;
        int i12 = (int) j10;
        c.a(j10 == ((long) i12), "checkedSubtract", i10, i11);
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (((r7 == java.math.RoundingMode.HALF_EVEN) & ((r0 & 1) != 0)) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
    
        if (r1 > 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        if (r5 > 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
    
        if (r5 < 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int divide(int r5, int r6, java.math.RoundingMode r7) {
        /*
            io.odeeo.internal.t0.u.checkNotNull(r7)
            if (r6 == 0) goto L58
            int r0 = r5 / r6
            int r1 = r6 * r0
            int r1 = r5 - r1
            if (r1 != 0) goto Le
            return r0
        Le:
            r5 = r5 ^ r6
            int r5 = r5 >> 31
            r2 = 1
            r5 = r5 | r2
            int[] r3 = io.odeeo.internal.v0.a.C0677a.f67257a
            int r4 = r7.ordinal()
            r3 = r3[r4]
            r4 = 0
            switch(r3) {
                case 1: goto L50;
                case 2: goto L57;
                case 3: goto L4c;
                case 4: goto L4e;
                case 5: goto L49;
                case 6: goto L25;
                case 7: goto L25;
                case 8: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L25:
            int r1 = java.lang.Math.abs(r1)
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 - r1
            int r1 = r1 - r6
            if (r1 != 0) goto L46
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            if (r7 == r6) goto L4e
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_EVEN
            if (r7 != r6) goto L3b
            r6 = r2
            goto L3c
        L3b:
            r6 = r4
        L3c:
            r7 = r0 & 1
            if (r7 == 0) goto L41
            goto L42
        L41:
            r2 = r4
        L42:
            r6 = r6 & r2
            if (r6 == 0) goto L57
            goto L4e
        L46:
            if (r1 <= 0) goto L57
            goto L4e
        L49:
            if (r5 <= 0) goto L57
            goto L4e
        L4c:
            if (r5 >= 0) goto L57
        L4e:
            int r0 = r0 + r5
            return r0
        L50:
            if (r1 != 0) goto L53
            goto L54
        L53:
            r2 = r4
        L54:
            io.odeeo.internal.v0.c.a(r2)
        L57:
            return r0
        L58:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "/ by zero"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.v0.a.divide(int, int, java.math.RoundingMode):int");
    }

    public static int factorial(int i10) {
        c.a("n", i10);
        int[] iArr = f67255d;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return Integer.MAX_VALUE;
    }

    public static int floorPowerOfTwo(int i10) {
        c.b("x", i10);
        return Integer.highestOneBit(i10);
    }

    public static int gcd(int i10, int i11) {
        c.a("a", i10);
        c.a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, i11);
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
        return b.isPrime(i10);
    }

    public static int log10(int i10, RoundingMode roundingMode) {
        int iA;
        c.b("x", i10);
        int iA2 = a(i10);
        int i11 = f67253b[iA2];
        switch (C0677a.f67257a[roundingMode.ordinal()]) {
            case 1:
                c.a(i10 == i11);
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
                iA = a(f67254c[iA2], i10);
                break;
            default:
                throw new AssertionError();
        }
        return iA + iA2;
    }

    public static int log2(int i10, RoundingMode roundingMode) {
        c.b("x", i10);
        switch (C0677a.f67257a[roundingMode.ordinal()]) {
            case 1:
                c.a(isPowerOfTwo(i10));
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
        if (i11 <= 0) {
            throw new ArithmeticException(o2.k(i11, "Modulus ", " must be > 0"));
        }
        int i12 = i10 % i11;
        return i12 >= 0 ? i12 : i12 + i11;
    }

    public static int pow(int i10, int i11) {
        c.a("exponent", i11);
        if (i10 == -2) {
            if (i11 < 32) {
                return (i11 & 1) == 0 ? 1 << i11 : -(1 << i11);
            }
            return 0;
        }
        if (i10 == -1) {
            return (i11 & 1) == 0 ? 1 : -1;
        }
        if (i10 == 0) {
            return i11 == 0 ? 1 : 0;
        }
        if (i10 == 1) {
            return 1;
        }
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

    public static int saturatedAdd(int i10, int i11) {
        return d.saturatedCast(i10 + i11);
    }

    public static int saturatedMultiply(int i10, int i11) {
        return d.saturatedCast(i10 * i11);
    }

    public static int saturatedPow(int i10, int i11) {
        c.a("exponent", i11);
        if (i10 == -2) {
            return i11 >= 32 ? (i11 & 1) + Integer.MAX_VALUE : (i11 & 1) == 0 ? 1 << i11 : (-1) << i11;
        }
        if (i10 == -1) {
            return (i11 & 1) == 0 ? 1 : -1;
        }
        if (i10 == 0) {
            return i11 == 0 ? 1 : 0;
        }
        if (i10 == 1) {
            return 1;
        }
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

    public static int saturatedSubtract(int i10, int i11) {
        return d.saturatedCast(i10 - i11);
    }

    public static int sqrt(int i10, RoundingMode roundingMode) {
        int iA;
        c.a("x", i10);
        int iB = b(i10);
        switch (C0677a.f67257a[roundingMode.ordinal()]) {
            case 1:
                c.a(iB * iB == i10);
                return iB;
            case 2:
            case 3:
                return iB;
            case 4:
            case 5:
                iA = a(iB * iB, i10);
                break;
            case 6:
            case 7:
            case 8:
                iA = a((iB * iB) + iB, i10);
                break;
            default:
                throw new AssertionError();
        }
        return iA + iB;
    }

    public static int a(int i10) {
        byte b10 = f67252a[Integer.numberOfLeadingZeros(i10)];
        return b10 - a(i10, f67253b[b10]);
    }
}
