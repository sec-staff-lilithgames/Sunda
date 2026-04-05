package kotlinx.coroutines.tasks;

import androidx.lifecycle.b3;
import av.b;
import av.e;
import aw.f;
import bv.h;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ha.a;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectClause1;
import kv.p;
import rv.t;
import tu.a0;
import tu.x0;
import tu.z;
import zu.d;
import zu.k;
import zu.l;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class TasksKt {
    public static final <T> Deferred<T> asDeferred(Task<T> task) {
        return asDeferredImpl(task, null);
    }

    private static final <T> Deferred<T> asDeferredImpl(Task<T> task, CancellationTokenSource cancellationTokenSource) {
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception != null) {
                completableDeferredCompletableDeferred$default.completeExceptionally(exception);
            } else if (task.isCanceled()) {
                Job.DefaultImpls.cancel$default((Job) completableDeferredCompletableDeferred$default, (CancellationException) null, 1, (Object) null);
            } else {
                completableDeferredCompletableDeferred$default.complete(task.getResult());
            }
        } else {
            task.addOnCompleteListener(DirectExecutor.INSTANCE, new a(completableDeferredCompletableDeferred$default, 17));
        }
        if (cancellationTokenSource != null) {
            completableDeferredCompletableDeferred$default.invokeOnCompletion(new f(cancellationTokenSource, 18));
        }
        return new Deferred<T>() { // from class: kotlinx.coroutines.tasks.TasksKt.asDeferredImpl.3
            @Override // kotlinx.coroutines.Job
            public ChildHandle attachChild(ChildJob childJob) {
                return completableDeferredCompletableDeferred$default.attachChild(childJob);
            }

            @Override // kotlinx.coroutines.Deferred
            public Object await(d<? super T> dVar) {
                return completableDeferredCompletableDeferred$default.await(dVar);
            }

            @Override // kotlinx.coroutines.Job
            @tu.f
            public /* synthetic */ void cancel() {
                completableDeferredCompletableDeferred$default.cancel();
            }

            @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, zu.k, zu.m
            public <R> R fold(R r10, p pVar) {
                return (R) completableDeferredCompletableDeferred$default.fold(r10, pVar);
            }

            @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, zu.k, zu.m
            public <E extends k> E get(l lVar) {
                return (E) completableDeferredCompletableDeferred$default.get(lVar);
            }

            @Override // kotlinx.coroutines.Job
            public CancellationException getCancellationException() {
                return completableDeferredCompletableDeferred$default.getCancellationException();
            }

            @Override // kotlinx.coroutines.Job
            public t getChildren() {
                return completableDeferredCompletableDeferred$default.getChildren();
            }

            @Override // kotlinx.coroutines.Deferred
            public T getCompleted() {
                return completableDeferredCompletableDeferred$default.getCompleted();
            }

            @Override // kotlinx.coroutines.Deferred
            public Throwable getCompletionExceptionOrNull() {
                return completableDeferredCompletableDeferred$default.getCompletionExceptionOrNull();
            }

            @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, zu.k
            public l getKey() {
                return completableDeferredCompletableDeferred$default.getKey();
            }

            @Override // kotlinx.coroutines.Deferred
            public SelectClause1<T> getOnAwait() {
                return completableDeferredCompletableDeferred$default.getOnAwait();
            }

            @Override // kotlinx.coroutines.Job
            public SelectClause0 getOnJoin() {
                return completableDeferredCompletableDeferred$default.getOnJoin();
            }

            @Override // kotlinx.coroutines.Job
            public Job getParent() {
                return completableDeferredCompletableDeferred$default.getParent();
            }

            @Override // kotlinx.coroutines.Job
            public DisposableHandle invokeOnCompletion(kv.l lVar) {
                return completableDeferredCompletableDeferred$default.invokeOnCompletion(lVar);
            }

            @Override // kotlinx.coroutines.Job
            public boolean isActive() {
                return completableDeferredCompletableDeferred$default.isActive();
            }

            @Override // kotlinx.coroutines.Job
            public boolean isCancelled() {
                return completableDeferredCompletableDeferred$default.isCancelled();
            }

            @Override // kotlinx.coroutines.Job
            public boolean isCompleted() {
                return completableDeferredCompletableDeferred$default.isCompleted();
            }

            @Override // kotlinx.coroutines.Job
            public Object join(d<? super x0> dVar) {
                return completableDeferredCompletableDeferred$default.join(dVar);
            }

            @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, zu.k, zu.m
            public m minusKey(l lVar) {
                return completableDeferredCompletableDeferred$default.minusKey(lVar);
            }

            @Override // kotlinx.coroutines.Job
            @tu.f
            public Job plus(Job job) {
                return completableDeferredCompletableDeferred$default.plus(job);
            }

            @Override // kotlinx.coroutines.Job
            public boolean start() {
                return completableDeferredCompletableDeferred$default.start();
            }

            @Override // kotlinx.coroutines.Job
            public void cancel(CancellationException cancellationException) {
                completableDeferredCompletableDeferred$default.cancel(cancellationException);
            }

            @Override // kotlinx.coroutines.Job
            public DisposableHandle invokeOnCompletion(boolean z10, boolean z11, kv.l lVar) {
                return completableDeferredCompletableDeferred$default.invokeOnCompletion(z10, z11, lVar);
            }

            @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, zu.k, zu.m
            public m plus(m mVar) {
                return completableDeferredCompletableDeferred$default.plus(mVar);
            }

            @Override // kotlinx.coroutines.Job
            @tu.f
            public /* synthetic */ boolean cancel(Throwable th2) {
                return completableDeferredCompletableDeferred$default.cancel(th2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asDeferredImpl$lambda$1(CompletableDeferred completableDeferred, Task task) {
        Exception exception = task.getException();
        if (exception != null) {
            completableDeferred.completeExceptionally(exception);
        } else if (task.isCanceled()) {
            Job.DefaultImpls.cancel$default((Job) completableDeferred, (CancellationException) null, 1, (Object) null);
        } else {
            completableDeferred.complete(task.getResult());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 asDeferredImpl$lambda$2(CancellationTokenSource cancellationTokenSource, Throwable th2) {
        cancellationTokenSource.cancel();
        return x0.f87415a;
    }

    public static final <T> Task<T> asTask(Deferred<? extends T> deferred) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        deferred.invokeOnCompletion(new b3(cancellationTokenSource, 2, deferred, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 asTask$lambda$0(CancellationTokenSource cancellationTokenSource, Deferred deferred, TaskCompletionSource taskCompletionSource, Throwable th2) {
        boolean z10 = th2 instanceof CancellationException;
        x0 x0Var = x0.f87415a;
        if (z10) {
            cancellationTokenSource.cancel();
            return x0Var;
        }
        Throwable completionExceptionOrNull = deferred.getCompletionExceptionOrNull();
        if (completionExceptionOrNull == null) {
            taskCompletionSource.setResult(deferred.getCompleted());
        } else {
            Exception runtimeExecutionException = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
            if (runtimeExecutionException == null) {
                runtimeExecutionException = new RuntimeExecutionException(completionExceptionOrNull);
            }
            taskCompletionSource.setException(runtimeExecutionException);
        }
        return x0Var;
    }

    public static final <T> Object await(Task<T> task, d<? super T> dVar) {
        return awaitImpl(task, null, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object awaitImpl(Task<T> task, final CancellationTokenSource cancellationTokenSource, d<? super T> dVar) throws Exception {
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception != null) {
                throw exception;
            }
            if (!task.isCanceled()) {
                return task.getResult();
            }
            throw new CancellationException("Task " + task + " was cancelled normally.");
        }
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        task.addOnCompleteListener(DirectExecutor.INSTANCE, new OnCompleteListener() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task<T> task2) {
                Exception exception2 = task2.getException();
                if (exception2 != null) {
                    d dVar2 = cancellableContinuationImpl;
                    int i10 = z.f87419c;
                    dVar2.resumeWith(z.m7131constructorimpl(a0.createFailure(exception2)));
                } else {
                    if (task2.isCanceled()) {
                        CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuationImpl, null, 1, null);
                        return;
                    }
                    d dVar3 = cancellableContinuationImpl;
                    int i11 = z.f87419c;
                    dVar3.resumeWith(z.m7131constructorimpl(task2.getResult()));
                }
            }
        });
        if (cancellationTokenSource != null) {
            cancellableContinuationImpl.invokeOnCancellation(new kv.l() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2
                @Override // kv.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return x0.f87415a;
                }

                public final void invoke(Throwable th2) {
                    cancellationTokenSource.cancel();
                }
            });
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    public static final <T> Deferred<T> asDeferred(Task<T> task, CancellationTokenSource cancellationTokenSource) {
        return asDeferredImpl(task, cancellationTokenSource);
    }

    public static final <T> Object await(Task<T> task, CancellationTokenSource cancellationTokenSource, d<? super T> dVar) {
        return awaitImpl(task, cancellationTokenSource, dVar);
    }
}
