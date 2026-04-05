package n0;

import a2.a3;
import a2.g5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q1 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public static final q1 f75166e = new q1(3);

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(1220403677);
        e1.v q0Var = ((Boolean) wVar.consume(p1.getLocalMinimumTouchTargetEnforcement())).booleanValue() ? new q0(((g5) wVar.consume(a3.getLocalViewConfiguration())).mo36getMinimumTouchTargetSizeMYxV2XQ(), null) : e1.t.f53496b;
        wVar.endReplaceableGroup();
        return q0Var;
    }
}
