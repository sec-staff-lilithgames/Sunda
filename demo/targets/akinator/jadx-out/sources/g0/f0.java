package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f56407a = new f0();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e1.d f56408e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e1.d dVar) {
            super(1);
            this.f56408e = dVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            w3Var.setName("align");
            w3Var.setValue(this.f56408e);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.l {
        public b() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            w3Var.setName("matchParentSize");
        }
    }

    @Override // g0.e0
    public e1.v align(e1.v vVar, e1.d alignment) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(alignment, "alignment");
        return vVar.then(new v(alignment, false, a2.t3.isDebugInspectorInfoEnabled() ? new a(alignment) : a2.t3.getNoInspectorInfo()));
    }

    @Override // g0.e0
    public e1.v matchParentSize(e1.v vVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        return vVar.then(new v(e1.d.f53469a.getCenter(), true, a2.t3.isDebugInspectorInfoEnabled() ? new b() : a2.t3.getNoInspectorInfo()));
    }
}
