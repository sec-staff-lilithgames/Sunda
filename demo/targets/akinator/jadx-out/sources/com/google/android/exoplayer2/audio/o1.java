package com.google.android.exoplayer2.audio;

import j1.o2;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f27232a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27233b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27234c;

    /* renamed from: d, reason: collision with root package name */
    public final float f27235d;

    /* renamed from: e, reason: collision with root package name */
    public final float f27236e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27237f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27238g;

    /* renamed from: h, reason: collision with root package name */
    public final int f27239h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f27240i;

    /* renamed from: j, reason: collision with root package name */
    public short[] f27241j;

    /* renamed from: k, reason: collision with root package name */
    public int f27242k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f27243l;

    /* renamed from: m, reason: collision with root package name */
    public int f27244m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f27245n;

    /* renamed from: o, reason: collision with root package name */
    public int f27246o;

    /* renamed from: p, reason: collision with root package name */
    public int f27247p;

    /* renamed from: q, reason: collision with root package name */
    public int f27248q;

    /* renamed from: r, reason: collision with root package name */
    public int f27249r;

    /* renamed from: s, reason: collision with root package name */
    public int f27250s;

    /* renamed from: t, reason: collision with root package name */
    public int f27251t;

    /* renamed from: u, reason: collision with root package name */
    public int f27252u;

    /* renamed from: v, reason: collision with root package name */
    public int f27253v;

    public o1(int i10, int i11, float f10, float f11, int i12) {
        this.f27232a = i10;
        this.f27233b = i11;
        this.f27234c = f10;
        this.f27235d = f11;
        this.f27236e = i10 / i12;
        this.f27237f = i10 / 400;
        int i13 = i10 / 65;
        this.f27238g = i13;
        int i14 = i13 * 2;
        this.f27239h = i14;
        this.f27240i = new short[i14];
        this.f27241j = new short[i14 * i11];
        this.f27243l = new short[i14 * i11];
        this.f27245n = new short[i14 * i11];
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

    public final void a(short[] sArr, int i10, int i11) {
        short[] sArrC = c(this.f27243l, this.f27244m, i11);
        this.f27243l = sArrC;
        int i12 = this.f27233b;
        System.arraycopy(sArr, i10 * i12, sArrC, this.f27244m * i12, i12 * i11);
        this.f27244m += i11;
    }

    public final void b(short[] sArr, int i10, int i11) {
        int i12 = this.f27239h / i11;
        int i13 = this.f27233b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[o2.B(i16, i14, i15, i18)];
            }
            this.f27240i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f27233b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int d(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f27233b;
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
        this.f27252u = i15 / i16;
        this.f27253v = i17 / i14;
        return i16;
    }

    public final void f() {
        float f10;
        float f11;
        float f12;
        double d10;
        int iD;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.f27244m;
        float f13 = this.f27234c;
        float f14 = this.f27235d;
        float f15 = f13 / f14;
        float f16 = this.f27236e * f14;
        double d11 = f15;
        int i18 = this.f27232a;
        int i19 = 1;
        int i20 = this.f27233b;
        if (d11 > 1.00001d || d11 < 0.99999d) {
            int i21 = this.f27242k;
            int i22 = this.f27239h;
            if (i21 >= i22) {
                int i23 = 0;
                while (true) {
                    int i24 = this.f27249r;
                    if (i24 > 0) {
                        int iMin = Math.min(i22, i24);
                        a(this.f27241j, i23, iMin);
                        this.f27249r -= iMin;
                        i23 += iMin;
                        f11 = f15;
                        f12 = f16;
                        d10 = d11;
                        f10 = 1.0f;
                    } else {
                        short[] sArr = this.f27241j;
                        int i25 = i18 > 4000 ? i18 / 4000 : i19;
                        f10 = 1.0f;
                        int i26 = this.f27238g;
                        int i27 = this.f27237f;
                        if (i20 == i19 && i25 == i19) {
                            iD = d(sArr, i23, i27, i26);
                            f11 = f15;
                            f12 = f16;
                            d10 = d11;
                        } else {
                            b(sArr, i23, i25);
                            f11 = f15;
                            f12 = f16;
                            short[] sArr2 = this.f27240i;
                            d10 = d11;
                            int iD2 = d(sArr2, 0, i27 / i25, i26 / i25);
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
                                if (i20 == 1) {
                                    iD = d(sArr, i23, i27, i26);
                                } else {
                                    b(sArr, i23, 1);
                                    iD = d(sArr2, 0, i27, i26);
                                }
                            } else {
                                iD = iD2;
                            }
                        }
                        int i32 = this.f27252u;
                        int i33 = this.f27253v;
                        if (i32 == 0 || (i10 = this.f27250s) == 0 || i33 > i32 * 3 || i32 * 2 <= this.f27251t * 3) {
                            i10 = iD;
                        }
                        this.f27251t = i32;
                        this.f27250s = iD;
                        if (d10 > 1.0d) {
                            short[] sArr3 = this.f27241j;
                            if (f11 >= 2.0f) {
                                i12 = (int) (i10 / (f11 - 1.0f));
                            } else {
                                this.f27249r = (int) (((2.0f - f11) * i10) / (f11 - 1.0f));
                                i12 = i10;
                            }
                            short[] sArrC = c(this.f27243l, this.f27244m, i12);
                            this.f27243l = sArrC;
                            int i34 = i23 + i10;
                            int i35 = i23;
                            int i36 = i12;
                            e(i36, this.f27233b, sArrC, this.f27244m, sArr3, i35, sArr3, i34);
                            this.f27244m += i36;
                            i23 = i10 + i36 + i35;
                        } else {
                            int i37 = i23;
                            short[] sArr4 = this.f27241j;
                            if (f11 < 0.5f) {
                                i11 = (int) ((i10 * f11) / (1.0f - f11));
                            } else {
                                this.f27249r = (int) ((((2.0f * f11) - 1.0f) * i10) / (1.0f - f11));
                                i11 = i10;
                            }
                            int i38 = i10 + i11;
                            short[] sArrC2 = c(this.f27243l, this.f27244m, i38);
                            this.f27243l = sArrC2;
                            System.arraycopy(sArr4, i37 * i20, sArrC2, this.f27244m * i20, i10 * i20);
                            e(i11, this.f27233b, this.f27243l, this.f27244m + i10, sArr4, i37 + i10, sArr4, i37);
                            this.f27244m += i38;
                            i23 = i37 + i11;
                        }
                    }
                    if (i23 + i22 > i21) {
                        break;
                    }
                    i19 = 1;
                    f15 = f11;
                    f16 = f12;
                    d11 = d10;
                }
                int i39 = this.f27242k - i23;
                short[] sArr5 = this.f27241j;
                System.arraycopy(sArr5, i23 * i20, sArr5, 0, i39 * i20);
                this.f27242k = i39;
            }
            if (f12 != f10 || this.f27244m == i17) {
            }
            int i40 = (int) (i18 / f12);
            while (true) {
                if (i40 <= 16384 && i18 <= 16384) {
                    break;
                }
                i40 /= 2;
                i18 /= 2;
            }
            int i41 = this.f27244m - i17;
            short[] sArrC3 = c(this.f27245n, this.f27246o, i41);
            this.f27245n = sArrC3;
            System.arraycopy(this.f27243l, i17 * i20, sArrC3, this.f27246o * i20, i41 * i20);
            this.f27244m = i17;
            this.f27246o += i41;
            int i42 = 0;
            while (true) {
                i13 = this.f27246o;
                i14 = i13 - 1;
                if (i42 >= i14) {
                    break;
                }
                while (true) {
                    i15 = this.f27247p + 1;
                    int i43 = i15 * i40;
                    i16 = this.f27248q;
                    if (i43 <= i16 * i18) {
                        break;
                    }
                    this.f27243l = c(this.f27243l, this.f27244m, 1);
                    for (int i44 = 0; i44 < i20; i44++) {
                        short[] sArr6 = this.f27243l;
                        int i45 = (this.f27244m * i20) + i44;
                        short[] sArr7 = this.f27245n;
                        int i46 = (i42 * i20) + i44;
                        short s10 = sArr7[i46];
                        short s11 = sArr7[i46 + i20];
                        int i47 = this.f27248q * i18;
                        int i48 = this.f27247p;
                        int i49 = i48 * i40;
                        int i50 = (i48 + 1) * i40;
                        int i51 = i50 - i47;
                        int i52 = i50 - i49;
                        sArr6[i45] = (short) ((((i52 - i51) * s11) + (s10 * i51)) / i52);
                    }
                    this.f27248q++;
                    this.f27244m++;
                }
                this.f27247p = i15;
                if (i15 == i18) {
                    this.f27247p = 0;
                    com.google.android.exoplayer2.util.a.checkState(i16 == i40);
                    this.f27248q = 0;
                }
                i42++;
            }
            if (i14 == 0) {
                return;
            }
            short[] sArr8 = this.f27245n;
            System.arraycopy(sArr8, i14 * i20, sArr8, 0, (i13 - i14) * i20);
            this.f27246o -= i14;
            return;
        }
        a(this.f27241j, 0, this.f27242k);
        this.f27242k = 0;
        f12 = f16;
        f10 = 1.0f;
        if (f12 != f10) {
        }
    }

    public void flush() {
        this.f27242k = 0;
        this.f27244m = 0;
        this.f27246o = 0;
        this.f27247p = 0;
        this.f27248q = 0;
        this.f27249r = 0;
        this.f27250s = 0;
        this.f27251t = 0;
        this.f27252u = 0;
        this.f27253v = 0;
    }

    public void getOutput(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f27233b;
        int iMin = Math.min(iRemaining / i10, this.f27244m);
        shortBuffer.put(this.f27243l, 0, iMin * i10);
        int i11 = this.f27244m - iMin;
        this.f27244m = i11;
        short[] sArr = this.f27243l;
        System.arraycopy(sArr, iMin * i10, sArr, 0, i11 * i10);
    }

    public int getOutputSize() {
        return this.f27244m * this.f27233b * 2;
    }

    public int getPendingInputBytes() {
        return this.f27242k * this.f27233b * 2;
    }

    public void queueEndOfStream() {
        int i10 = this.f27242k;
        float f10 = this.f27234c;
        float f11 = this.f27235d;
        int i11 = this.f27244m + ((int) ((((i10 / (f10 / f11)) + this.f27246o) / (this.f27236e * f11)) + 0.5f));
        short[] sArr = this.f27241j;
        int i12 = this.f27239h;
        this.f27241j = c(sArr, i10, (i12 * 2) + i10);
        int i13 = 0;
        while (true) {
            int i14 = this.f27233b;
            if (i13 >= i12 * 2 * i14) {
                break;
            }
            this.f27241j[(i14 * i10) + i13] = 0;
            i13++;
        }
        this.f27242k = (i12 * 2) + this.f27242k;
        f();
        if (this.f27244m > i11) {
            this.f27244m = i11;
        }
        this.f27242k = 0;
        this.f27249r = 0;
        this.f27246o = 0;
    }

    public void queueInput(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f27233b;
        int i11 = iRemaining / i10;
        short[] sArrC = c(this.f27241j, this.f27242k, i11);
        this.f27241j = sArrC;
        shortBuffer.get(sArrC, this.f27242k * i10, ((i11 * i10) * 2) / 2);
        this.f27242k += i11;
        f();
    }
}
