package kotlinx.coroutines;

import kv.p;
import zu.j;
import zu.k;
import zu.l;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface CoroutineExceptionHandler extends k {
    public static final Key Key = Key.$$INSTANCE;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static <R> R fold(CoroutineExceptionHandler coroutineExceptionHandler, R r10, p pVar) {
            return (R) j.fold(coroutineExceptionHandler, r10, pVar);
        }

        public static <E extends k> E get(CoroutineExceptionHandler coroutineExceptionHandler, l lVar) {
            return (E) j.get(coroutineExceptionHandler, lVar);
        }

        public static m minusKey(CoroutineExceptionHandler coroutineExceptionHandler, l lVar) {
            return j.minusKey(coroutineExceptionHandler, lVar);
        }

        public static m plus(CoroutineExceptionHandler coroutineExceptionHandler, m mVar) {
            return j.plus(coroutineExceptionHandler, mVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Key implements l {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // zu.k, zu.m
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // zu.k, zu.m
    /* synthetic */ k get(l lVar);

    @Override // zu.k
    /* synthetic */ l getKey();

    void handleException(m mVar, Throwable th2);

    @Override // zu.k, zu.m
    /* synthetic */ m minusKey(l lVar);

    @Override // zu.k, zu.m
    /* synthetic */ m plus(m mVar);
}
