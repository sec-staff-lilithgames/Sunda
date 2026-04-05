package a2;

import j1.g1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class r4 {
    public static final boolean a(j1.l1 l1Var, float f10, float f11, j1.l1 l1Var2, j1.l1 l1Var3) {
        i1.j jVar = new i1.j(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        if (l1Var2 == null) {
            l1Var2 = j1.p.Path();
        }
        l1Var2.addRect(jVar);
        if (l1Var3 == null) {
            l1Var3 = j1.p.Path();
        }
        l1Var3.mo4807opN5in7k0(l1Var, l1Var2, j1.r1.f68954b.m4911getIntersectb3I0S0c());
        boolean zIsEmpty = l1Var3.isEmpty();
        l1Var3.reset();
        l1Var2.reset();
        return !zIsEmpty;
    }

    public static final boolean b(float f10, float f11, float f12, float f13, long j10) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fM4156getXimpl = i1.b.m4156getXimpl(j10);
        float fM4157getYimpl = i1.b.m4157getYimpl(j10);
        return ((f15 * f15) / (fM4157getYimpl * fM4157getYimpl)) + ((f14 * f14) / (fM4156getXimpl * fM4156getXimpl)) <= 1.0f;
    }

    public static final boolean isInOutline(j1.g1 outline, float f10, float f11, j1.l1 l1Var, j1.l1 l1Var2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(outline, "outline");
        if (outline instanceof g1.b) {
            i1.j rect = ((g1.b) outline).getRect();
            return rect.getLeft() <= f10 && f10 < rect.getRight() && rect.getTop() <= f11 && f11 < rect.getBottom();
        }
        if (!(outline instanceof g1.c)) {
            if (outline instanceof g1.a) {
                return a(((g1.a) outline).getPath(), f10, f11, l1Var, l1Var2);
            }
            throw new tu.t();
        }
        i1.l roundRect = ((g1.c) outline).getRoundRect();
        if (f10 < roundRect.getLeft() || f10 >= roundRect.getRight() || f11 < roundRect.getTop() || f11 >= roundRect.getBottom()) {
            return false;
        }
        if (i1.b.m4156getXimpl(roundRect.m4230getTopRightCornerRadiuskKHJgLs()) + i1.b.m4156getXimpl(roundRect.m4229getTopLeftCornerRadiuskKHJgLs()) <= roundRect.getWidth()) {
            if (i1.b.m4156getXimpl(roundRect.m4228getBottomRightCornerRadiuskKHJgLs()) + i1.b.m4156getXimpl(roundRect.m4227getBottomLeftCornerRadiuskKHJgLs()) <= roundRect.getWidth()) {
                if (i1.b.m4157getYimpl(roundRect.m4227getBottomLeftCornerRadiuskKHJgLs()) + i1.b.m4157getYimpl(roundRect.m4229getTopLeftCornerRadiuskKHJgLs()) <= roundRect.getHeight()) {
                    if (i1.b.m4157getYimpl(roundRect.m4228getBottomRightCornerRadiuskKHJgLs()) + i1.b.m4157getYimpl(roundRect.m4230getTopRightCornerRadiuskKHJgLs()) <= roundRect.getHeight()) {
                        float fM4156getXimpl = i1.b.m4156getXimpl(roundRect.m4229getTopLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
                        float fM4157getYimpl = i1.b.m4157getYimpl(roundRect.m4229getTopLeftCornerRadiuskKHJgLs()) + roundRect.getTop();
                        float right = roundRect.getRight() - i1.b.m4156getXimpl(roundRect.m4230getTopRightCornerRadiuskKHJgLs());
                        float fM4157getYimpl2 = i1.b.m4157getYimpl(roundRect.m4230getTopRightCornerRadiuskKHJgLs()) + roundRect.getTop();
                        float right2 = roundRect.getRight() - i1.b.m4156getXimpl(roundRect.m4228getBottomRightCornerRadiuskKHJgLs());
                        float bottom = roundRect.getBottom() - i1.b.m4157getYimpl(roundRect.m4228getBottomRightCornerRadiuskKHJgLs());
                        float bottom2 = roundRect.getBottom() - i1.b.m4157getYimpl(roundRect.m4227getBottomLeftCornerRadiuskKHJgLs());
                        float fM4156getXimpl2 = i1.b.m4156getXimpl(roundRect.m4227getBottomLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
                        if (f10 < fM4156getXimpl && f11 < fM4157getYimpl) {
                            return b(f10, f11, fM4156getXimpl, fM4157getYimpl, roundRect.m4229getTopLeftCornerRadiuskKHJgLs());
                        }
                        if (f10 < fM4156getXimpl2 && f11 > bottom2) {
                            return b(f10, f11, fM4156getXimpl2, bottom2, roundRect.m4227getBottomLeftCornerRadiuskKHJgLs());
                        }
                        if (f10 > right && f11 < fM4157getYimpl2) {
                            return b(f10, f11, right, fM4157getYimpl2, roundRect.m4230getTopRightCornerRadiuskKHJgLs());
                        }
                        if (f10 <= right2 || f11 <= bottom) {
                            return true;
                        }
                        return b(f10, f11, right2, bottom, roundRect.m4228getBottomRightCornerRadiuskKHJgLs());
                    }
                }
            }
        }
        j1.l1 l1VarPath = l1Var2 == null ? j1.p.Path() : l1Var2;
        l1VarPath.addRoundRect(roundRect);
        return a(l1VarPath, f10, f11, l1Var, l1Var2);
    }

    public static /* synthetic */ boolean isInOutline$default(j1.g1 g1Var, float f10, float f11, j1.l1 l1Var, j1.l1 l1Var2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            l1Var = null;
        }
        if ((i10 & 16) != 0) {
            l1Var2 = null;
        }
        return isInOutline(g1Var, f10, f11, l1Var, l1Var2);
    }
}
