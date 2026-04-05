package kotlinx.coroutines;

import kotlinx.coroutines.Job;
import kv.p;
import tu.f;
import zu.k;
import zu.l;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface CompletableJob extends Job {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static <R> R fold(CompletableJob completableJob, R r10, p pVar) {
            return (R) Job.DefaultImpls.fold(completableJob, r10, pVar);
        }

        public static <E extends k> E get(CompletableJob completableJob, l lVar) {
            return (E) Job.DefaultImpls.get(completableJob, lVar);
        }

        public static m minusKey(CompletableJob completableJob, l lVar) {
            return Job.DefaultImpls.minusKey(completableJob, lVar);
        }

        @f
        public static Job plus(CompletableJob completableJob, Job job) {
            return Job.DefaultImpls.plus((Job) completableJob, job);
        }

        public static m plus(CompletableJob completableJob, m mVar) {
            return Job.DefaultImpls.plus(completableJob, mVar);
        }
    }

    boolean complete();

    boolean completeExceptionally(Throwable th2);

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ k get(l lVar);

    @Override // kotlinx.coroutines.Job, zu.k
    /* synthetic */ l getKey();

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ m minusKey(l lVar);

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ m plus(m mVar);
}
