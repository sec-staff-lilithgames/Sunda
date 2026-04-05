package b0;

import a2.t3;
import a2.w3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c0.j0 f8363e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ kv.p f8364f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c0.j0 j0Var, kv.p pVar) {
            super(1);
            this.f8363e = j0Var;
            this.f8364f = pVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "animateContentSize").set("animationSpec", this.f8363e);
            w3Var.getProperties().set("finishedListener", this.f8364f);
        }
    }

    public static final e1.v animateContentSize(e1.v vVar, c0.j0 animationSpec, kv.p pVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        return e1.o.composed(vVar, t3.isDebugInspectorInfoEnabled() ? new a(animationSpec, pVar) : t3.getNoInspectorInfo(), new g0(animationSpec, pVar));
    }

    public static /* synthetic */ e1.v animateContentSize$default(e1.v vVar, c0.j0 j0Var, kv.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j0Var = c0.o.spring$default(0.0f, 0.0f, null, 7, null);
        }
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        return animateContentSize(vVar, j0Var, pVar);
    }
}
