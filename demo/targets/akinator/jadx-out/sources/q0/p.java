package q0;

import io.ktor.http.LinkHeader;
import p0.i4;
import p0.v4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public static final p f82364c = new p(0, 1, 1, null);

    @Override // q0.n0
    public final void a(o0 o0Var, p0.d dVar, v4 v4Var, i4 i4Var, p0 p0Var) {
        v4Var.ensureStarted((p0.b) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(0)));
    }

    /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
    public final int m5928getAnchorHpuvwBQ() {
        return w.m5952constructorimpl(0);
    }

    @Override // q0.n0
    /* renamed from: objectParamName-31yXWZQ */
    public String mo5902objectParamName31yXWZQ(int i10) {
        return w.m5954equalsimpl0(i10, w.m5952constructorimpl(0)) ? LinkHeader.Parameters.Anchor : super.mo5902objectParamName31yXWZQ(i10);
    }
}
