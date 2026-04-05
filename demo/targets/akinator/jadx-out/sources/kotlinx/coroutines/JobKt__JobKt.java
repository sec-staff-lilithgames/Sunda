package kotlinx.coroutines;

import av.e;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.Job;
import kv.l;
import rv.t;
import tu.f;
import tu.x0;
import zu.d;
import zu.k;
import zu.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class JobKt__JobKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: kotlinx.coroutines.JobKt__JobKt$invokeOnCompletion$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends a0 implements l {
        public AnonymousClass1(Object obj) {
            super(1, obj, JobNode.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public final void invoke(Throwable th2) {
            ((JobNode) this.receiver).invoke(th2);
        }
    }

    public static final CompletableJob Job(Job job) {
        return new JobImpl(job);
    }

    public static /* synthetic */ CompletableJob Job$default(Job job, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            job = null;
        }
        return JobKt.Job(job);
    }

    public static final void cancel(m mVar, CancellationException cancellationException) {
        Job job = (Job) mVar.get(Job.Key);
        if (job != null) {
            job.cancel(cancellationException);
        }
    }

    public static /* synthetic */ void cancel$default(m mVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        JobKt.cancel(mVar, cancellationException);
    }

    public static final Object cancelAndJoin(Job job, d<? super x0> dVar) {
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        Object objJoin = job.join(dVar);
        return objJoin == e.getCOROUTINE_SUSPENDED() ? objJoin : x0.f87415a;
    }

    public static final void cancelChildren(Job job, CancellationException cancellationException) {
        Iterator<Object> it = job.getChildren().iterator();
        while (it.hasNext()) {
            ((Job) it.next()).cancel(cancellationException);
        }
    }

    public static /* synthetic */ void cancelChildren$default(Job job, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        JobKt.cancelChildren(job, cancellationException);
    }

    public static final DisposableHandle disposeOnCompletion(Job job, DisposableHandle disposableHandle) {
        return invokeOnCompletion$default(job, false, new DisposeOnCompletion(disposableHandle), 1, null);
    }

    public static final void ensureActive(Job job) {
        if (!job.isActive()) {
            throw job.getCancellationException();
        }
    }

    public static final Job getJob(m mVar) {
        Job job = (Job) mVar.get(Job.Key);
        if (job != null) {
            return job;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + mVar).toString());
    }

    public static final DisposableHandle invokeOnCompletion(Job job, boolean z10, JobNode jobNode) {
        return job instanceof JobSupport ? ((JobSupport) job).invokeOnCompletionInternal$kotlinx_coroutines_core(z10, jobNode) : job.invokeOnCompletion(jobNode.getOnCancelling(), z10, new AnonymousClass1(jobNode));
    }

    public static /* synthetic */ DisposableHandle invokeOnCompletion$default(Job job, boolean z10, JobNode jobNode, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return JobKt.invokeOnCompletion(job, z10, jobNode);
    }

    public static final boolean isActive(m mVar) {
        Job job = (Job) mVar.get(Job.Key);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }

    private static final Throwable orCancellation$JobKt__JobKt(Throwable th2, Job job) {
        return th2 == null ? new JobCancellationException("Job was cancelled", null, job) : th2;
    }

    @f
    /* renamed from: Job, reason: collision with other method in class */
    public static final /* synthetic */ Job m5133Job(Job job) {
        return JobKt.Job(job);
    }

    /* renamed from: Job$default, reason: collision with other method in class */
    public static /* synthetic */ Job m5134Job$default(Job job, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            job = null;
        }
        return m5133Job(job);
    }

    public static /* synthetic */ void cancel$default(Job job, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        JobKt.cancel(job, str, th2);
    }

    public static /* synthetic */ void cancelChildren$default(Job job, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        cancelChildren(job, th2);
    }

    public static final void ensureActive(m mVar) {
        Job job = (Job) mVar.get(Job.Key);
        if (job != null) {
            JobKt.ensureActive(job);
        }
    }

    public static final void cancel(Job job, String str, Throwable th2) {
        job.cancel(ExceptionsKt.CancellationException(str, th2));
    }

    public static /* synthetic */ boolean cancel$default(m mVar, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        return cancel(mVar, th2);
    }

    public static /* synthetic */ void cancelChildren$default(m mVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        JobKt.cancelChildren(mVar, cancellationException);
    }

    @f
    public static final /* synthetic */ boolean cancel(m mVar, Throwable th2) {
        k kVar = mVar.get(Job.Key);
        JobSupport jobSupport = kVar instanceof JobSupport ? (JobSupport) kVar : null;
        if (jobSupport == null) {
            return false;
        }
        jobSupport.cancelInternal(orCancellation$JobKt__JobKt(th2, jobSupport));
        return true;
    }

    public static /* synthetic */ void cancelChildren$default(m mVar, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        cancelChildren(mVar, th2);
    }

    @f
    public static final /* synthetic */ void cancelChildren(Job job, Throwable th2) {
        for (Job job2 : job.getChildren()) {
            JobSupport jobSupport = job2 instanceof JobSupport ? (JobSupport) job2 : null;
            if (jobSupport != null) {
                jobSupport.cancelInternal(orCancellation$JobKt__JobKt(th2, job));
            }
        }
    }

    public static final void cancelChildren(m mVar, CancellationException cancellationException) {
        t children;
        Job job = (Job) mVar.get(Job.Key);
        if (job == null || (children = job.getChildren()) == null) {
            return;
        }
        Iterator<Object> it = children.iterator();
        while (it.hasNext()) {
            ((Job) it.next()).cancel(cancellationException);
        }
    }

    @f
    public static final /* synthetic */ void cancelChildren(m mVar, Throwable th2) {
        Job job = (Job) mVar.get(Job.Key);
        if (job == null) {
            return;
        }
        for (Job job2 : job.getChildren()) {
            JobSupport jobSupport = job2 instanceof JobSupport ? (JobSupport) job2 : null;
            if (jobSupport != null) {
                jobSupport.cancelInternal(orCancellation$JobKt__JobKt(th2, job));
            }
        }
    }
}
