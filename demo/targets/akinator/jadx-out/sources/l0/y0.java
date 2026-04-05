package l0;

import g2.b;
import g2.c2;
import g2.e2;
import g2.w1;
import g2.x1;
import g2.y1;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: k, reason: collision with root package name */
    public static final a f72207k = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final g2.b f72208a;

    /* renamed from: b, reason: collision with root package name */
    public final c2 f72209b;

    /* renamed from: c, reason: collision with root package name */
    public final int f72210c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f72211d;

    /* renamed from: e, reason: collision with root package name */
    public final int f72212e;

    /* renamed from: f, reason: collision with root package name */
    public final s2.e f72213f;

    /* renamed from: g, reason: collision with root package name */
    public final l2.y f72214g;

    /* renamed from: h, reason: collision with root package name */
    public final List f72215h;

    /* renamed from: i, reason: collision with root package name */
    public g2.o f72216i;

    /* renamed from: j, reason: collision with root package name */
    public s2.x f72217j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final void paint(j1.e0 canvas, x1 textLayoutResult) {
            kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
            kotlin.jvm.internal.e0.checkNotNullParameter(textLayoutResult, "textLayoutResult");
            y1.f56888a.paint(canvas, textLayoutResult);
        }
    }

    public y0(g2.b bVar, c2 c2Var, int i10, boolean z10, int i11, s2.e eVar, l2.y yVar, List list, kotlin.jvm.internal.u uVar) {
        this.f72208a = bVar;
        this.f72209b = c2Var;
        this.f72210c = i10;
        this.f72211d = z10;
        this.f72212e = i11;
        this.f72213f = eVar;
        this.f72214g = yVar;
        this.f72215h = list;
        if (i10 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* renamed from: layout-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ x1 m5289layoutNN6EwU$default(y0 y0Var, long j10, s2.x xVar, x1 x1Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            x1Var = null;
        }
        return y0Var.m5291layoutNN6EwU(j10, xVar, x1Var);
    }

    public final s2.e getDensity() {
        return this.f72213f;
    }

    public final l2.y getFontFamilyResolver() {
        return this.f72214g;
    }

    public final s2.x getIntrinsicsLayoutDirection$foundation_release() {
        return this.f72217j;
    }

    public final int getMaxIntrinsicWidth() {
        if (this.f72216i != null) {
            return (int) Math.ceil(r0.getMaxIntrinsicWidth());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    public final int getMaxLines() {
        return this.f72210c;
    }

    public final int getMinIntrinsicWidth() {
        if (this.f72216i != null) {
            return (int) Math.ceil(r0.getMinIntrinsicWidth());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    /* renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m5290getOverflowgIe3tQ8() {
        return this.f72212e;
    }

    public final g2.o getParagraphIntrinsics$foundation_release() {
        return this.f72216i;
    }

    public final List<b.C0570b> getPlaceholders() {
        return this.f72215h;
    }

    public final boolean getSoftWrap() {
        return this.f72211d;
    }

    public final c2 getStyle() {
        return this.f72209b;
    }

    public final g2.b getText() {
        return this.f72208a;
    }

    /* renamed from: layout-NN6Ew-U, reason: not valid java name */
    public final x1 m5291layoutNN6EwU(long j10, s2.x layoutDirection, x1 x1Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (x1Var != null) {
            if (j1.m5265canReuse7_7YC6M(x1Var, this.f72208a, this.f72209b, this.f72215h, this.f72210c, this.f72211d, this.f72212e, this.f72213f, layoutDirection, this.f72214g, j10)) {
                return x1Var.m4042copyO0kMr_c(new w1(x1Var.getLayoutInput().getText(), this.f72209b, x1Var.getLayoutInput().getPlaceholders(), x1Var.getLayoutInput().getMaxLines(), x1Var.getLayoutInput().getSoftWrap(), x1Var.getLayoutInput().m4032getOverflowgIe3tQ8(), x1Var.getLayoutInput().getDensity(), x1Var.getLayoutInput().getLayoutDirection(), x1Var.getLayoutInput().getFontFamilyResolver(), j10, (kotlin.jvm.internal.u) null), s2.d.m6769constrain4WqzIAM(j10, s2.w.IntSize((int) Math.ceil(x1Var.getMultiParagraph().getWidth()), (int) Math.ceil(x1Var.getMultiParagraph().getHeight()))));
            }
        }
        layoutIntrinsics(layoutDirection);
        int iM6757getMinWidthimpl = s2.c.m6757getMinWidthimpl(j10);
        int i10 = this.f72212e;
        boolean z10 = this.f72211d;
        int iM6755getMaxWidthimpl = ((z10 || r2.a0.m6027equalsimpl0(i10, r2.a0.f83672b.m6100getEllipsisgIe3tQ8())) && s2.c.m6751getHasBoundedWidthimpl(j10)) ? s2.c.m6755getMaxWidthimpl(j10) : Integer.MAX_VALUE;
        int i11 = (z10 || !r2.a0.m6027equalsimpl0(i10, r2.a0.f83672b.m6100getEllipsisgIe3tQ8())) ? this.f72210c : 1;
        if (iM6757getMinWidthimpl != iM6755getMaxWidthimpl) {
            iM6755getMaxWidthimpl = qv.v.coerceIn(getMaxIntrinsicWidth(), iM6757getMinWidthimpl, iM6755getMaxWidthimpl);
        }
        int i12 = iM6755getMaxWidthimpl;
        g2.o oVar = this.f72216i;
        if (oVar == null) {
            throw new IllegalStateException("layoutIntrinsics must be called first");
        }
        return new x1(new w1(this.f72208a, this.f72209b, this.f72215h, this.f72210c, this.f72211d, this.f72212e, this.f72213f, layoutDirection, this.f72214g, j10, (kotlin.jvm.internal.u) null), new g2.l(oVar, s2.d.Constraints$default(0, i12, 0, s2.c.m6754getMaxHeightimpl(j10), 5, null), i11, r2.a0.m6027equalsimpl0(i10, r2.a0.f83672b.m6100getEllipsisgIe3tQ8()), null), s2.d.m6769constrain4WqzIAM(j10, s2.w.IntSize((int) Math.ceil(r13.getWidth()), (int) Math.ceil(r13.getHeight()))), null);
    }

    public final void layoutIntrinsics(s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        g2.o oVar = this.f72216i;
        if (oVar == null || layoutDirection != this.f72217j || oVar.getHasStaleResolvedFonts()) {
            this.f72217j = layoutDirection;
            oVar = new g2.o(this.f72208a, e2.resolveDefaults(this.f72209b, layoutDirection), (List<b.C0570b>) this.f72215h, this.f72213f, this.f72214g);
        }
        this.f72216i = oVar;
    }

    public final void setIntrinsicsLayoutDirection$foundation_release(s2.x xVar) {
        this.f72217j = xVar;
    }

    public final void setParagraphIntrinsics$foundation_release(g2.o oVar) {
        this.f72216i = oVar;
    }

    public /* synthetic */ y0(g2.b bVar, c2 c2Var, int i10, boolean z10, int i11, s2.e eVar, l2.y yVar, List list, int i12, kotlin.jvm.internal.u uVar) {
        this(bVar, c2Var, (i12 & 4) != 0 ? Integer.MAX_VALUE : i10, (i12 & 8) != 0 ? true : z10, (i12 & 16) != 0 ? r2.a0.f83672b.m6099getClipgIe3tQ8() : i11, eVar, yVar, (i12 & 128) != 0 ? uu.p0.emptyList() : list, null);
    }
}
