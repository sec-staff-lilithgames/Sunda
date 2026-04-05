package h1;

import a2.t3;
import a2.w3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b {
    public static final e1.v onFocusChanged(e1.v vVar, kv.l onFocusChanged) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        return e1.o.composed(vVar, t3.isDebugInspectorInfoEnabled() ? new a(onFocusChanged) : t3.getNoInspectorInfo(), new d(onFocusChanged));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.l f58535e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kv.l lVar) {
            super(1);
            this.f58535e = lVar;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "onFocusChanged").set("onFocusChanged", this.f58535e);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return tu.x0.f87415a;
        }
    }
}
