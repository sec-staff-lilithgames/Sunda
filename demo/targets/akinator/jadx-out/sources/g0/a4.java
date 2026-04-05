package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a4 {

    /* renamed from: a, reason: collision with root package name */
    public static final y1.f f56348a = y1.c.modifierLocalOf(z3.f56665e);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ v3 f56349e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v3 v3Var) {
            super(1);
            this.f56349e = v3Var;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            a.b.b(w3Var, "$this$null", "consumedWindowInsets").set("insets", this.f56349e);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i2 f56350e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i2 i2Var) {
            super(1);
            this.f56350e = i2Var;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            a.b.b(w3Var, "$this$null", "consumedWindowInsets").set("paddingValues", this.f56350e);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ v3 f56351e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v3 v3Var) {
            super(1);
            this.f56351e = v3Var;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            a.b.b(w3Var, "$this$null", "windowInsetsPadding").set("insets", this.f56351e);
        }
    }

    public static final e1.v consumedWindowInsets(e1.v vVar, v3 insets) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(insets, "insets");
        return vVar.then(new p3(insets, a2.t3.isDebugInspectorInfoEnabled() ? new a(insets) : a2.t3.getNoInspectorInfo()));
    }

    public static final y1.f getModifierLocalConsumedWindowInsets() {
        return f56348a;
    }

    public static final e1.v windowInsetsPadding(e1.v vVar, v3 insets) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(insets, "insets");
        return vVar.then(new z0(insets, a2.t3.isDebugInspectorInfoEnabled() ? new c(insets) : a2.t3.getNoInspectorInfo()));
    }

    public static final e1.v consumedWindowInsets(e1.v vVar, i2 paddingValues) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(paddingValues, "paddingValues");
        return vVar.then(new j2(paddingValues, a2.t3.isDebugInspectorInfoEnabled() ? new b(paddingValues) : a2.t3.getNoInspectorInfo()));
    }
}
