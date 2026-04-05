package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface l1 {
    /* renamed from: addPath-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m4840addPathUv8p0NA$default(l1 l1Var, l1 l1Var2, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i10 & 2) != 0) {
            j10 = i1.h.f59344b.m4173getZeroF1C5BW0();
        }
        l1Var.mo4805addPathUv8p0NA(l1Var2, j10);
    }

    void addArc(i1.j jVar, float f10, float f11);

    void addArcRad(i1.j jVar, float f10, float f11);

    void addOval(i1.j jVar);

    /* renamed from: addPath-Uv8p0NA */
    void mo4805addPathUv8p0NA(l1 l1Var, long j10);

    void addRect(i1.j jVar);

    void addRoundRect(i1.l lVar);

    void arcTo(i1.j jVar, float f10, float f11, boolean z10);

    default void arcToRad(i1.j rect, float f10, float f11, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rect, "rect");
        arcTo(rect, p0.degrees(f10), p0.degrees(f11), z10);
    }

    void close();

    void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15);

    i1.j getBounds();

    /* renamed from: getFillType-Rg-k1Os */
    int mo4806getFillTypeRgk1Os();

    boolean isConvex();

    boolean isEmpty();

    void lineTo(float f10, float f11);

    void moveTo(float f10, float f11);

    /* renamed from: op-N5in7k0 */
    boolean mo4807opN5in7k0(l1 l1Var, l1 l1Var2, int i10);

    void quadraticBezierTo(float f10, float f11, float f12, float f13);

    void relativeCubicTo(float f10, float f11, float f12, float f13, float f14, float f15);

    void relativeLineTo(float f10, float f11);

    void relativeMoveTo(float f10, float f11);

    void relativeQuadraticBezierTo(float f10, float f11, float f12, float f13);

    void reset();

    /* renamed from: setFillType-oQ8Xj4U */
    void mo4808setFillTypeoQ8Xj4U(int i10);

    /* renamed from: translate-k-4lQ0M */
    void mo4809translatek4lQ0M(long j10);
}
