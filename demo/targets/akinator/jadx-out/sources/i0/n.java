package i0;

import a2.t3;
import a2.w3;
import e1.v;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ m f59316e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar) {
            super(1);
            this.f59316e = mVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "bringIntoViewResponder").set("responder", this.f59316e);
        }
    }

    public static final boolean access$completelyOverlaps(i1.j jVar, i1.j jVar2) {
        return jVar.getLeft() <= jVar2.getLeft() && jVar.getTop() <= jVar2.getTop() && jVar.getRight() >= jVar2.getRight() && jVar.getBottom() >= jVar2.getBottom();
    }

    public static final v bringIntoViewResponder(v vVar, m responder) {
        e0.checkNotNullParameter(vVar, "<this>");
        e0.checkNotNullParameter(responder, "responder");
        return e1.o.composed(vVar, t3.isDebugInspectorInfoEnabled() ? new a(responder) : t3.getNoInspectorInfo(), new o(responder));
    }
}
