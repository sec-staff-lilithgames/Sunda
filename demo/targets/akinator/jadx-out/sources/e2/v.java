package e2;

import a2.t3;
import a2.w3;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class v {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.l f53631e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kv.l lVar) {
            super(1);
            this.f53631e = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "clearAndSetSemantics").set("properties", this.f53631e);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f53632e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ kv.l f53633f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, kv.l lVar) {
            super(1);
            this.f53632e = z10;
            this.f53633f = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            com.google.android.gms.internal.play_billing.a.d(this.f53632e, a.b.b(w3Var, "$this$null", "semantics"), "mergeDescendants", w3Var).set("properties", this.f53633f);
        }
    }

    public static final e1.v clearAndSetSemantics(e1.v vVar, kv.l properties) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(properties, "properties");
        return e1.o.composed(vVar, t3.isDebugInspectorInfoEnabled() ? new a(properties) : t3.getNoInspectorInfo(), new w(properties));
    }

    public static final e1.v semantics(e1.v vVar, boolean z10, kv.l properties) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(properties, "properties");
        return e1.o.composed(vVar, t3.isDebugInspectorInfoEnabled() ? new b(z10, properties) : t3.getNoInspectorInfo(), new x(z10, properties));
    }

    public static /* synthetic */ e1.v semantics$default(e1.v vVar, boolean z10, kv.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return semantics(vVar, z10, lVar);
    }
}
