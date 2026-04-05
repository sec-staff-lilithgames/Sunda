package kotlinx.coroutines.future;

import androidx.lifecycle.c3;
import av.b;
import av.e;
import aw.f;
import bv.h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.function.BiFunction;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kv.l;
import kv.p;
import tu.x0;
import zu.d;
import zu.m;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class FutureKt {
    public static final <T> CompletableFuture<T> asCompletableFuture(Deferred<? extends T> deferred) {
        CompletableFuture<T> completableFuture = new CompletableFuture<>();
        setupCancellation(deferred, completableFuture);
        deferred.invokeOnCompletion(new c3(14, completableFuture, deferred));
        return completableFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 asCompletableFuture$lambda$1(CompletableFuture completableFuture, Deferred deferred, Throwable th2) {
        try {
            completableFuture.complete(deferred.getCompleted());
        } catch (Throwable th3) {
            completableFuture.completeExceptionally(th3);
        }
        return x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 asCompletableFuture$lambda$2(CompletableFuture completableFuture, Throwable th2) {
        x0 x0Var = x0.f87415a;
        if (th2 == null) {
            completableFuture.complete(x0Var);
        } else {
            completableFuture.completeExceptionally(th2);
        }
        return x0Var;
    }

    public static final <T> Deferred<T> asDeferred(CompletionStage<T> completionStage) {
        Throwable cause;
        CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (!completableFuture.isDone()) {
            CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            completionStage.handle(new a(0, new a1.a(completableDeferredCompletableDeferred$default, 8)));
            JobKt__JobKt.invokeOnCompletion$default(completableDeferredCompletableDeferred$default, false, new CancelFutureOnCompletion(completableFuture), 1, null);
            return completableDeferredCompletableDeferred$default;
        }
        try {
            return CompletableDeferredKt.CompletableDeferred(completableFuture.get());
        } catch (Throwable th2) {
            th = th2;
            ExecutionException executionException = th instanceof ExecutionException ? (ExecutionException) th : null;
            if (executionException != null && (cause = executionException.getCause()) != null) {
                th = cause;
            }
            CompletableDeferred completableDeferredCompletableDeferred$default2 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            completableDeferredCompletableDeferred$default2.completeExceptionally(th);
            return completableDeferredCompletableDeferred$default2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object asDeferred$lambda$5(CompletableDeferred completableDeferred, Object obj, Throwable th2) {
        boolean zCompleteExceptionally;
        Throwable cause;
        try {
            if (th2 == null) {
                zCompleteExceptionally = completableDeferred.complete(obj);
            } else {
                CompletionException completionException = th2 instanceof CompletionException ? (CompletionException) th2 : null;
                if (completionException != null && (cause = completionException.getCause()) != null) {
                    th2 = cause;
                }
                zCompleteExceptionally = completableDeferred.completeExceptionally(th2);
            }
            return Boolean.valueOf(zCompleteExceptionally);
        } catch (Throwable th3) {
            CoroutineExceptionHandlerKt.handleCoroutineException(n.f98854b, th3);
            return x0.f87415a;
        }
    }

    public static final <T> Object await(CompletionStage<T> completionStage, d<? super T> dVar) throws Throwable {
        final CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (completableFuture.isDone()) {
            try {
                return completableFuture.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        final ContinuationHandler continuationHandler = new ContinuationHandler(cancellableContinuationImpl);
        completionStage.handle(continuationHandler);
        cancellableContinuationImpl.invokeOnCancellation(new l() { // from class: kotlinx.coroutines.future.FutureKt$await$2$1
            @Override // kv.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return x0.f87415a;
            }

            public final void invoke(Throwable th2) {
                completableFuture.cancel(false);
                continuationHandler.cont = null;
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    public static final <T> CompletableFuture<T> future(CoroutineScope coroutineScope, m mVar, CoroutineStart coroutineStart, p pVar) {
        if (coroutineStart.isLazy()) {
            throw new IllegalArgumentException((coroutineStart + " start is not supported").toString());
        }
        m mVarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, mVar);
        CompletableFuture<T> completableFuture = new CompletableFuture<>();
        CompletableFutureCoroutine completableFutureCoroutine = new CompletableFutureCoroutine(mVarNewCoroutineContext, completableFuture);
        completableFuture.handle((BiFunction) completableFutureCoroutine);
        completableFutureCoroutine.start(coroutineStart, completableFutureCoroutine, pVar);
        return completableFuture;
    }

    public static /* synthetic */ CompletableFuture future$default(CoroutineScope coroutineScope, m mVar, CoroutineStart coroutineStart, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = n.f98854b;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return future(coroutineScope, mVar, coroutineStart, pVar);
    }

    private static final void setupCancellation(final Job job, CompletableFuture<?> completableFuture) {
        completableFuture.handle((BiFunction<? super Object, Throwable, ? extends U>) new a(1, new p() { // from class: kotlinx.coroutines.future.FutureKt.setupCancellation.1
            @Override // kv.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(obj, (Throwable) obj2);
                return x0.f87415a;
            }

            public final void invoke(Object obj, Throwable th2) {
                Job job2 = job;
                if (th2 != null) {
                    CancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
                    if (CancellationException == null) {
                        CancellationException = ExceptionsKt.CancellationException("CompletableFuture was completed exceptionally", th2);
                    }
                }
                job2.cancel(CancellationException);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 setupCancellation$lambda$3(p pVar, Object obj, Throwable th2) {
        return (x0) pVar.invoke(obj, th2);
    }

    public static final CompletableFuture<x0> asCompletableFuture(Job job) {
        CompletableFuture<x0> completableFuture = new CompletableFuture<>();
        setupCancellation(job, completableFuture);
        job.invokeOnCompletion(new f(completableFuture, 17));
        return completableFuture;
    }
}
