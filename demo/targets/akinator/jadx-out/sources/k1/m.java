package k1;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class m {

    /* renamed from: g, reason: collision with root package name */
    public static final a f70062g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final g f70063a;

    /* renamed from: b, reason: collision with root package name */
    public final g f70064b;

    /* renamed from: c, reason: collision with root package name */
    public final g f70065c;

    /* renamed from: d, reason: collision with root package name */
    public final g f70066d;

    /* renamed from: e, reason: collision with root package name */
    public final int f70067e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f70068f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        /* renamed from: access$computeTransform-YBCOT_4, reason: not valid java name */
        public static final float[] m5113access$computeTransformYBCOT_4(a aVar, g gVar, g gVar2, int i10) {
            aVar.getClass();
            if (!r.m5121equalsimpl0(i10, r.f70087b.m5114getAbsoluteuksYyKA())) {
                return null;
            }
            long jM5109getModelxdoWZVw = gVar.m5109getModelxdoWZVw();
            e eVar = f.f70028b;
            boolean zM5104equalsimpl0 = f.m5104equalsimpl0(jM5109getModelxdoWZVw, eVar.m5099getRgbxdoWZVw());
            boolean zM5104equalsimpl02 = f.m5104equalsimpl0(gVar2.m5109getModelxdoWZVw(), eVar.m5099getRgbxdoWZVw());
            if (zM5104equalsimpl0 && zM5104equalsimpl02) {
                return null;
            }
            if (!zM5104equalsimpl0 && !zM5104equalsimpl02) {
                return null;
            }
            if (!zM5104equalsimpl0) {
                gVar = gVar2;
            }
            z zVar = (z) gVar;
            float[] xyz$ui_graphics_release = zM5104equalsimpl0 ? zVar.getWhitePoint().toXyz$ui_graphics_release() : n.f70072a.getD50Xyz$ui_graphics_release();
            float[] xyz$ui_graphics_release2 = zM5104equalsimpl02 ? zVar.getWhitePoint().toXyz$ui_graphics_release() : n.f70072a.getD50Xyz$ui_graphics_release();
            return new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]};
        }

        public final m identity$ui_graphics_release(g source) {
            kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
            return new l(source, source, r.f70087b.m5116getRelativeuksYyKA(), null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends m {

        /* renamed from: h, reason: collision with root package name */
        public final z f70069h;

        /* renamed from: i, reason: collision with root package name */
        public final z f70070i;

        /* renamed from: j, reason: collision with root package name */
        public final float[] f70071j;

        public b(z zVar, z zVar2, int i10, kotlin.jvm.internal.u uVar) {
            float[] fArrMul3x3;
            super(zVar, zVar2, zVar, zVar2, i10, null, null);
            this.f70069h = zVar;
            this.f70070i = zVar2;
            if (h.compare(zVar.getWhitePoint(), zVar2.getWhitePoint())) {
                fArrMul3x3 = h.mul3x3(zVar2.getInverseTransform$ui_graphics_release(), zVar.getTransform$ui_graphics_release());
            } else {
                float[] transform$ui_graphics_release = zVar.getTransform$ui_graphics_release();
                float[] inverseTransform$ui_graphics_release = zVar2.getInverseTransform$ui_graphics_release();
                float[] xyz$ui_graphics_release = zVar.getWhitePoint().toXyz$ui_graphics_release();
                float[] xyz$ui_graphics_release2 = zVar2.getWhitePoint().toXyz$ui_graphics_release();
                d0 whitePoint = zVar.getWhitePoint();
                n nVar = n.f70072a;
                if (!h.compare(whitePoint, nVar.getD50())) {
                    float[] transform$ui_graphics_release2 = d.f70021b.getBradford().getTransform$ui_graphics_release();
                    float[] d50Xyz$ui_graphics_release = nVar.getD50Xyz$ui_graphics_release();
                    float[] fArrCopyOf = Arrays.copyOf(d50Xyz$ui_graphics_release, d50Xyz$ui_graphics_release.length);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
                    transform$ui_graphics_release = h.mul3x3(h.chromaticAdaptation(transform$ui_graphics_release2, xyz$ui_graphics_release, fArrCopyOf), zVar.getTransform$ui_graphics_release());
                }
                if (!h.compare(zVar2.getWhitePoint(), nVar.getD50())) {
                    float[] transform$ui_graphics_release3 = d.f70021b.getBradford().getTransform$ui_graphics_release();
                    float[] d50Xyz$ui_graphics_release2 = nVar.getD50Xyz$ui_graphics_release();
                    float[] fArrCopyOf2 = Arrays.copyOf(d50Xyz$ui_graphics_release2, d50Xyz$ui_graphics_release2.length);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(fArrCopyOf2, "copyOf(this, size)");
                    inverseTransform$ui_graphics_release = h.inverse3x3(h.mul3x3(h.chromaticAdaptation(transform$ui_graphics_release3, xyz$ui_graphics_release2, fArrCopyOf2), zVar2.getTransform$ui_graphics_release()));
                }
                fArrMul3x3 = h.mul3x3(inverseTransform$ui_graphics_release, r.m5121equalsimpl0(i10, r.f70087b.m5114getAbsoluteuksYyKA()) ? h.mul3x3Diag(new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]}, transform$ui_graphics_release) : transform$ui_graphics_release);
            }
            this.f70071j = fArrMul3x3;
        }

        @Override // k1.m
        public float[] transform(float[] v10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
            z zVar = this.f70069h;
            v10[0] = (float) ((Number) zVar.getEotf().invoke(Double.valueOf(v10[0]))).doubleValue();
            v10[1] = (float) ((Number) zVar.getEotf().invoke(Double.valueOf(v10[1]))).doubleValue();
            v10[2] = (float) ((Number) zVar.getEotf().invoke(Double.valueOf(v10[2]))).doubleValue();
            h.mul3x3Float3(this.f70071j, v10);
            z zVar2 = this.f70070i;
            v10[0] = (float) ((Number) zVar2.getOetf().invoke(Double.valueOf(v10[0]))).doubleValue();
            v10[1] = (float) ((Number) zVar2.getOetf().invoke(Double.valueOf(v10[1]))).doubleValue();
            v10[2] = (float) ((Number) zVar2.getOetf().invoke(Double.valueOf(v10[2]))).doubleValue();
            return v10;
        }
    }

    public m(g gVar, g gVar2, g gVar3, g gVar4, int i10, float[] fArr, kotlin.jvm.internal.u uVar) {
        this.f70063a = gVar;
        this.f70064b = gVar2;
        this.f70065c = gVar3;
        this.f70066d = gVar4;
        this.f70067e = i10;
        this.f70068f = fArr;
    }

    public final g getDestination() {
        return this.f70064b;
    }

    /* renamed from: getRenderIntent-uksYyKA, reason: not valid java name */
    public final int m5112getRenderIntentuksYyKA() {
        return this.f70067e;
    }

    public final g getSource() {
        return this.f70063a;
    }

    public final float[] transform(float f10, float f11, float f12) {
        return transform(new float[]{f10, f11, f12});
    }

    public float[] transform(float[] v10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
        float[] xyz = this.f70065c.toXyz(v10);
        float[] fArr = this.f70068f;
        if (fArr != null) {
            xyz[0] = xyz[0] * fArr[0];
            xyz[1] = xyz[1] * fArr[1];
            xyz[2] = xyz[2] * fArr[2];
        }
        return this.f70066d.fromXyz(xyz);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m(g gVar, g gVar2, int i10, kotlin.jvm.internal.u uVar) {
        long jM5109getModelxdoWZVw = gVar.m5109getModelxdoWZVw();
        e eVar = f.f70028b;
        this(gVar, gVar2, f.m5104equalsimpl0(jM5109getModelxdoWZVw, eVar.m5099getRgbxdoWZVw()) ? h.adapt$default(gVar, n.f70072a.getD50(), null, 2, null) : gVar, f.m5104equalsimpl0(gVar2.m5109getModelxdoWZVw(), eVar.m5099getRgbxdoWZVw()) ? h.adapt$default(gVar2, n.f70072a.getD50(), null, 2, null) : gVar2, i10, a.m5113access$computeTransformYBCOT_4(f70062g, gVar, gVar2, i10), null);
    }
}
