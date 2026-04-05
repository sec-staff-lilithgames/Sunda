package j1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l implements l1 {

    /* renamed from: a, reason: collision with root package name */
    public final Path f68908a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f68909b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f68910c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f68911d;

    /* JADX WARN: Multi-variable type inference failed */
    public l() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static void a(i1.j jVar) {
        if (Float.isNaN(jVar.getLeft())) {
            throw new IllegalStateException("Rect.left is NaN");
        }
        if (Float.isNaN(jVar.getTop())) {
            throw new IllegalStateException("Rect.top is NaN");
        }
        if (Float.isNaN(jVar.getRight())) {
            throw new IllegalStateException("Rect.right is NaN");
        }
        if (Float.isNaN(jVar.getBottom())) {
            throw new IllegalStateException("Rect.bottom is NaN");
        }
    }

    @Override // j1.l1
    public void addArc(i1.j oval, float f10, float f11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(oval, "oval");
        a(oval);
        Rect androidRect = w1.toAndroidRect(oval);
        RectF rectF = this.f68909b;
        rectF.set(androidRect);
        this.f68908a.addArc(rectF, f10, f11);
    }

    @Override // j1.l1
    public void addArcRad(i1.j oval, float f10, float f11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(oval, "oval");
        addArc(oval, p0.degrees(f10), p0.degrees(f11));
    }

    @Override // j1.l1
    public void addOval(i1.j oval) {
        kotlin.jvm.internal.e0.checkNotNullParameter(oval, "oval");
        Rect androidRect = w1.toAndroidRect(oval);
        RectF rectF = this.f68909b;
        rectF.set(androidRect);
        this.f68908a.addOval(rectF, Path.Direction.CCW);
    }

    @Override // j1.l1
    /* renamed from: addPath-Uv8p0NA, reason: not valid java name */
    public void mo4805addPathUv8p0NA(l1 path, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
        if (!(path instanceof l)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f68908a.addPath(((l) path).getInternalPath(), i1.h.m4185getXimpl(j10), i1.h.m4186getYimpl(j10));
    }

    @Override // j1.l1
    public void addRect(i1.j rect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rect, "rect");
        a(rect);
        RectF androidRectF = w1.toAndroidRectF(rect);
        RectF rectF = this.f68909b;
        rectF.set(androidRectF);
        this.f68908a.addRect(rectF, Path.Direction.CCW);
    }

    @Override // j1.l1
    public void addRoundRect(i1.l roundRect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(roundRect, "roundRect");
        float left = roundRect.getLeft();
        float top = roundRect.getTop();
        float right = roundRect.getRight();
        float bottom = roundRect.getBottom();
        RectF rectF = this.f68909b;
        rectF.set(left, top, right, bottom);
        float fM4156getXimpl = i1.b.m4156getXimpl(roundRect.m4229getTopLeftCornerRadiuskKHJgLs());
        float[] fArr = this.f68910c;
        fArr[0] = fM4156getXimpl;
        fArr[1] = i1.b.m4157getYimpl(roundRect.m4229getTopLeftCornerRadiuskKHJgLs());
        fArr[2] = i1.b.m4156getXimpl(roundRect.m4230getTopRightCornerRadiuskKHJgLs());
        fArr[3] = i1.b.m4157getYimpl(roundRect.m4230getTopRightCornerRadiuskKHJgLs());
        fArr[4] = i1.b.m4156getXimpl(roundRect.m4228getBottomRightCornerRadiuskKHJgLs());
        fArr[5] = i1.b.m4157getYimpl(roundRect.m4228getBottomRightCornerRadiuskKHJgLs());
        fArr[6] = i1.b.m4156getXimpl(roundRect.m4227getBottomLeftCornerRadiuskKHJgLs());
        fArr[7] = i1.b.m4157getYimpl(roundRect.m4227getBottomLeftCornerRadiuskKHJgLs());
        this.f68908a.addRoundRect(rectF, fArr, Path.Direction.CCW);
    }

    @Override // j1.l1
    public void arcTo(i1.j rect, float f10, float f11, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rect, "rect");
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        RectF rectF = this.f68909b;
        rectF.set(left, top, right, bottom);
        this.f68908a.arcTo(rectF, f10, f11, z10);
    }

    @Override // j1.l1
    public /* bridge */ /* synthetic */ void arcToRad(i1.j jVar, float f10, float f11, boolean z10) {
        super.arcToRad(jVar, f10, f11, z10);
    }

    @Override // j1.l1
    public void close() {
        this.f68908a.close();
    }

    @Override // j1.l1
    public void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f68908a.cubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // j1.l1
    public i1.j getBounds() {
        Path path = this.f68908a;
        RectF rectF = this.f68909b;
        path.computeBounds(rectF, true);
        return new i1.j(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // j1.l1
    /* renamed from: getFillType-Rg-k1Os, reason: not valid java name */
    public int mo4806getFillTypeRgk1Os() {
        return this.f68908a.getFillType() == Path.FillType.EVEN_ODD ? o1.f68941b.m4876getEvenOddRgk1Os() : o1.f68941b.m4877getNonZeroRgk1Os();
    }

    public final Path getInternalPath() {
        return this.f68908a;
    }

    @Override // j1.l1
    public boolean isConvex() {
        return this.f68908a.isConvex();
    }

    @Override // j1.l1
    public boolean isEmpty() {
        return this.f68908a.isEmpty();
    }

    @Override // j1.l1
    public void lineTo(float f10, float f11) {
        this.f68908a.lineTo(f10, f11);
    }

    @Override // j1.l1
    public void moveTo(float f10, float f11) {
        this.f68908a.moveTo(f10, f11);
    }

    @Override // j1.l1
    /* renamed from: op-N5in7k0, reason: not valid java name */
    public boolean mo4807opN5in7k0(l1 path1, l1 path2, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(path1, "path1");
        kotlin.jvm.internal.e0.checkNotNullParameter(path2, "path2");
        q1 q1Var = r1.f68954b;
        Path.Op op2 = r1.m4929equalsimpl0(i10, q1Var.m4910getDifferenceb3I0S0c()) ? Path.Op.DIFFERENCE : r1.m4929equalsimpl0(i10, q1Var.m4911getIntersectb3I0S0c()) ? Path.Op.INTERSECT : r1.m4929equalsimpl0(i10, q1Var.m4912getReverseDifferenceb3I0S0c()) ? Path.Op.REVERSE_DIFFERENCE : r1.m4929equalsimpl0(i10, q1Var.m4913getUnionb3I0S0c()) ? Path.Op.UNION : Path.Op.XOR;
        if (!(path1 instanceof l)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path internalPath = ((l) path1).getInternalPath();
        if (path2 instanceof l) {
            return this.f68908a.op(internalPath, ((l) path2).getInternalPath(), op2);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // j1.l1
    public void quadraticBezierTo(float f10, float f11, float f12, float f13) {
        this.f68908a.quadTo(f10, f11, f12, f13);
    }

    @Override // j1.l1
    public void relativeCubicTo(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f68908a.rCubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // j1.l1
    public void relativeLineTo(float f10, float f11) {
        this.f68908a.rLineTo(f10, f11);
    }

    @Override // j1.l1
    public void relativeMoveTo(float f10, float f11) {
        this.f68908a.rMoveTo(f10, f11);
    }

    @Override // j1.l1
    public void relativeQuadraticBezierTo(float f10, float f11, float f12, float f13) {
        this.f68908a.rQuadTo(f10, f11, f12, f13);
    }

    @Override // j1.l1
    public void reset() {
        this.f68908a.reset();
    }

    @Override // j1.l1
    /* renamed from: setFillType-oQ8Xj4U, reason: not valid java name */
    public void mo4808setFillTypeoQ8Xj4U(int i10) {
        this.f68908a.setFillType(o1.m4898equalsimpl0(i10, o1.f68941b.m4876getEvenOddRgk1Os()) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // j1.l1
    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public void mo4809translatek4lQ0M(long j10) {
        Matrix matrix = this.f68911d;
        matrix.reset();
        matrix.setTranslate(i1.h.m4185getXimpl(j10), i1.h.m4186getYimpl(j10));
        this.f68908a.transform(matrix);
    }

    public l(Path internalPath) {
        kotlin.jvm.internal.e0.checkNotNullParameter(internalPath, "internalPath");
        this.f68908a = internalPath;
        this.f68909b = new RectF();
        this.f68910c = new float[8];
        this.f68911d = new Matrix();
    }

    public /* synthetic */ l(Path path, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? new Path() : path);
    }

    public static /* synthetic */ void isConvex$annotations() {
    }
}
