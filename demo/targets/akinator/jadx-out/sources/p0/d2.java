package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface d2 extends zu.k {
    @Override // zu.k, zu.m
    /* synthetic */ Object fold(Object obj, kv.p pVar);

    @Override // zu.k, zu.m
    /* synthetic */ zu.k get(zu.l lVar);

    @Override // zu.k
    default zu.l getKey() {
        return c2.f80168b;
    }

    @Override // zu.k, zu.m
    /* synthetic */ zu.m minusKey(zu.l lVar);

    @Override // zu.k, zu.m
    /* synthetic */ zu.m plus(zu.m mVar);

    <R> Object withFrameNanos(kv.l lVar, zu.d<? super R> dVar);
}
