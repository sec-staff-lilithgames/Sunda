package g3;

import androidx.constraintlayout.widget.k;
import com.ironsource.C3191e4;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 implements Comparable {

    /* renamed from: u, reason: collision with root package name */
    public static final String[] f57031u = {C3191e4.h.L, "x", "y", "width", "height", "pathRotate"};

    /* renamed from: b, reason: collision with root package name */
    public a3.g f57032b;

    /* renamed from: e, reason: collision with root package name */
    public float f57034e;

    /* renamed from: f, reason: collision with root package name */
    public float f57035f;

    /* renamed from: g, reason: collision with root package name */
    public float f57036g;

    /* renamed from: h, reason: collision with root package name */
    public float f57037h;

    /* renamed from: i, reason: collision with root package name */
    public float f57038i;

    /* renamed from: j, reason: collision with root package name */
    public float f57039j;

    /* renamed from: c, reason: collision with root package name */
    public int f57033c = 0;

    /* renamed from: k, reason: collision with root package name */
    public float f57040k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    public float f57041l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public int f57042m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f57043n = -1;

    /* renamed from: o, reason: collision with root package name */
    public float f57044o = Float.NaN;

    /* renamed from: p, reason: collision with root package name */
    public s f57045p = null;

    /* renamed from: q, reason: collision with root package name */
    public LinkedHashMap f57046q = new LinkedHashMap();

    /* renamed from: r, reason: collision with root package name */
    public int f57047r = 0;

    /* renamed from: s, reason: collision with root package name */
    public double[] f57048s = new double[18];

    /* renamed from: t, reason: collision with root package name */
    public double[] f57049t = new double[18];

    public static boolean a(float f10, float f11) {
        return (Float.isNaN(f10) || Float.isNaN(f11)) ? Float.isNaN(f10) != Float.isNaN(f11) : Math.abs(f10 - f11) > 1.0E-6f;
    }

    public static void e(float f10, float f11, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f16 = (float) dArr[i10];
            double d10 = dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f12 = f16;
            } else if (i11 == 2) {
                f14 = f16;
            } else if (i11 == 3) {
                f13 = f16;
            } else if (i11 == 4) {
                f15 = f16;
            }
        }
        float f17 = f12 - ((0.0f * f13) / 2.0f);
        float f18 = f14 - ((0.0f * f15) / 2.0f);
        fArr[0] = (((f13 * 1.0f) + f17) * f10) + ((1.0f - f10) * f17) + 0.0f;
        fArr[1] = (((f15 * 1.0f) + f18) * f11) + ((1.0f - f11) * f18) + 0.0f;
    }

    public void applyParameters(k.a aVar) {
        this.f57032b = a3.g.getInterpolator(aVar.f5439d.f5491d);
        k.c cVar = aVar.f5439d;
        this.f57042m = cVar.f5492e;
        this.f57043n = cVar.f5489b;
        this.f57040k = cVar.f5495h;
        this.f57033c = cVar.f5493f;
        int i10 = cVar.f5490c;
        this.f57041l = aVar.f5438c.f5505e;
        this.f57044o = aVar.f5440e.C;
        for (String str : aVar.f5442g.keySet()) {
            androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) aVar.f5442g.get(str);
            if (bVar != null && bVar.isContinuous()) {
                this.f57046q.put(str, bVar);
            }
        }
    }

    public final void b(double d10, int[] iArr, double[] dArr, float[] fArr, int i10) {
        float fSin = this.f57036g;
        float fCos = this.f57037h;
        float f10 = this.f57038i;
        float f11 = this.f57039j;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f12 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                fSin = f12;
            } else if (i12 == 2) {
                fCos = f12;
            } else if (i12 == 3) {
                f10 = f12;
            } else if (i12 == 4) {
                f11 = f12;
            }
        }
        s sVar = this.f57045p;
        if (sVar != null) {
            float[] fArr2 = new float[2];
            sVar.getCenter(d10, fArr2, new float[2]);
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            double d11 = f13;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) (((Math.sin(d13) * d12) + d11) - (f10 / 2.0f));
            fCos = (float) ((f14 - (Math.cos(d13) * d12)) - (f11 / 2.0f));
        }
        fArr[i10] = (f10 / 2.0f) + fSin + 0.0f;
        fArr[i10 + 1] = (f11 / 2.0f) + fCos + 0.0f;
    }

    public final void c(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.f57036g;
        float fCos = this.f57037h;
        float f11 = this.f57038i;
        float f12 = this.f57039j;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f13 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f10 = f13;
            } else if (i12 == 2) {
                fCos = f13;
            } else if (i12 == 3) {
                f11 = f13;
            } else if (i12 == 4) {
                f12 = f13;
            }
        }
        s sVar = this.f57045p;
        if (sVar != null) {
            float centerX = sVar.getCenterX();
            float centerY = this.f57045p.getCenterY();
            double d10 = f10;
            double d11 = fCos;
            float fSin = (float) (((Math.sin(d11) * d10) + centerX) - (f11 / 2.0f));
            fCos = (float) ((centerY - (Math.cos(d11) * d10)) - (f12 / 2.0f));
            f10 = fSin;
        }
        float f14 = f11 + f10;
        float f15 = f12 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i10] = f10 + 0.0f;
        fArr[i10 + 1] = fCos + 0.0f;
        fArr[i10 + 2] = f14 + 0.0f;
        fArr[i10 + 3] = fCos + 0.0f;
        fArr[i10 + 4] = f14 + 0.0f;
        fArr[i10 + 5] = f15 + 0.0f;
        fArr[i10 + 6] = f10 + 0.0f;
        fArr[i10 + 7] = f15 + 0.0f;
    }

    public void configureRelativeTo(s sVar) {
        double d10 = this.f57041l;
        sVar.f57229j[0].getPos(d10, sVar.f57235p);
        a3.d dVar = sVar.f57230k;
        if (dVar != null) {
            double[] dArr = sVar.f57235p;
            if (dArr.length > 0) {
                dVar.getPos(d10, dArr);
            }
        }
    }

    public final void d(float f10, float f11, float f12, float f13) {
        this.f57036g = f10;
        this.f57037h = f11;
        this.f57038i = f12;
        this.f57039j = f13;
    }

    public void setupRelative(s sVar, j0 j0Var) {
        double d10 = (((this.f57038i / 2.0f) + this.f57036g) - j0Var.f57036g) - (j0Var.f57038i / 2.0f);
        double d11 = (((this.f57039j / 2.0f) + this.f57037h) - j0Var.f57037h) - (j0Var.f57039j / 2.0f);
        this.f57045p = sVar;
        this.f57036g = (float) Math.hypot(d11, d10);
        if (Float.isNaN(this.f57044o)) {
            this.f57037h = (float) (Math.atan2(d11, d10) + 1.5707963267948966d);
        } else {
            this.f57037h = (float) Math.toRadians(this.f57044o);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(j0 j0Var) {
        return Float.compare(this.f57035f, j0Var.f57035f);
    }
}
