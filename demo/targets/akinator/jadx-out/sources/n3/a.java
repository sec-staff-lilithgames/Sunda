package n3;

import android.graphics.Color;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f75560a;

    /* renamed from: b, reason: collision with root package name */
    public final float f75561b;

    /* renamed from: c, reason: collision with root package name */
    public final float f75562c;

    /* renamed from: d, reason: collision with root package name */
    public final float f75563d;

    /* renamed from: e, reason: collision with root package name */
    public final float f75564e;

    /* renamed from: f, reason: collision with root package name */
    public final float f75565f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f75560a = f10;
        this.f75561b = f11;
        this.f75562c = f12;
        this.f75563d = f13;
        this.f75564e = f14;
        this.f75565f = f15;
    }

    public static a a(int i10) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        b(i10, r.f75596k, fArr, fArr2);
        return new a(fArr2[0], fArr2[1], fArr[0], fArr[4], fArr[5], fArr[6]);
    }

    public static void b(int i10, r rVar, float[] fArr, float[] fArr2) {
        float fC = b.c(Color.red(i10));
        float fC2 = b.c(Color.green(i10));
        float fC3 = b.c(Color.blue(i10));
        float[][] fArr3 = b.f75569d;
        float[] fArr4 = fArr3[0];
        float f10 = (fArr4[2] * fC3) + (fArr4[1] * fC2) + (fArr4[0] * fC);
        fArr2[0] = f10;
        float[] fArr5 = fArr3[1];
        float f11 = (fArr5[2] * fC3) + (fArr5[1] * fC2) + (fArr5[0] * fC);
        fArr2[1] = f11;
        float[] fArr6 = fArr3[2];
        float f12 = (fC3 * fArr6[2]) + (fC2 * fArr6[1]) + (fC * fArr6[0]);
        fArr2[2] = f12;
        float[][] fArr7 = b.f75566a;
        float[] fArr8 = fArr7[0];
        float f13 = (fArr8[2] * f12) + (fArr8[1] * f11) + (fArr8[0] * f10);
        float[] fArr9 = fArr7[1];
        float f14 = (fArr9[2] * f12) + (fArr9[1] * f11) + (fArr9[0] * f10);
        float[] fArr10 = fArr7[2];
        float f15 = (f12 * fArr10[2]) + (f11 * fArr10[1]) + (f10 * fArr10[0]);
        float[] fArr11 = rVar.f75603g;
        float f16 = rVar.f75605i;
        float f17 = rVar.f75600d;
        float f18 = rVar.f75597a;
        float f19 = fArr11[0] * f13;
        float f20 = fArr11[1] * f14;
        float f21 = fArr11[2] * f15;
        float f22 = rVar.f75604h;
        float fPow = (float) Math.pow((Math.abs(f19) * f22) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f20) * f22) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((Math.abs(f21) * f22) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f19) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f20) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f21) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d10 = fSignum3;
        float f23 = ((float) (((fSignum2 * (-12.0d)) + (fSignum * 11.0d)) + d10)) / 11.0f;
        float f24 = ((float) ((fSignum + fSignum2) - (d10 * 2.0d))) / 9.0f;
        float f25 = fSignum2 * 20.0f;
        float f26 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f25)) / 20.0f;
        float f27 = (((fSignum * 40.0f) + f25) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f24, f23)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f28 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f27 * rVar.f75598b) / f18, rVar.f75606j * f17)) * 100.0f;
        float fSqrt = (4.0f / f17) * ((float) Math.sqrt(fPow4 / 100.0f)) * (f18 + 4.0f) * f16;
        float fSqrt2 = ((float) Math.sqrt(fPow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, rVar.f75602f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) fAtan2) < 20.14d ? fAtan2 + 360.0f : fAtan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * rVar.f75601e) * rVar.f75599c) * ((float) Math.sqrt((f24 * f24) + (f23 * f23)))) / (f26 + 0.305f), 0.9d));
        float f29 = fSqrt2 * f16;
        float fSqrt3 = ((float) Math.sqrt((r0 * f17) / r10)) * 50.0f;
        float f30 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * f29) + 1.0f)) * 43.85965f;
        double d11 = f28;
        float fCos = ((float) Math.cos(d11)) * fLog;
        float fSin = fLog * ((float) Math.sin(d11));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt2;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fSqrt;
            fArr[2] = f29;
            fArr[3] = fSqrt3;
            fArr[4] = f30;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    public static a c(float f10, float f11, float f12) {
        r rVar = r.f75596k;
        float f13 = rVar.f75600d;
        Math.sqrt(f10 / 100.0d);
        float f14 = rVar.f75597a + 4.0f;
        float f15 = rVar.f75605i * f11;
        Math.sqrt(((f11 / ((float) Math.sqrt(r1))) * rVar.f75600d) / f14);
        float f16 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float fLog = ((float) Math.log((f15 * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f12) / 180.0f;
        return new a(f12, f11, f10, f16, fLog * ((float) Math.cos(d10)), fLog * ((float) Math.sin(d10)));
    }

    public static void getM3HCTfromColor(int i10, float[] fArr) {
        b(i10, r.f75596k, null, fArr);
        fArr[2] = b.b(i10);
    }

    public static int toColor(float f10, float f11, float f12) {
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        r rVar = r.f75596k;
        float f19 = f11;
        if (f19 < 1.0d || Math.round(f12) <= 0.0d || Math.round(f12) >= 100.0d) {
            return b.a(f12);
        }
        float f20 = 0.0f;
        float fMin = f10 < 0.0f ? 0.0f : Math.min(360.0f, f10);
        float f21 = 0.0f;
        boolean z10 = true;
        a aVar = null;
        float f22 = f19;
        while (Math.abs(f21 - f19) >= 0.4f) {
            float f23 = 100.0f;
            float f24 = 1000.0f;
            float f25 = f20;
            float f26 = 1000.0f;
            a aVar2 = null;
            while (true) {
                if (Math.abs(f25 - f23) <= 0.01f) {
                    f13 = fMin;
                    f14 = f19;
                    f15 = f20;
                    f16 = f22;
                    f17 = 2.0f;
                    break;
                }
                float f27 = ((f23 - f25) / 2.0f) + f25;
                f15 = f20;
                int iD = c(f27, f22, fMin).d(r.f75596k);
                float fB = b.b(iD);
                float fAbs = Math.abs(f12 - fB);
                if (fAbs < 0.2f) {
                    a aVarA = a(iD);
                    f17 = 2.0f;
                    f14 = f19;
                    a aVarC = c(aVarA.f75562c, aVarA.f75561b, fMin);
                    f13 = fMin;
                    float f28 = aVarA.f75563d - aVarC.f75563d;
                    float f29 = aVarA.f75564e - aVarC.f75564e;
                    float f30 = aVarA.f75565f - aVarC.f75565f;
                    double dSqrt = Math.sqrt((f30 * f30) + (f29 * f29) + (f28 * f28));
                    f18 = fB;
                    f16 = f22;
                    float fPow = (float) (Math.pow(dSqrt, 0.63d) * 1.41d);
                    if (fPow <= 1.0f) {
                        f26 = fPow;
                        aVar2 = aVarA;
                        f24 = fAbs;
                    }
                } else {
                    f13 = fMin;
                    f14 = f19;
                    f18 = fB;
                    f16 = f22;
                    f17 = 2.0f;
                }
                if (f24 == f15 && f26 == f15) {
                    break;
                }
                if (f18 < f12) {
                    f25 = f27;
                } else {
                    f23 = f27;
                }
                f22 = f16;
                f20 = f15;
                f19 = f14;
                fMin = f13;
            }
            if (!z10) {
                if (aVar2 == null) {
                    f19 = f16;
                } else {
                    f21 = f16;
                    aVar = aVar2;
                    f19 = f14;
                }
                f22 = ((f19 - f21) / f17) + f21;
                f20 = f15;
            } else {
                if (aVar2 != null) {
                    return aVar2.d(rVar);
                }
                f22 = ((f14 - f21) / f17) + f21;
                z10 = false;
                f20 = f15;
                f19 = f14;
            }
            fMin = f13;
        }
        return aVar == null ? b.a(f12) : aVar.d(rVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(n3.r r20) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.a.d(n3.r):int");
    }
}
