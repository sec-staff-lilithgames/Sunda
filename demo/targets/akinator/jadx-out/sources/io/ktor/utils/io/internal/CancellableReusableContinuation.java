package io.ktor.utils.io.internal;

import av.e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kv.l;
import tu.a0;
import tu.x0;
import tu.z;
import zu.d;
import zu.m;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CancellableReusableContinuation<T> implements d<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater state$FU = AtomicReferenceFieldUpdater.newUpdater(CancellableReusableContinuation.class, Object.class, "state");
    private static final /* synthetic */ AtomicReferenceFieldUpdater jobCancellationHandler$FU = AtomicReferenceFieldUpdater.newUpdater(CancellableReusableContinuation.class, Object.class, "jobCancellationHandler");
    private volatile /* synthetic */ Object state = null;
    private volatile /* synthetic */ Object jobCancellationHandler = null;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class JobRelation implements l {
        private DisposableHandle handler;
        private final Job job;
        final /* synthetic */ CancellableReusableContinuation<T> this$0;

        public JobRelation(CancellableReusableContinuation cancellableReusableContinuation, Job job) {
            e0.checkNotNullParameter(job, "job");
            this.this$0 = cancellableReusableContinuation;
            this.job = job;
            DisposableHandle disposableHandleInvokeOnCompletion$default = Job.DefaultImpls.invokeOnCompletion$default(job, true, false, this, 2, null);
            if (job.isActive()) {
                this.handler = disposableHandleInvokeOnCompletion$default;
            }
        }

        public final void dispose() {
            DisposableHandle disposableHandle = this.handler;
            if (disposableHandle != null) {
                this.handler = null;
                disposableHandle.dispose();
            }
        }

        public final Job getJob() {
            return this.job;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public void invoke(Throwable th2) {
            this.this$0.notParent(this);
            dispose();
            if (th2 != null) {
                this.this$0.resumeWithExceptionContinuationOnly(this.job, th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notParent(CancellableReusableContinuation<T>.JobRelation jobRelation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = jobCancellationHandler$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, jobRelation, null) && atomicReferenceFieldUpdater.get(this) == jobRelation) {
        }
    }

    private final void parent(m mVar) {
        Job job = (Job) mVar.get(Job.Key);
        JobRelation jobRelation = (JobRelation) this.jobCancellationHandler;
        if ((jobRelation != null ? jobRelation.getJob() : null) == job) {
            return;
        }
        if (job == null) {
            JobRelation jobRelation2 = (JobRelation) jobCancellationHandler$FU.getAndSet(this, null);
            if (jobRelation2 != null) {
                jobRelation2.dispose();
                return;
            }
            return;
        }
        JobRelation jobRelation3 = new JobRelation(this, job);
        while (true) {
            Object obj = this.jobCancellationHandler;
            JobRelation jobRelation4 = (JobRelation) obj;
            if (jobRelation4 != null && jobRelation4.getJob() == job) {
                jobRelation3.dispose();
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = jobCancellationHandler$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, jobRelation3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (jobRelation4 != null) {
                jobRelation4.dispose();
                return;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resumeWithExceptionContinuationOnly(Job job, Throwable th2) {
        while (true) {
            Object obj = this.state;
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (dVar.getContext().get(Job.Key) != job) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$FU;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<T of io.ktor.utils.io.internal.CancellableReusableContinuation>");
                int i10 = z.f87419c;
                dVar.resumeWith(z.m7131constructorimpl(a0.createFailure(th2)));
                return;
            }
            return;
        }
    }

    public final void close(T value) {
        e0.checkNotNullParameter(value, "value");
        resumeWith(z.m7131constructorimpl(value));
        JobRelation jobRelation = (JobRelation) jobCancellationHandler$FU.getAndSet(this, null);
        if (jobRelation != null) {
            jobRelation.dispose();
        }
    }

    public final Object completeSuspendBlock(d<? super T> actual) {
        e0.checkNotNullParameter(actual, "actual");
        while (true) {
            Object obj = this.state;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$FU;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, actual)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                parent(actual.getContext());
                return e.getCOROUTINE_SUSPENDED();
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = state$FU;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    break;
                }
            }
            if (obj instanceof Throwable) {
                throw ((Throwable) obj);
            }
            e0.checkNotNull(obj, "null cannot be cast to non-null type T of io.ktor.utils.io.internal.CancellableReusableContinuation");
            return obj;
        }
    }

    @Override // zu.d
    public m getContext() {
        m context;
        Object obj = this.state;
        d dVar = obj instanceof d ? (d) obj : null;
        return (dVar == null || (context = dVar.getContext()) == null) ? n.f98854b : context;
    }

    @Override // zu.d
    public void resumeWith(Object obj) {
        Object objM7134exceptionOrNullimpl;
        while (true) {
            Object obj2 = this.state;
            if (obj2 == null) {
                objM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(obj);
                if (objM7134exceptionOrNullimpl == null) {
                    a0.throwOnFailure(obj);
                    objM7134exceptionOrNullimpl = obj;
                }
            } else if (!(obj2 instanceof d)) {
                return;
            } else {
                objM7134exceptionOrNullimpl = null;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM7134exceptionOrNullimpl)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (obj2 instanceof d) {
                ((d) obj2).resumeWith(obj);
                return;
            }
            return;
        }
    }

    public final void close(Throwable cause) {
        e0.checkNotNullParameter(cause, "cause");
        int i10 = z.f87419c;
        resumeWith(z.m7131constructorimpl(a0.createFailure(cause)));
        JobRelation jobRelation = (JobRelation) jobCancellationHandler$FU.getAndSet(this, null);
        if (jobRelation != null) {
            jobRelation.dispose();
        }
    }
}
