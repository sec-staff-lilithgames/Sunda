package u1;

import a2.t3;
import a2.w3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class v {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ t f87682e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f87683f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, boolean z10) {
            super(1);
            this.f87682e = tVar;
            this.f87683f = z10;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "pointerHoverIcon").set("icon", this.f87682e);
            w3Var.getProperties().set("overrideDescendants", Boolean.valueOf(this.f87683f));
        }
    }

    public static final e1.v pointerHoverIcon(e1.v vVar, t icon, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(icon, "icon");
        return e1.o.composed(vVar, t3.isDebugInspectorInfoEnabled() ? new a(icon, z10) : t3.getNoInspectorInfo(), new y(icon, z10));
    }

    public static /* synthetic */ e1.v pointerHoverIcon$default(e1.v vVar, t tVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return pointerHoverIcon(vVar, tVar, z10);
    }
}
