package j1;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface e0 {
    /* renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m4726clipPathmtrdDE$default(e0 e0Var, l1 l1Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = k0.f68900b.m4778getIntersectrtfAjoo();
        }
        e0Var.mo4696clipPathmtrdDE(l1Var, i10);
    }

    /* renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static /* synthetic */ void m4727clipRectN_I0leg$default(e0 e0Var, float f10, float f11, float f12, float f13, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i11 & 16) != 0) {
            i10 = k0.f68900b.m4778getIntersectrtfAjoo();
        }
        e0Var.mo4697clipRectN_I0leg(f10, f11, f12, f13, i10);
    }

    /* renamed from: clipRect-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m4728clipRectmtrdDE$default(e0 e0Var, i1.j jVar, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = k0.f68900b.m4778getIntersectrtfAjoo();
        }
        e0Var.mo4698clipRectmtrdDE(jVar, i10);
    }

    /* renamed from: drawImageRect-HPBpro0$default, reason: not valid java name */
    static /* synthetic */ void m4729drawImageRectHPBpro0$default(e0 e0Var, y0 y0Var, long j10, long j11, long j12, long j13, i1 i1Var, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
        }
        long jM6920getZeronOccac = (i10 & 2) != 0 ? s2.q.f85352b.m6920getZeronOccac() : j10;
        long jIntSize = (i10 & 4) != 0 ? s2.w.IntSize(y0Var.getWidth(), y0Var.getHeight()) : j11;
        e0Var.mo4702drawImageRectHPBpro0(y0Var, jM6920getZeronOccac, jIntSize, (i10 & 8) != 0 ? s2.q.f85352b.m6920getZeronOccac() : j12, (i10 & 16) != 0 ? jIntSize : j13, i1Var);
    }

    static /* synthetic */ void scale$default(e0 e0Var, float f10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
        }
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        e0Var.scale(f10, f11);
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo4696clipPathmtrdDE(l1 l1Var, int i10);

    /* renamed from: clipRect-N_I0leg */
    void mo4697clipRectN_I0leg(float f10, float f11, float f12, float f13, int i10);

    /* renamed from: clipRect-mtrdD-E */
    default void mo4698clipRectmtrdDE(i1.j rect, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rect, "rect");
        mo4697clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), i10);
    }

    /* renamed from: concat-58bKbWc */
    void mo4699concat58bKbWc(float[] fArr);

    void disableZ();

    void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, i1 i1Var);

    default void drawArc(i1.j rect, float f10, float f11, boolean z10, i1 paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rect, "rect");
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "paint");
        drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f10, f11, z10, paint);
    }

    default void drawArcRad(i1.j rect, float f10, float f11, boolean z10, i1 paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rect, "rect");
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "paint");
        drawArc(rect, p0.degrees(f10), p0.degrees(f11), z10, paint);
    }

    /* renamed from: drawCircle-9KIMszo */
    void mo4700drawCircle9KIMszo(long j10, float f10, i1 i1Var);

    /* renamed from: drawImage-d-4ec7I */
    void mo4701drawImaged4ec7I(y0 y0Var, long j10, i1 i1Var);

    /* renamed from: drawImageRect-HPBpro0 */
    void mo4702drawImageRectHPBpro0(y0 y0Var, long j10, long j11, long j12, long j13, i1 i1Var);

    /* renamed from: drawLine-Wko1d7g */
    void mo4703drawLineWko1d7g(long j10, long j11, i1 i1Var);

    void drawOval(float f10, float f11, float f12, float f13, i1 i1Var);

    default void drawOval(i1.j rect, i1 paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rect, "rect");
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "paint");
        drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    void drawPath(l1 l1Var, i1 i1Var);

    /* renamed from: drawPoints-O7TthRY */
    void mo4704drawPointsO7TthRY(int i10, List<i1.h> list, i1 i1Var);

    /* renamed from: drawRawPoints-O7TthRY */
    void mo4705drawRawPointsO7TthRY(int i10, float[] fArr, i1 i1Var);

    void drawRect(float f10, float f11, float f12, float f13, i1 i1Var);

    default void drawRect(i1.j rect, i1 paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rect, "rect");
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "paint");
        drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, i1 i1Var);

    /* renamed from: drawVertices-TPEHhCM */
    void mo4706drawVerticesTPEHhCM(z2 z2Var, int i10, i1 i1Var);

    void enableZ();

    void restore();

    void rotate(float f10);

    void save();

    void saveLayer(i1.j jVar, i1 i1Var);

    void scale(float f10, float f11);

    void skew(float f10, float f11);

    default void skewRad(float f10, float f11) {
        skew(p0.degrees(f10), p0.degrees(f11));
    }

    void translate(float f10, float f11);
}
