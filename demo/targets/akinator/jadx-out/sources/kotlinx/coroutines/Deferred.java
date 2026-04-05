package kotlinx.coroutines;

import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectClause1;
import kv.p;
import tu.f;
import zu.d;
import zu.k;
import zu.l;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface Deferred<T> extends Job {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static <T, R> R fold(Deferred<? extends T> deferred, R r10, p pVar) {
            return (R) Job.DefaultImpls.fold(deferred, r10, pVar);
        }

        public static <T, E extends k> E get(Deferred<? extends T> deferred, l lVar) {
            return (E) Job.DefaultImpls.get(deferred, lVar);
        }

        public static <T> m minusKey(Deferred<? extends T> deferred, l lVar) {
            return Job.DefaultImpls.minusKey(deferred, lVar);
        }

        @f
        public static <T> Job plus(Deferred<? extends T> deferred, Job job) {
            return Job.DefaultImpls.plus((Job) deferred, job);
        }

        public static <T> m plus(Deferred<? extends T> deferred, m mVar) {
            return Job.DefaultImpls.plus(deferred, mVar);
        }
    }

    Object await(d<? super T> dVar);

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ k get(l lVar);

    T getCompleted();

    Throwable getCompletionExceptionOrNull();

    @Override // kotlinx.coroutines.Job, zu.k
    /* synthetic */ l getKey();

    SelectClause1<T> getOnAwait();

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ m minusKey(l lVar);

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ m plus(m mVar);
}
