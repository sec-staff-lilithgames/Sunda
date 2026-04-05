package o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface f2 extends r0 {
    Object rollback(Object obj, zu.d<?> dVar);

    @Override // o5.r0
    /* synthetic */ Object usePrepared(String str, kv.l lVar, zu.d dVar);

    <R> Object withNestedTransaction(kv.p pVar, zu.d<? super R> dVar);
}
