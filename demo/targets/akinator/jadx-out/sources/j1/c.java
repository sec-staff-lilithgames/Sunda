package j1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f68847a = d.f68856a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f68848b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final Rect f68849c = new Rect();

    public final void a(int i10, List list, i1 i1Var) {
        if (list.size() < 2) {
            return;
        }
        qv.k kVarStep = qv.v.step(qv.v.until(0, list.size() - 1), i10);
        int first = kVarStep.getFirst();
        int last = kVarStep.getLast();
        int step = kVarStep.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return;
        }
        while (true) {
            long jM4195unboximpl = ((i1.h) list.get(first)).m4195unboximpl();
            long jM4195unboximpl2 = ((i1.h) list.get(first + 1)).m4195unboximpl();
            this.f68847a.drawLine(i1.h.m4185getXimpl(jM4195unboximpl), i1.h.m4186getYimpl(jM4195unboximpl), i1.h.m4185getXimpl(jM4195unboximpl2), i1.h.m4186getYimpl(jM4195unboximpl2), i1Var.asFrameworkPaint());
            if (first == last) {
                return;
            } else {
                first += step;
            }
        }
    }

    public final void b(int i10, float[] fArr, i1 i1Var) {
        if (fArr.length < 4 || fArr.length % 2 != 0) {
            return;
        }
        qv.k kVarStep = qv.v.step(qv.v.until(0, fArr.length - 3), i10 * 2);
        int first = kVarStep.getFirst();
        int last = kVarStep.getLast();
        int step = kVarStep.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return;
        }
        while (true) {
            this.f68847a.drawLine(fArr[first], fArr[first + 1], fArr[first + 2], fArr[first + 3], i1Var.asFrameworkPaint());
            if (first == last) {
                return;
            } else {
                first += step;
            }
        }
    }

    @Override // j1.e0
    /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
    public void mo4696clipPathmtrdDE(l1 path, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
        Canvas canvas = this.f68847a;
        if (!(path instanceof l)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((l) path).getInternalPath(), m4707toRegionOp7u2Bmg(i10));
    }

    @Override // j1.e0
    /* renamed from: clipRect-N_I0leg, reason: not valid java name */
    public void mo4697clipRectN_I0leg(float f10, float f11, float f12, float f13, int i10) {
        this.f68847a.clipRect(f10, f11, f12, f13, m4707toRegionOp7u2Bmg(i10));
    }

    @Override // j1.e0
    /* renamed from: clipRect-mtrdD-E, reason: not valid java name */
    public /* bridge */ /* synthetic */ void mo4698clipRectmtrdDE(i1.j jVar, int i10) {
        super.mo4698clipRectmtrdDE(jVar, i10);
    }

    @Override // j1.e0
    /* renamed from: concat-58bKbWc, reason: not valid java name */
    public void mo4699concat58bKbWc(float[] matrix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(matrix, "matrix");
        if (f1.m4756isIdentity58bKbWc(matrix)) {
            return;
        }
        Matrix matrix2 = new Matrix();
        h.m4759setFromEL8BTi8(matrix2, matrix);
        this.f68847a.concat(matrix2);
    }

    @Override // j1.e0
    public void disableZ() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        h0.f68870a.enableZ(this.f68847a, false);
    }

    @Override // j1.e0
    public /* bridge */ /* synthetic */ void drawArc(i1.j jVar, float f10, float f11, boolean z10, i1 i1Var) {
        super.drawArc(jVar, f10, f11, z10, i1Var);
    }

    @Override // j1.e0
    public /* bridge */ /* synthetic */ void drawArcRad(i1.j jVar, float f10, float f11, boolean z10, i1 i1Var) {
        super.drawArcRad(jVar, f10, f11, z10, i1Var);
    }

    @Override // j1.e0
    /* renamed from: drawCircle-9KIMszo, reason: not valid java name */
    public void mo4700drawCircle9KIMszo(long j10, float f10, i1 paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "paint");
        this.f68847a.drawCircle(i1.h.m4185getXimpl(j10), i1.h.m4186getYimpl(j10), f10, paint.asFrameworkPaint());
    }

    @Override // j1.e0
    /* renamed from: drawImage-d-4ec7I, reason: not valid java name */
    public void mo4701drawImaged4ec7I(y0 image, long j10, i1 paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(image, "image");
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "paint");
        this.f68847a.drawBitmap(g.asAndroidBitmap(image), i1.h.m4185getXimpl(j10), i1.h.m4186getYimpl(j10), paint.asFrameworkPaint());
    }

    @Override // j1.e0
    /* renamed from: drawImageRect-HPBpro0, reason: not valid java name */
    public void mo4702drawImageRectHPBpro0(y0 image, long j10, long j11, long j12, long j13, i1 paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(image, "image");
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f68847a;
        Bitmap bitmapAsAndroidBitmap = g.asAndroidBitmap(image);
        int iM6930getXimpl = s2.q.m6930getXimpl(j10);
        Rect rect = this.f68848b;
        rect.left = iM6930getXimpl;
        rect.top = s2.q.m6931getYimpl(j10);
        rect.right = s2.v.m6972getWidthimpl(j11) + s2.q.m6930getXimpl(j10);
        rect.bottom = s2.v.m6971getHeightimpl(j11) + s2.q.m6931getYimpl(j10);
        int iM6930getXimpl2 = s2.q.m6930getXimpl(j12);
        Rect rect2 = this.f68849c;
        rect2.left = iM6930getXimpl2;
        rect2.top = s2.q.m6931getYimpl(j12);
        rect2.right = s2.v.m6972getWidthimpl(j13) + s2.q.m6930getXimpl(j12);
        rect2.bottom = s2.v.m6971getHeightimpl(j13) + s2.q.m6931getYimpl(j12);
        canvas.drawBitmap(bitmapAsAndroidBitmap, rect, rect2, paint.asFrameworkPaint());
    }

    @Override // j1.e0
    /* renamed from: drawLine-Wko1d7g, reason: not valid java name */
    public void mo4703drawLineWko1d7g(long j10, long j11, i1 paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "paint");
        this.f68847a.drawLine(i1.h.m4185getXimpl(j10), i1.h.m4186getYimpl(j10), i1.h.m4185getXimpl(j11), i1.h.m4186getYimpl(j11), paint.asFrameworkPaint());
    }

    @Override // j1.e0
    public /* bridge */ /* synthetic */ void drawOval(i1.j jVar, i1 i1Var) {
        super.drawOval(jVar, i1Var);
    }

    @Override // j1.e0
    public void drawPath(l1 path, i1 paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f68847a;
        if (!(path instanceof l)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((l) path).getInternalPath(), paint.asFrameworkPaint());
    }

    @Override // j1.e0
    /* renamed from: drawPoints-O7TthRY, reason: not valid java name */
    public void mo4704drawPointsO7TthRY(int i10, List<i1.h> points, i1 paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(points, "points");
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "paint");
        t1 t1Var = u1.f69006b;
        if (u1.m5001equalsimpl0(i10, t1Var.m4988getLinesr_lszbg())) {
            a(2, points, paint);
            return;
        }
        if (u1.m5001equalsimpl0(i10, t1Var.m4990getPolygonr_lszbg())) {
            a(1, points, paint);
            return;
        }
        if (u1.m5001equalsimpl0(i10, t1Var.m4989getPointsr_lszbg())) {
            int size = points.size();
            for (int i11 = 0; i11 < size; i11++) {
                long jM4195unboximpl = points.get(i11).m4195unboximpl();
                this.f68847a.drawPoint(i1.h.m4185getXimpl(jM4195unboximpl), i1.h.m4186getYimpl(jM4195unboximpl), paint.asFrameworkPaint());
            }
        }
    }

    @Override // j1.e0
    /* renamed from: drawRawPoints-O7TthRY, reason: not valid java name */
    public void mo4705drawRawPointsO7TthRY(int i10, float[] points, i1 paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(points, "points");
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "paint");
        if (points.length % 2 != 0) {
            throw new IllegalArgumentException("points must have an even number of values");
        }
        t1 t1Var = u1.f69006b;
        if (u1.m5001equalsimpl0(i10, t1Var.m4988getLinesr_lszbg())) {
            b(2, points, paint);
            return;
        }
        if (u1.m5001equalsimpl0(i10, t1Var.m4990getPolygonr_lszbg())) {
            b(1, points, paint);
            return;
        }
        if (!u1.m5001equalsimpl0(i10, t1Var.m4989getPointsr_lszbg()) || points.length % 2 != 0) {
            return;
        }
        qv.k kVarStep = qv.v.step(qv.v.until(0, points.length - 1), 2);
        int first = kVarStep.getFirst();
        int last = kVarStep.getLast();
        int step = kVarStep.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return;
        }
        while (true) {
            this.f68847a.drawPoint(points[first], points[first + 1], paint.asFrameworkPaint());
            if (first == last) {
                return;
            } else {
                first += step;
            }
        }
    }

    @Override // j1.e0
    public /* bridge */ /* synthetic */ void drawRect(i1.j jVar, i1 i1Var) {
        super.drawRect(jVar, i1Var);
    }

    @Override // j1.e0
    public void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, i1 paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "paint");
        this.f68847a.drawRoundRect(f10, f11, f12, f13, f14, f15, paint.asFrameworkPaint());
    }

    @Override // j1.e0
    /* renamed from: drawVertices-TPEHhCM, reason: not valid java name */
    public void mo4706drawVerticesTPEHhCM(z2 vertices, int i10, i1 paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vertices, "vertices");
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "paint");
        this.f68847a.drawVertices(t.m4954toAndroidVertexModeJOOmi9M(vertices.m5087getVertexModec2xauaI()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, paint.asFrameworkPaint());
    }

    @Override // j1.e0
    public void enableZ() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        h0.f68870a.enableZ(this.f68847a, true);
    }

    public final Canvas getInternalCanvas() {
        return this.f68847a;
    }

    @Override // j1.e0
    public void restore() {
        this.f68847a.restore();
    }

    @Override // j1.e0
    public void rotate(float f10) {
        this.f68847a.rotate(f10);
    }

    @Override // j1.e0
    public void save() {
        this.f68847a.save();
    }

    @Override // j1.e0
    public void saveLayer(i1.j bounds, i1 paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bounds, "bounds");
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "paint");
        this.f68847a.saveLayer(bounds.getLeft(), bounds.getTop(), bounds.getRight(), bounds.getBottom(), paint.asFrameworkPaint(), 31);
    }

    @Override // j1.e0
    public void scale(float f10, float f11) {
        this.f68847a.scale(f10, f11);
    }

    public final void setInternalCanvas(Canvas canvas) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "<set-?>");
        this.f68847a = canvas;
    }

    @Override // j1.e0
    public void skew(float f10, float f11) {
        this.f68847a.skew(f10, f11);
    }

    @Override // j1.e0
    public /* bridge */ /* synthetic */ void skewRad(float f10, float f11) {
        super.skewRad(f10, f11);
    }

    /* renamed from: toRegionOp--7u2Bmg, reason: not valid java name */
    public final Region.Op m4707toRegionOp7u2Bmg(int i10) {
        return k0.m4791equalsimpl0(i10, k0.f68900b.m4777getDifferencertfAjoo()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // j1.e0
    public void translate(float f10, float f11) {
        this.f68847a.translate(f10, f11);
    }

    @Override // j1.e0
    public void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, i1 paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "paint");
        this.f68847a.drawArc(f10, f11, f12, f13, f14, f15, z10, paint.asFrameworkPaint());
    }

    @Override // j1.e0
    public void drawOval(float f10, float f11, float f12, float f13, i1 paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "paint");
        this.f68847a.drawOval(f10, f11, f12, f13, paint.asFrameworkPaint());
    }

    @Override // j1.e0
    public void drawRect(float f10, float f11, float f12, float f13, i1 paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "paint");
        this.f68847a.drawRect(f10, f11, f12, f13, paint.asFrameworkPaint());
    }

    public static /* synthetic */ void getInternalCanvas$annotations() {
    }
}
