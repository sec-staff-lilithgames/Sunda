package n0;

import a2.t3;
import a2.w3;
import p0.g3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g3 f75160a = p0.o0.staticCompositionLocalOf(o1.f75155e);

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
            w3Var.setName("minimumTouchTargetSize");
            w3Var.getProperties().set("README", "Adds outer padding to measure at least 48.dp (default) in size to disambiguate touch interactions if the element would measure smaller");
        }
    }

    public static final g3 getLocalMinimumTouchTargetEnforcement() {
        return f75160a;
    }

    public static final e1.v minimumTouchTargetSize(e1.v vVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        return e1.o.composed(vVar, t3.isDebugInspectorInfoEnabled() ? new a() : t3.getNoInspectorInfo(), q1.f75166e);
    }

    public static /* synthetic */ void getLocalMinimumTouchTargetEnforcement$annotations() {
    }
}
