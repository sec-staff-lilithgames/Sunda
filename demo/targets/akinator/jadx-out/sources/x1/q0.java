package x1;

import a2.t3;
import a2.w3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.q f91401e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kv.q qVar) {
            super(1);
            this.f91401e = qVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", TtmlNode.TAG_LAYOUT).set("measure", this.f91401e);
        }
    }

    public static final e1.v layout(e1.v vVar, kv.q measure) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measure, "measure");
        return vVar.then(new p0(measure, t3.isDebugInspectorInfoEnabled() ? new a(measure) : t3.getNoInspectorInfo()));
    }
}
