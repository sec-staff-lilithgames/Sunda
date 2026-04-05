package k1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f70039a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f70040b;

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f70041c;

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f70042d;

    /* renamed from: e, reason: collision with root package name */
    public static final z f70043e;

    /* renamed from: f, reason: collision with root package name */
    public static final z f70044f;

    /* renamed from: g, reason: collision with root package name */
    public static final z f70045g;

    /* renamed from: h, reason: collision with root package name */
    public static final z f70046h;

    /* renamed from: i, reason: collision with root package name */
    public static final z f70047i;

    /* renamed from: j, reason: collision with root package name */
    public static final z f70048j;

    /* renamed from: k, reason: collision with root package name */
    public static final z f70049k;

    /* renamed from: l, reason: collision with root package name */
    public static final z f70050l;

    /* renamed from: m, reason: collision with root package name */
    public static final z f70051m;

    /* renamed from: n, reason: collision with root package name */
    public static final z f70052n;

    /* renamed from: o, reason: collision with root package name */
    public static final z f70053o;

    /* renamed from: p, reason: collision with root package name */
    public static final z f70054p;

    /* renamed from: q, reason: collision with root package name */
    public static final z f70055q;

    /* renamed from: r, reason: collision with root package name */
    public static final z f70056r;

    /* renamed from: s, reason: collision with root package name */
    public static final e0 f70057s;

    /* renamed from: t, reason: collision with root package name */
    public static final o f70058t;

    /* renamed from: u, reason: collision with root package name */
    public static final z f70059u;

    /* renamed from: v, reason: collision with root package name */
    public static final p f70060v;

    /* renamed from: w, reason: collision with root package name */
    public static final g[] f70061w;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f70040b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f70041c = fArr2;
        c0 c0Var = new c0(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f70042d = c0Var;
        c0 c0Var2 = new c0(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        n nVar = n.f70072a;
        z zVar = new z("sRGB IEC61966-2.1", fArr, nVar.getD65(), c0Var, 0);
        f70043e = zVar;
        z zVar2 = new z("sRGB IEC61966-2.1 (Linear)", fArr, nVar.getD65(), 1.0d, 0.0f, 1.0f, 1);
        f70044f = zVar2;
        z zVar3 = new z("scRGB-nl IEC 61966-2-2:2003", fArr, nVar.getD65(), null, i.f70037e, j.f70038e, -0.799f, 2.399f, c0Var, 2);
        f70045g = zVar3;
        z zVar4 = new z("scRGB IEC 61966-2-2:2003", fArr, nVar.getD65(), 1.0d, -0.5f, 7.499f, 3);
        f70046h = zVar4;
        z zVar5 = new z("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, nVar.getD65(), new c0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        f70047i = zVar5;
        z zVar6 = new z("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, nVar.getD65(), new c0(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        f70048j = zVar6;
        z zVar7 = new z("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new d0(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f70049k = zVar7;
        z zVar8 = new z("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, nVar.getD65(), c0Var, 7);
        f70050l = zVar8;
        z zVar9 = new z("NTSC (1953)", fArr2, nVar.getC(), new c0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        f70051m = zVar9;
        z zVar10 = new z("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, nVar.getD65(), new c0(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        f70052n = zVar10;
        z zVar11 = new z("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, nVar.getD65(), 2.2d, 0.0f, 1.0f, 10);
        f70053o = zVar11;
        z zVar12 = new z("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, nVar.getD50(), new c0(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        f70054p = zVar12;
        z zVar13 = new z("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, nVar.getD60(), 1.0d, -65504.0f, 65504.0f, 12);
        f70055q = zVar13;
        z zVar14 = new z("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, nVar.getD60(), 1.0d, -65504.0f, 65504.0f, 13);
        f70056r = zVar14;
        e0 e0Var = new e0("Generic XYZ", 14);
        f70057s = e0Var;
        o oVar = new o("Generic L*a*b*", 15);
        f70058t = oVar;
        z zVar15 = new z("None", fArr, nVar.getD65(), c0Var2, 16);
        f70059u = zVar15;
        p pVar = new p("Oklab", 17);
        f70060v = pVar;
        f70061w = new g[]{zVar, zVar2, zVar3, zVar4, zVar5, zVar6, zVar7, zVar8, zVar9, zVar10, zVar11, zVar12, zVar13, zVar14, e0Var, oVar, zVar15, pVar};
    }

    public final z getAces() {
        return f70055q;
    }

    public final z getAcescg() {
        return f70056r;
    }

    public final z getAdobeRgb() {
        return f70053o;
    }

    public final z getBt2020() {
        return f70048j;
    }

    public final z getBt709() {
        return f70047i;
    }

    public final g getCieLab() {
        return f70058t;
    }

    public final g getCieXyz() {
        return f70057s;
    }

    public final g getColorSpace$ui_graphics_release(int i10) {
        return getColorSpacesArray$ui_graphics_release()[i10];
    }

    public final g[] getColorSpacesArray$ui_graphics_release() {
        return f70061w;
    }

    public final z getDciP3() {
        return f70049k;
    }

    public final z getDisplayP3() {
        return f70050l;
    }

    public final z getExtendedSrgb() {
        return f70045g;
    }

    public final z getLinearExtendedSrgb() {
        return f70046h;
    }

    public final z getLinearSrgb() {
        return f70044f;
    }

    public final z getNtsc1953() {
        return f70051m;
    }

    public final float[] getNtsc1953Primaries$ui_graphics_release() {
        return f70041c;
    }

    public final g getOklab() {
        return f70060v;
    }

    public final z getProPhotoRgb() {
        return f70054p;
    }

    public final z getSmpteC() {
        return f70052n;
    }

    public final z getSrgb() {
        return f70043e;
    }

    public final float[] getSrgbPrimaries$ui_graphics_release() {
        return f70040b;
    }

    public final c0 getSrgbTransferParameters$ui_graphics_release() {
        return f70042d;
    }

    public final z getUnspecified$ui_graphics_release() {
        return f70059u;
    }

    public final g match(float[] toXYZD50, c0 function) {
        kotlin.jvm.internal.e0.checkNotNullParameter(toXYZD50, "toXYZD50");
        kotlin.jvm.internal.e0.checkNotNullParameter(function, "function");
        for (g gVar : f70061w) {
            if (f.m5104equalsimpl0(gVar.m5109getModelxdoWZVw(), f.f70028b.m5099getRgbxdoWZVw())) {
                z zVar = (z) h.adapt$default(gVar, n.f70072a.getD50(), null, 2, null);
                if (h.compare(toXYZD50, zVar.getTransform$ui_graphics_release()) && h.compare(function, zVar.getTransferParameters())) {
                    return gVar;
                }
            }
        }
        return null;
    }
}
