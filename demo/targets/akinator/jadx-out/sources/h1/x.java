package h1;

import a2.t3;
import a2.w3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final y1.f f58621a = y1.c.modifierLocalOf(t.f58610e);

    /* renamed from: b, reason: collision with root package name */
    public static final e1.v f58622b = e1.t.f53496b.then(new u()).then(new v()).then(new w());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {
        public a() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            w3Var.setName("focusModifier");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends kotlin.jvm.internal.f0 implements kv.l {
        public b() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            w3Var.setName("focusTarget");
        }
    }

    @tu.f
    public static final e1.v focusModifier(e1.v vVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        return e1.o.composed(vVar, t3.isDebugInspectorInfoEnabled() ? new a() : t3.getNoInspectorInfo(), z.f58624e);
    }

    public static final e1.v focusTarget(e1.v vVar, s focusModifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(focusModifier, "focusModifier");
        return vVar.then(focusModifier).then(f58622b);
    }

    public static final y1.f getModifierLocalParentFocusModifier() {
        return f58621a;
    }

    public static final e1.v getResetFocusModifierLocals() {
        return f58622b;
    }

    public static final e1.v focusTarget(e1.v vVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        return e1.o.composed(vVar, t3.isDebugInspectorInfoEnabled() ? new b() : t3.getNoInspectorInfo(), b0.f58536e);
    }
}
