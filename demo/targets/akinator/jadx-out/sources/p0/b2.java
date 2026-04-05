package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b2 {
    public static <R> R fold(d2 d2Var, R r10, kv.p pVar) {
        return (R) zu.j.fold(d2Var, r10, pVar);
    }

    public static <E extends zu.k> E get(d2 d2Var, zu.l lVar) {
        return (E) zu.j.get(d2Var, lVar);
    }

    @Deprecated
    public static zu.l getKey(d2 d2Var) {
        return super/*p0.d2*/.getKey();
    }

    public static zu.m minusKey(d2 d2Var, zu.l lVar) {
        return zu.j.minusKey(d2Var, lVar);
    }

    public static zu.m plus(d2 d2Var, zu.m mVar) {
        return zu.j.plus(d2Var, mVar);
    }
}
