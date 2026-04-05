package zu;

import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface k extends m {
    @Override // zu.m
    <R> R fold(R r10, p pVar);

    @Override // zu.m
    <E extends k> E get(l lVar);

    l getKey();

    @Override // zu.m
    m minusKey(l lVar);

    @Override // zu.m
    /* synthetic */ m plus(m mVar);
}
