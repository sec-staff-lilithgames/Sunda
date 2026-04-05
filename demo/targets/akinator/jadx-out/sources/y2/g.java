package y2;

import com.ironsource.C3191e4;
import j1.o2;
import java.util.HashMap;
import y2.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class g implements Comparable {

    /* renamed from: t, reason: collision with root package name */
    public static final String[] f94000t = {C3191e4.h.L, "x", "y", "width", "height", "pathRotate"};

    /* renamed from: b, reason: collision with root package name */
    public a3.g f94001b;

    /* renamed from: c, reason: collision with root package name */
    public int f94002c;

    /* renamed from: e, reason: collision with root package name */
    public float f94003e;

    /* renamed from: f, reason: collision with root package name */
    public float f94004f;

    /* renamed from: g, reason: collision with root package name */
    public float f94005g;

    /* renamed from: h, reason: collision with root package name */
    public float f94006h;

    /* renamed from: i, reason: collision with root package name */
    public float f94007i;

    /* renamed from: j, reason: collision with root package name */
    public float f94008j;

    /* renamed from: k, reason: collision with root package name */
    public float f94009k;

    /* renamed from: l, reason: collision with root package name */
    public int f94010l;

    /* renamed from: m, reason: collision with root package name */
    public String f94011m;

    /* renamed from: n, reason: collision with root package name */
    public float f94012n;

    /* renamed from: o, reason: collision with root package name */
    public e f94013o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f94014p;

    /* renamed from: q, reason: collision with root package name */
    public final int f94015q;

    /* renamed from: r, reason: collision with root package name */
    public double[] f94016r;

    /* renamed from: s, reason: collision with root package name */
    public double[] f94017s;

    public g() {
        this.f94002c = 0;
        this.f94009k = Float.NaN;
        this.f94010l = -1;
        this.f94011m = null;
        this.f94012n = Float.NaN;
        this.f94013o = null;
        this.f94014p = new HashMap();
        this.f94015q = 0;
        this.f94016r = new double[18];
        this.f94017s = new double[18];
    }

    public static boolean a(float f10, float f11) {
        return (Float.isNaN(f10) || Float.isNaN(f11)) ? Float.isNaN(f10) != Float.isNaN(f11) : Math.abs(f10 - f11) > 1.0E-6f;
    }

    public static void c(float f10, float f11, float[] fArr, int[] iArr, double[] dArr) {
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f16 = (float) dArr[i10];
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

    public void applyParameters(h hVar) {
        d3.g gVar;
        this.f94001b = a3.g.getInterpolator(hVar.f94019b.f94024b);
        h.a aVar = hVar.f94019b;
        this.f94010l = aVar.f94025c;
        this.f94011m = aVar.f94023a;
        this.f94009k = aVar.f94027e;
        this.f94002c = aVar.f94026d;
        hVar.f94020c.getClass();
        c3.f fVar = hVar.f94018a;
        if (fVar != null && (gVar = fVar.f11777a) != null) {
            this.f94012n = gVar.H;
        }
        for (String str : hVar.getCustomAttributeNames()) {
            c customAttribute = hVar.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.f94014p.put(str, customAttribute);
            }
        }
    }

    public final void b(double d10, int[] iArr, double[] dArr, float[] fArr, int i10) {
        float fSin = this.f94005g;
        float fCos = this.f94006h;
        float f10 = this.f94007i;
        float f11 = this.f94008j;
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
        e eVar = this.f94013o;
        if (eVar != null) {
            float[] fArr2 = new float[2];
            eVar.getCenter(d10, fArr2, new float[2]);
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

    public void configureRelativeTo(e eVar) {
        double d10 = Float.NaN;
        eVar.f93967g[0].getPos(d10, eVar.f93973m);
        a3.d dVar = eVar.f93968h;
        if (dVar != null) {
            double[] dArr = eVar.f93973m;
            if (dArr.length > 0) {
                dVar.getPos(d10, dArr);
            }
        }
    }

    public void setupRelative(e eVar, g gVar) {
        double d10 = (((this.f94007i / 2.0f) + this.f94005g) - gVar.f94005g) - (gVar.f94007i / 2.0f);
        double d11 = (((this.f94008j / 2.0f) + this.f94006h) - gVar.f94006h) - (gVar.f94008j / 2.0f);
        this.f94013o = eVar;
        this.f94005g = (float) Math.hypot(d11, d10);
        if (Float.isNaN(this.f94012n)) {
            this.f94006h = (float) (Math.atan2(d11, d10) + 1.5707963267948966d);
        } else {
            this.f94006h = (float) Math.toRadians(this.f94012n);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(g gVar) {
        return Float.compare(this.f94004f, gVar.f94004f);
    }

    public g(int i10, int i11, z2.d dVar, g gVar, g gVar2) {
        float fMin;
        float fA;
        this.f94002c = 0;
        this.f94009k = Float.NaN;
        this.f94010l = -1;
        this.f94011m = null;
        this.f94012n = Float.NaN;
        this.f94013o = null;
        this.f94014p = new HashMap();
        this.f94015q = 0;
        this.f94016r = new double[18];
        this.f94017s = new double[18];
        if (gVar.f94011m != null) {
            float f10 = dVar.f97454a / 100.0f;
            this.f94003e = f10;
            this.f94002c = 0;
            this.f94015q = dVar.f97498m;
            float f11 = Float.isNaN(dVar.f97492g) ? f10 : dVar.f97492g;
            float f12 = Float.isNaN(dVar.f97493h) ? f10 : dVar.f97493h;
            float f13 = gVar2.f94007i;
            float f14 = gVar.f94007i;
            float f15 = gVar2.f94008j;
            float f16 = gVar.f94008j;
            this.f94004f = this.f94003e;
            this.f94007i = (int) (((f13 - f14) * f11) + f14);
            this.f94008j = (int) (((f15 - f16) * f12) + f16);
            int i12 = dVar.f97498m;
            if (i12 == 1) {
                float f17 = Float.isNaN(dVar.f97494i) ? f10 : dVar.f97494i;
                float f18 = gVar2.f94005g;
                float f19 = gVar.f94005g;
                this.f94005g = o2.a(f18, f19, f17, f19);
                f10 = Float.isNaN(dVar.f97495j) ? f10 : dVar.f97495j;
                float f20 = gVar2.f94006h;
                float f21 = gVar.f94006h;
                this.f94006h = o2.a(f20, f21, f10, f21);
            } else if (i12 != 2) {
                float f22 = Float.isNaN(dVar.f97494i) ? f10 : dVar.f97494i;
                float f23 = gVar2.f94005g;
                float f24 = gVar.f94005g;
                this.f94005g = o2.a(f23, f24, f22, f24);
                f10 = Float.isNaN(dVar.f97495j) ? f10 : dVar.f97495j;
                float f25 = gVar2.f94006h;
                float f26 = gVar.f94006h;
                this.f94006h = o2.a(f25, f26, f10, f26);
            } else {
                if (Float.isNaN(dVar.f97494i)) {
                    float f27 = gVar2.f94005g;
                    float f28 = gVar.f94005g;
                    fMin = o2.a(f27, f28, f10, f28);
                } else {
                    fMin = Math.min(f12, f11) * dVar.f97494i;
                }
                this.f94005g = fMin;
                if (Float.isNaN(dVar.f97495j)) {
                    float f29 = gVar2.f94006h;
                    float f30 = gVar.f94006h;
                    fA = o2.a(f29, f30, f10, f30);
                } else {
                    fA = dVar.f97495j;
                }
                this.f94006h = fA;
            }
            this.f94011m = gVar.f94011m;
            this.f94001b = a3.g.getInterpolator(dVar.f97490e);
            this.f94010l = dVar.f97491f;
            return;
        }
        int i13 = dVar.f97498m;
        if (i13 == 1) {
            float f31 = dVar.f97454a / 100.0f;
            this.f94003e = f31;
            this.f94002c = 0;
            float f32 = Float.isNaN(dVar.f97492g) ? f31 : dVar.f97492g;
            float f33 = Float.isNaN(dVar.f97493h) ? f31 : dVar.f97493h;
            float f34 = gVar2.f94007i - gVar.f94007i;
            float f35 = gVar2.f94008j - gVar.f94008j;
            this.f94004f = this.f94003e;
            f31 = Float.isNaN(dVar.f97494i) ? f31 : dVar.f97494i;
            float f36 = gVar.f94005g;
            float f37 = gVar.f94007i;
            float f38 = gVar.f94006h;
            float f39 = gVar.f94008j;
            float f40 = f31;
            float f41 = ((gVar2.f94007i / 2.0f) + gVar2.f94005g) - ((f37 / 2.0f) + f36);
            float f42 = ((gVar2.f94008j / 2.0f) + gVar2.f94006h) - ((f39 / 2.0f) + f38);
            float f43 = f41 * f40;
            float f44 = (f34 * f32) / 2.0f;
            this.f94005g = (int) ((f36 + f43) - f44);
            float f45 = f42 * f40;
            float f46 = (f35 * f33) / 2.0f;
            this.f94006h = (int) ((f38 + f45) - f46);
            this.f94007i = (int) (f37 + r8);
            this.f94008j = (int) (f39 + r9);
            float f47 = Float.isNaN(dVar.f97495j) ? 0.0f : dVar.f97495j;
            this.f94015q = 1;
            float f48 = (int) ((gVar.f94005g + f43) - f44);
            float f49 = (int) ((gVar.f94006h + f45) - f46);
            this.f94005g = f48 + ((-f42) * f47);
            this.f94006h = f49 + (f41 * f47);
            this.f94011m = this.f94011m;
            this.f94001b = a3.g.getInterpolator(dVar.f97490e);
            this.f94010l = dVar.f97491f;
            return;
        }
        if (i13 != 2) {
            float f50 = dVar.f97454a / 100.0f;
            this.f94003e = f50;
            this.f94002c = 0;
            float f51 = Float.isNaN(dVar.f97492g) ? f50 : dVar.f97492g;
            float f52 = Float.isNaN(dVar.f97493h) ? f50 : dVar.f97493h;
            float f53 = gVar2.f94007i;
            float f54 = gVar.f94007i;
            float f55 = f53 - f54;
            float f56 = gVar2.f94008j;
            float f57 = gVar.f94008j;
            float f58 = f56 - f57;
            this.f94004f = this.f94003e;
            float f59 = gVar.f94005g;
            float f60 = gVar.f94006h;
            float f61 = ((f53 / 2.0f) + gVar2.f94005g) - ((f54 / 2.0f) + f59);
            float f62 = ((f56 / 2.0f) + gVar2.f94006h) - ((f57 / 2.0f) + f60);
            float f63 = (f55 * f51) / 2.0f;
            this.f94005g = (int) (((f61 * f50) + f59) - f63);
            float f64 = (f58 * f52) / 2.0f;
            this.f94006h = (int) (((f62 * f50) + f60) - f64);
            this.f94007i = (int) (f54 + r12);
            this.f94008j = (int) (f57 + r15);
            float f65 = Float.isNaN(dVar.f97494i) ? f50 : dVar.f97494i;
            float f66 = Float.isNaN(dVar.f97497l) ? 0.0f : dVar.f97497l;
            f50 = Float.isNaN(dVar.f97495j) ? f50 : dVar.f97495j;
            float f67 = Float.isNaN(dVar.f97496k) ? 0.0f : dVar.f97496k;
            this.f94015q = 0;
            this.f94005g = (int) (((f67 * f62) + ((f65 * f61) + gVar.f94005g)) - f63);
            this.f94006h = (int) (((f62 * f50) + ((f61 * f66) + gVar.f94006h)) - f64);
            this.f94001b = a3.g.getInterpolator(dVar.f97490e);
            this.f94010l = dVar.f97491f;
            return;
        }
        float f68 = dVar.f97454a / 100.0f;
        this.f94003e = f68;
        this.f94002c = 0;
        float f69 = Float.isNaN(dVar.f97492g) ? f68 : dVar.f97492g;
        float f70 = Float.isNaN(dVar.f97493h) ? f68 : dVar.f97493h;
        float f71 = gVar2.f94007i;
        float f72 = f71 - gVar.f94007i;
        float f73 = gVar2.f94008j;
        float f74 = f73 - gVar.f94008j;
        this.f94004f = this.f94003e;
        float f75 = gVar.f94005g;
        float f76 = gVar.f94006h;
        float f77 = (f71 / 2.0f) + gVar2.f94005g;
        float f78 = (f73 / 2.0f) + gVar2.f94006h;
        float f79 = f72 * f69;
        this.f94005g = (int) ((((f77 - ((r9 / 2.0f) + f75)) * f68) + f75) - (f79 / 2.0f));
        float f80 = f74 * f70;
        this.f94006h = (int) ((((f78 - ((r12 / 2.0f) + f76)) * f68) + f76) - (f80 / 2.0f));
        this.f94007i = (int) (r9 + f79);
        this.f94008j = (int) (r12 + f80);
        this.f94015q = 2;
        if (!Float.isNaN(dVar.f97494i)) {
            this.f94005g = (int) (dVar.f97494i * (i10 - ((int) this.f94007i)));
        }
        if (!Float.isNaN(dVar.f97495j)) {
            this.f94006h = (int) (dVar.f97495j * (i11 - ((int) this.f94008j)));
        }
        this.f94011m = this.f94011m;
        this.f94001b = a3.g.getInterpolator(dVar.f97490e);
        this.f94010l = dVar.f97491f;
    }
}
