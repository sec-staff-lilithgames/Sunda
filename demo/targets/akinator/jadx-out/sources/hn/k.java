package hn;

import j1.o2;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f59050a;

    /* renamed from: b, reason: collision with root package name */
    public final int f59051b;

    /* renamed from: c, reason: collision with root package name */
    public final float f59052c;

    /* renamed from: d, reason: collision with root package name */
    public final float f59053d;

    /* renamed from: e, reason: collision with root package name */
    public final float f59054e;

    /* renamed from: f, reason: collision with root package name */
    public final int f59055f;

    /* renamed from: g, reason: collision with root package name */
    public final int f59056g;

    /* renamed from: h, reason: collision with root package name */
    public final int f59057h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f59058i;

    /* renamed from: j, reason: collision with root package name */
    public short[] f59059j;

    /* renamed from: k, reason: collision with root package name */
    public int f59060k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f59061l;

    /* renamed from: m, reason: collision with root package name */
    public int f59062m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f59063n;

    /* renamed from: o, reason: collision with root package name */
    public int f59064o;

    /* renamed from: p, reason: collision with root package name */
    public int f59065p;

    /* renamed from: q, reason: collision with root package name */
    public int f59066q;

    /* renamed from: r, reason: collision with root package name */
    public int f59067r;

    /* renamed from: s, reason: collision with root package name */
    public int f59068s;

    /* renamed from: t, reason: collision with root package name */
    public int f59069t;

    /* renamed from: u, reason: collision with root package name */
    public int f59070u;

    /* renamed from: v, reason: collision with root package name */
    public int f59071v;

    /* renamed from: w, reason: collision with root package name */
    public double f59072w;

    public k(int i10, int i11, float f10, float f11, int i12) {
        this.f59050a = i10;
        this.f59051b = i11;
        this.f59052c = f10;
        this.f59053d = f11;
        this.f59054e = i10 / i12;
        this.f59055f = i10 / 400;
        int i13 = i10 / 65;
        this.f59056g = i13;
        int i14 = i13 * 2;
        this.f59057h = i14;
        this.f59058i = new short[i14];
        this.f59059j = new short[i14 * i11];
        this.f59061l = new short[i14 * i11];
        this.f59063n = new short[i14 * i11];
    }

    public static void e(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) e3.g.e(sArr3[i17], i19, (i10 - i19) * sArr2[i18], i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public static long getExpectedFrameCountAfterProcessorApplied(int i10, int i11, float f10, float f11, long j10) {
        float f12 = (i10 / i11) * f11;
        double d10 = f10 / f11;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(f12));
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j10);
        if (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) {
            bigDecimalValueOf = bigDecimalValueOf.divide(BigDecimal.valueOf(d10), RoundingMode.HALF_EVEN);
        }
        if (f12 == 1.0f) {
            return bigDecimalValueOf.longValueExact();
        }
        RoundingMode roundingMode = RoundingMode.HALF_EVEN;
        long jLongValueExact = bigDecimalValueOf.divide(bigDecimal, roundingMode).longValueExact();
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(i10);
        BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(bigDecimalValueOf2, 20, roundingMode);
        BigDecimal bigDecimalDivide2 = bigDecimalValueOf2.divide(bigDecimal, 20, roundingMode);
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        return jLongValueExact - bigDecimalDivide.multiply(bigDecimalDivide2.subtract(bigDecimalDivide2.setScale(0, roundingMode2))).setScale(0, roundingMode2).longValueExact();
    }

    public final void a(short[] sArr, int i10, int i11) {
        short[] sArrC = c(this.f59061l, this.f59062m, i11);
        this.f59061l = sArrC;
        int i12 = this.f59051b;
        System.arraycopy(sArr, i10 * i12, sArrC, this.f59062m * i12, i12 * i11);
        this.f59062m += i11;
    }

    public final void b(short[] sArr, int i10, int i11) {
        int i12 = this.f59057h / i11;
        int i13 = this.f59051b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[o2.B(i16, i14, i15, i18)];
            }
            this.f59058i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f59051b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int d(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f59051b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i15 * i11) {
                i16 = i11;
                i15 = iAbs;
            }
            if (iAbs * i14 > i17 * i11) {
                i14 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f59070u = i15 / i16;
        this.f59071v = i17 / i14;
        return i16;
    }

    public final void f() {
        float f10;
        double d10;
        int iD;
        int i10;
        int i11;
        int i12;
        int iRound;
        int i13;
        int i14;
        int i15;
        long j10;
        long j11;
        int i16 = this.f59062m;
        float f11 = this.f59052c;
        float f12 = this.f59053d;
        double d11 = f11 / f12;
        float f13 = this.f59054e * f12;
        int i17 = this.f59050a;
        int i18 = 1;
        int i19 = this.f59051b;
        int i20 = 0;
        if (d11 > 1.0000100135803223d || d11 < 0.9999899864196777d) {
            int i21 = this.f59060k;
            int i22 = this.f59057h;
            if (i21 >= i22) {
                int i23 = 0;
                while (true) {
                    int i24 = this.f59067r;
                    if (i24 > 0) {
                        int iMin = Math.min(i22, i24);
                        a(this.f59059j, i23, iMin);
                        this.f59067r -= iMin;
                        i23 += iMin;
                        f10 = f13;
                        d10 = d11;
                        i11 = i22;
                    } else {
                        short[] sArr = this.f59059j;
                        int i25 = i17 > 4000 ? i17 / 4000 : i18;
                        int i26 = this.f59056g;
                        int i27 = this.f59055f;
                        if (i19 == i18 && i25 == i18) {
                            iD = d(sArr, i23, i27, i26);
                            f10 = f13;
                            d10 = d11;
                        } else {
                            b(sArr, i23, i25);
                            f10 = f13;
                            d10 = d11;
                            short[] sArr2 = this.f59058i;
                            int iD2 = d(sArr2, i20, i27 / i25, i26 / i25);
                            if (i25 != 1) {
                                int i28 = iD2 * i25;
                                int i29 = i25 * 4;
                                int i30 = i28 - i29;
                                int i31 = i28 + i29;
                                if (i30 >= i27) {
                                    i27 = i30;
                                }
                                if (i31 <= i26) {
                                    i26 = i31;
                                }
                                if (i19 == 1) {
                                    iD = d(sArr, i23, i27, i26);
                                } else {
                                    b(sArr, i23, 1);
                                    iD = d(sArr2, i20, i27, i26);
                                }
                            } else {
                                iD = iD2;
                            }
                        }
                        int i32 = this.f59070u;
                        int i33 = this.f59071v;
                        if (i32 == 0 || (i10 = this.f59068s) == 0 || i33 > i32 * 3 || i32 * 2 <= this.f59069t * 3) {
                            i10 = iD;
                        }
                        this.f59069t = i32;
                        this.f59068s = iD;
                        if (d10 > 1.0d) {
                            short[] sArr3 = this.f59059j;
                            if (d10 >= 2.0d) {
                                i11 = i22;
                                double d12 = (i10 / (d10 - 1.0d)) + this.f59072w;
                                iRound = (int) Math.round(d12);
                                this.f59072w = d12 - iRound;
                            } else {
                                i11 = i22;
                                double d13 = (((2.0d - d10) * i10) / (d10 - 1.0d)) + this.f59072w;
                                int iRound2 = (int) Math.round(d13);
                                this.f59067r = iRound2;
                                this.f59072w = d13 - iRound2;
                                iRound = i10;
                            }
                            short[] sArrC = c(this.f59061l, this.f59062m, iRound);
                            this.f59061l = sArrC;
                            int i34 = i23 + i10;
                            int i35 = i23;
                            int i36 = iRound;
                            e(i36, this.f59051b, sArrC, this.f59062m, sArr3, i35, sArr3, i34);
                            this.f59062m += i36;
                            i23 = i10 + i36 + i35;
                        } else {
                            i11 = i22;
                            int i37 = i23;
                            short[] sArr4 = this.f59059j;
                            if (d10 < 0.5d) {
                                double d14 = ((i10 * d10) / (1.0d - d10)) + this.f59072w;
                                int iRound3 = (int) Math.round(d14);
                                this.f59072w = d14 - iRound3;
                                i12 = iRound3;
                            } else {
                                double d15 = ((((d10 * 2.0d) - 1.0d) * i10) / (1.0d - d10)) + this.f59072w;
                                int iRound4 = (int) Math.round(d15);
                                this.f59067r = iRound4;
                                this.f59072w = d15 - iRound4;
                                i12 = i10;
                            }
                            int i38 = i10 + i12;
                            short[] sArrC2 = c(this.f59061l, this.f59062m, i38);
                            this.f59061l = sArrC2;
                            System.arraycopy(sArr4, i37 * i19, sArrC2, this.f59062m * i19, i10 * i19);
                            e(i12, this.f59051b, this.f59061l, this.f59062m + i10, sArr4, i37 + i10, sArr4, i37);
                            this.f59062m += i38;
                            i23 = i37 + i12;
                        }
                    }
                    if (i23 + i11 > i21) {
                        break;
                    }
                    i20 = 0;
                    i22 = i11;
                    i18 = 1;
                    f13 = f10;
                    d11 = d10;
                }
                int i39 = this.f59060k - i23;
                short[] sArr5 = this.f59059j;
                System.arraycopy(sArr5, i23 * i19, sArr5, 0, i39 * i19);
                this.f59060k = i39;
            }
            if (f10 != 1.0f || this.f59062m == i16) {
            }
            long j12 = (long) (i17 / f10);
            long j13 = i17;
            while (j12 != 0 && j13 != 0 && j12 % 2 == 0 && j13 % 2 == 0) {
                j12 /= 2;
                j13 /= 2;
            }
            int i40 = this.f59062m - i16;
            short[] sArrC3 = c(this.f59063n, this.f59064o, i40);
            this.f59063n = sArrC3;
            System.arraycopy(this.f59061l, i16 * i19, sArrC3, this.f59064o * i19, i40 * i19);
            this.f59062m = i16;
            this.f59064o += i40;
            int i41 = 0;
            while (true) {
                i13 = this.f59064o;
                i14 = i13 - 1;
                if (i41 >= i14) {
                    break;
                }
                while (true) {
                    i15 = this.f59065p + 1;
                    j10 = i15;
                    long j14 = j10 * j12;
                    j11 = this.f59066q;
                    if (j14 <= j11 * j13) {
                        break;
                    }
                    this.f59061l = c(this.f59061l, this.f59062m, 1);
                    int i42 = 0;
                    while (i42 < i19) {
                        short[] sArr6 = this.f59061l;
                        int i43 = (this.f59062m * i19) + i42;
                        short[] sArr7 = this.f59063n;
                        int i44 = (i41 * i19) + i42;
                        short s10 = sArr7[i44];
                        short s11 = sArr7[i44 + i19];
                        long j15 = j12;
                        int i45 = i41;
                        long j16 = (r12 + 1) * j15;
                        long j17 = j16 - (this.f59066q * j13);
                        long j18 = j16 - (this.f59065p * j15);
                        sArr6[i43] = (short) ((((j18 - j17) * s11) + (s10 * j17)) / j18);
                        i42++;
                        i41 = i45;
                        j12 = j15;
                    }
                    this.f59066q++;
                    this.f59062m++;
                    i41 = i41;
                    j12 = j12;
                }
                long j19 = j12;
                int i46 = i41;
                this.f59065p = i15;
                if (j10 == j13) {
                    this.f59065p = 0;
                    io.bidmachine.media3.common.util.a.checkState(j11 == j19);
                    this.f59066q = 0;
                }
                i41 = i46 + 1;
                j12 = j19;
            }
            if (i14 == 0) {
                return;
            }
            short[] sArr8 = this.f59063n;
            System.arraycopy(sArr8, i14 * i19, sArr8, 0, (i13 - i14) * i19);
            this.f59064o -= i14;
            return;
        }
        a(this.f59059j, 0, this.f59060k);
        this.f59060k = 0;
        f10 = f13;
        if (f10 != 1.0f) {
        }
    }

    public void flush() {
        this.f59060k = 0;
        this.f59062m = 0;
        this.f59064o = 0;
        this.f59065p = 0;
        this.f59066q = 0;
        this.f59067r = 0;
        this.f59068s = 0;
        this.f59069t = 0;
        this.f59070u = 0;
        this.f59071v = 0;
        this.f59072w = 0.0d;
    }

    public void getOutput(ShortBuffer shortBuffer) {
        io.bidmachine.media3.common.util.a.checkState(this.f59062m >= 0);
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f59051b;
        int iMin = Math.min(iRemaining / i10, this.f59062m);
        shortBuffer.put(this.f59061l, 0, iMin * i10);
        int i11 = this.f59062m - iMin;
        this.f59062m = i11;
        short[] sArr = this.f59061l;
        System.arraycopy(sArr, iMin * i10, sArr, 0, i11 * i10);
    }

    public int getOutputSize() {
        io.bidmachine.media3.common.util.a.checkState(this.f59062m >= 0);
        return this.f59062m * this.f59051b * 2;
    }

    public int getPendingInputBytes() {
        return this.f59060k * this.f59051b * 2;
    }

    public void queueEndOfStream() {
        int i10 = this.f59060k;
        float f10 = this.f59052c;
        float f11 = this.f59053d;
        double d10 = f10 / f11;
        int i11 = this.f59062m + ((int) (((((((i10 - r5) / d10) + this.f59067r) + this.f59072w) + this.f59064o) / (this.f59054e * f11)) + 0.5d));
        this.f59072w = 0.0d;
        short[] sArr = this.f59059j;
        int i12 = this.f59057h;
        this.f59059j = c(sArr, i10, (i12 * 2) + i10);
        int i13 = 0;
        while (true) {
            int i14 = this.f59051b;
            if (i13 >= i12 * 2 * i14) {
                break;
            }
            this.f59059j[(i14 * i10) + i13] = 0;
            i13++;
        }
        this.f59060k = (i12 * 2) + this.f59060k;
        f();
        if (this.f59062m > i11) {
            this.f59062m = Math.max(i11, 0);
        }
        this.f59060k = 0;
        this.f59067r = 0;
        this.f59064o = 0;
    }

    public void queueInput(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f59051b;
        int i11 = iRemaining / i10;
        short[] sArrC = c(this.f59059j, this.f59060k, i11);
        this.f59059j = sArrC;
        shortBuffer.get(sArrC, this.f59060k * i10, ((i11 * i10) * 2) / 2);
        this.f59060k += i11;
        f();
    }
}
