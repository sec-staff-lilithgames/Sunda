package w1;

import a2.t3;
import a2.w3;
import e1.v;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;
import y1.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final f f90320a = y1.c.modifierLocalOf(w1.a.f90318e);

    public static final f getModifierLocalRotaryScrollParent() {
        return f90320a;
    }

    public static final v onPreRotaryScrollEvent(v vVar, l onPreRotaryScrollEvent) {
        e0.checkNotNullParameter(vVar, "<this>");
        e0.checkNotNullParameter(onPreRotaryScrollEvent, "onPreRotaryScrollEvent");
        return t3.inspectableWrapper(vVar, t3.isDebugInspectorInfoEnabled() ? new a(onPreRotaryScrollEvent) : t3.getNoInspectorInfo(), new r1.b(null, new w1.b(onPreRotaryScrollEvent), f90320a));
    }

    public static final v onRotaryScrollEvent(v vVar, l onRotaryScrollEvent) {
        e0.checkNotNullParameter(vVar, "<this>");
        e0.checkNotNullParameter(onRotaryScrollEvent, "onRotaryScrollEvent");
        return t3.inspectableWrapper(vVar, t3.isDebugInspectorInfoEnabled() ? new b(onRotaryScrollEvent) : t3.getNoInspectorInfo(), new r1.b(new w1.b(onRotaryScrollEvent), null, f90320a));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends f0 implements l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l f90321e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar) {
            super(1);
            this.f90321e = lVar;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "onPreRotaryScrollEvent").set("onPreRotaryScrollEvent", this.f90321e);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends f0 implements l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l f90322e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l lVar) {
            super(1);
            this.f90322e = lVar;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "onRotaryScrollEvent").set("onRotaryScrollEvent", this.f90322e);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return x0.f87415a;
        }
    }

    public static /* synthetic */ void getModifierLocalRotaryScrollParent$annotations() {
    }
}
