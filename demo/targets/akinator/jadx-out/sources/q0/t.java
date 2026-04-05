package q0;

import io.ktor.http.LinkHeader;
import p0.i4;
import p0.s4;
import p0.v4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public static final t f82382c = new t(0, 3, 1, null);

    @Override // q0.n0
    public final void a(o0 o0Var, p0.d dVar, v4 v4Var, i4 i4Var, p0 p0Var) {
        p0 p0VarAccess$withCurrentStackTrace;
        s4 s4Var = (s4) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(1));
        p0.b bVar = (p0.b) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(0));
        c cVar = (c) o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(2));
        v4 v4VarOpenWriter = s4Var.openWriter();
        if (p0Var != null) {
            try {
                p0VarAccess$withCurrentStackTrace = r0.access$withCurrentStackTrace(p0Var, v4Var);
            } catch (Throwable th2) {
                v4VarOpenWriter.close(false);
                throw th2;
            }
        } else {
            p0VarAccess$withCurrentStackTrace = null;
        }
        cVar.executeAndFlushAllPendingFixups(dVar, v4VarOpenWriter, i4Var, p0VarAccess$withCurrentStackTrace);
        v4VarOpenWriter.close(true);
        v4Var.beginInsert();
        v4Var.moveFrom(s4Var, bVar.toIndexFor(s4Var), false);
        v4Var.endInsert();
    }

    /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
    public final int m5933getAnchorHpuvwBQ() {
        return w.m5952constructorimpl(0);
    }

    /* renamed from: getFixups-HpuvwBQ, reason: not valid java name */
    public final int m5934getFixupsHpuvwBQ() {
        return w.m5952constructorimpl(2);
    }

    /* renamed from: getFromSlotTable-HpuvwBQ, reason: not valid java name */
    public final int m5935getFromSlotTableHpuvwBQ() {
        return w.m5952constructorimpl(1);
    }

    @Override // q0.n0
    /* renamed from: objectParamName-31yXWZQ */
    public String mo5902objectParamName31yXWZQ(int i10) {
        return w.m5954equalsimpl0(i10, w.m5952constructorimpl(0)) ? LinkHeader.Parameters.Anchor : w.m5954equalsimpl0(i10, w.m5952constructorimpl(1)) ? "from" : w.m5954equalsimpl0(i10, w.m5952constructorimpl(2)) ? "fixups" : super.mo5902objectParamName31yXWZQ(i10);
    }
}
