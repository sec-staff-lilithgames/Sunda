package kotlinx.coroutines;

import kotlinx.coroutines.Job;
import kv.p;
import tu.f;
import zu.k;
import zu.l;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes10.dex */
public interface ChildJob extends Job {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static <R> R fold(ChildJob childJob, R r10, p pVar) {
            return (R) Job.DefaultImpls.fold(childJob, r10, pVar);
        }

        public static <E extends k> E get(ChildJob childJob, l lVar) {
            return (E) Job.DefaultImpls.get(childJob, lVar);
        }

        public static m minusKey(ChildJob childJob, l lVar) {
            return Job.DefaultImpls.minusKey(childJob, lVar);
        }

        @f
        public static Job plus(ChildJob childJob, Job job) {
            return Job.DefaultImpls.plus((Job) childJob, job);
        }

        public static m plus(ChildJob childJob, m mVar) {
            return Job.DefaultImpls.plus(childJob, mVar);
        }
    }

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ k get(l lVar);

    @Override // kotlinx.coroutines.Job, zu.k
    /* synthetic */ l getKey();

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ m minusKey(l lVar);

    void parentCancelled(ParentJob parentJob);

    @Override // kotlinx.coroutines.Job, zu.k, zu.m
    /* synthetic */ m plus(m mVar);
}
