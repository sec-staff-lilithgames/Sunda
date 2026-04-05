package io.odeeo.internal.d;

import j1.o2;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f63500a;

    /* renamed from: b, reason: collision with root package name */
    public final int f63501b;

    /* renamed from: c, reason: collision with root package name */
    public final float f63502c;

    /* renamed from: d, reason: collision with root package name */
    public final float f63503d;

    /* renamed from: e, reason: collision with root package name */
    public final float f63504e;

    /* renamed from: f, reason: collision with root package name */
    public final int f63505f;

    /* renamed from: g, reason: collision with root package name */
    public final int f63506g;

    /* renamed from: h, reason: collision with root package name */
    public final int f63507h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f63508i;

    /* renamed from: j, reason: collision with root package name */
    public short[] f63509j;

    /* renamed from: k, reason: collision with root package name */
    public int f63510k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f63511l;

    /* renamed from: m, reason: collision with root package name */
    public int f63512m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f63513n;

    /* renamed from: o, reason: collision with root package name */
    public int f63514o;

    /* renamed from: p, reason: collision with root package name */
    public int f63515p;

    /* renamed from: q, reason: collision with root package name */
    public int f63516q;

    /* renamed from: r, reason: collision with root package name */
    public int f63517r;

    /* renamed from: s, reason: collision with root package name */
    public int f63518s;

    /* renamed from: t, reason: collision with root package name */
    public int f63519t;

    /* renamed from: u, reason: collision with root package name */
    public int f63520u;

    /* renamed from: v, reason: collision with root package name */
    public int f63521v;

    public v(int i10, int i11, float f10, float f11, int i12) {
        this.f63500a = i10;
        this.f63501b = i11;
        this.f63502c = f10;
        this.f63503d = f11;
        this.f63504e = i10 / i12;
        this.f63505f = i10 / 400;
        int i13 = i10 / 65;
        this.f63506g = i13;
        int i14 = i13 * 2;
        this.f63507h = i14;
        this.f63508i = new short[i14];
        int i15 = i14 * i11;
        this.f63509j = new short[i15];
        this.f63511l = new short[i15];
        this.f63513n = new short[i15];
    }

    public final void a(short[] sArr, int i10, int i11) {
        short[] sArrC = c(this.f63511l, this.f63512m, i11);
        this.f63511l = sArrC;
        int i12 = this.f63501b;
        System.arraycopy(sArr, i10 * i12, sArrC, this.f63512m * i12, i12 * i11);
        this.f63512m += i11;
    }

    public final void b(short[] sArr, int i10, int i11) {
        int i12 = this.f63507h / i11;
        int i13 = this.f63501b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[o2.B(i16, i14, i15, i18)];
            }
            this.f63508i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f63501b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final void d(int i10) {
        int i11 = this.f63510k - i10;
        short[] sArr = this.f63509j;
        int i12 = this.f63501b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f63510k = i11;
    }

    public void flush() {
        this.f63510k = 0;
        this.f63512m = 0;
        this.f63514o = 0;
        this.f63515p = 0;
        this.f63516q = 0;
        this.f63517r = 0;
        this.f63518s = 0;
        this.f63519t = 0;
        this.f63520u = 0;
        this.f63521v = 0;
    }

    public void getOutput(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f63501b, this.f63512m);
        shortBuffer.put(this.f63511l, 0, this.f63501b * iMin);
        int i10 = this.f63512m - iMin;
        this.f63512m = i10;
        short[] sArr = this.f63511l;
        int i11 = this.f63501b;
        System.arraycopy(sArr, iMin * i11, sArr, 0, i10 * i11);
    }

    public int getOutputSize() {
        return this.f63512m * this.f63501b * 2;
    }

    public int getPendingInputBytes() {
        return this.f63510k * this.f63501b * 2;
    }

    public void queueEndOfStream() {
        int i10;
        int i11 = this.f63510k;
        float f10 = this.f63502c;
        float f11 = this.f63503d;
        int i12 = this.f63512m + ((int) ((((i11 / (f10 / f11)) + this.f63514o) / (this.f63504e * f11)) + 0.5f));
        this.f63509j = c(this.f63509j, i11, (this.f63507h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f63507h * 2;
            int i14 = this.f63501b;
            if (i13 >= i10 * i14) {
                break;
            }
            this.f63509j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f63510k += i10;
        a();
        if (this.f63512m > i12) {
            this.f63512m = i12;
        }
        this.f63510k = 0;
        this.f63517r = 0;
        this.f63514o = 0;
    }

    public void queueInput(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f63501b;
        int i11 = iRemaining / i10;
        short[] sArrC = c(this.f63509j, this.f63510k, i11);
        this.f63509j = sArrC;
        shortBuffer.get(sArrC, this.f63510k * this.f63501b, ((i10 * i11) * 2) / 2);
        this.f63510k += i11;
        a();
    }

    public final int a(int i10) {
        int iMin = Math.min(this.f63507h, this.f63517r);
        a(this.f63509j, i10, iMin);
        this.f63517r -= iMin;
        return iMin;
    }

    public final void c(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f63513n;
        int i11 = this.f63501b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f63514o - i10) * i11);
        this.f63514o -= i10;
    }

    public final void b(int i10) {
        int i11 = this.f63512m - i10;
        short[] sArrC = c(this.f63513n, this.f63514o, i11);
        this.f63513n = sArrC;
        short[] sArr = this.f63511l;
        int i12 = this.f63501b;
        System.arraycopy(sArr, i10 * i12, sArrC, this.f63514o * i12, i12 * i11);
        this.f63512m = i10;
        this.f63514o += i11;
    }

    public final int a(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f63501b;
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
        this.f63520u = i15 / i16;
        this.f63521v = i17 / i14;
        return i16;
    }

    public final short b(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f63501b];
        int i13 = this.f63516q * i11;
        int i14 = this.f63515p;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) ((((i18 - i17) * s11) + (s10 * i17)) / i18);
    }

    public final boolean a(int i10, int i11) {
        return i10 != 0 && this.f63518s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f63519t * 3;
    }

    public final int a(short[] sArr, int i10) {
        int iA;
        int i11 = this.f63500a;
        int i12 = i11 > 4000 ? i11 / 4000 : 1;
        if (this.f63501b == 1 && i12 == 1) {
            iA = a(sArr, i10, this.f63505f, this.f63506g);
        } else {
            b(sArr, i10, i12);
            int iA2 = a(this.f63508i, 0, this.f63505f / i12, this.f63506g / i12);
            if (i12 != 1) {
                int i13 = iA2 * i12;
                int i14 = i12 * 4;
                int i15 = i13 - i14;
                int i16 = i13 + i14;
                int i17 = this.f63505f;
                if (i15 < i17) {
                    i15 = i17;
                }
                int i18 = this.f63506g;
                if (i16 > i18) {
                    i16 = i18;
                }
                if (this.f63501b == 1) {
                    iA = a(sArr, i10, i15, i16);
                } else {
                    b(sArr, i10, 1);
                    iA = a(this.f63508i, 0, i15, i16);
                }
            } else {
                iA = iA2;
            }
        }
        int i19 = a(this.f63520u, this.f63521v) ? this.f63518s : iA;
        this.f63519t = this.f63520u;
        this.f63518s = iA;
        return i19;
    }

    public final int b(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (i11 / (f10 - 1.0f));
        } else {
            this.f63517r = (int) (((2.0f - f10) * i11) / (f10 - 1.0f));
            i12 = i11;
        }
        short[] sArrC = c(this.f63511l, this.f63512m, i12);
        this.f63511l = sArrC;
        a(i12, this.f63501b, sArrC, this.f63512m, sArr, i10, sArr, i10 + i11);
        this.f63512m += i12;
        return i12;
    }

    public final void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f63512m == i10) {
            return;
        }
        int i13 = this.f63500a;
        int i14 = (int) (i13 / f10);
        while (true) {
            if (i14 <= 16384 && i13 <= 16384) {
                break;
            }
            i14 /= 2;
            i13 /= 2;
        }
        b(i10);
        int i15 = 0;
        while (true) {
            int i16 = this.f63514o - 1;
            if (i15 < i16) {
                while (true) {
                    i11 = this.f63515p + 1;
                    int i17 = i11 * i14;
                    i12 = this.f63516q;
                    if (i17 <= i12 * i13) {
                        break;
                    }
                    this.f63511l = c(this.f63511l, this.f63512m, 1);
                    int i18 = 0;
                    while (true) {
                        int i19 = this.f63501b;
                        if (i18 < i19) {
                            this.f63511l[(this.f63512m * i19) + i18] = b(this.f63513n, (i19 * i15) + i18, i13, i14);
                            i18++;
                        }
                    }
                    this.f63516q++;
                    this.f63512m++;
                }
                this.f63515p = i11;
                if (i11 == i13) {
                    this.f63515p = 0;
                    io.odeeo.internal.q0.a.checkState(i12 == i14);
                    this.f63516q = 0;
                }
                i15++;
            } else {
                c(i16);
                return;
            }
        }
    }

    public final int a(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((i11 * f10) / (1.0f - f10));
        } else {
            this.f63517r = (int) ((((2.0f * f10) - 1.0f) * i11) / (1.0f - f10));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] sArrC = c(this.f63511l, this.f63512m, i13);
        this.f63511l = sArrC;
        int i14 = this.f63501b;
        System.arraycopy(sArr, i10 * i14, sArrC, this.f63512m * i14, i14 * i11);
        a(i12, this.f63501b, this.f63511l, this.f63512m + i11, sArr, i10 + i11, sArr, i10);
        this.f63512m += i13;
        return i12;
    }

    public final void a(float f10) {
        int iA;
        int i10 = this.f63510k;
        if (i10 < this.f63507h) {
            return;
        }
        int iB = 0;
        do {
            if (this.f63517r > 0) {
                iA = a(iB);
            } else {
                int iA2 = a(this.f63509j, iB);
                if (f10 > 1.0d) {
                    iB = b(this.f63509j, iB, f10, iA2) + iA2 + iB;
                } else {
                    iA = a(this.f63509j, iB, f10, iA2);
                }
            }
            iB = iA + iB;
        } while (this.f63507h + iB <= i10);
        d(iB);
    }

    public final void a() {
        int i10 = this.f63512m;
        float f10 = this.f63502c;
        float f11 = this.f63503d;
        float f12 = f10 / f11;
        float f13 = this.f63504e * f11;
        double d10 = f12;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            a(this.f63509j, 0, this.f63510k);
            this.f63510k = 0;
        } else {
            a(f12);
        }
        if (f13 != 1.0f) {
            a(f13, i10);
        }
    }

    public static void a(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
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
}
