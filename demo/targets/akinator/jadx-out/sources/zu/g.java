package zu;

import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface g extends k {
    @Override // zu.k, zu.m
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // zu.k, zu.m
    <E extends k> E get(l lVar);

    @Override // zu.k
    /* synthetic */ l getKey();

    <T> d<T> interceptContinuation(d<? super T> dVar);

    @Override // zu.k, zu.m
    m minusKey(l lVar);

    @Override // zu.k, zu.m
    /* synthetic */ m plus(m mVar);

    void releaseInterceptedContinuation(d<?> dVar);
}
