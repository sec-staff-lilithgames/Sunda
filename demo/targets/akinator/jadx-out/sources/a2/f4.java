package a2;

import android.graphics.Outline;
import android.os.Build;
import j1.g1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f4 {

    /* renamed from: a, reason: collision with root package name */
    public s2.e f3560a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3561b;

    /* renamed from: c, reason: collision with root package name */
    public final Outline f3562c;

    /* renamed from: d, reason: collision with root package name */
    public long f3563d;

    /* renamed from: e, reason: collision with root package name */
    public j1.f2 f3564e;

    /* renamed from: f, reason: collision with root package name */
    public j1.l1 f3565f;

    /* renamed from: g, reason: collision with root package name */
    public j1.l1 f3566g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3567h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3568i;

    /* renamed from: j, reason: collision with root package name */
    public j1.l1 f3569j;

    /* renamed from: k, reason: collision with root package name */
    public i1.l f3570k;

    /* renamed from: l, reason: collision with root package name */
    public float f3571l;

    /* renamed from: m, reason: collision with root package name */
    public long f3572m;

    /* renamed from: n, reason: collision with root package name */
    public long f3573n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3574o;

    /* renamed from: p, reason: collision with root package name */
    public s2.x f3575p;

    /* renamed from: q, reason: collision with root package name */
    public j1.g1 f3576q;

    public f4(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        this.f3560a = density;
        this.f3561b = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f3562c = outline;
        i1.n nVar = i1.o.f59366b;
        this.f3563d = nVar.m4239getZeroNHjbRc();
        this.f3564e = j1.y1.getRectangleShape();
        this.f3572m = i1.h.f59344b.m4173getZeroF1C5BW0();
        this.f3573n = nVar.m4239getZeroNHjbRc();
        this.f3575p = s2.x.f85363b;
    }

    public final void a() {
        if (this.f3567h) {
            this.f3572m = i1.h.f59344b.m4173getZeroF1C5BW0();
            long j10 = this.f3563d;
            this.f3573n = j10;
            this.f3571l = 0.0f;
            this.f3566g = null;
            this.f3567h = false;
            this.f3568i = false;
            boolean z10 = this.f3574o;
            Outline outline = this.f3562c;
            if (!z10 || i1.o.m4252getWidthimpl(j10) <= 0.0f || i1.o.m4249getHeightimpl(this.f3563d) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f3561b = true;
            j1.g1 g1VarMo3688createOutlinePq9zytI = this.f3564e.mo3688createOutlinePq9zytI(this.f3563d, this.f3575p, this.f3560a);
            this.f3576q = g1VarMo3688createOutlinePq9zytI;
            if (g1VarMo3688createOutlinePq9zytI instanceof g1.b) {
                i1.j rect = ((g1.b) g1VarMo3688createOutlinePq9zytI).getRect();
                this.f3572m = i1.i.Offset(rect.getLeft(), rect.getTop());
                this.f3573n = i1.p.Size(rect.getWidth(), rect.getHeight());
                outline.setRect(mv.d.roundToInt(rect.getLeft()), mv.d.roundToInt(rect.getTop()), mv.d.roundToInt(rect.getRight()), mv.d.roundToInt(rect.getBottom()));
                return;
            }
            if (!(g1VarMo3688createOutlinePq9zytI instanceof g1.c)) {
                if (g1VarMo3688createOutlinePq9zytI instanceof g1.a) {
                    b(((g1.a) g1VarMo3688createOutlinePq9zytI).getPath());
                    return;
                }
                return;
            }
            i1.l roundRect = ((g1.c) g1VarMo3688createOutlinePq9zytI).getRoundRect();
            float fM4156getXimpl = i1.b.m4156getXimpl(roundRect.m4229getTopLeftCornerRadiuskKHJgLs());
            this.f3572m = i1.i.Offset(roundRect.getLeft(), roundRect.getTop());
            this.f3573n = i1.p.Size(roundRect.getWidth(), roundRect.getHeight());
            if (i1.m.isSimple(roundRect)) {
                this.f3562c.setRoundRect(mv.d.roundToInt(roundRect.getLeft()), mv.d.roundToInt(roundRect.getTop()), mv.d.roundToInt(roundRect.getRight()), mv.d.roundToInt(roundRect.getBottom()), fM4156getXimpl);
                this.f3571l = fM4156getXimpl;
                return;
            }
            j1.l1 l1VarPath = this.f3565f;
            if (l1VarPath == null) {
                l1VarPath = j1.p.Path();
                this.f3565f = l1VarPath;
            }
            l1VarPath.reset();
            l1VarPath.addRoundRect(roundRect);
            b(l1VarPath);
        }
    }

    public final void b(j1.l1 l1Var) {
        int i10 = Build.VERSION.SDK_INT;
        Outline outline = this.f3562c;
        if (i10 <= 28 && !l1Var.isConvex()) {
            this.f3561b = false;
            outline.setEmpty();
            this.f3568i = true;
        } else {
            if (!(l1Var instanceof j1.l)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((j1.l) l1Var).getInternalPath());
            this.f3568i = !outline.canClip();
        }
        this.f3566g = l1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void clipToOutline(j1.e0 r15) {
        /*
            r14 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.e0.checkNotNullParameter(r15, r0)
            j1.l1 r0 = r14.getClipPath()
            r1 = 0
            r2 = 0
            r3 = 2
            if (r0 == 0) goto L12
            j1.e0.m4726clipPathmtrdDE$default(r15, r0, r1, r3, r2)
            return
        L12:
            float r0 = r14.f3571l
            r4 = 0
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 <= 0) goto Lba
            j1.l1 r5 = r14.f3569j
            i1.l r6 = r14.f3570k
            if (r5 == 0) goto L73
            long r7 = r14.f3572m
            long r9 = r14.f3573n
            if (r6 == 0) goto L73
            boolean r11 = i1.m.isSimple(r6)
            if (r11 != 0) goto L2c
            goto L73
        L2c:
            float r11 = r6.getLeft()
            float r12 = i1.h.m4185getXimpl(r7)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 != 0) goto L73
            float r11 = r6.getTop()
            float r12 = i1.h.m4186getYimpl(r7)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 != 0) goto L73
            float r11 = r6.getRight()
            float r12 = i1.h.m4185getXimpl(r7)
            float r13 = i1.o.m4252getWidthimpl(r9)
            float r13 = r13 + r12
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto L73
            float r11 = r6.getBottom()
            float r7 = i1.h.m4186getYimpl(r7)
            float r8 = i1.o.m4249getHeightimpl(r9)
            float r8 = r8 + r7
            int r7 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r7 != 0) goto L73
            long r6 = r6.m4229getTopLeftCornerRadiuskKHJgLs()
            float r6 = i1.b.m4156getXimpl(r6)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L73
            goto Lb6
        L73:
            long r6 = r14.f3572m
            float r8 = i1.h.m4185getXimpl(r6)
            long r6 = r14.f3572m
            float r9 = i1.h.m4186getYimpl(r6)
            long r6 = r14.f3572m
            float r0 = i1.h.m4185getXimpl(r6)
            long r6 = r14.f3573n
            float r6 = i1.o.m4252getWidthimpl(r6)
            float r10 = r6 + r0
            long r6 = r14.f3572m
            float r0 = i1.h.m4186getYimpl(r6)
            long r6 = r14.f3573n
            float r6 = i1.o.m4249getHeightimpl(r6)
            float r11 = r6 + r0
            float r0 = r14.f3571l
            long r12 = i1.c.CornerRadius$default(r0, r4, r3, r2)
            i1.l r0 = i1.m.m4233RoundRectgG7oq9Y(r8, r9, r10, r11, r12)
            if (r5 != 0) goto Lac
            j1.l1 r5 = j1.p.Path()
            goto Laf
        Lac:
            r5.reset()
        Laf:
            r5.addRoundRect(r0)
            r14.f3570k = r0
            r14.f3569j = r5
        Lb6:
            j1.e0.m4726clipPathmtrdDE$default(r15, r5, r1, r3, r2)
            return
        Lba:
            long r0 = r14.f3572m
            float r3 = i1.h.m4185getXimpl(r0)
            long r0 = r14.f3572m
            float r4 = i1.h.m4186getYimpl(r0)
            long r0 = r14.f3572m
            float r0 = i1.h.m4185getXimpl(r0)
            long r1 = r14.f3573n
            float r1 = i1.o.m4252getWidthimpl(r1)
            float r5 = r1 + r0
            long r0 = r14.f3572m
            float r0 = i1.h.m4186getYimpl(r0)
            long r1 = r14.f3573n
            float r1 = i1.o.m4249getHeightimpl(r1)
            float r6 = r1 + r0
            r8 = 16
            r9 = 0
            r7 = 0
            r2 = r15
            j1.e0.m4727clipRectN_I0leg$default(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.f4.clipToOutline(j1.e0):void");
    }

    public final j1.l1 getClipPath() {
        a();
        return this.f3566g;
    }

    public final Outline getOutline() {
        a();
        if (this.f3574o && this.f3561b) {
            return this.f3562c;
        }
        return null;
    }

    public final boolean getOutlineClipSupported() {
        return !this.f3568i;
    }

    /* renamed from: isInOutline-k-4lQ0M, reason: not valid java name */
    public final boolean m33isInOutlinek4lQ0M(long j10) {
        j1.g1 g1Var;
        if (this.f3574o && (g1Var = this.f3576q) != null) {
            return r4.isInOutline(g1Var, i1.h.m4185getXimpl(j10), i1.h.m4186getYimpl(j10), null, null);
        }
        return true;
    }

    public final boolean update(j1.f2 shape, float f10, boolean z10, float f11, s2.x layoutDirection, s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(shape, "shape");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        this.f3562c.setAlpha(f10);
        boolean zAreEqual = kotlin.jvm.internal.e0.areEqual(this.f3564e, shape);
        boolean z11 = !zAreEqual;
        if (!zAreEqual) {
            this.f3564e = shape;
            this.f3567h = true;
        }
        boolean z12 = z10 || f11 > 0.0f;
        if (this.f3574o != z12) {
            this.f3574o = z12;
            this.f3567h = true;
        }
        if (this.f3575p != layoutDirection) {
            this.f3575p = layoutDirection;
            this.f3567h = true;
        }
        if (!kotlin.jvm.internal.e0.areEqual(this.f3560a, density)) {
            this.f3560a = density;
            this.f3567h = true;
        }
        return z11;
    }

    /* renamed from: update-uvyYCjk, reason: not valid java name */
    public final void m34updateuvyYCjk(long j10) {
        if (i1.o.m4248equalsimpl0(this.f3563d, j10)) {
            return;
        }
        this.f3563d = j10;
        this.f3567h = true;
    }
}
