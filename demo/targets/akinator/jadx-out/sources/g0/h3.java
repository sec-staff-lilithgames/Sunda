package g0;

import io.ktor.http.ContentDisposition;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h3 {

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f56446a = new s0(p0.f56550c, 1.0f, new a3(1.0f));

    /* renamed from: b, reason: collision with root package name */
    public static final s0 f56447b = new s0(p0.f56549b, 1.0f, new y2(1.0f));

    /* renamed from: c, reason: collision with root package name */
    public static final s0 f56448c = new s0(p0.f56551e, 1.0f, new z2(1.0f));

    /* renamed from: d, reason: collision with root package name */
    public static final g4 f56449d;

    /* renamed from: e, reason: collision with root package name */
    public static final g4 f56450e;

    /* renamed from: f, reason: collision with root package name */
    public static final g4 f56451f;

    /* renamed from: g, reason: collision with root package name */
    public static final g4 f56452g;

    /* renamed from: h, reason: collision with root package name */
    public static final g4 f56453h;

    /* renamed from: i, reason: collision with root package name */
    public static final g4 f56454i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f56455e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f56456f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, float f11) {
            super(1);
            this.f56455e = f10;
            this.f56456f = f11;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            e3.g.g(this.f56455e, a.b.b(w3Var, "$this$null", "defaultMinSize"), "minWidth", w3Var).set("minHeight", s2.i.m6815boximpl(this.f56456f));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f56457e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10) {
            super(1);
            this.f56457e = f10;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            w3Var.setName("height");
            w3Var.setValue(s2.i.m6815boximpl(this.f56457e));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f56458e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f56459f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f10, float f11) {
            super(1);
            this.f56458e = f10;
            this.f56459f = f11;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            e3.g.g(this.f56458e, a.b.b(w3Var, "$this$null", "heightIn"), "min", w3Var).set("max", s2.i.m6815boximpl(this.f56459f));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f56460e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f10) {
            super(1);
            this.f56460e = f10;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            w3Var.setName("requiredHeight");
            w3Var.setValue(s2.i.m6815boximpl(this.f56460e));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f56461e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f56462f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(float f10, float f11) {
            super(1);
            this.f56461e = f10;
            this.f56462f = f11;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            e3.g.g(this.f56461e, a.b.b(w3Var, "$this$null", "requiredHeightIn"), "min", w3Var).set("max", s2.i.m6815boximpl(this.f56462f));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f56463e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(float f10) {
            super(1);
            this.f56463e = f10;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            w3Var.setName("requiredSize");
            w3Var.setValue(s2.i.m6815boximpl(this.f56463e));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f56464e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f56465f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(float f10, float f11) {
            super(1);
            this.f56464e = f10;
            this.f56465f = f11;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            e3.g.g(this.f56464e, a.b.b(w3Var, "$this$null", "requiredSize"), "width", w3Var).set("height", s2.i.m6815boximpl(this.f56465f));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f56466e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f56467f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f56468g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f56469h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(float f10, float f11, float f12, float f13) {
            super(1);
            this.f56466e = f10;
            this.f56467f = f11;
            this.f56468g = f12;
            this.f56469h = f13;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            e3.g.g(this.f56468g, e3.g.g(this.f56467f, e3.g.g(this.f56466e, a.b.b(w3Var, "$this$null", "requiredSizeIn"), "minWidth", w3Var), "minHeight", w3Var), "maxWidth", w3Var).set("maxHeight", s2.i.m6815boximpl(this.f56469h));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class i extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f56470e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(float f10) {
            super(1);
            this.f56470e = f10;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            w3Var.setName("requiredWidth");
            w3Var.setValue(s2.i.m6815boximpl(this.f56470e));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class j extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f56471e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f56472f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(float f10, float f11) {
            super(1);
            this.f56471e = f10;
            this.f56472f = f11;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            e3.g.g(this.f56471e, a.b.b(w3Var, "$this$null", "requiredWidthIn"), "min", w3Var).set("max", s2.i.m6815boximpl(this.f56472f));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class k extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f56473e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(float f10) {
            super(1);
            this.f56473e = f10;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            w3Var.setName(ContentDisposition.Parameters.Size);
            w3Var.setValue(s2.i.m6815boximpl(this.f56473e));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class l extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f56474e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f56475f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(float f10, float f11) {
            super(1);
            this.f56474e = f10;
            this.f56475f = f11;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            e3.g.g(this.f56474e, a.b.b(w3Var, "$this$null", ContentDisposition.Parameters.Size), "width", w3Var).set("height", s2.i.m6815boximpl(this.f56475f));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class m extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f56476e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f56477f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f56478g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f56479h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(float f10, float f11, float f12, float f13) {
            super(1);
            this.f56476e = f10;
            this.f56477f = f11;
            this.f56478g = f12;
            this.f56479h = f13;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            e3.g.g(this.f56478g, e3.g.g(this.f56477f, e3.g.g(this.f56476e, a.b.b(w3Var, "$this$null", "sizeIn"), "minWidth", w3Var), "minHeight", w3Var), "maxWidth", w3Var).set("maxHeight", s2.i.m6815boximpl(this.f56479h));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class n extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f56480e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(float f10) {
            super(1);
            this.f56480e = f10;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            w3Var.setName("width");
            w3Var.setValue(s2.i.m6815boximpl(this.f56480e));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class o extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f56481e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f56482f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(float f10, float f11) {
            super(1);
            this.f56481e = f10;
            this.f56482f = f11;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            e3.g.g(this.f56481e, a.b.b(w3Var, "$this$null", "widthIn"), "min", w3Var).set("max", s2.i.m6815boximpl(this.f56482f));
        }
    }

    static {
        e1.a aVar = e1.d.f53469a;
        f56449d = c(aVar.getCenterHorizontally(), false);
        f56450e = c(aVar.getStart(), false);
        f56451f = a(aVar.getCenterVertically(), false);
        f56452g = a(aVar.getTop(), false);
        f56453h = b(aVar.getCenter(), false);
        f56454i = b(aVar.getTopStart(), false);
    }

    public static final g4 a(e1.c cVar, boolean z10) {
        return new g4(p0.f56549b, z10, new b3(cVar), cVar, new c3(cVar, z10));
    }

    public static final g4 b(e1.d dVar, boolean z10) {
        return new g4(p0.f56551e, z10, new d3(dVar), dVar, new e3(dVar, z10));
    }

    public static final g4 c(e1.b bVar, boolean z10) {
        return new g4(p0.f56550c, z10, new f3(bVar), bVar, new g3(bVar, z10));
    }

    /* renamed from: defaultMinSize-VpY3zN4, reason: not valid java name */
    public static final e1.v m3889defaultMinSizeVpY3zN4(e1.v defaultMinSize, float f10, float f11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultMinSize, "$this$defaultMinSize");
        return defaultMinSize.then(new r3(f10, f11, a2.t3.isDebugInspectorInfoEnabled() ? new a(f10, f11) : a2.t3.getNoInspectorInfo(), null));
    }

    /* renamed from: defaultMinSize-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ e1.v m3890defaultMinSizeVpY3zN4$default(e1.v vVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        }
        return m3889defaultMinSizeVpY3zN4(vVar, f10, f11);
    }

    public static final e1.v fillMaxHeight(e1.v vVar, float f10) {
        s0 s0Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        if (f10 == 1.0f) {
            s0Var = f56447b;
        } else {
            s0Var = new s0(p0.f56549b, f10, new y2(f10));
        }
        return vVar.then(s0Var);
    }

    public static /* synthetic */ e1.v fillMaxHeight$default(e1.v vVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return fillMaxHeight(vVar, f10);
    }

    public static final e1.v fillMaxSize(e1.v vVar, float f10) {
        s0 s0Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        if (f10 == 1.0f) {
            s0Var = f56448c;
        } else {
            s0Var = new s0(p0.f56551e, f10, new z2(f10));
        }
        return vVar.then(s0Var);
    }

    public static /* synthetic */ e1.v fillMaxSize$default(e1.v vVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return fillMaxSize(vVar, f10);
    }

    public static final e1.v fillMaxWidth(e1.v vVar, float f10) {
        s0 s0Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        if (f10 == 1.0f) {
            s0Var = f56446a;
        } else {
            s0Var = new s0(p0.f56550c, f10, new a3(f10));
        }
        return vVar.then(s0Var);
    }

    public static /* synthetic */ e1.v fillMaxWidth$default(e1.v vVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return fillMaxWidth(vVar, f10);
    }

    /* renamed from: height-3ABfNKs, reason: not valid java name */
    public static final e1.v m3891height3ABfNKs(e1.v height, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(height, "$this$height");
        return height.then(new k3(0.0f, f10, 0.0f, f10, true, a2.t3.isDebugInspectorInfoEnabled() ? new b(f10) : a2.t3.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: heightIn-VpY3zN4, reason: not valid java name */
    public static final e1.v m3892heightInVpY3zN4(e1.v heightIn, float f10, float f11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(heightIn, "$this$heightIn");
        return heightIn.then(new k3(0.0f, f10, 0.0f, f11, true, a2.t3.isDebugInspectorInfoEnabled() ? new c(f10, f11) : a2.t3.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: heightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ e1.v m3893heightInVpY3zN4$default(e1.v vVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        }
        return m3892heightInVpY3zN4(vVar, f10, f11);
    }

    /* renamed from: requiredHeight-3ABfNKs, reason: not valid java name */
    public static final e1.v m3894requiredHeight3ABfNKs(e1.v requiredHeight, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(requiredHeight, "$this$requiredHeight");
        return requiredHeight.then(new k3(0.0f, f10, 0.0f, f10, false, a2.t3.isDebugInspectorInfoEnabled() ? new d(f10) : a2.t3.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: requiredHeightIn-VpY3zN4, reason: not valid java name */
    public static final e1.v m3895requiredHeightInVpY3zN4(e1.v requiredHeightIn, float f10, float f11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(requiredHeightIn, "$this$requiredHeightIn");
        return requiredHeightIn.then(new k3(0.0f, f10, 0.0f, f11, false, a2.t3.isDebugInspectorInfoEnabled() ? new e(f10, f11) : a2.t3.getNoInspectorInfo(), 5, null));
    }

    /* renamed from: requiredHeightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ e1.v m3896requiredHeightInVpY3zN4$default(e1.v vVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        }
        return m3895requiredHeightInVpY3zN4(vVar, f10, f11);
    }

    /* renamed from: requiredSize-3ABfNKs, reason: not valid java name */
    public static final e1.v m3897requiredSize3ABfNKs(e1.v requiredSize, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(requiredSize, "$this$requiredSize");
        return requiredSize.then(new k3(f10, f10, f10, f10, false, a2.t3.isDebugInspectorInfoEnabled() ? new f(f10) : a2.t3.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSize-6HolHcs, reason: not valid java name */
    public static final e1.v m3898requiredSize6HolHcs(e1.v requiredSize, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(requiredSize, "$this$requiredSize");
        return m3899requiredSizeVpY3zN4(requiredSize, s2.o.m6911getWidthD9Ej5fM(j10), s2.o.m6909getHeightD9Ej5fM(j10));
    }

    /* renamed from: requiredSize-VpY3zN4, reason: not valid java name */
    public static final e1.v m3899requiredSizeVpY3zN4(e1.v requiredSize, float f10, float f11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(requiredSize, "$this$requiredSize");
        return requiredSize.then(new k3(f10, f11, f10, f11, false, a2.t3.isDebugInspectorInfoEnabled() ? new g(f10, f11) : a2.t3.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSizeIn-qDBjuR0, reason: not valid java name */
    public static final e1.v m3900requiredSizeInqDBjuR0(e1.v requiredSizeIn, float f10, float f11, float f12, float f13) {
        kotlin.jvm.internal.e0.checkNotNullParameter(requiredSizeIn, "$this$requiredSizeIn");
        return requiredSizeIn.then(new k3(f10, f11, f12, f13, false, a2.t3.isDebugInspectorInfoEnabled() ? new h(f10, f11, f12, f13) : a2.t3.getNoInspectorInfo(), null));
    }

    /* renamed from: requiredSizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ e1.v m3901requiredSizeInqDBjuR0$default(e1.v vVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 4) != 0) {
            f12 = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 8) != 0) {
            f13 = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        }
        return m3900requiredSizeInqDBjuR0(vVar, f10, f11, f12, f13);
    }

    /* renamed from: requiredWidth-3ABfNKs, reason: not valid java name */
    public static final e1.v m3902requiredWidth3ABfNKs(e1.v requiredWidth, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(requiredWidth, "$this$requiredWidth");
        return requiredWidth.then(new k3(f10, 0.0f, f10, 0.0f, false, a2.t3.isDebugInspectorInfoEnabled() ? new i(f10) : a2.t3.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: requiredWidthIn-VpY3zN4, reason: not valid java name */
    public static final e1.v m3903requiredWidthInVpY3zN4(e1.v requiredWidthIn, float f10, float f11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(requiredWidthIn, "$this$requiredWidthIn");
        return requiredWidthIn.then(new k3(f10, 0.0f, f11, 0.0f, false, a2.t3.isDebugInspectorInfoEnabled() ? new j(f10, f11) : a2.t3.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: requiredWidthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ e1.v m3904requiredWidthInVpY3zN4$default(e1.v vVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        }
        return m3903requiredWidthInVpY3zN4(vVar, f10, f11);
    }

    /* renamed from: size-3ABfNKs, reason: not valid java name */
    public static final e1.v m3905size3ABfNKs(e1.v size, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(size, "$this$size");
        return size.then(new k3(f10, f10, f10, f10, true, a2.t3.isDebugInspectorInfoEnabled() ? new k(f10) : a2.t3.getNoInspectorInfo(), null));
    }

    /* renamed from: size-6HolHcs, reason: not valid java name */
    public static final e1.v m3906size6HolHcs(e1.v size, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(size, "$this$size");
        return m3907sizeVpY3zN4(size, s2.o.m6911getWidthD9Ej5fM(j10), s2.o.m6909getHeightD9Ej5fM(j10));
    }

    /* renamed from: size-VpY3zN4, reason: not valid java name */
    public static final e1.v m3907sizeVpY3zN4(e1.v size, float f10, float f11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(size, "$this$size");
        return size.then(new k3(f10, f11, f10, f11, true, a2.t3.isDebugInspectorInfoEnabled() ? new l(f10, f11) : a2.t3.getNoInspectorInfo(), null));
    }

    /* renamed from: sizeIn-qDBjuR0, reason: not valid java name */
    public static final e1.v m3908sizeInqDBjuR0(e1.v sizeIn, float f10, float f11, float f12, float f13) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sizeIn, "$this$sizeIn");
        return sizeIn.then(new k3(f10, f11, f12, f13, true, a2.t3.isDebugInspectorInfoEnabled() ? new m(f10, f11, f12, f13) : a2.t3.getNoInspectorInfo(), null));
    }

    /* renamed from: sizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ e1.v m3909sizeInqDBjuR0$default(e1.v vVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 4) != 0) {
            f12 = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 8) != 0) {
            f13 = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        }
        return m3908sizeInqDBjuR0(vVar, f10, f11, f12, f13);
    }

    /* renamed from: width-3ABfNKs, reason: not valid java name */
    public static final e1.v m3910width3ABfNKs(e1.v width, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(width, "$this$width");
        return width.then(new k3(f10, 0.0f, f10, 0.0f, true, a2.t3.isDebugInspectorInfoEnabled() ? new n(f10) : a2.t3.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: widthIn-VpY3zN4, reason: not valid java name */
    public static final e1.v m3911widthInVpY3zN4(e1.v widthIn, float f10, float f11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(widthIn, "$this$widthIn");
        return widthIn.then(new k3(f10, 0.0f, f11, 0.0f, true, a2.t3.isDebugInspectorInfoEnabled() ? new o(f10, f11) : a2.t3.getNoInspectorInfo(), 10, null));
    }

    /* renamed from: widthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ e1.v m3912widthInVpY3zN4$default(e1.v vVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        }
        if ((i10 & 2) != 0) {
            f11 = s2.i.f85335c.m6814getUnspecifiedD9Ej5fM();
        }
        return m3911widthInVpY3zN4(vVar, f10, f11);
    }

    public static final e1.v wrapContentHeight(e1.v vVar, e1.c align, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(align, "align");
        e1.a aVar = e1.d.f53469a;
        return vVar.then((!kotlin.jvm.internal.e0.areEqual(align, aVar.getCenterVertically()) || z10) ? (!kotlin.jvm.internal.e0.areEqual(align, aVar.getTop()) || z10) ? a(align, z10) : f56452g : f56451f);
    }

    public static /* synthetic */ e1.v wrapContentHeight$default(e1.v vVar, e1.c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = e1.d.f53469a.getCenterVertically();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return wrapContentHeight(vVar, cVar, z10);
    }

    public static final e1.v wrapContentSize(e1.v vVar, e1.d align, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(align, "align");
        e1.a aVar = e1.d.f53469a;
        return vVar.then((!kotlin.jvm.internal.e0.areEqual(align, aVar.getCenter()) || z10) ? (!kotlin.jvm.internal.e0.areEqual(align, aVar.getTopStart()) || z10) ? b(align, z10) : f56454i : f56453h);
    }

    public static /* synthetic */ e1.v wrapContentSize$default(e1.v vVar, e1.d dVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = e1.d.f53469a.getCenter();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return wrapContentSize(vVar, dVar, z10);
    }

    public static final e1.v wrapContentWidth(e1.v vVar, e1.b align, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(align, "align");
        e1.a aVar = e1.d.f53469a;
        return vVar.then((!kotlin.jvm.internal.e0.areEqual(align, aVar.getCenterHorizontally()) || z10) ? (!kotlin.jvm.internal.e0.areEqual(align, aVar.getStart()) || z10) ? c(align, z10) : f56450e : f56449d);
    }

    public static /* synthetic */ e1.v wrapContentWidth$default(e1.v vVar, e1.b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = e1.d.f53469a.getCenterHorizontally();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return wrapContentWidth(vVar, bVar, z10);
    }
}
