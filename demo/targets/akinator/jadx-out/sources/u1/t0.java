package u1;

import a2.t3;
import a2.w3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c1 f87673e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ kv.l f87674f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c1 c1Var, kv.l lVar) {
            super(1);
            this.f87673e = c1Var;
            this.f87674f = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "pointerInteropFilter").set("requestDisallowInterceptTouchEvent", this.f87673e);
            w3Var.getProperties().set("onTouchEvent", this.f87674f);
        }
    }

    public static final e1.v motionEventSpy(e1.v vVar, kv.l watcher) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(watcher, "watcher");
        return i1.pointerInput(vVar, watcher, new s0(watcher, null));
    }

    public static final e1.v pointerInteropFilter(e1.v vVar, u2.o view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        q0 q0Var = new q0();
        q0Var.setOnTouchEvent(new v0(view));
        c1 c1Var = new c1();
        q0Var.setRequestDisallowInterceptTouchEvent(c1Var);
        view.setOnRequestDisallowInterceptTouchEvent$ui_release(c1Var);
        return vVar.then(q0Var);
    }

    public static /* synthetic */ e1.v pointerInteropFilter$default(e1.v vVar, c1 c1Var, kv.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c1Var = null;
        }
        return pointerInteropFilter(vVar, c1Var, lVar);
    }

    public static final e1.v pointerInteropFilter(e1.v vVar, c1 c1Var, kv.l onTouchEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(onTouchEvent, "onTouchEvent");
        return e1.o.composed(vVar, t3.isDebugInspectorInfoEnabled() ? new a(c1Var, onTouchEvent) : t3.getNoInspectorInfo(), new u0(c1Var, onTouchEvent));
    }
}
