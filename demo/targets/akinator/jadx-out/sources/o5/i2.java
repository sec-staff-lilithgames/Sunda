package o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i2 {
    public static final <R> Object deferredTransaction(h2 h2Var, kv.p pVar, zu.d<? super R> dVar) {
        return h2Var.withTransaction(g2.f77579b, pVar, dVar);
    }

    public static final <R> Object exclusiveTransaction(h2 h2Var, kv.p pVar, zu.d<? super R> dVar) {
        return h2Var.withTransaction(g2.f77581e, pVar, dVar);
    }

    public static final Object execSQL(r0 r0Var, String str, zu.d<? super tu.x0> dVar) {
        Object objUsePrepared = r0Var.usePrepared(str, new f.j0(10), dVar);
        return objUsePrepared == av.e.getCOROUTINE_SUSPENDED() ? objUsePrepared : tu.x0.f87415a;
    }

    public static final <R> Object immediateTransaction(h2 h2Var, kv.p pVar, zu.d<? super R> dVar) {
        return h2Var.withTransaction(g2.f77580c, pVar, dVar);
    }
}
