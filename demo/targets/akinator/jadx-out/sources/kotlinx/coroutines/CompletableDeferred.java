package kotlinx.coroutines;

import kotlinx.coroutines.Deferred;
import kv.p;
import tu.f;
import zu.k;
import zu.l;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface CompletableDeferred<T> extends Deferred<T> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static <T, R> R fold(CompletableDeferred<T> completableDeferred, R r10, p pVar) {
            return (R) Deferred.DefaultImpls.fold(completableDeferred, r10, pVar);
        }

        public static <T, E extends k> E get(CompletableDeferred<T> completableDeferred, l lVar) {
            return (E) Deferred.DefaultImpls.get(completableDeferred, lVar);
        }

        public static <T> m minusKey(CompletableDeferred<T> completableDeferred, l lVar) {
            return Deferred.DefaultImpls.minusKey(completableDeferred, lVar);
        }

        @f
        public static <T> Job plus(CompletableDeferred<T> completableDeferred, Job job) {
            return Deferred.DefaultImpls.plus((Deferred) completableDeferred, job);
        }

        public static <T> m plus(CompletableDeferred<T> completableDeferred, m mVar) {
            return Deferred.DefaultImpls.plus(completableDeferred, mVar);
        }
    }

    boolean complete(T t10);

    boolean completeExceptionally(Throwable th2);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ k get(l lVar);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, zu.k
    /* synthetic */ l getKey();

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ m minusKey(l lVar);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ m plus(m mVar);
}
