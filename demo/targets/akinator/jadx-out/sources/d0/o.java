package d0;

import j1.g1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f51530e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ j1.b0 f51531f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ j1.f2 f51532g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, j1.b0 b0Var, j1.f2 f2Var) {
            super(1);
            this.f51530e = f10;
            this.f51531f = b0Var;
            this.f51532g = f2Var;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            a.b.b(w3Var, "$this$null", "border").set("width", s2.i.m6815boximpl(this.f51530e));
            j1.b0 b0Var = this.f51531f;
            if (b0Var instanceof j1.j2) {
                w3Var.getProperties().set("color", j1.m0.m4848boximpl(((j1.j2) b0Var).m4781getValue0d7_KjU()));
                w3Var.setValue(j1.m0.m4848boximpl(((j1.j2) b0Var).m4781getValue0d7_KjU()));
            } else {
                w3Var.getProperties().set("brush", b0Var);
            }
            w3Var.getProperties().set("shape", this.f51532g);
        }
    }

    public static final long a(long j10, float f10) {
        return i1.c.CornerRadius(Math.max(0.0f, i1.b.m4156getXimpl(j10) - f10), Math.max(0.0f, i1.b.m4157getYimpl(j10) - f10));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final g1.l access$drawGenericBorder(g1.d r35, z1.a2 r36, j1.b0 r37, j1.g1.a r38, boolean r39, float r40) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.o.access$drawGenericBorder(g1.d, z1.a2, j1.b0, j1.g1$a, boolean, float):g1.l");
    }

    /* renamed from: access$drawRoundRectBorder-SYlcjDY, reason: not valid java name */
    public static final g1.l m3721access$drawRoundRectBorderSYlcjDY(g1.d dVar, z1.a2 a2Var, j1.b0 b0Var, g1.c cVar, long j10, long j11, boolean z10, float f10) {
        if (i1.m.isSimple(cVar.getRoundRect())) {
            return dVar.onDrawWithContent(new t(z10, b0Var, cVar.getRoundRect().m4229getTopLeftCornerRadiuskKHJgLs(), f10 / 2, f10, j10, j11, new l1.n(f10, 0.0f, 0, 0, null, 30, null)));
        }
        l lVar = (l) a2Var.getValue();
        if (lVar == null) {
            l lVar2 = new l(null, null, null, null, 15, null);
            a2Var.setValue(lVar2);
            lVar = lVar2;
        }
        j1.l1 l1VarObtainPath = lVar.obtainPath();
        i1.l roundRect = cVar.getRoundRect();
        l1VarObtainPath.reset();
        l1VarObtainPath.addRoundRect(roundRect);
        if (!z10) {
            j1.l1 l1VarPath = j1.p.Path();
            l1VarPath.addRoundRect(new i1.l(f10, f10, roundRect.getWidth() - f10, roundRect.getHeight() - f10, a(roundRect.m4229getTopLeftCornerRadiuskKHJgLs(), f10), a(roundRect.m4230getTopRightCornerRadiuskKHJgLs(), f10), a(roundRect.m4228getBottomRightCornerRadiuskKHJgLs(), f10), a(roundRect.m4227getBottomLeftCornerRadiuskKHJgLs(), f10), null));
            l1VarObtainPath.mo4807opN5in7k0(l1VarObtainPath, l1VarPath, j1.r1.f68954b.m4910getDifferenceb3I0S0c());
        }
        return dVar.onDrawWithContent(new u(l1VarObtainPath, b0Var));
    }

    public static final e1.v border(e1.v vVar, v border, j1.f2 shape) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(border, "border");
        kotlin.jvm.internal.e0.checkNotNullParameter(shape, "shape");
        return m3725borderziNgDLE(vVar, border.m3733getWidthD9Ej5fM(), border.getBrush(), shape);
    }

    public static /* synthetic */ e1.v border$default(e1.v vVar, v vVar2, j1.f2 f2Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f2Var = j1.y1.getRectangleShape();
        }
        return border(vVar, vVar2, f2Var);
    }

    /* renamed from: border-xT4_qwU, reason: not valid java name */
    public static final e1.v m3723borderxT4_qwU(e1.v border, float f10, long j10, j1.f2 shape) {
        kotlin.jvm.internal.e0.checkNotNullParameter(border, "$this$border");
        kotlin.jvm.internal.e0.checkNotNullParameter(shape, "shape");
        return m3725borderziNgDLE(border, f10, new j1.j2(j10, null), shape);
    }

    /* renamed from: border-xT4_qwU$default, reason: not valid java name */
    public static /* synthetic */ e1.v m3724borderxT4_qwU$default(e1.v vVar, float f10, long j10, j1.f2 f2Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f2Var = j1.y1.getRectangleShape();
        }
        return m3723borderxT4_qwU(vVar, f10, j10, f2Var);
    }

    /* renamed from: border-ziNgDLE, reason: not valid java name */
    public static final e1.v m3725borderziNgDLE(e1.v border, float f10, j1.b0 brush, j1.f2 shape) {
        kotlin.jvm.internal.e0.checkNotNullParameter(border, "$this$border");
        kotlin.jvm.internal.e0.checkNotNullParameter(brush, "brush");
        kotlin.jvm.internal.e0.checkNotNullParameter(shape, "shape");
        return e1.o.composed(border, a2.t3.isDebugInspectorInfoEnabled() ? new a(f10, brush, shape) : a2.t3.getNoInspectorInfo(), new n(f10, brush, shape));
    }
}
