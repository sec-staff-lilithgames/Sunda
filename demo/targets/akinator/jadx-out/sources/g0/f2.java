package g0;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f2 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f56410e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f56411f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f56412g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f56413h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, float f11, float f12, float f13) {
            super(1);
            this.f56410e = f10;
            this.f56411f = f11;
            this.f56412g = f12;
            this.f56413h = f13;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            e3.g.g(this.f56412g, e3.g.g(this.f56411f, e3.g.g(this.f56410e, a.b.b(w3Var, "$this$null", "absolutePadding"), TtmlNode.LEFT, w3Var), "top", w3Var), TtmlNode.RIGHT, w3Var).set("bottom", s2.i.m6815boximpl(this.f56413h));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i2 f56414e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i2 i2Var) {
            super(1);
            this.f56414e = i2Var;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            a.b.b(w3Var, "$this$null", "padding").set("paddingValues", this.f56414e);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f56415e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f10) {
            super(1);
            this.f56415e = f10;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            w3Var.setName("padding");
            w3Var.setValue(s2.i.m6815boximpl(this.f56415e));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f56416e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f56417f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f10, float f11) {
            super(1);
            this.f56416e = f10;
            this.f56417f = f11;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            e3.g.g(this.f56416e, a.b.b(w3Var, "$this$null", "padding"), "horizontal", w3Var).set("vertical", s2.i.m6815boximpl(this.f56417f));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f56418e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f56419f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f56420g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f56421h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(float f10, float f11, float f12, float f13) {
            super(1);
            this.f56418e = f10;
            this.f56419f = f11;
            this.f56420g = f12;
            this.f56421h = f13;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            e3.g.g(this.f56420g, e3.g.g(this.f56419f, e3.g.g(this.f56418e, a.b.b(w3Var, "$this$null", "padding"), "start", w3Var), "top", w3Var), TtmlNode.END, w3Var).set("bottom", s2.i.m6815boximpl(this.f56421h));
        }
    }

    /* renamed from: PaddingValues-0680j_4, reason: not valid java name */
    public static final i2 m3870PaddingValues0680j_4(float f10) {
        return new k2(f10, f10, f10, f10, null);
    }

    /* renamed from: PaddingValues-YgX7TsA, reason: not valid java name */
    public static final i2 m3871PaddingValuesYgX7TsA(float f10, float f11) {
        return new k2(f10, f11, f10, f11, null);
    }

    /* renamed from: PaddingValues-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ i2 m3872PaddingValuesYgX7TsA$default(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s2.i.m6817constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = s2.i.m6817constructorimpl(0);
        }
        return m3871PaddingValuesYgX7TsA(f10, f11);
    }

    /* renamed from: PaddingValues-a9UjIt4, reason: not valid java name */
    public static final i2 m3873PaddingValuesa9UjIt4(float f10, float f11, float f12, float f13) {
        return new k2(f10, f11, f12, f13, null);
    }

    /* renamed from: PaddingValues-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ i2 m3874PaddingValuesa9UjIt4$default(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s2.i.m6817constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = s2.i.m6817constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f12 = s2.i.m6817constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f13 = s2.i.m6817constructorimpl(0);
        }
        return m3873PaddingValuesa9UjIt4(f10, f11, f12, f13);
    }

    /* renamed from: absolutePadding-qDBjuR0, reason: not valid java name */
    public static final e1.v m3875absolutePaddingqDBjuR0(e1.v absolutePadding, float f10, float f11, float f12, float f13) {
        kotlin.jvm.internal.e0.checkNotNullParameter(absolutePadding, "$this$absolutePadding");
        return absolutePadding.then(new h2(f10, f11, f12, f13, false, a2.t3.isDebugInspectorInfoEnabled() ? new a(f10, f11, f12, f13) : a2.t3.getNoInspectorInfo(), null));
    }

    /* renamed from: absolutePadding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ e1.v m3876absolutePaddingqDBjuR0$default(e1.v vVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s2.i.m6817constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = s2.i.m6817constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f12 = s2.i.m6817constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f13 = s2.i.m6817constructorimpl(0);
        }
        return m3875absolutePaddingqDBjuR0(vVar, f10, f11, f12, f13);
    }

    public static final float calculateEndPadding(i2 i2Var, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(i2Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == s2.x.f85363b ? i2Var.mo3843calculateRightPaddingu2uoSUM(layoutDirection) : i2Var.mo3842calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    public static final float calculateStartPadding(i2 i2Var, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(i2Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == s2.x.f85363b ? i2Var.mo3842calculateLeftPaddingu2uoSUM(layoutDirection) : i2Var.mo3843calculateRightPaddingu2uoSUM(layoutDirection);
    }

    public static final e1.v padding(e1.v vVar, i2 paddingValues) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(paddingValues, "paddingValues");
        return vVar.then(new n2(paddingValues, a2.t3.isDebugInspectorInfoEnabled() ? new b(paddingValues) : a2.t3.getNoInspectorInfo()));
    }

    /* renamed from: padding-3ABfNKs, reason: not valid java name */
    public static final e1.v m3877padding3ABfNKs(e1.v padding, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new h2(f10, f10, f10, f10, true, a2.t3.isDebugInspectorInfoEnabled() ? new c(f10) : a2.t3.getNoInspectorInfo(), null));
    }

    /* renamed from: padding-VpY3zN4, reason: not valid java name */
    public static final e1.v m3878paddingVpY3zN4(e1.v padding, float f10, float f11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new h2(f10, f11, f10, f11, true, a2.t3.isDebugInspectorInfoEnabled() ? new d(f10, f11) : a2.t3.getNoInspectorInfo(), null));
    }

    /* renamed from: padding-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ e1.v m3879paddingVpY3zN4$default(e1.v vVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s2.i.m6817constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = s2.i.m6817constructorimpl(0);
        }
        return m3878paddingVpY3zN4(vVar, f10, f11);
    }

    /* renamed from: padding-qDBjuR0, reason: not valid java name */
    public static final e1.v m3880paddingqDBjuR0(e1.v padding, float f10, float f11, float f12, float f13) {
        kotlin.jvm.internal.e0.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new h2(f10, f11, f12, f13, true, a2.t3.isDebugInspectorInfoEnabled() ? new e(f10, f11, f12, f13) : a2.t3.getNoInspectorInfo(), null));
    }

    /* renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ e1.v m3881paddingqDBjuR0$default(e1.v vVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s2.i.m6817constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = s2.i.m6817constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f12 = s2.i.m6817constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f13 = s2.i.m6817constructorimpl(0);
        }
        return m3880paddingqDBjuR0(vVar, f10, f11, f12, f13);
    }
}
