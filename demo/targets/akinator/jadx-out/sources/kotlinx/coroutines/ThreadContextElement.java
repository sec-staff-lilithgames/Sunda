package kotlinx.coroutines;

import kv.p;
import zu.j;
import zu.k;
import zu.l;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface ThreadContextElement<S> extends k {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static <S, R> R fold(ThreadContextElement<S> threadContextElement, R r10, p pVar) {
            return (R) j.fold(threadContextElement, r10, pVar);
        }

        public static <S, E extends k> E get(ThreadContextElement<S> threadContextElement, l lVar) {
            return (E) j.get(threadContextElement, lVar);
        }

        public static <S> m minusKey(ThreadContextElement<S> threadContextElement, l lVar) {
            return j.minusKey(threadContextElement, lVar);
        }

        public static <S> m plus(ThreadContextElement<S> threadContextElement, m mVar) {
            return j.plus(threadContextElement, mVar);
        }
    }

    @Override // zu.k, zu.m
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // zu.k, zu.m
    /* synthetic */ k get(l lVar);

    @Override // zu.k
    /* synthetic */ l getKey();

    @Override // zu.k, zu.m
    /* synthetic */ m minusKey(l lVar);

    @Override // zu.k, zu.m
    /* synthetic */ m plus(m mVar);

    void restoreThreadContext(m mVar, S s10);

    S updateThreadContext(m mVar);
}
