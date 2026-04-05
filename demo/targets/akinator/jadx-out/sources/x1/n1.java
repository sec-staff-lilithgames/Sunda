package x1;

import a2.t3;
import a2.w3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n1 {
    public static final e1.v onSizeChanged(e1.v vVar, kv.l onSizeChanged) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(onSizeChanged, "onSizeChanged");
        return vVar.then(new o1(onSizeChanged, t3.isDebugInspectorInfoEnabled() ? new a(onSizeChanged) : t3.getNoInspectorInfo()));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.l f91389e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kv.l lVar) {
            super(1);
            this.f91389e = lVar;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "onSizeChanged").set("onSizeChanged", this.f91389e);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return tu.x0.f87415a;
        }
    }
}
