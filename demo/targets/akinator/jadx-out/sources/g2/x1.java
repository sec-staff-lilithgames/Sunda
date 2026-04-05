package g2;

import j1.o2;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final w1 f56880a;

    /* renamed from: b, reason: collision with root package name */
    public final l f56881b;

    /* renamed from: c, reason: collision with root package name */
    public final long f56882c;

    /* renamed from: d, reason: collision with root package name */
    public final float f56883d;

    /* renamed from: e, reason: collision with root package name */
    public final float f56884e;

    /* renamed from: f, reason: collision with root package name */
    public final List f56885f;

    public x1(w1 w1Var, l lVar, long j10, kotlin.jvm.internal.u uVar) {
        this.f56880a = w1Var;
        this.f56881b = lVar;
        this.f56882c = j10;
        this.f56883d = lVar.getFirstBaseline();
        this.f56884e = lVar.getLastBaseline();
        this.f56885f = lVar.getPlaceholderRects();
    }

    /* renamed from: copy-O0kMr_c$default, reason: not valid java name */
    public static /* synthetic */ x1 m4041copyO0kMr_c$default(x1 x1Var, w1 w1Var, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            w1Var = x1Var.f56880a;
        }
        if ((i10 & 2) != 0) {
            j10 = x1Var.f56882c;
        }
        return x1Var.m4042copyO0kMr_c(w1Var, j10);
    }

    public static /* synthetic */ int getLineEnd$default(x1 x1Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return x1Var.getLineEnd(i10, z10);
    }

    /* renamed from: copy-O0kMr_c, reason: not valid java name */
    public final x1 m4042copyO0kMr_c(w1 layoutInput, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutInput, "layoutInput");
        return new x1(layoutInput, this.f56881b, j10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f56880a, x1Var.f56880a) && kotlin.jvm.internal.e0.areEqual(this.f56881b, x1Var.f56881b) && s2.v.m6970equalsimpl0(this.f56882c, x1Var.f56882c) && this.f56883d == x1Var.f56883d && this.f56884e == x1Var.f56884e && kotlin.jvm.internal.e0.areEqual(this.f56885f, x1Var.f56885f);
    }

    public final r2.k getBidiRunDirection(int i10) {
        return this.f56881b.getBidiRunDirection(i10);
    }

    public final i1.j getBoundingBox(int i10) {
        return this.f56881b.getBoundingBox(i10);
    }

    public final i1.j getCursorRect(int i10) {
        return this.f56881b.getCursorRect(i10);
    }

    public final boolean getDidOverflowHeight() {
        l lVar = this.f56881b;
        return lVar.getDidExceedMaxLines() || ((float) s2.v.m6971getHeightimpl(this.f56882c)) < lVar.getHeight();
    }

    public final boolean getDidOverflowWidth() {
        return ((float) s2.v.m6972getWidthimpl(this.f56882c)) < this.f56881b.getWidth();
    }

    public final float getFirstBaseline() {
        return this.f56883d;
    }

    public final boolean getHasVisualOverflow() {
        return getDidOverflowWidth() || getDidOverflowHeight();
    }

    public final float getHorizontalPosition(int i10, boolean z10) {
        return this.f56881b.getHorizontalPosition(i10, z10);
    }

    public final float getLastBaseline() {
        return this.f56884e;
    }

    public final w1 getLayoutInput() {
        return this.f56880a;
    }

    public final float getLineBottom(int i10) {
        return this.f56881b.getLineBottom(i10);
    }

    public final int getLineCount() {
        return this.f56881b.getLineCount();
    }

    public final int getLineEnd(int i10, boolean z10) {
        return this.f56881b.getLineEnd(i10, z10);
    }

    public final int getLineForOffset(int i10) {
        return this.f56881b.getLineForOffset(i10);
    }

    public final int getLineForVerticalPosition(float f10) {
        return this.f56881b.getLineForVerticalPosition(f10);
    }

    public final float getLineLeft(int i10) {
        return this.f56881b.getLineLeft(i10);
    }

    public final float getLineRight(int i10) {
        return this.f56881b.getLineRight(i10);
    }

    public final int getLineStart(int i10) {
        return this.f56881b.getLineStart(i10);
    }

    public final float getLineTop(int i10) {
        return this.f56881b.getLineTop(i10);
    }

    public final l getMultiParagraph() {
        return this.f56881b;
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m4043getOffsetForPositionk4lQ0M(long j10) {
        return this.f56881b.m3994getOffsetForPositionk4lQ0M(j10);
    }

    public final r2.k getParagraphDirection(int i10) {
        return this.f56881b.getParagraphDirection(i10);
    }

    public final j1.l1 getPathForRange(int i10, int i11) {
        return this.f56881b.getPathForRange(i10, i11);
    }

    public final List<i1.j> getPlaceholderRects() {
        return this.f56885f;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m4044getSizeYbymL2g() {
        return this.f56882c;
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m4045getWordBoundaryjx7JFs(int i10) {
        return this.f56881b.m3995getWordBoundaryjx7JFs(i10);
    }

    public int hashCode() {
        return this.f56885f.hashCode() + b0.e2.b(this.f56884e, b0.e2.b(this.f56883d, (s2.v.m6973hashCodeimpl(this.f56882c) + ((this.f56881b.hashCode() + (this.f56880a.hashCode() * 31)) * 31)) * 31, 31), 31);
    }

    public final boolean isLineEllipsized(int i10) {
        return this.f56881b.isLineEllipsized(i10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TextLayoutResult(layoutInput=");
        sb2.append(this.f56880a);
        sb2.append(", multiParagraph=");
        sb2.append(this.f56881b);
        sb2.append(", size=");
        sb2.append((Object) s2.v.m6975toStringimpl(this.f56882c));
        sb2.append(", firstBaseline=");
        sb2.append(this.f56883d);
        sb2.append(", lastBaseline=");
        sb2.append(this.f56884e);
        sb2.append(", placeholderRects=");
        return o2.p(sb2, this.f56885f, ')');
    }
}
