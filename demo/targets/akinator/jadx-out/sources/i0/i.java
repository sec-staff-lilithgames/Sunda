package i0;

import a2.t3;
import a2.w3;
import e1.v;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i {
    public static final f BringIntoViewRequester() {
        return new h();
    }

    public static final v bringIntoViewRequester(v vVar, f bringIntoViewRequester) {
        e0.checkNotNullParameter(vVar, "<this>");
        e0.checkNotNullParameter(bringIntoViewRequester, "bringIntoViewRequester");
        return e1.o.composed(vVar, t3.isDebugInspectorInfoEnabled() ? new a(bringIntoViewRequester) : t3.getNoInspectorInfo(), new k(bringIntoViewRequester));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f59310e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar) {
            super(1);
            this.f59310e = fVar;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "bringIntoViewRequester").set("bringIntoViewRequester", this.f59310e);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return x0.f87415a;
        }
    }
}
