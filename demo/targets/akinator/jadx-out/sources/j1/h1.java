package j1;

import j1.g1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h1 {
    public static final boolean access$hasSameCornerRadius(i1.l lVar) {
        return ((i1.b.m4156getXimpl(lVar.m4227getBottomLeftCornerRadiuskKHJgLs()) > i1.b.m4156getXimpl(lVar.m4228getBottomRightCornerRadiuskKHJgLs()) ? 1 : (i1.b.m4156getXimpl(lVar.m4227getBottomLeftCornerRadiuskKHJgLs()) == i1.b.m4156getXimpl(lVar.m4228getBottomRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (i1.b.m4156getXimpl(lVar.m4228getBottomRightCornerRadiuskKHJgLs()) > i1.b.m4156getXimpl(lVar.m4230getTopRightCornerRadiuskKHJgLs()) ? 1 : (i1.b.m4156getXimpl(lVar.m4228getBottomRightCornerRadiuskKHJgLs()) == i1.b.m4156getXimpl(lVar.m4230getTopRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (i1.b.m4156getXimpl(lVar.m4230getTopRightCornerRadiuskKHJgLs()) > i1.b.m4156getXimpl(lVar.m4229getTopLeftCornerRadiuskKHJgLs()) ? 1 : (i1.b.m4156getXimpl(lVar.m4230getTopRightCornerRadiuskKHJgLs()) == i1.b.m4156getXimpl(lVar.m4229getTopLeftCornerRadiuskKHJgLs()) ? 0 : -1)) == 0) && ((i1.b.m4157getYimpl(lVar.m4227getBottomLeftCornerRadiuskKHJgLs()) > i1.b.m4157getYimpl(lVar.m4228getBottomRightCornerRadiuskKHJgLs()) ? 1 : (i1.b.m4157getYimpl(lVar.m4227getBottomLeftCornerRadiuskKHJgLs()) == i1.b.m4157getYimpl(lVar.m4228getBottomRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (i1.b.m4157getYimpl(lVar.m4228getBottomRightCornerRadiuskKHJgLs()) > i1.b.m4157getYimpl(lVar.m4230getTopRightCornerRadiuskKHJgLs()) ? 1 : (i1.b.m4157getYimpl(lVar.m4228getBottomRightCornerRadiuskKHJgLs()) == i1.b.m4157getYimpl(lVar.m4230getTopRightCornerRadiuskKHJgLs()) ? 0 : -1)) == 0 && (i1.b.m4157getYimpl(lVar.m4230getTopRightCornerRadiuskKHJgLs()) > i1.b.m4157getYimpl(lVar.m4229getTopLeftCornerRadiuskKHJgLs()) ? 1 : (i1.b.m4157getYimpl(lVar.m4230getTopRightCornerRadiuskKHJgLs()) == i1.b.m4157getYimpl(lVar.m4229getTopLeftCornerRadiuskKHJgLs()) ? 0 : -1)) == 0);
    }

    public static final void addOutline(l1 l1Var, g1 outline) {
        kotlin.jvm.internal.e0.checkNotNullParameter(l1Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(outline, "outline");
        if (outline instanceof g1.b) {
            l1Var.addRect(((g1.b) outline).getRect());
        } else if (outline instanceof g1.c) {
            l1Var.addRoundRect(((g1.c) outline).getRoundRect());
        } else {
            if (!(outline instanceof g1.a)) {
                throw new tu.t();
            }
            l1.m4840addPathUv8p0NA$default(l1Var, ((g1.a) outline).getPath(), 0L, 2, null);
        }
    }

    public static final void drawOutline(e0 e0Var, g1 outline, i1 paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(e0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(outline, "outline");
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "paint");
        if (outline instanceof g1.b) {
            e0Var.drawRect(((g1.b) outline).getRect(), paint);
            return;
        }
        if (!(outline instanceof g1.c)) {
            if (!(outline instanceof g1.a)) {
                throw new tu.t();
            }
            e0Var.drawPath(((g1.a) outline).getPath(), paint);
        } else {
            g1.c cVar = (g1.c) outline;
            l1 roundRectPath$ui_graphics_release = cVar.getRoundRectPath$ui_graphics_release();
            if (roundRectPath$ui_graphics_release != null) {
                e0Var.drawPath(roundRectPath$ui_graphics_release, paint);
            } else {
                e0Var.drawRoundRect(cVar.getRoundRect().getLeft(), cVar.getRoundRect().getTop(), cVar.getRoundRect().getRight(), cVar.getRoundRect().getBottom(), i1.b.m4156getXimpl(cVar.getRoundRect().m4227getBottomLeftCornerRadiuskKHJgLs()), i1.b.m4157getYimpl(cVar.getRoundRect().m4227getBottomLeftCornerRadiuskKHJgLs()), paint);
            }
        }
    }

    /* renamed from: drawOutline-hn5TExg, reason: not valid java name */
    public static final void m4761drawOutlinehn5TExg(l1.i drawOutline, g1 outline, b0 brush, float f10, l1.j style, n0 n0Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(drawOutline, "$this$drawOutline");
        kotlin.jvm.internal.e0.checkNotNullParameter(outline, "outline");
        kotlin.jvm.internal.e0.checkNotNullParameter(brush, "brush");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        if (outline instanceof g1.b) {
            i1.j rect = ((g1.b) outline).getRect();
            drawOutline.mo5309drawRectAsUm42w(brush, i1.i.Offset(rect.getLeft(), rect.getTop()), i1.p.Size(rect.getWidth(), rect.getHeight()), f10, style, n0Var, i10);
            return;
        }
        if (!(outline instanceof g1.c)) {
            if (!(outline instanceof g1.a)) {
                throw new tu.t();
            }
            drawOutline.mo5305drawPathGBMwjPU(((g1.a) outline).getPath(), brush, f10, style, n0Var, i10);
            return;
        }
        g1.c cVar = (g1.c) outline;
        l1 roundRectPath$ui_graphics_release = cVar.getRoundRectPath$ui_graphics_release();
        if (roundRectPath$ui_graphics_release != null) {
            drawOutline.mo5305drawPathGBMwjPU(roundRectPath$ui_graphics_release, brush, f10, style, n0Var, i10);
            return;
        }
        i1.l roundRect = cVar.getRoundRect();
        drawOutline.mo5311drawRoundRectZuiqVtQ(brush, i1.i.Offset(roundRect.getLeft(), roundRect.getTop()), i1.p.Size(roundRect.getWidth(), roundRect.getHeight()), i1.c.CornerRadius$default(i1.b.m4156getXimpl(roundRect.m4227getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, null), f10, style, n0Var, i10);
    }

    /* renamed from: drawOutline-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m4762drawOutlinehn5TExg$default(l1.i iVar, g1 g1Var, b0 b0Var, float f10, l1.j jVar, n0 n0Var, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            jVar = l1.m.f72234a;
        }
        l1.j jVar2 = jVar;
        if ((i11 & 16) != 0) {
            n0Var = null;
        }
        n0 n0Var2 = n0Var;
        if ((i11 & 32) != 0) {
            i10 = l1.i.O8.m5344getDefaultBlendMode0nO6VwU();
        }
        m4761drawOutlinehn5TExg(iVar, g1Var, b0Var, f11, jVar2, n0Var2, i10);
    }

    /* renamed from: drawOutline-wDX37Ww, reason: not valid java name */
    public static final void m4763drawOutlinewDX37Ww(l1.i drawOutline, g1 outline, long j10, float f10, l1.j style, n0 n0Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(drawOutline, "$this$drawOutline");
        kotlin.jvm.internal.e0.checkNotNullParameter(outline, "outline");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        if (outline instanceof g1.b) {
            i1.j rect = ((g1.b) outline).getRect();
            drawOutline.mo5310drawRectnJ9OG0(j10, i1.i.Offset(rect.getLeft(), rect.getTop()), i1.p.Size(rect.getWidth(), rect.getHeight()), f10, style, n0Var, i10);
            return;
        }
        if (!(outline instanceof g1.c)) {
            if (!(outline instanceof g1.a)) {
                throw new tu.t();
            }
            drawOutline.mo5306drawPathLG529CI(((g1.a) outline).getPath(), j10, f10, style, n0Var, i10);
            return;
        }
        g1.c cVar = (g1.c) outline;
        l1 roundRectPath$ui_graphics_release = cVar.getRoundRectPath$ui_graphics_release();
        if (roundRectPath$ui_graphics_release != null) {
            drawOutline.mo5306drawPathLG529CI(roundRectPath$ui_graphics_release, j10, f10, style, n0Var, i10);
            return;
        }
        i1.l roundRect = cVar.getRoundRect();
        drawOutline.mo5312drawRoundRectuAw5IA(j10, i1.i.Offset(roundRect.getLeft(), roundRect.getTop()), i1.p.Size(roundRect.getWidth(), roundRect.getHeight()), i1.c.CornerRadius$default(i1.b.m4156getXimpl(roundRect.m4227getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, null), style, f10, n0Var, i10);
    }

    /* renamed from: drawOutline-wDX37Ww$default, reason: not valid java name */
    public static /* synthetic */ void m4764drawOutlinewDX37Ww$default(l1.i iVar, g1 g1Var, long j10, float f10, l1.j jVar, n0 n0Var, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            jVar = l1.m.f72234a;
        }
        l1.j jVar2 = jVar;
        if ((i11 & 16) != 0) {
            n0Var = null;
        }
        m4763drawOutlinewDX37Ww(iVar, g1Var, j10, f11, jVar2, n0Var, (i11 & 32) != 0 ? l1.i.O8.m5344getDefaultBlendMode0nO6VwU() : i10);
    }
}
