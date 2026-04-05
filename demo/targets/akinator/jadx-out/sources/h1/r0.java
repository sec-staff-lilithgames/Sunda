package h1;

import a2.t3;
import a2.w3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final y1.f f58591a = y1.c.modifierLocalOf(q0.f58589e);

    public static final e1.v focusRequester(e1.v vVar, o0 focusRequester) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(focusRequester, "focusRequester");
        return e1.o.composed(vVar, t3.isDebugInspectorInfoEnabled() ? new a(focusRequester) : t3.getNoInspectorInfo(), new s0(focusRequester));
    }

    public static final y1.f getModifierLocalFocusRequester() {
        return f58591a;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ o0 f58592e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o0 o0Var) {
            super(1);
            this.f58592e = o0Var;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "focusRequester").set("focusRequester", this.f58592e);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return tu.x0.f87415a;
        }
    }
}
