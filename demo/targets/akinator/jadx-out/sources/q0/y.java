package q0;

import p0.i2;
import p0.i4;
import p0.v4;
import p0.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public static final y f82388c = new y(0, 3, 1, null);

    @Override // q0.n0
    public final void a(o0 o0Var, p0.d dVar, v4 v4Var, i4 i4Var, p0 p0Var) {
        y0 y0Var = (y0) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(0));
        i2 i2Var = (i2) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(2));
        ((p0.f0) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(1))).movableContentStateReleased$runtime(i2Var, p0.d0.extractMovableContentAtCurrent(y0Var, i2Var, v4Var, null), dVar);
    }

    /* renamed from: getComposition-HpuvwBQ, reason: not valid java name */
    public final int m5959getCompositionHpuvwBQ() {
        return w.m5952constructorimpl(0);
    }

    /* renamed from: getParentCompositionContext-HpuvwBQ, reason: not valid java name */
    public final int m5960getParentCompositionContextHpuvwBQ() {
        return w.m5952constructorimpl(1);
    }

    /* renamed from: getReference-HpuvwBQ, reason: not valid java name */
    public final int m5961getReferenceHpuvwBQ() {
        return w.m5952constructorimpl(2);
    }

    @Override // q0.n0
    /* renamed from: objectParamName-31yXWZQ */
    public String mo5902objectParamName31yXWZQ(int i10) {
        return w.m5954equalsimpl0(i10, w.m5952constructorimpl(0)) ? "composition" : w.m5954equalsimpl0(i10, w.m5952constructorimpl(1)) ? "parentCompositionContext" : w.m5954equalsimpl0(i10, w.m5952constructorimpl(2)) ? "reference" : super.mo5902objectParamName31yXWZQ(i10);
    }
}
