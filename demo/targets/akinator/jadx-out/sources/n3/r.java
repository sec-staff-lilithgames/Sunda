package n3;

import b0.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: k, reason: collision with root package name */
    public static final r f75596k;

    /* renamed from: a, reason: collision with root package name */
    public final float f75597a;

    /* renamed from: b, reason: collision with root package name */
    public final float f75598b;

    /* renamed from: c, reason: collision with root package name */
    public final float f75599c;

    /* renamed from: d, reason: collision with root package name */
    public final float f75600d;

    /* renamed from: e, reason: collision with root package name */
    public final float f75601e;

    /* renamed from: f, reason: collision with root package name */
    public final float f75602f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f75603g;

    /* renamed from: h, reason: collision with root package name */
    public final float f75604h;

    /* renamed from: i, reason: collision with root package name */
    public final float f75605i;

    /* renamed from: j, reason: collision with root package name */
    public final float f75606j;

    static {
        float[] fArr = b.f75568c;
        float fD = (float) ((b.d() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f75566a;
        float f10 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f10;
        float f12 = fArr[1];
        float f13 = (fArr3[1] * f12) + f11;
        float f14 = fArr[2];
        float f15 = (fArr3[2] * f14) + f13;
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[2] * f14) + (fArr4[1] * f12) + (fArr4[0] * f10);
        float[] fArr5 = fArr2[2];
        float f17 = (f14 * fArr5[2]) + (f12 * fArr5[1]) + (f10 * fArr5[0]);
        float f18 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fC = e3.g.c((float) Math.exp(((-fD) - 42.0f) / 92.0f), 0.2777778f, 1.0f, 1.0f);
        double d10 = fC;
        if (d10 > 1.0d) {
            fC = 1.0f;
        } else if (d10 < 0.0d) {
            fC = 0.0f;
        }
        float f19 = 1.0f / ((5.0f * fD) + 1.0f);
        float f20 = f19 * f19 * f19 * f19;
        float f21 = 1.0f - f20;
        float fCbrt = (0.1f * f21 * f21 * ((float) Math.cbrt(fD * 5.0d))) + (f20 * fD);
        float fD2 = b.d() / fArr[1];
        double d11 = fD2;
        float fSqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * fCbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * fCbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * fCbrt) * f17) / 100.0d, 0.42d)};
        float f22 = fArr6[0];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr6[1];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = fArr6[2];
        float[] fArr7 = {f23, f25, (400.0f * f26) / (f26 + 27.13f)};
        f75596k = new r(fD2, e2.a(fArr7[2], 0.05f, (fArr7[0] * 2.0f) + fArr7[1], fPow), fPow, fPow, f18, 1.0f, new float[]{(((100.0f / f15) * fC) + 1.0f) - fC, (((100.0f / f16) * fC) + 1.0f) - fC, (((100.0f / f17) * fC) + 1.0f) - fC}, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public r(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f75602f = f10;
        this.f75597a = f11;
        this.f75598b = f12;
        this.f75599c = f13;
        this.f75600d = f14;
        this.f75601e = f15;
        this.f75603g = fArr;
        this.f75604h = f16;
        this.f75605i = f17;
        this.f75606j = f18;
    }
}
