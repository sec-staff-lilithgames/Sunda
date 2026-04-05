package q0;

import io.ktor.http.LinkHeader;
import p0.i4;
import p0.v4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public static final l f82356c = new l(0, 2, 1, null);

    @Override // q0.n0
    public final void a(o0 o0Var, p0.d dVar, v4 v4Var, i4 i4Var, p0 p0Var) {
        ((kv.l) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(0))).invoke((p0.e0) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(1)));
    }

    /* renamed from: getAction-HpuvwBQ, reason: not valid java name */
    public final int m5923getActionHpuvwBQ() {
        return w.m5952constructorimpl(0);
    }

    /* renamed from: getComposition-HpuvwBQ, reason: not valid java name */
    public final int m5924getCompositionHpuvwBQ() {
        return w.m5952constructorimpl(1);
    }

    @Override // q0.n0
    /* renamed from: objectParamName-31yXWZQ */
    public String mo5902objectParamName31yXWZQ(int i10) {
        return w.m5954equalsimpl0(i10, w.m5952constructorimpl(0)) ? LinkHeader.Parameters.Anchor : w.m5954equalsimpl0(i10, w.m5952constructorimpl(1)) ? "composition" : super.mo5902objectParamName31yXWZQ(i10);
    }
}
