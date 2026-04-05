package q0;

import java.util.List;
import p0.i4;
import p0.v4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public static final g f82346c = new g(0, 2, 1, null);

    @Override // q0.n0
    public final void a(o0 o0Var, p0.d dVar, v4 v4Var, i4 i4Var, p0 p0Var) {
        int element = ((z0.w) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(0))).getElement();
        List list = (List) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(1));
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            kotlin.jvm.internal.e0.checkNotNull(dVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            int i11 = element + i10;
            dVar.insertBottomUp(i11, obj);
            dVar.insertTopDown(i11, obj);
        }
    }

    /* renamed from: getEffectiveNodeIndex-HpuvwBQ, reason: not valid java name */
    public final int m5908getEffectiveNodeIndexHpuvwBQ() {
        return w.m5952constructorimpl(0);
    }

    /* renamed from: getNodes-HpuvwBQ, reason: not valid java name */
    public final int m5909getNodesHpuvwBQ() {
        return w.m5952constructorimpl(1);
    }

    @Override // q0.n0
    /* renamed from: objectParamName-31yXWZQ */
    public String mo5902objectParamName31yXWZQ(int i10) {
        return w.m5954equalsimpl0(i10, w.m5952constructorimpl(0)) ? "effectiveNodeIndex" : w.m5954equalsimpl0(i10, w.m5952constructorimpl(1)) ? "nodes" : super.mo5902objectParamName31yXWZQ(i10);
    }
}
