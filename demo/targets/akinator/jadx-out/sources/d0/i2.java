package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i2 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f0.q f51400e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f51401f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f0.q qVar, boolean z10) {
            super(1);
            this.f51400e = qVar;
            this.f51401f = z10;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            a.b.b(w3Var, "$this$null", "hoverable").set("interactionSource", this.f51400e);
            w3Var.getProperties().set("enabled", Boolean.valueOf(this.f51401f));
        }
    }

    public static final e1.v hoverable(e1.v vVar, f0.q interactionSource, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(interactionSource, "interactionSource");
        return e1.o.composed(vVar, a2.t3.isDebugInspectorInfoEnabled() ? new a(interactionSource, z10) : a2.t3.getNoInspectorInfo(), new r2(interactionSource, z10));
    }

    public static /* synthetic */ e1.v hoverable$default(e1.v vVar, f0.q qVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return hoverable(vVar, qVar, z10);
    }
}
