package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface v2 {
    static /* synthetic */ e1.v weight$default(v2 v2Var, e1.v vVar, float f10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return ((w2) v2Var).weight(vVar, f10, z10);
    }

    e1.v align(e1.v vVar, e1.c cVar);

    e1.v alignBy(e1.v vVar, kv.l lVar);

    e1.v alignBy(e1.v vVar, x1.x xVar);

    e1.v alignByBaseline(e1.v vVar);

    e1.v weight(e1.v vVar, float f10, boolean z10);
}
