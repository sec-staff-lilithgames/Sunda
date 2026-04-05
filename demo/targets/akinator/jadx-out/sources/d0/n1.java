package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a2.q3 f51511a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f51512e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f0.q f51513f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, f0.q qVar) {
            super(1);
            this.f51512e = z10;
            this.f51513f = qVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            com.google.android.gms.internal.play_billing.a.d(this.f51512e, a.b.b(w3Var, "$this$null", "focusable"), "enabled", w3Var).set("interactionSource", this.f51513f);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f51514e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f0.q f51515f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, f0.q qVar) {
            super(1);
            this.f51514e = z10;
            this.f51515f = qVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            com.google.android.gms.internal.play_billing.a.d(this.f51514e, a.b.b(w3Var, "$this$null", "focusableInNonTouchMode"), "enabled", w3Var).set("interactionSource", this.f51515f);
        }
    }

    static {
        f51511a = new a2.q3(a2.t3.isDebugInspectorInfoEnabled() ? new c2() : a2.t3.getNoInspectorInfo());
    }

    public static final e1.v focusGroup(e1.v vVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        return h1.x.focusTarget(h1.k0.focusProperties(vVar.then(f51511a), m1.f51499e));
    }

    public static final e1.v focusable(e1.v vVar, boolean z10, f0.q qVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        return e1.o.composed(vVar, a2.t3.isDebugInspectorInfoEnabled() ? new a(z10, qVar) : a2.t3.getNoInspectorInfo(), new y1(qVar, z10));
    }

    public static /* synthetic */ e1.v focusable$default(e1.v vVar, boolean z10, f0.q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            qVar = null;
        }
        return focusable(vVar, z10, qVar);
    }

    public static final e1.v focusableInNonTouchMode(e1.v vVar, boolean z10, f0.q qVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        return e1.o.composed(vVar, a2.t3.isDebugInspectorInfoEnabled() ? new b(z10, qVar) : a2.t3.getNoInspectorInfo(), new a2(z10, qVar));
    }
}
