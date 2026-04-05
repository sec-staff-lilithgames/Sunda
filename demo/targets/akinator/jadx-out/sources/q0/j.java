package q0;

import io.ktor.http.LinkHeader;
import p0.i4;
import p0.v4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public static final j f82352c = new j(0, 2, 1, null);

    @Override // q0.n0
    public final void a(o0 o0Var, p0.d dVar, v4 v4Var, i4 i4Var, p0 p0Var) {
        z0.w wVar = (z0.w) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(0));
        p0.b bVar = (p0.b) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(1));
        kotlin.jvm.internal.e0.checkNotNull(dVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        wVar.setElement(r0.access$positionToInsert(v4Var, bVar, dVar));
    }

    /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
    public final int m5917getAnchorHpuvwBQ() {
        return w.m5952constructorimpl(1);
    }

    /* renamed from: getEffectiveNodeIndexOut-HpuvwBQ, reason: not valid java name */
    public final int m5918getEffectiveNodeIndexOutHpuvwBQ() {
        return w.m5952constructorimpl(0);
    }

    @Override // q0.n0
    /* renamed from: objectParamName-31yXWZQ */
    public String mo5902objectParamName31yXWZQ(int i10) {
        return w.m5954equalsimpl0(i10, w.m5952constructorimpl(0)) ? "effectiveNodeIndexOut" : w.m5954equalsimpl0(i10, w.m5952constructorimpl(1)) ? LinkHeader.Parameters.Anchor : super.mo5902objectParamName31yXWZQ(i10);
    }
}
