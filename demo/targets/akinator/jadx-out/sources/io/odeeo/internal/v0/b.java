package io.odeeo.internal.v0;

import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.ironsource.mediationsdk.l;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import io.odeeo.internal.t0.u;
import io.odeeo.internal.w0.g;
import java.math.RoundingMode;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f67258a = {19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f67259b = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, C.NANOS_PER_SECOND, RealConnection.IDLE_CONNECTION_HEALTHY_NS, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    /* renamed from: c, reason: collision with root package name */
    public static final long[] f67260c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f67261d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f67262e = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f67263f = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, MBSupportMuteAdType.INTERSTITIAL_VIDEO, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 169, 139, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};

    /* renamed from: g, reason: collision with root package name */
    public static final long[][] f67264g = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67265a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f67265a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67265a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67265a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67265a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f67265a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f67265a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f67265a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f67265a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.v0.b$b, reason: collision with other inner class name */
    public static abstract class EnumC0678b {

        /* renamed from: a, reason: collision with root package name */
        public static final EnumC0678b f67266a;

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0678b f67267b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EnumC0678b[] f67268c;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.v0.b$b$a */
        public enum a extends EnumC0678b {
            public a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // io.odeeo.internal.v0.b.EnumC0678b
            public long a(long j10, long j11, long j12) {
                return (j10 * j11) % j12;
            }

            @Override // io.odeeo.internal.v0.b.EnumC0678b
            public long a(long j10, long j11) {
                return (j10 * j10) % j11;
            }
        }

        static {
            a aVar = new a("SMALL", 0);
            f67266a = aVar;
            C0679b c0679b = new C0679b(l.f37555b, 1);
            f67267b = c0679b;
            f67268c = new EnumC0678b[]{aVar, c0679b};
        }

        public EnumC0678b(String str, int i10) {
        }

        public static boolean b(long j10, long j11) {
            return (j11 <= 3037000499L ? f67266a : f67267b).c(j10, j11);
        }

        public static EnumC0678b valueOf(String str) {
            return (EnumC0678b) Enum.valueOf(EnumC0678b.class, str);
        }

        public static EnumC0678b[] values() {
            return (EnumC0678b[]) f67268c.clone();
        }

        public abstract long a(long j10, long j11);

        public abstract long a(long j10, long j11, long j12);

        public final boolean c(long j10, long j11) {
            long j12 = j11 - 1;
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j12);
            long j13 = j12 >> iNumberOfTrailingZeros;
            long j14 = j10 % j11;
            if (j14 == 0) {
                return true;
            }
            long jB = b(j14, j13, j11);
            if (jB == 1) {
                return true;
            }
            int i10 = 0;
            while (jB != j12) {
                i10++;
                if (i10 == iNumberOfTrailingZeros) {
                    return false;
                }
                jB = a(jB, j11);
            }
            return true;
        }

        public /* synthetic */ EnumC0678b(String str, int i10, a aVar) {
            this(str, i10);
        }

        public final long b(long j10, long j11, long j12) {
            long j13;
            long jA = j10;
            long jA2 = 1;
            while (j11 != 0) {
                if ((j11 & 1) != 0) {
                    j13 = j12;
                    jA2 = a(jA2, jA, j13);
                } else {
                    j13 = j12;
                }
                jA = a(jA, j13);
                j11 >>= 1;
                j12 = j13;
            }
            return jA2;
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.v0.b$b$b, reason: collision with other inner class name */
        public enum C0679b extends EnumC0678b {
            public C0679b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // io.odeeo.internal.v0.b.EnumC0678b
            public long a(long j10, long j11, long j12) {
                long j13 = j10 >>> 32;
                long j14 = j11 >>> 32;
                long j15 = j10 & 4294967295L;
                long j16 = j11 & 4294967295L;
                long jD = (j13 * j16) + d(j13 * j14, j12);
                if (jD < 0) {
                    jD = g.remainder(jD, j12);
                }
                return c(d((j14 * j15) + jD, j12), g.remainder(j15 * j16, j12), j12);
            }

            public final long c(long j10, long j11, long j12) {
                long j13 = j10 + j11;
                return j10 >= j12 - j11 ? j13 - j12 : j13;
            }

            public final long d(long j10, long j11) {
                int i10 = 32;
                do {
                    int iMin = Math.min(i10, Long.numberOfLeadingZeros(j10));
                    j10 = g.remainder(j10 << iMin, j11);
                    i10 -= iMin;
                } while (i10 > 0);
                return j10;
            }

            @Override // io.odeeo.internal.v0.b.EnumC0678b
            public long a(long j10, long j11) {
                long j12 = j10 >>> 32;
                long j13 = j10 & 4294967295L;
                long jD = d(j12 * j12, j11);
                long jRemainder = j12 * j13 * 2;
                if (jRemainder < 0) {
                    jRemainder = g.remainder(jRemainder, j11);
                }
                return c(d(jD + jRemainder, j11), g.remainder(j13 * j13, j11), j11);
            }
        }
    }

    public static int a(long j10, long j11) {
        return (int) ((~(~(j10 - j11))) >>> 63);
    }

    public static int b(long j10) {
        byte b10 = f67258a[Long.numberOfLeadingZeros(j10)];
        return b10 - a(j10, f67259b[b10]);
    }

    public static long binomial(int i10, int i11) {
        c.a("n", i10);
        c.a(CampaignEx.JSON_KEY_AD_K, i11);
        u.checkArgument(i11 <= i10, "k (%s) > n (%s)", i11, i10);
        if (i11 > (i10 >> 1)) {
            i11 = i10 - i11;
        }
        long jA = 1;
        if (i11 == 0) {
            return 1L;
        }
        if (i11 == 1) {
            return i10;
        }
        long[] jArr = f67261d;
        if (i10 < jArr.length) {
            return jArr[i10] / (jArr[i11] * jArr[i10 - i11]);
        }
        int[] iArr = f67262e;
        if (i11 >= iArr.length || i10 > iArr[i11]) {
            return Long.MAX_VALUE;
        }
        int[] iArr2 = f67263f;
        if (i11 < iArr2.length && i10 <= iArr2[i11]) {
            int i12 = i10 - 1;
            long j10 = i10;
            for (int i13 = 2; i13 <= i11; i13++) {
                j10 = (j10 * i12) / i13;
                i12--;
            }
            return j10;
        }
        long j11 = i10;
        int iLog2 = log2(j11, RoundingMode.CEILING);
        int i14 = i10 - 1;
        int i15 = iLog2;
        int i16 = 2;
        long j12 = j11;
        long j13 = 1;
        while (i16 <= i11) {
            i15 += iLog2;
            if (i15 < 63) {
                j12 *= i14;
                j13 *= i16;
            } else {
                jA = a(jA, j12, j13);
                j12 = i14;
                j13 = i16;
                i15 = iLog2;
            }
            i16++;
            i14--;
        }
        return a(jA, j12, j13);
    }

    public static long ceilingPowerOfTwo(long j10) {
        c.b("x", j10);
        if (j10 <= 4611686018427387904L) {
            return 1 << (-Long.numberOfLeadingZeros(j10 - 1));
        }
        throw new ArithmeticException(o2.n(j10, "ceilingPowerOfTwo(", ") is not representable as a long"));
    }

    public static long checkedAdd(long j10, long j11) {
        long j12 = j10 + j11;
        c.a(((j10 ^ j11) < 0) | ((j10 ^ j12) >= 0), "checkedAdd", j10, j11);
        return j12;
    }

    public static long checkedMultiply(long j10, long j11) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10);
        if (iNumberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        c.a(iNumberOfLeadingZeros >= 64, "checkedMultiply", j10, j11);
        c.a((j10 >= 0) | (j11 != Long.MIN_VALUE), "checkedMultiply", j10, j11);
        long j12 = j10 * j11;
        c.a(j10 == 0 || j12 / j10 == j11, "checkedMultiply", j10, j11);
        return j12;
    }

    public static long checkedPow(long j10, int i10) {
        int i11 = i10;
        c.a("exponent", i11);
        long jCheckedMultiply = 1;
        if (!(j10 >= -2) || !(j10 <= 2)) {
            long j11 = j10;
            while (i11 != 0) {
                if (i11 == 1) {
                    return checkedMultiply(jCheckedMultiply, j11);
                }
                if ((i11 & 1) != 0) {
                    jCheckedMultiply = checkedMultiply(jCheckedMultiply, j11);
                }
                i11 >>= 1;
                if (i11 > 0) {
                    c.a(-3037000499L <= j11 && j11 <= 3037000499L, "checkedPow", j11, i11);
                    j11 *= j11;
                }
            }
            return jCheckedMultiply;
        }
        int i12 = (int) j10;
        if (i12 == -2) {
            c.a(i11 < 64, QGjYBESwAiCc.XeoApd, j10, i11);
            return (i11 & 1) == 0 ? 1 << i11 : (-1) << i11;
        }
        if (i12 == -1) {
            return (i11 & 1) == 0 ? 1L : -1L;
        }
        if (i12 == 0) {
            return i11 == 0 ? 1L : 0L;
        }
        if (i12 == 1) {
            return 1L;
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        c.a(i11 < 63, "checkedPow", j10, i11);
        return 1 << i11;
    }

    public static long checkedSubtract(long j10, long j11) {
        long j12 = j10 - j11;
        c.a(((j10 ^ j11) >= 0) | ((j10 ^ j12) >= 0), "checkedSubtract", j10, j11);
        return j12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long divide(long r9, long r11, java.math.RoundingMode r13) {
        /*
            io.odeeo.internal.t0.u.checkNotNull(r13)
            long r0 = r9 / r11
            long r2 = r11 * r0
            long r2 = r9 - r2
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L11
            goto L67
        L11:
            long r9 = r9 ^ r11
            r7 = 63
            long r9 = r9 >> r7
            int r9 = (int) r9
            r10 = 1
            r9 = r9 | r10
            int[] r7 = io.odeeo.internal.v0.b.a.f67265a
            int r8 = r13.ordinal()
            r7 = r7[r8]
            r8 = 0
            switch(r7) {
                case 1: goto L5b;
                case 2: goto L62;
                case 3: goto L58;
                case 4: goto L63;
                case 5: goto L55;
                case 6: goto L2a;
                case 7: goto L2a;
                case 8: goto L2a;
                default: goto L24;
            }
        L24:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L2a:
            long r2 = java.lang.Math.abs(r2)
            long r11 = java.lang.Math.abs(r11)
            long r11 = r11 - r2
            long r2 = r2 - r11
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 != 0) goto L52
            java.math.RoundingMode r11 = java.math.RoundingMode.HALF_UP
            if (r13 != r11) goto L3e
            r11 = r10
            goto L3f
        L3e:
            r11 = r8
        L3f:
            java.math.RoundingMode r12 = java.math.RoundingMode.HALF_EVEN
            if (r13 != r12) goto L45
            r12 = r10
            goto L46
        L45:
            r12 = r8
        L46:
            r2 = 1
            long r2 = r2 & r0
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 == 0) goto L4e
            goto L4f
        L4e:
            r10 = r8
        L4f:
            r10 = r10 & r12
            r10 = r10 | r11
            goto L63
        L52:
            if (r11 <= 0) goto L62
            goto L63
        L55:
            if (r9 <= 0) goto L62
            goto L63
        L58:
            if (r9 >= 0) goto L62
            goto L63
        L5b:
            if (r6 != 0) goto L5e
            goto L5f
        L5e:
            r10 = r8
        L5f:
            io.odeeo.internal.v0.c.a(r10)
        L62:
            r10 = r8
        L63:
            if (r10 == 0) goto L67
            long r9 = (long) r9
            long r0 = r0 + r9
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.v0.b.divide(long, long, java.math.RoundingMode):long");
    }

    public static long factorial(int i10) {
        c.a("n", i10);
        long[] jArr = f67261d;
        if (i10 < jArr.length) {
            return jArr[i10];
        }
        return Long.MAX_VALUE;
    }

    public static long floorPowerOfTwo(long j10) {
        c.b("x", j10);
        return 1 << (63 - Long.numberOfLeadingZeros(j10));
    }

    public static long gcd(long j10, long j11) {
        c.a("a", j10);
        c.a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, j11);
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

    public static boolean isPrime(long j10) {
        if (j10 < 2) {
            c.a("n", j10);
            return false;
        }
        if (j10 != 2 && j10 != 3 && j10 != 5 && j10 != 7 && j10 != 11 && j10 != 13) {
            if (((1 << ((int) (j10 % 30))) & (-545925251)) == 0 && j10 % 7 != 0 && j10 % 11 != 0 && j10 % 13 != 0) {
                if (j10 >= 289) {
                    for (long[] jArr : f67264g) {
                        if (j10 <= jArr[0]) {
                            for (int i10 = 1; i10 < jArr.length; i10++) {
                                if (EnumC0678b.b(jArr[i10], j10)) {
                                }
                            }
                        }
                    }
                    throw new AssertionError();
                }
            }
            return false;
        }
        return true;
    }

    public static int log10(long j10, RoundingMode roundingMode) {
        int iA;
        c.b("x", j10);
        int iB = b(j10);
        long j11 = f67259b[iB];
        switch (a.f67265a[roundingMode.ordinal()]) {
            case 1:
                c.a(j10 == j11);
                return iB;
            case 2:
            case 3:
                return iB;
            case 4:
            case 5:
                iA = a(j11, j10);
                break;
            case 6:
            case 7:
            case 8:
                iA = a(f67260c[iB], j10);
                break;
            default:
                throw new AssertionError();
        }
        return iA + iB;
    }

    public static int log2(long j10, RoundingMode roundingMode) {
        c.b("x", j10);
        switch (a.f67265a[roundingMode.ordinal()]) {
            case 1:
                c.a(isPowerOfTwo(j10));
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
                return a((-5402926248376769404) >>> iNumberOfLeadingZeros, j10) + (63 - iNumberOfLeadingZeros);
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
        c.a("exponent", i10);
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
        if (i11 == -1) {
            return (i10 & 1) == 0 ? 1L : -1L;
        }
        if (i11 == 0) {
            return i10 == 0 ? 1L : 0L;
        }
        if (i11 == 1) {
            return 1L;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        if (i10 < 64) {
            return 1 << i10;
        }
        return 0L;
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
        c.a("exponent", i10);
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
        if (i11 == -1) {
            return (i10 & 1) == 0 ? 1L : -1L;
        }
        if (i11 == 0) {
            return i10 == 0 ? 1L : 0L;
        }
        if (i11 == 1) {
            return 1L;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        if (i10 >= 63) {
            return Long.MAX_VALUE;
        }
        return 1 << i10;
    }

    public static long saturatedSubtract(long j10, long j11) {
        long j12 = j10 - j11;
        return (((j11 ^ j10) > 0L ? 1 : ((j11 ^ j10) == 0L ? 0 : -1)) >= 0) | ((j10 ^ j12) >= 0) ? j12 : ((j12 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static long sqrt(long j10, RoundingMode roundingMode) {
        c.a("x", j10);
        if (a(j10)) {
            return io.odeeo.internal.v0.a.sqrt((int) j10, roundingMode);
        }
        long jSqrt = (long) Math.sqrt(j10);
        long j11 = jSqrt * jSqrt;
        switch (a.f67265a[roundingMode.ordinal()]) {
            case 1:
                c.a(j11 == j10);
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
                return (jSqrt - (j10 < j11 ? 1 : 0)) + a((r0 * r0) + r0, j10);
            default:
                throw new AssertionError();
        }
    }

    public static boolean a(long j10) {
        return ((long) ((int) j10)) == j10;
    }

    public static long mod(long j10, long j11) {
        if (j11 <= 0) {
            throw new ArithmeticException("Modulus must be positive");
        }
        long j12 = j10 % j11;
        return j12 >= 0 ? j12 : j12 + j11;
    }

    public static long a(long j10, long j11, long j12) {
        if (j10 == 1) {
            return j11 / j12;
        }
        long jGcd = gcd(j10, j12);
        return (j11 / (j12 / jGcd)) * (j10 / jGcd);
    }
}
