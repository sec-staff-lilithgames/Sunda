package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class v2 {

    /* renamed from: a, reason: collision with root package name */
    public static final p0.g3 f51645a = p0.o0.staticCompositionLocalOf(u2.f51637e);

    public static final p0.g3 getLocalIndication() {
        return f51645a;
    }

    public static final e1.v indication(e1.v vVar, f0.o interactionSource, s2 s2Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(interactionSource, "interactionSource");
        return e1.o.composed(vVar, a2.t3.isDebugInspectorInfoEnabled() ? new a(s2Var, interactionSource) : a2.t3.getNoInspectorInfo(), new w2(s2Var, interactionSource));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ s2 f51646e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f0.o f51647f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s2 s2Var, f0.o oVar) {
            super(1);
            this.f51646e = s2Var;
            this.f51647f = oVar;
        }

        public final void invoke(a2.w3 w3Var) {
            a.b.b(w3Var, "$this$null", "indication").set("indication", this.f51646e);
            w3Var.getProperties().set("interactionSource", this.f51647f);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }
    }
}
