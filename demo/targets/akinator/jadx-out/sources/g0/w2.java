package g0;

import g0.x2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w2 implements v2 {

    /* renamed from: a, reason: collision with root package name */
    public static final w2 f56611a = new w2();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e1.c f56612e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e1.c cVar) {
            super(1);
            this.f56612e = cVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            w3Var.setName("align");
            w3Var.setValue(this.f56612e);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x1.x f56613e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x1.x xVar) {
            super(1);
            this.f56613e = xVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            w3Var.setName("alignBy");
            w3Var.setValue(this.f56613e);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.l f56614e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kv.l lVar) {
            super(1);
            this.f56614e = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            w3Var.setName("alignBy");
            w3Var.setValue(this.f56614e);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f56615e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f56616f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f10, boolean z10) {
            super(1);
            this.f56615e = f10;
            this.f56616f = z10;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            w3Var.setName("weight");
            float f10 = this.f56615e;
            w3Var.setValue(Float.valueOf(f10));
            w3Var.getProperties().set("weight", Float.valueOf(f10));
            w3Var.getProperties().set("fill", Boolean.valueOf(this.f56616f));
        }
    }

    @Override // g0.v2
    public e1.v align(e1.v vVar, e1.c alignment) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(alignment, "alignment");
        return vVar.then(new t3(alignment, a2.t3.isDebugInspectorInfoEnabled() ? new a(alignment) : a2.t3.getNoInspectorInfo()));
    }

    @Override // g0.v2
    public e1.v alignBy(e1.v vVar, x1.x alignmentLine) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(alignmentLine, "alignmentLine");
        return vVar.then(new x2.a(alignmentLine, a2.t3.isDebugInspectorInfoEnabled() ? new b(alignmentLine) : a2.t3.getNoInspectorInfo()));
    }

    @Override // g0.v2
    public e1.v alignByBaseline(e1.v vVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        return alignBy(vVar, x1.d.getFirstBaseline());
    }

    @Override // g0.v2
    public e1.v weight(e1.v vVar, float f10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        if (f10 > 0.0d) {
            return vVar.then(new c2(f10, z10, a2.t3.isDebugInspectorInfoEnabled() ? new d(f10, z10) : a2.t3.getNoInspectorInfo()));
        }
        throw new IllegalArgumentException(("invalid weight " + f10 + "; must be greater than zero").toString());
    }

    @Override // g0.v2
    public e1.v alignBy(e1.v vVar, kv.l alignmentLineBlock) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(alignmentLineBlock, "alignmentLineBlock");
        return vVar.then(new x2.b(alignmentLineBlock, a2.t3.isDebugInspectorInfoEnabled() ? new c(alignmentLineBlock) : a2.t3.getNoInspectorInfo()));
    }
}
