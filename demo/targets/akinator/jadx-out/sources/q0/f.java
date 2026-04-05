package q0;

import p0.i4;
import p0.n2;
import p0.v4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public static final f f82344c = new f(0, 2, 1, null);

    @Override // q0.n0
    public final void a(o0 o0Var, p0.d dVar, v4 v4Var, i4 i4Var, p0 p0Var) {
        z0.w wVar = (z0.w) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(1));
        int element = wVar != null ? wVar.getElement() : 0;
        a aVar = (a) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(0));
        if (element > 0) {
            dVar = new n2(dVar, element);
        }
        aVar.executeAndFlushAllPendingChanges(dVar, v4Var, i4Var, p0Var != null ? r0.access$withCurrentStackTrace(p0Var, v4Var) : null);
    }

    /* renamed from: getChanges-HpuvwBQ, reason: not valid java name */
    public final int m5906getChangesHpuvwBQ() {
        return w.m5952constructorimpl(0);
    }

    /* renamed from: getEffectiveNodeIndex-HpuvwBQ, reason: not valid java name */
    public final int m5907getEffectiveNodeIndexHpuvwBQ() {
        return w.m5952constructorimpl(1);
    }

    @Override // q0.n0
    /* renamed from: objectParamName-31yXWZQ */
    public String mo5902objectParamName31yXWZQ(int i10) {
        return w.m5954equalsimpl0(i10, w.m5952constructorimpl(0)) ? "changes" : w.m5954equalsimpl0(i10, w.m5952constructorimpl(1)) ? "effectiveNodeIndex" : super.mo5902objectParamName31yXWZQ(i10);
    }
}
