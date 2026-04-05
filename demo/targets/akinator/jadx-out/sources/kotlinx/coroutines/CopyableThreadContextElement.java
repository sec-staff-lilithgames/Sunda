package kotlinx.coroutines;

import kotlinx.coroutines.ThreadContextElement;
import kv.p;
import zu.k;
import zu.l;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface CopyableThreadContextElement<S> extends ThreadContextElement<S> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static <S, R> R fold(CopyableThreadContextElement<S> copyableThreadContextElement, R r10, p pVar) {
            return (R) ThreadContextElement.DefaultImpls.fold(copyableThreadContextElement, r10, pVar);
        }

        public static <S, E extends k> E get(CopyableThreadContextElement<S> copyableThreadContextElement, l lVar) {
            return (E) ThreadContextElement.DefaultImpls.get(copyableThreadContextElement, lVar);
        }

        public static <S> m minusKey(CopyableThreadContextElement<S> copyableThreadContextElement, l lVar) {
            return ThreadContextElement.DefaultImpls.minusKey(copyableThreadContextElement, lVar);
        }

        public static <S> m plus(CopyableThreadContextElement<S> copyableThreadContextElement, m mVar) {
            return ThreadContextElement.DefaultImpls.plus(copyableThreadContextElement, mVar);
        }
    }

    CopyableThreadContextElement<S> copyForChild();

    @Override // kotlinx.coroutines.ThreadContextElement, zu.k, zu.m
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlinx.coroutines.ThreadContextElement, zu.k, zu.m
    /* synthetic */ k get(l lVar);

    @Override // kotlinx.coroutines.ThreadContextElement, zu.k
    /* synthetic */ l getKey();

    m mergeForChild(k kVar);

    @Override // kotlinx.coroutines.ThreadContextElement, zu.k, zu.m
    /* synthetic */ m minusKey(l lVar);

    @Override // kotlinx.coroutines.ThreadContextElement, zu.k, zu.m
    /* synthetic */ m plus(m mVar);
}
