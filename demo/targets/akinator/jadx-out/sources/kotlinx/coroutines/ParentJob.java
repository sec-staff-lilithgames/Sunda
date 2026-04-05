package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;
import kv.p;
import tu.f;
import zu.k;
import zu.l;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes10.dex */
public interface ParentJob extends Job {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static <R> R fold(ParentJob parentJob, R r10, p pVar) {
            return (R) Job.DefaultImpls.fold(parentJob, r10, pVar);
        }

        public static <E extends k> E get(ParentJob parentJob, l lVar) {
            return (E) Job.DefaultImpls.get(parentJob, lVar);
        }

        public static m minusKey(ParentJob parentJob, l lVar) {
            return Job.DefaultImpls.minusKey(parentJob, lVar);
        }

        @f
        public static Job plus(ParentJob parentJob, Job job) {
            return Job.DefaultImpls.plus((Job) parentJob, job);
        }

        public static m plus(ParentJob parentJob, m mVar) {
            return Job.DefaultImpls.plus(parentJob, mVar);
        }
    }

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ k get(l lVar);

    CancellationException getChildJobCancellationCause();

    @Override // kotlinx.coroutines.Job, zu.k
    /* synthetic */ l getKey();

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ m minusKey(l lVar);

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ m plus(m mVar);
}
