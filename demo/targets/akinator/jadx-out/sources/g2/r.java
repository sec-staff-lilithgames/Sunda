package g2;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface r {
    static /* synthetic */ int getLineEnd$default(r rVar, int i10, boolean z10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return rVar.getLineEnd(i10, z10);
    }

    static /* synthetic */ void paint$default(r rVar, j1.e0 e0Var, j1.b0 b0Var, j1.d2 d2Var, r2.n nVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint");
        }
        if ((i10 & 4) != 0) {
            d2Var = null;
        }
        if ((i10 & 8) != 0) {
            nVar = null;
        }
        rVar.paint(e0Var, b0Var, d2Var, nVar);
    }

    /* renamed from: paint-RPmYEkk$default, reason: not valid java name */
    static /* synthetic */ void m4004paintRPmYEkk$default(r rVar, j1.e0 e0Var, long j10, j1.d2 d2Var, r2.n nVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
        }
        if ((i10 & 2) != 0) {
            j10 = j1.m0.f68918b.m4835getUnspecified0d7_KjU();
        }
        rVar.mo4007paintRPmYEkk(e0Var, j10, (i10 & 4) != 0 ? null : d2Var, (i10 & 8) != 0 ? null : nVar);
    }

    r2.k getBidiRunDirection(int i10);

    i1.j getBoundingBox(int i10);

    i1.j getCursorRect(int i10);

    boolean getDidExceedMaxLines();

    float getFirstBaseline();

    float getHeight();

    float getHorizontalPosition(int i10, boolean z10);

    float getLastBaseline();

    float getLineBottom(int i10);

    int getLineCount();

    int getLineEnd(int i10, boolean z10);

    int getLineForOffset(int i10);

    int getLineForVerticalPosition(float f10);

    float getLineHeight(int i10);

    float getLineLeft(int i10);

    float getLineRight(int i10);

    int getLineStart(int i10);

    float getLineTop(int i10);

    float getLineWidth(int i10);

    float getMaxIntrinsicWidth();

    float getMinIntrinsicWidth();

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    int mo4005getOffsetForPositionk4lQ0M(long j10);

    r2.k getParagraphDirection(int i10);

    j1.l1 getPathForRange(int i10, int i11);

    List<i1.j> getPlaceholderRects();

    float getWidth();

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    long mo4006getWordBoundaryjx7JFs(int i10);

    boolean isLineEllipsized(int i10);

    default void paint(j1.e0 canvas, j1.b0 brush, j1.d2 d2Var, r2.n nVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        kotlin.jvm.internal.e0.checkNotNullParameter(brush, "brush");
        throw new UnsupportedOperationException("Using brush for painting the paragraph is a separate functionality that is not supported on this platform");
    }

    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    void mo4007paintRPmYEkk(j1.e0 e0Var, long j10, j1.d2 d2Var, r2.n nVar);
}
