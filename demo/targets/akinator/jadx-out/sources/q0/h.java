package q0;

import java.util.List;
import p0.h2;
import p0.i2;
import p0.i4;
import p0.k3;
import p0.m3;
import p0.v4;
import p0.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public static final h f82348c = new h(0, 4, 1, null);

    @Override // q0.n0
    public final void a(o0 o0Var, p0.d dVar, v4 v4Var, i4 i4Var, p0 p0Var) throws Throwable {
        i2 i2Var = (i2) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(2));
        i2 i2Var2 = (i2) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(3));
        p0.f0 f0Var = (p0.f0) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(1));
        h2 h2VarMovableContentStateResolve$runtime = (h2) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(0));
        if (h2VarMovableContentStateResolve$runtime == null && (h2VarMovableContentStateResolve$runtime = f0Var.movableContentStateResolve$runtime(i2Var)) == null) {
            p0.d0.composeRuntimeError("Could not resolve state for movable content");
            throw new tu.k();
        }
        List<p0.b> listMoveIntoGroupFrom = v4Var.moveIntoGroupFrom(1, h2VarMovableContentStateResolve$runtime.getSlotTable$runtime(), 2);
        k3.a aVar = k3.f80299h;
        y0 composition$runtime = i2Var2.getComposition$runtime();
        kotlin.jvm.internal.e0.checkNotNull(composition$runtime, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
        aVar.adoptAnchoredScopes$runtime(v4Var, listMoveIntoGroupFrom, (m3) composition$runtime);
    }

    /* renamed from: getFrom-HpuvwBQ, reason: not valid java name */
    public final int m5911getFromHpuvwBQ() {
        return w.m5952constructorimpl(2);
    }

    /* renamed from: getParentCompositionContext-HpuvwBQ, reason: not valid java name */
    public final int m5912getParentCompositionContextHpuvwBQ() {
        return w.m5952constructorimpl(1);
    }

    /* renamed from: getResolvedState-HpuvwBQ, reason: not valid java name */
    public final int m5913getResolvedStateHpuvwBQ() {
        return w.m5952constructorimpl(0);
    }

    /* renamed from: getTo-HpuvwBQ, reason: not valid java name */
    public final int m5914getToHpuvwBQ() {
        return w.m5952constructorimpl(3);
    }

    @Override // q0.n0
    /* renamed from: objectParamName-31yXWZQ */
    public String mo5902objectParamName31yXWZQ(int i10) {
        return w.m5954equalsimpl0(i10, w.m5952constructorimpl(0)) ? "resolvedState" : w.m5954equalsimpl0(i10, w.m5952constructorimpl(1)) ? "resolvedCompositionContext" : w.m5954equalsimpl0(i10, w.m5952constructorimpl(2)) ? "from" : w.m5954equalsimpl0(i10, w.m5952constructorimpl(3)) ? "to" : super.mo5902objectParamName31yXWZQ(i10);
    }
}
