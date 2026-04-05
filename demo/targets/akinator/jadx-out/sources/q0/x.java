package q0;

import p0.i4;
import p0.v4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public static final x f82387c = new x(1, 1, null);

    @Override // q0.n0
    public final void a(o0 o0Var, p0.d dVar, v4 v4Var, i4 i4Var, p0 p0Var) {
        p0.b bVar = (p0.b) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(0));
        int i10 = o0Var.getInt(0);
        dVar.up();
        kotlin.jvm.internal.e0.checkNotNull(dVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        dVar.insertBottomUp(i10, v4Var.node(bVar));
    }

    @Override // q0.n0
    public final p0.b b(o0 o0Var) {
        return (p0.b) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(0));
    }

    /* renamed from: getGroupAnchor-HpuvwBQ, reason: not valid java name */
    public final int m5958getGroupAnchorHpuvwBQ() {
        return w.m5952constructorimpl(0);
    }

    public final int getInsertIndex() {
        return 0;
    }

    @Override // q0.n0
    public String intParamName(int i10) {
        return i10 == 0 ? "insertIndex" : super.intParamName(i10);
    }

    @Override // q0.n0
    /* renamed from: objectParamName-31yXWZQ */
    public String mo5902objectParamName31yXWZQ(int i10) {
        return w.m5954equalsimpl0(i10, w.m5952constructorimpl(0)) ? "groupAnchor" : super.mo5902objectParamName31yXWZQ(i10);
    }
}
