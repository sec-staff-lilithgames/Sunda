package g0;

import g0.x2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f56494a = new k0();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e1.b f56495e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e1.b bVar) {
            super(1);
            this.f56495e = bVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            w3Var.setName("align");
            w3Var.setValue(this.f56495e);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x1.f2 f56496e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x1.f2 f2Var) {
            super(1);
            this.f56496e = f2Var;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            w3Var.setName("alignBy");
            w3Var.setValue(this.f56496e);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.l f56497e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kv.l lVar) {
            super(1);
            this.f56497e = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            w3Var.setName("alignBy");
            w3Var.setValue(this.f56497e);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f56498e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f56499f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f10, boolean z10) {
            super(1);
            this.f56498e = f10;
            this.f56499f = z10;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            w3Var.setName("weight");
            float f10 = this.f56498e;
            w3Var.setValue(Float.valueOf(f10));
            w3Var.getProperties().set("weight", Float.valueOf(f10));
            w3Var.getProperties().set("fill", Boolean.valueOf(this.f56499f));
        }
    }

    @Override // g0.j0
    public e1.v align(e1.v vVar, e1.b alignment) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(alignment, "alignment");
        return vVar.then(new v0(alignment, a2.t3.isDebugInspectorInfoEnabled() ? new a(alignment) : a2.t3.getNoInspectorInfo()));
    }

    @Override // g0.j0
    public e1.v alignBy(e1.v vVar, x1.f2 alignmentLine) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(alignmentLine, "alignmentLine");
        return vVar.then(new x2.a(alignmentLine, a2.t3.isDebugInspectorInfoEnabled() ? new b(alignmentLine) : a2.t3.getNoInspectorInfo()));
    }

    @Override // g0.j0
    public e1.v weight(e1.v vVar, float f10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        if (f10 > 0.0d) {
            return vVar.then(new c2(f10, z10, a2.t3.isDebugInspectorInfoEnabled() ? new d(f10, z10) : a2.t3.getNoInspectorInfo()));
        }
        throw new IllegalArgumentException(("invalid weight " + f10 + "; must be greater than zero").toString());
    }

    @Override // g0.j0
    public e1.v alignBy(e1.v vVar, kv.l alignmentLineBlock) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(alignmentLineBlock, "alignmentLineBlock");
        return vVar.then(new x2.b(alignmentLineBlock, a2.t3.isDebugInspectorInfoEnabled() ? new c(alignmentLineBlock) : a2.t3.getNoInspectorInfo()));
    }
}
