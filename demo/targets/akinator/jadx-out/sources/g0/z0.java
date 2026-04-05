package g0;

import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z0 extends a2.x3 implements x1.o0, y1.b, y1.d {

    /* renamed from: e, reason: collision with root package name */
    public final v3 f56659e;

    /* renamed from: f, reason: collision with root package name */
    public final p0.j2 f56660f;

    /* renamed from: g, reason: collision with root package name */
    public final p0.j2 f56661g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ v3 f56662e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v3 v3Var) {
            super(1);
            this.f56662e = v3Var;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            a.b.b(w3Var, "$this$null", "InsetsPaddingModifier").set("insets", this.f56662e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(v3 insets, kv.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.e0.checkNotNullParameter(insets, "insets");
        kotlin.jvm.internal.e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f56659e = insets;
        this.f56660f = o5.mutableStateOf$default(insets, null, 2, null);
        this.f56661g = o5.mutableStateOf$default(insets, null, 2, null);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z0) {
            return kotlin.jvm.internal.e0.areEqual(((z0) obj).f56659e, this.f56659e);
        }
        return false;
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    @Override // y1.d
    public y1.f getKey() {
        return a4.getModifierLocalConsumedWindowInsets();
    }

    public int hashCode() {
        return this.f56659e.hashCode();
    }

    @Override // x1.o0
    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(x1.z zVar, x1.y yVar, int i10) {
        return super.maxIntrinsicHeight(zVar, yVar, i10);
    }

    @Override // x1.o0
    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(x1.z zVar, x1.y yVar, int i10) {
        return super.maxIntrinsicWidth(zVar, yVar, i10);
    }

    @Override // x1.o0
    /* renamed from: measure-3p2s80s */
    public x1.y0 mo74measure3p2s80s(x1.a1 measure, x1.w0 measurable, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(measure, "$this$measure");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        p0.j2 j2Var = this.f56660f;
        int left = ((v3) j2Var.getValue()).getLeft(measure, measure.getLayoutDirection());
        int top = ((v3) j2Var.getValue()).getTop(measure);
        int right = ((v3) j2Var.getValue()).getRight(measure, measure.getLayoutDirection()) + left;
        int bottom = ((v3) j2Var.getValue()).getBottom(measure) + top;
        x1.q1 q1VarMo7826measureBRTryo0 = measurable.mo7826measureBRTryo0(s2.d.m6774offsetNN6EwU(j10, -right, -bottom));
        return x1.a1.layout$default(measure, s2.d.m6772constrainWidthK40F9xA(j10, q1VarMo7826measureBRTryo0.getWidth() + right), s2.d.m6771constrainHeightK40F9xA(j10, q1VarMo7826measureBRTryo0.getHeight() + bottom), null, new y0(left, top, q1VarMo7826measureBRTryo0), 4, null);
    }

    @Override // x1.o0
    public /* bridge */ /* synthetic */ int minIntrinsicHeight(x1.z zVar, x1.y yVar, int i10) {
        return super.minIntrinsicHeight(zVar, yVar, i10);
    }

    @Override // x1.o0
    public /* bridge */ /* synthetic */ int minIntrinsicWidth(x1.z zVar, x1.y yVar, int i10) {
        return super.minIntrinsicWidth(zVar, yVar, i10);
    }

    @Override // y1.b
    public void onModifierLocalsUpdated(y1.e scope) {
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        v3 v3Var = (v3) scope.getCurrent(a4.getModifierLocalConsumedWindowInsets());
        v3 v3Var2 = this.f56659e;
        this.f56660f.setValue(y3.exclude(v3Var2, v3Var));
        this.f56661g.setValue(y3.union(v3Var, v3Var2));
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }

    @Override // y1.d
    public v3 getValue() {
        return (v3) this.f56661g.getValue();
    }

    public /* synthetic */ z0(v3 v3Var, kv.l lVar, int i10, kotlin.jvm.internal.u uVar) {
        this(v3Var, (i10 & 2) != 0 ? a2.t3.isDebugInspectorInfoEnabled() ? new a(v3Var) : a2.t3.getNoInspectorInfo() : lVar);
    }
}
