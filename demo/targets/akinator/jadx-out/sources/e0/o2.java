package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface o2 {
    static /* synthetic */ Object drag$default(o2 o2Var, d0.l3 l3Var, kv.p pVar, zu.d dVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
        }
        if ((i10 & 1) != 0) {
            l3Var = d0.l3.f51488b;
        }
        return o2Var.drag(l3Var, pVar, dVar);
    }

    void dispatchRawDelta(float f10);

    Object drag(d0.l3 l3Var, kv.p pVar, zu.d<? super tu.x0> dVar);
}
