package q0;

import io.ktor.http.LinkHeader;
import p0.i4;
import p0.s4;
import p0.v4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public static final s f82369c = new s(0, 2, 1, null);

    @Override // q0.n0
    public final void a(o0 o0Var, p0.d dVar, v4 v4Var, i4 i4Var, p0 p0Var) {
        s4 s4Var = (s4) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(1));
        p0.b bVar = (p0.b) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(0));
        v4Var.beginInsert();
        v4Var.moveFrom(s4Var, bVar.toIndexFor(s4Var), false);
        v4Var.endInsert();
    }

    /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
    public final int m5931getAnchorHpuvwBQ() {
        return w.m5952constructorimpl(0);
    }

    /* renamed from: getFromSlotTable-HpuvwBQ, reason: not valid java name */
    public final int m5932getFromSlotTableHpuvwBQ() {
        return w.m5952constructorimpl(1);
    }

    @Override // q0.n0
    /* renamed from: objectParamName-31yXWZQ */
    public String mo5902objectParamName31yXWZQ(int i10) {
        return w.m5954equalsimpl0(i10, w.m5952constructorimpl(0)) ? LinkHeader.Parameters.Anchor : w.m5954equalsimpl0(i10, w.m5952constructorimpl(1)) ? "from" : super.mo5902objectParamName31yXWZQ(i10);
    }
}
