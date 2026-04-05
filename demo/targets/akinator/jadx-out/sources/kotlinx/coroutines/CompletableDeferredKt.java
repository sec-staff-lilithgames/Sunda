package kotlinx.coroutines;

import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CompletableDeferredKt {
    public static final <T> CompletableDeferred<T> CompletableDeferred(Job job) {
        return new CompletableDeferredImpl(job);
    }

    public static /* synthetic */ CompletableDeferred CompletableDeferred$default(Job job, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            job = null;
        }
        return CompletableDeferred(job);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean completeWith(CompletableDeferred<T> completableDeferred, Object obj) {
        Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(obj);
        return thM7134exceptionOrNullimpl == null ? completableDeferred.complete(obj) : completableDeferred.completeExceptionally(thM7134exceptionOrNullimpl);
    }

    public static final <T> CompletableDeferred<T> CompletableDeferred(T t10) {
        CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl(null);
        completableDeferredImpl.complete(t10);
        return completableDeferredImpl;
    }
}
